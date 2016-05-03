package com.wea.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wea.Beans.AreaUser;
import com.wea.Dao.AreaDao;

public class AreaServlet extends HttpServlet{

	private AreaUser areaUser = null;
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
        AreaDao areaDao = new AreaDao();
        String method = req.getParameter("method");
		if(method.equals("arealogin")){
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			String address = req.getParameter("address");
			areaUser = areaDao.Login(username, password, address);
			if(areaUser!=null){
				System.out.println(username);
				System.out.println(password);
				System.out.println(address);
				req.getRequestDispatcher("/back/areaback/areaIndex.jsp").forward(req, resp);
			}else {
				req.getRequestDispatcher("/back/areaback/error.jsp").forward(req, resp);
			}
		}
	}

}
