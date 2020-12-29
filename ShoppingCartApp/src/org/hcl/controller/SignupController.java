package org.hcl.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hcl.model.User;
import org.hcl.services.UserService;
import org.hcl.services.UserServiceImpl;

@WebServlet("/signup")
public class SignupController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService service = new UserServiceImpl();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String msg="";
		int id = Integer.parseInt(request.getParameter("userid"));
		String userName = request.getParameter("username");
		String gender = request.getParameter("gender");
		String designation = request.getParameter("designation");
		String password = request.getParameter("password");
		User user = new User(id,userName,password,gender,designation);
		boolean b = service.register(user);
		if(b) 
			msg = "Successfully Registered";
		else
			msg = "Registration unsuccessful";
		request.setAttribute("message", msg);
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);		
	}

}
