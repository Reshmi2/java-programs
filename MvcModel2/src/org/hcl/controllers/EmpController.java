package org.hcl.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hcl.model.Emp;
import org.hcl.services.EmpService;
import org.hcl.services.EmpServiceImpl;

/**
 * Servlet implementation class EmpController
 */
@WebServlet(urlPatterns = {"/mvcmodel2"})
public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmpService service = new EmpServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("Text/html");
		PrintWriter pw = response.getWriter();
		List<Emp> employees = service.getEmployees();
		request.setAttribute("empatt", employees);
		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
		rd.forward(request, response);
		
	}

}
