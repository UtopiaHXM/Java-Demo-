package com.wea.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wea.Beans.AreaUser;
import com.wea.Dao.AreaDao;

public class RegisterServlet extends HttpServlet{
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
		String method = req.getParameter("method");
		if(method.equals("arealogin")){
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			String confirmPassword = req.getParameter("confirmPassword");
			String address = req.getParameter("address");
System.out.println("address=="+address);
			if(password.equals(confirmPassword)){
				AreaDao areaDao = new AreaDao();
				AreaUser areaUser = areaDao.Login(username, password, address);
				if(areaUser==null){
					areaUser = new AreaUser();
					areaUser.setUsername(username);
					areaUser.setPassword(password);
					areaUser.setAddress(address);
					areaDao.register(areaUser);
					req.getRequestDispatcher("/back/areaback/areaLogin.jsp").forward(req, resp);
				}else {
					req.getRequestDispatcher("/back/areaback/registerExitError.jsp").forward(req, resp);
				}
			}else {
				req.getRequestDispatcher("/back/areaback/registerError.jsp").forward(req, resp);
			}		
		}
		
		
	}
}
