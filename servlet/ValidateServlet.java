package com.chaitali.servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chaitali.pojo.IUserDAO;
import com.chaitali.pojo.UserDAO;
import com.chaitali.util.DAOUtility;



/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/ValidateServlet")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName, password;
		PrintWriter out = response.getWriter();

		userName = request.getParameter("userName");
		password = request.getParameter("password");
		String userType =null;

		try {
			userType = getUserType(userName, password);
		
		System.out.println(userType);

		RequestDispatcher requestDispatcher = null;

		if (userType.equals("admin")) {
			requestDispatcher = request.getRequestDispatcher("/admin");

		} else if (userType.equals("user")) {
			requestDispatcher = request.getRequestDispatcher("/user");
		} else {
			requestDispatcher = request.getRequestDispatcher("/invalid");
			out.print("<h1>Invalid User</h1>");
		}

		requestDispatcher.forward(request, response);
		}catch (InvalidUserException e) {
			out.print(e.getMessage());}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private String getUserType(String userName, String password) {
		IUserDAO dao = DAOUtility.getUserDAO();
		return dao.getUserType(userName, password);
	}

}
