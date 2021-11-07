package com.xworkz.trainee.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TraineeHttpServlet extends HttpServlet{
	
	public TraineeHttpServlet() {
		
		System.out.println("Invoked no-args constructor from "+(this.getClass().getSimpleName()));
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		String name = req.getParameter("name");
		String type = req.getParameter("type");
		String yop = req.getParameter("yop");
		String education = req.getParameter("education");
		Trainee trainee = new Trainee(name, type, yop, education);
		TraineeDAO dao = new TraineeDAO();
		String result = dao.insert(trainee);
		
		res.getWriter().print(result);
	}

}
