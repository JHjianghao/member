/*
package com.member.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.stu.pojo.Student;
import com.stu.service.StudentService;
import com.stu.service.StudentServiceImpl;

*/
/**
 * Servlet implementation class StudentServlet
 *//*

@WebServlet("/student.do")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    */
/**
     * @see HttpServlet#HttpServlet()
     *//*

    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	*/
/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 *//*

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String opr = request.getParameter("opr");
		StudentService studentService = new StudentServiceImpl();
		switch (opr) {
		case "login":
			login(studentService,request,response);
			break;
		case "findAll":
			break;
		case "add":
			break;
		case "update":
			break;
		case "delete":
			break;
		case "detail":
			break;
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public void login(StudentService studentService,HttpServletRequest request, HttpServletResponse response) throws IOException {
		String no = request.getParameter("studentNo");
		int studentNo = 0;
		if(no!=null) {
			studentNo = Integer.parseInt(no);
		}
		String loginPwd = request.getParameter("loginPwd");
		Student student = studentService.login(studentNo, loginPwd);
		HttpSession session = request.getSession();
		session.setAttribute("student", student);
		response.sendRedirect("index.jsp");
	}

}
*/
