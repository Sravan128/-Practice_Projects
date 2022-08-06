package com;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Product
 */
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		int id=Integer.parseInt(request.getParameter("ID"));
		//out.println(id);
	   try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining","root","Sravan@128");
		out.println("Connection established ");
	   PreparedStatement psmt=con.prepareStatement("select * from ProductInformation where ID=?");
	   psmt.setInt(1,id);
	   ResultSet rs=psmt.executeQuery();
	   if(rs.next()) {
		   out.println("Product Id = "+rs.getInt(1));
		   out.println("Product Name = "+rs.getString(2));
		   out.println("Product Price = "+rs.getFloat(3));
	   }
	   else {
		   out.println("No product present with thid Id. Please go back and enter correct id");
		  
	   }
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
