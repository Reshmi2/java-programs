package org.hcl.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import org.hcl.model.Emp;
import org.hcl.services.EmpService;
import org.hcl.services.EmpServiceImpl;

/**
 * Servlet implementation class EmployeeService
 */
@WebServlet("/EmployeeService")
public class EmployeeController extends GenericServlet {
	private static final long serialVersionUID = 1L;
   
	EmpService service = new EmpServiceImpl();
    public EmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("Text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<table>");
		for(Emp e: service.getAll()) {
			pw.println("<tr>");
			pw.println("<td>"+e.getEno()+"</td><td>"+e.getEname()+"</td><td>"+e.getAddress());
			pw.println("</tr>");
		}
		pw.println("</table>");
		pw.close();

	}

}
