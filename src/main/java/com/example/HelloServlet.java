package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Yellow</h1>");
		out.println("<h1 style='color:red;'>Hello Servlet</h1>");
		out.println("<div style='border:3px dotted yellow;'>BOX</div>");
		out.println("</body>");
		out.println("</html>");
		
	}

	

}
