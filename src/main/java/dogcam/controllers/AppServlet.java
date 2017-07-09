package dogcam.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AppServlet extends HttpServlet {	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cam = request.getParameter("cam");
		RequestDispatcher rd = null;
		if ("0".equals(cam)) {
			rd = getServletContext().getRequestDispatcher("/WEB-INF/pages/cam0.html");
		} else if ("1".equals(cam)) {
			rd = getServletContext().getRequestDispatcher("/WEB-INF/pages/cam1.html");
		} else {
			rd = getServletContext().getRequestDispatcher("/WEB-INF/pages/index.html");
		}
		
		rd.forward(request, response);
	}

	
}
