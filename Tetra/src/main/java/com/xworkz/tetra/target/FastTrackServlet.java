package com.xworkz.tetra.target;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2,urlPatterns = "/myWish")
public class FastTrackServlet extends HttpServlet {
	
	public FastTrackServlet() {
		System.out.println("Creating FastTrackServlet");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("FastTrackServlet Server Running");
	}

}
