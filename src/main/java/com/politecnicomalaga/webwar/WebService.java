package com.politecnicomalaga.webwar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class WebService extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		MrBean bean = new MrBean();
		out.println("<html><body><h1>Hola Mundo!</h1><p>" + bean.getName() + "</p><p>" + bean.getAge() + "</p><p>" + bean.getNationality() + "</p><p>" + bean.getCarBrand() + "</p></body></html>");
	}
}