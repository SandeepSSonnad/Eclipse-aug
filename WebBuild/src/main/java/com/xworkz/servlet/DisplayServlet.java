package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/display")
public class DisplayServlet extends HttpServlet {
	
	public DisplayServlet() {
		System.out.println("Creating DisplayServlet");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running Do-Get Method");
		String data="Displaying the data by get Method";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plane");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost Method");
		String data="Displaying the data by Post Method";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plane");
		
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPut Method");
		String data="Displaying the data by Put Method";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plane");
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doDelete Method");
		String data="Displaying the data by Delete Method";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plane");
	}
	
	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doHead Method");
		String data="Displaying the data by Head Method";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plane");
	}
	
	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doOption Method");
		String data="Displaying the data by Option Method";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plane");
	}
	
	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doTrace Method");
		String data="Displaying the data by Trace Method";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plane");
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
