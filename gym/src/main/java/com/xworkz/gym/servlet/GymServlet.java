package com.xworkz.gym.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GymServlet extends HttpServlet{
	
	public GymServlet() {
		
		System.out.println("GymServlet created");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		System.out.println("Invoked service in gym servlet");
		String gymName = req.getParameter("gymName");
		System.out.println("Gym Name ".concat(gymName));
		String loc = req.getParameter("location");
		System.out.println("Location :"+loc);
		String fees = req.getParameter("fees");
		System.out.println("Fees :".concat(fees));
		String review = req.getParameter("review");
		System.out.println("review :".concat(review));
		String contact = req.getParameter("contact");
		System.out.println("Contact :".concat(contact));
		
		System.out.println("Starting to write response");
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>");
		out.print("Details saved for ".concat(gymName));
		out.print("</br>");
		out.print("Fees".concat(fees));
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");
	}
	

}
