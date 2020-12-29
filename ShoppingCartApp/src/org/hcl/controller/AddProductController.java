package org.hcl.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hcl.model.Product;
import org.hcl.services.ProductService;
import org.hcl.services.ProductServiceImpl;

@WebServlet("/addproduct")
public class AddProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductService service = new ProductServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		RequestDispatcher rd = request.getRequestDispatcher("addProduct.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid = Integer.parseInt(request.getParameter("productId"));
		String pname = request.getParameter("productName");
		String imageUrl = request.getParameter("imageUrl");
		String description = request.getParameter("description");
		int price = Integer.parseInt(request.getParameter("price"));
		boolean isInserted = service.addProduct(new Product(pid, pname, imageUrl, description, price));
		if(isInserted) {
			response.sendRedirect("./products");
		}
	}

}
