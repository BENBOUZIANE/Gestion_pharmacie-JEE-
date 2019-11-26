package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Admin extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		if(req.getParameter("user").equals("harakat") && req.getParameter("pas").equals("rida"))
		{
			HttpSession sess = req.getSession();
            sess.setAttribute("log", req.getParameter("user"));
			resp.sendRedirect("gestion_medicamans.jsp");
		}
		
		else
		{
			resp.sendRedirect("GM.jsp");
		}
	}
}
