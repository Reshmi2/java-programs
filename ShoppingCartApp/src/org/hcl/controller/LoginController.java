package org.hcl.controller;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hcl.model.User;
import org.hcl.services.UserService;
import org.hcl.services.UserServiceImpl;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService service = new UserServiceImpl();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session = null;
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		boolean b = service.validate(user);
		if(b) {
			session = request.getSession();
			Optional<User> optionalUser = service.getUserByUsername(userName);
			session.setAttribute("user", optionalUser.get());
			RequestDispatcher rd = request.getRequestDispatcher("dashboard.jsp");
			rd.forward(request, response);
		}
		else {
			response.sendRedirect("index.jsp");
		}
	}

}
