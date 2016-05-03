package com.servlet;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.bean.news;
import com.dao.news_dao;
/**
 * Servlet implementation class addServlet
 */

public class addServlet extends HttpServlet {
	
       
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		request.setCharacterEncoding("gb2312");
		String title=request.getParameter("politicalTitle");
		String content=request.getParameter("politicalContent");
		news n=new news();
		n.setTitle(title);
		System.out.print(title);
		HttpSession session=request.getSession();
		String table=(String) session.getAttribute("table");
		session.setAttribute("news", n);
		String sql="insert into "+table+" (title,content) values ('"+title+"','"+content+"')";
		news_dao nd=new news_dao(); 
		nd.insert(sql);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("news/political.jsp");
     	dispatcher.forward(request, response);
		
	
	}

}
