package org.hcl.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import org.hcl.model.Emp;
import org.hcl.services.EmpService;
import org.hcl.services.EmpServiceImpl;

@WebServlet(urlPatterns = {"/mvcmodel1"})
public class EmpController extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;
	EmpService service = new EmpServiceImpl();
    public EmpController() {
        super();
    }

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<table>");
		List<Emp> employees = service.getEmployees();
		for(Emp e : employees) {
			pw.println("<tr>");
			pw.println("<td>"+e.getEno()+"</td><td>"+e.getEname()+"</td><td>"+e.getAddress()+"</td>");
			pw.println("</tr>");
		}
		pw.println("<table>");
		pw.close();
	}

}
