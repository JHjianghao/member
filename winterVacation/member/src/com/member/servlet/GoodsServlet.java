package com.member.servlet;

import com.member.pojo.Goods;
import com.member.service.GoodsService;
import com.member.service.GoodsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/goods.do")
public class GoodsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        HttpSession session = request.getSession();
        String names = request.getParameter("names");
        GoodsService goodsService = new GoodsServiceImpl();
        Goods goods = new Goods();
        switch (names) {
            case "findById":
                String commodity = request.getParameter("commodity");
                if (commodity.equals(null)) {
                    System.out.println("获取不到商品名");
                }
                goods = goodsService.findById(commodity);
                if (goods == null) {
                    System.out.println("没有这个商品");
                }
                request.setAttribute("goods", goods);
                request.getRequestDispatcher("memberdo/show.jsp").forward(request, response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
