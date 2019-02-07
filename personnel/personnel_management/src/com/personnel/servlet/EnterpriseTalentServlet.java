package com.personnel.servlet;

import com.personnel.pojo.EnterpriseTalent;
import com.personnel.pojo.Transform;
import com.personnel.service.DepartmentService;
import com.personnel.service.EnterpriseTalentService;
import com.personnel.service.EnterpriseTalentServiceImpl;
import com.personnel.util.Transverter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@WebServlet("/EnterpriseTalentServlet.do")
public class EnterpriseTalentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        /* response.setCharacterEncoding("utf-8");*/
        HttpSession session = request.getSession();
        String transfer = request.getParameter("transfer");
        EnterpriseTalentService enterpriseTalentService = new EnterpriseTalentServiceImpl();
        List<EnterpriseTalent> enterpriseTalentList = null;
        List<DepartmentService> departmentServiceList = null;
        List<Transform> transformList = new ArrayList<>();
        Transform transform = null;
        int number = 0;
        switch (transfer) {
            case "findAll":
                String pagination = request.getParameter("pagination");
                int page = 0;
                if (pagination == null) {
                    page = 1;
                } else {
                    page = Integer.parseInt(pagination);
                }
                int count = enterpriseTalentService.count();
                int totalPage = count % 3 == 0 ? count / 3 : count / 3 + 1;
                if (page < 1) {
                    page = 1;
                } else if (page > totalPage) {
                    page = totalPage;
                }
                int index = (page - 1) * 3;
                Map<Long, String> map = Transverter.transverterS();
                enterpriseTalentList = enterpriseTalentService.findAll(index);
                for (EnterpriseTalent enterpriseTalent : enterpriseTalentList) {
                    transform = new Transform();
                    transform.setId(enterpriseTalent.getId());
                    transform.setName(enterpriseTalent.getName());
                    transform.setWorkingLife(enterpriseTalent.getWorkingLife());
                    transform.setWorkExperience(enterpriseTalent.getWorkExperience());
                    transform.setPersonalProfile(enterpriseTalent.getPersonalProfile());
                    transform.setDepartmentIdName(map.get(enterpriseTalent.getDepartmentId()));
                    transform.setGraduateSchool(enterpriseTalent.getGraduateSchool());
                    transformList.add(transform);
                }
                request.setAttribute("transformList", transformList);
                request.setAttribute("page", page);
                request.setAttribute("totalPage", totalPage);
                request.getRequestDispatcher("PersonnelDo/Display.jsp").forward(request, response);
                break;
            case "findById":
                String departmentIdName = request.getParameter("departmentIdName");
                Map<String, Long> map1 = Transverter.transverterR();
                long departmentId;
                if (departmentIdName == null) {
                    departmentId = 0;
                } else {
                    departmentId = map1.get(departmentIdName);
                }
                enterpriseTalentList = enterpriseTalentService.findById(departmentId);
                if (enterpriseTalentList.size() == 0) {
                    session.setAttribute("message", "没有这个卡号");
                }
                Map<Long, String> map2 = Transverter.transverterS();
                for (EnterpriseTalent enterpriseTalent : enterpriseTalentList) {
                    transform = new Transform();
                    transform.setId(enterpriseTalent.getId());
                    transform.setName(enterpriseTalent.getName());
                    transform.setWorkingLife(enterpriseTalent.getWorkingLife());
                    transform.setWorkExperience(enterpriseTalent.getWorkExperience());
                    transform.setPersonalProfile(enterpriseTalent.getPersonalProfile());
                    transform.setDepartmentIdName(map2.get(enterpriseTalent.getDepartmentId()));
                    transform.setGraduateSchool(enterpriseTalent.getGraduateSchool());
                    transformList.add(transform);
                }
                request.setAttribute("transformList", transformList);
                request.getRequestDispatcher("PersonnelDo/Department.jsp").forward(request, response);
                break;
            case "Add":
                String name = request.getParameter("RenName");
                long workingLife = Long.parseLong(request.getParameter("workingLife"));
                String workExperience = request.getParameter("workExperience");
                String personalProfile = request.getParameter("personalProfile");
                Map<String, Long> map3 = Transverter.transverterR();
                departmentId = map3.get(request.getParameter("departmentIdName"));
                String graduateSchool = request.getParameter("graduateSchool");
                EnterpriseTalent enterpriseTalent = new EnterpriseTalent();
                enterpriseTalent.setName(name);
                enterpriseTalent.setWorkingLife(workingLife);
                enterpriseTalent.setWorkExperience(workExperience);
                enterpriseTalent.setPersonalProfile(personalProfile);
                enterpriseTalent.setDepartmentId(departmentId);
                enterpriseTalent.setGraduateSchool(graduateSchool);
                number = enterpriseTalentService.addEnterpriseTalent(enterpriseTalent);
                if (number > 0) {
                    session.setAttribute("message", "添加成功");
                } else {
                    session.setAttribute("message", "添加失败");
                }
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
            case "LookId":
                long id = Long.parseLong(request.getParameter("id"));
                enterpriseTalent = enterpriseTalentService.Id(id);
                map = Transverter.transverterS();
                Transform transforms = new Transform();
                transforms.setId(enterpriseTalent.getId());
                transforms.setName(enterpriseTalent.getName());
                transforms.setWorkingLife(enterpriseTalent.getWorkingLife());
                transforms.setWorkExperience(enterpriseTalent.getWorkExperience());
                transforms.setPersonalProfile(enterpriseTalent.getPersonalProfile());
                transforms.setDepartmentIdName(map.get(enterpriseTalent.getDepartmentId()));
                transforms.setGraduateSchool(enterpriseTalent.getGraduateSchool());
                request.setAttribute("transforms", transforms);
                request.getRequestDispatcher("PersonnelDo/update.jsp").forward(request, response);
            case "Update":
                id = Long.parseLong(request.getParameter("id"));
                name = request.getParameter("RenName");
                workingLife = Long.parseLong(request.getParameter("workingLife"));
                workExperience = request.getParameter("workExperience");
                personalProfile = request.getParameter("personalProfile");
                map3 = Transverter.transverterR();
                departmentId = map3.get(request.getParameter("departmentIdName"));
                graduateSchool = request.getParameter("graduateSchool");
                EnterpriseTalent enterpriseTalent1 = new EnterpriseTalent();
                enterpriseTalent1.setId(id);
                enterpriseTalent1.setName(name);
                enterpriseTalent1.setWorkingLife(workingLife);
                enterpriseTalent1.setWorkExperience(workExperience);
                enterpriseTalent1.setPersonalProfile(personalProfile);
                enterpriseTalent1.setDepartmentId(departmentId);
                enterpriseTalent1.setGraduateSchool(graduateSchool);
                number = enterpriseTalentService.updateEnterpriseTalent(enterpriseTalent1);
                if (number > 0) {
                    session.setAttribute("message", "修改成功");
                } else {
                    session.setAttribute("message", "修改失败");
                }
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
            case "Delete":
                 id = Long.parseLong(request.getParameter("id"));
                 number = enterpriseTalentService.deleteEnterpriseTalent(id);
                if (number > 0) {
                    session.setAttribute("message", "添加成功");
                } else {
                    session.setAttribute("message", "添加失败");
                }
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
