package com.personnel.servlet;

import com.personnel.pojo.News_comment;
import com.personnel.pojo.News_detail;
import com.personnel.service.News_commentService;
import com.personnel.service.News_commentServiceImpl;
import com.personnel.service.News_detailService;
import com.personnel.service.News_detailServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.crypto.dsig.Transform;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@WebServlet("/News_detailServlet.do")
public class News_detailServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        /* response.setCharacterEncoding("utf-8");*/
        HttpSession session = request.getSession();
        String transfer = request.getParameter("transfer");
        News_detailService news_detailService = new News_detailServiceImpl();
        News_commentService news_commentService = new News_commentServiceImpl();
        List<News_detail> news_detailList = null;
        List<News_comment> news_commentList = null;
        /*List<Transform> transformList = new ArrayList<>();
        Transform transform = null;*/
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
                int count = news_detailService.count();
                int totalPage = count % 3 == 0 ? count / 3 : count / 3 + 1;
                if (page < 1) {
                    page = 1;
                } else if (page > totalPage) {
                    page = totalPage;
                }
                int index = (page - 1) * 3;//修改注意=================================================
                /*Map<Integer, String> map = Transverter.transverterA();*/
                news_detailList = news_detailService.findAll(index);
                request.setAttribute("transformList", news_detailList);
                request.setAttribute("page", page);
                request.setAttribute("totalPage", totalPage);
                request.getRequestDispatcher("Press_releaseDo/Display.jsp").forward(request, response);
                break;
            case "findById":
                String title = request.getParameter("title");
                if (title == null) {
                    session.setAttribute("message", "错误");
                } else {

                }
                news_detailList = news_detailService.findById(title);
                if (news_detailList.size() == 0) {
                    session.setAttribute("message", "值为空");
                }
                request.setAttribute("transformList", news_detailList);
                request.getRequestDispatcher("Press_releaseDo/Department.jsp").forward(request, response);
                break;
            case "Delete":
                long id = Long.parseLong(request.getParameter("id"));
                number = news_commentService.deleteEnterpriseTalent(id);
                int a = news_detailService.deleteEnterpriseTalent(id);
                if (a != 0 && number != 0) {
                    session.setAttribute("message", "删除成功");
                } else {
                    session.setAttribute("message", "删除失败");
                }
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
