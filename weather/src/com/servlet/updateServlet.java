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
 * Servlet implementation class updateServlet
 */
public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
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
		System.out.print("aaaaaaalllll");
		response.setContentType("text/html");
		request.setCharacterEncoding("gb2312");
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		String id=request.getParameter("id");
		news n=new news();
		n.setTitle(title);
	
		HttpSession session=request.getSession();
		String table=(String) session.getAttribute("table");
		session.setAttribute("news", n);
		String sql="update "+table+" set title='"+title+"',content='"+content+"' where id='"+id+"' ";
		news_dao nd=new news_dao();
		nd.insert(sql);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("news/political.jsp");
     	dispatcher.forward(request, response);
		
		
		
		
		
		
		
		
		
		
		
	}

}
