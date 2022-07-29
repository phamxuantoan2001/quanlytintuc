package com.quanlytintuc.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.quanlytintuc.service.IBaiVietService;



@WebServlet(urlPatterns = {"/trang-chu"})
public class HomeController extends HttpServlet {

	/**
	 * 
	 */
	@Inject
	private IBaiVietService baivietService;
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id= new Long("1");
		request.setAttribute("baiviet",baivietService.findByMaChuDe(id));
		RequestDispatcher rd = request.getRequestDispatcher("views/web/home.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	
}
