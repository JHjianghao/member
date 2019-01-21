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
        String name = request.getParameter("name");
        MembersService membersService = new MemdersServiceImpl();
        List<Members> membersList = null;
        List<Goods> goodsList = null;
        List<Collect> collectList = new ArrayList<Collect>();
        Collect collect = null;
        int result = 0;
        switch (name) {
            case "findAll":
                Map<Long, String> map = Judge.judges();
                membersList = membersService.findAll();
                for (Members members : membersList){
                    collect.setId(members.getId());
                    collect.setCreateTime(members.getCreateTime());
                    collect.setName(map.get(members.getGoodsId()));
                    collect.setNickName(members.getNickName());
                    collect.setMemberNumber(members.getMemberNumber());
                    collectList.add(collect);
                }
                request.setAttribute("list",collectList);
                request.getRequestDispatcher("enter.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
