package mypack.testDb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.sql.*;

@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

  
    public TestDbServlet() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		String connectionUrl="jdbc:mysql://localhost:3306/web_customer_tracker1?useSSL=false";
		
		String driverClassName="com.mysql.jdbc.Driver";
		
		String username="springstudentnitin";
		
		String password="springstudentnitin";
		
		try {
			
			Class.forName(driverClassName);
			
			out.println("connecting to the database"+connectionUrl);
			
			Connection myconn=DriverManager.getConnection(connectionUrl, username, password);
			
			out.println("connection successfull"+myconn);
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
			
			
		}
		
		
		
	}

}
