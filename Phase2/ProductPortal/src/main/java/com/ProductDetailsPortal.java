package com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProductDetailsPortal
 */
@WebServlet("/ProductDetailsPortal")
public class ProductDetailsPortal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductDetailsPortal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
HttpSession session=request.getSession();
		
		List<ProductDetails> data1=(List<ProductDetails>) session.getAttribute("productdetails");
		session.setAttribute("products",data1);
			RequestDispatcher rd=request.getRequestDispatcher("/productdetils.jsp");
			rd.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int productId=Integer.parseInt(request.getParameter("productid"));
		String productname=request.getParameter("productname");
		double productcost=Double.parseDouble(request.getParameter("productcost"));
		String productstock=request.getParameter("productstock");
		
		ProductDetails productdetail= new ProductDetails(productId, productname, productcost, productstock);
		List<ProductDetails> data=new ArrayList<>();
		data.add(productdetail);
		HttpSession session=request.getSession();
		session.setAttribute("productdetails",data);
		doGet(request,response);
	}

}
