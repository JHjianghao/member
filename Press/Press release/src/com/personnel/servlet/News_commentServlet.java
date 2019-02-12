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
import java.io.IOException;
import java.util.List;

@WebServlet("/News_commentServlet.do")
public class News_commentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        /* response.setCharacterEncoding("utf-8");*/
        HttpSession session = request.getSession();
        String transfer = request.getParameter("transfer");
        News_commentService news_commentService = new News_commentServiceImpl();
        List<News_detail> news_detailList = null;
        List<News_comment> news_commentList = null;
        /*List<Transform> transformList = new ArrayList<>();
        Transform transform = null;*/
        int number = 0;
        switch (transfer) {
            case "findAll":
                long newsid = Long.parseLong(request.getParameter("id"));
                news_commentList = news_commentService.Id(newsid);
                request.setAttribute("transformList", news_commentList);
                request.getRequestDispatcher("Press_releaseDo/Look.jsp").forward(request, response);
                break;
            case "Add":
                newsid = Long.parseLong(request.getParameter("id"));
                String content = request.getParameter("content");
                String author = request.getParameter("author");
                News_comment news_comment = new News_comment();
                news_comment.setNewsid(newsid);
                news_comment.setContent(content);
                news_comment.setAuthor(author);
                number = news_commentService.addEnterpriseTalent(news_comment);
                if (number != 0) {
                    session.setAttribute("message", "添加成功");
                } else {
                    session.setAttribute("message", "添加失败");
                }
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
