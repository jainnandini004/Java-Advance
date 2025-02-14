package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Profile")
public class Profile extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
			PrintWriter out=response.getWriter();  
	        request.getRequestDispatcher("index1.html").include(request, response);  
	          
	        HttpSession session=request.getSession(false);  
	        if(session!=null){  
	        String name=(String)session.getAttribute("name");  
	        
	        out.print("<h1>");    
	        out.print("Hello, "+name+" Welcome to Profile");  
	        out.print("<h1/>");  
	        
	        }  
	        else{  
	            out.print("Please login first");  
	            request.getRequestDispatcher("index2.html").include(request, response);  
	        }  
	        out.close();  
	}

}
