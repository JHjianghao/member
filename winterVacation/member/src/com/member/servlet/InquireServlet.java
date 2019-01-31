package com.member.servlet;

import com.member.pojo.Collect;
import com.member.pojo.Goods;
import com.member.pojo.Members;
import com.member.service.MembersService;
import com.member.service.MemdersServiceImpl;
import com.member.util.Judge;

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

@WebServlet("/member.do")
public class InquireServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        HttpSession session = request.getSession();
        String names = request.getParameter("names");
        MembersService membersService = new MemdersServiceImpl();
        List<Members> membersList = null;
        List<Goods> goodsList = null;
        List<Collect> collectList = new ArrayList<Collect>();
        Collect collect = null;
        int result = 0;
        long MemberNumber = 0;
        String MemberNumbers = null;
        long goodsName = 0;
        System.out.println(names);
        switch (names) {
            case "findAll":
                String currentPage = request.getParameter("currentPage");
                int current = 0;
                if (currentPage == null) {
                    current = 1;
                } else {
                    System.out.println(currentPage + "---------------------------------------");
                    current = Integer.parseInt(currentPage);
                }
                int count = membersService.count();
                int totalPage = count % 3 == 0 ? count / 3 : count / 3 + 1;
                if (current < 1) {
                    current = 1;
                } else if (current > totalPage) {
                    current = totalPage;
                }
                int index = (current - 1) * 3;
                Map<Long, String> map = Judge.judges();
                membersList = membersService.findAll(index);
                for (Members members : membersList) {
                    collect = new Collect();
                    collect.setId(members.getId());
                    collect.setCreateTime(members.getCreateTime());
                    collect.setName(map.get(members.getGoodsId()));
                    collect.setNickName(members.getNickName());
                    collect.setMemberNumber(members.getMemberNumber());
                    collectList.add(collect);
                }
                request.setAttribute("collectList", collectList);
                request.setAttribute("current", current);
                request.setAttribute("totalPage", totalPage);
                request.getRequestDispatcher("memberdo/enter.jsp").forward(request, response);
                break;
            case "findById":
                MemberNumbers = request.getParameter("MemberNumber");
                if (MemberNumbers == null) {
                    MemberNumber = Long.valueOf(0);
                } else {
                    MemberNumber = Long.parseLong(MemberNumbers);
                }
                membersList = membersService.findById(MemberNumber);
                if (membersList.size() == 0) {
                    session.setAttribute("message", "没有这个卡号");
                }
                Map<Long, String> map2 = Judge.judges();
                for (Members members : membersList) {
                    collect = new Collect();
                    collect.setId(members.getId());
                    collect.setCreateTime(members.getCreateTime());
                    collect.setName(map2.get(members.getGoodsId()));
                    collect.setNickName(members.getNickName());
                    collect.setMemberNumber(members.getMemberNumber());
                    collectList.add(collect);
                }
                request.setAttribute("collectList", collectList);
                request.getRequestDispatcher("memberdo/look.jsp").forward(request, response);
                break;
            case "addMembers":
                MemberNumber =Long.parseLong( request.getParameter("MemberNumber"));
                String nickName = request.getParameter("nickName");
                System.out.println(MemberNumber + nickName + "-================================================");
                goodsName = Long.parseLong( request.getParameter("goodsName"));
                if (MemberNumber == 0 && nickName == null && goodsName == 0) {
                    session.setAttribute("message", "错误请重新输入");
                }
                result = membersService.addMembers(MemberNumber, nickName,goodsName);
                if (result > 0) {
                    session.setAttribute("message", "添加成功");
                } else {
                    session.setAttribute("message", "添加失败");
                }
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
            case "delete":
                long id = Long.parseLong(request.getParameter("id"));
                result = membersService.deleteMembers(id);
                if (result > 0) {
                    session.setAttribute("message", "删除成功");
                } else {
                    session.setAttribute("message", "删除失败");
                }
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
