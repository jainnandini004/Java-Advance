package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LogOut")
public class LogOut extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {   
	        
		 PrintWriter out=response.getWriter();  
         
         request.getRequestDispatcher("index1.html").include(request, response);  
           
         HttpSession session=request.getSession();  
         session.invalidate();  
           
         out.print("You are successfully Logged Out!");  
           
         out.close();   
		
		
		
       
	}

}
