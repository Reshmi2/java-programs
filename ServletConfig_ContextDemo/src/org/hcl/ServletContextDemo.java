package org.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContextDemo
 */
@WebServlet("/ServletContextDemo")
public class ServletContextDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext context = null;
	public void init(ServletConfigDemo context) throws ServletException {
		
	}
	/**S
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		ServletContext context = getServletContext();
		String driver = context.getInitParameter("driver");
		String url = context.getInitParameter("url");
		String username = context.getInitParameter("username");
		String password = context.getInitParameter("password");
		pw.println("<h6>driver:"+driver+"</h6>");
		pw.println("<h6>driver:"+url+"</h6>");
		pw.println("<h6>driver:"+username+"</h6>");
		pw.println("<h6>driver:"+password+"</h6>");
		pw.close();
	}

}
