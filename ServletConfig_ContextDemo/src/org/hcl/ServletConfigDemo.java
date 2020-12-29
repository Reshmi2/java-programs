package org.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

/**
 * Servlet implementation class ServletConfig
 */
@WebServlet("/ServletConfig")
public class ServletConfigDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletConfigDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	private ServletConfig config = null;
	
	public void init(ServletConfigDemo config) throws ServletException {
		this.config = config;
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		ServletConfig config = getServletConfig();
		String name = config.getInitParameter("name");
		String address = config.getInitParameter("address");
		pw.println("<h1>The name is "+name+" and the address is "+address+"</h1>");
		pw.close();
	}

}
