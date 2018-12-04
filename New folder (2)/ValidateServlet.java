package com.chaitali.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ValidateServlet")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName, password;
		PrintWriter out=response.getWriter();
		userName=request.getParameter("userName");
		password=request.getParameter("password");
		out.print("Hello Everyone");

		RequestDispatcher requestDispatcher=null;
String userType ="invalid";

try{
		 userType= getUserType(userName, password);
		
}catch(InvalidUserException e){
	out.print("IIIInvalid User");
}	
		

		if(userType.equals("Admin")){
			requestDispatcher=	request.getRequestDispatcher("/AdminServlet");
			//out.print("Welcome Admin "+userName);
		}else if(userType.equals("User"))
		{	requestDispatcher=	request.getRequestDispatcher("/UserServlet");
			//out.print("Welcome User "+userName);
		}else{
			requestDispatcher=	request.getRequestDispatcher("/InvalidUser");
			//out.print("Invalid User ");
		}

		
		requestDispatcher.forward(request, response);
	}


	private String getUserType(String userName, String password) {
		
		UserDAO dao=new UserDAO();
		return dao.getUserType(userName, password);
	}
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request, response);
	}

}
