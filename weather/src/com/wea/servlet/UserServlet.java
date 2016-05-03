package com.wea.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wea.Beans.User;
import com.wea.Dao.UserDao;

public class UserServlet extends HttpServlet {

	private User user = null;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		UserDao userDao = new UserDao();
		String method = req.getParameter("method");
		if(method.equals("login")){
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			user = userDao.Login(username, password);
			if(user!=null){
				System.out.println(username);
				System.out.println(password);
				req.setAttribute("User", user);
				req.getRequestDispatcher("/news/political.jsp").forward(req, resp);
			}else {
				req.getRequestDispatcher("/back/error.jsp").forward(req, resp);
			}
		}
	}

}
