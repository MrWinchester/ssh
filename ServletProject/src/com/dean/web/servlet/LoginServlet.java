package com.dean.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dean.web.utils.StrUtils;

/**
 * @author Lucifer
 * @version create time：Jul 7, 2014 8:49:22 AM
 */
public class LoginServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// super.doGet(req, resp);
		System.out.println("do get");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		System.out.println(name+":"+password);
		// 转发
		req.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(req, resp);
		// 重定向
		
		StrUtils.writeLog(this,"do get");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.doPost(req, resp);
		StrUtils.writeLog(this,"do post");
	}

	@Override
	public void destroy() {
		super.destroy();
		StrUtils.writeLog(this,"do destroy");
	}

	@Override
	public void init() throws ServletException {
		super.init();
		StrUtils.writeLog(this,"init");
	}
	

}
