package com.servlet;

//import java.io.IOException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.news;
import com.dao.news_dao;

public class deleteServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		  news n=new news();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	    HttpSession session=request.getSession();
	   String table=(String) session.getAttribute("table");
		System.out.print("aaaaaaaaaaaa");
        String id=request.getParameter("n_id");
	   System.out.print(id);
		System.out.print("bbbbbbb");
		String sql="delete from "+table+" where id=('"+id+"') ";
		
		news_dao sd=new news_dao();
		sd.delete(sql);
		RequestDispatcher dispatcher=request.getRequestDispatcher("news/political.jsp");
     	dispatcher.forward(request, response);	
	}
	

}
