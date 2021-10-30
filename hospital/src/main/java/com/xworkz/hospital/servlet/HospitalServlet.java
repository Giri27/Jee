package com.xworkz.hospital.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HospitalServlet extends HttpServlet{

	public HospitalServlet() {

		System.out.println("HospitalServlet created");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		System.out.println("Invoked service in HospitalServlet");
		String name = req.getParameter("name");
		System.out.println("Hospital name ".concat(name));
		String founder = req.getParameter("founder");
		System.out.println("Hospital founder "+founder);
		String estimatedDate = req.getParameter("estimatedDate");
		System.out.println("Estimated Date "+estimatedDate);
		String specialization = req.getParameter("specialization");
		System.out.println("Specialization "+specialization);
		String chiefDoctor = req.getParameter("chiefDoctor");
		System.out.println("Chief Doctor "+chiefDoctor);
		String numberOfNurse = req.getParameter("numberOfNurse");
		System.out.println("Number of Nurse "+numberOfNurse);
		String numberOfBeds = req.getParameter("numberOfBeds");
		System.out.println("Number of Beds "+numberOfBeds);
		
		System.out.println("Starting to write response");
		
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.print("<html>");
		pw.print("<body>");
		pw.print("<h3>");
		pw.print("Details of hospital ".concat(name));
		pw.print("<html>");
		pw.print("<html>");
		pw.print("</h3>");
		pw.print("</body>");
		pw.print("</html>");
		
	}
}
