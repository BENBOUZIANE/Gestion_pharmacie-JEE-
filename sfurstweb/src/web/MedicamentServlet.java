package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Medicament;
import metier.Operation;

public class MedicamentServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Operation op = new Operation();
		String action = req.getParameter("action");
		if(action != null ){
			if(action.equals("supprimer"))
			{
        	op.remove(Long.parseLong(req.getParameter("id")));
        	MedicamentBeans mb = new MedicamentBeans();	
    		mb.setList(op.getAll());	
    		req.setAttribute("model", mb);
    		req.getRequestDispatcher("gestion_medicamans.jsp").forward(req, resp);	
        	}
			
			if(action.equals("rechercher"))
			{
				String nmm=req.getParameter("recherche");
				MedicamentBeans mb = new MedicamentBeans();	
				mb.setList(op.getMoc(nmm));	
				req.setAttribute("model", mb);
				req.getRequestDispatcher("gestion_medicamans.jsp").forward(req, resp);
			}	
		}
        else
        {
		String nom = req.getParameter("nom");
		String prix= req.getParameter("prix");
		String des= req.getParameter("des");
		String date_prod= req.getParameter("date_prod");
		String date_fin= req.getParameter("date_fin");
		String cons= req.getParameter("cons");
		
		Medicament m = new Medicament(1l, nom ,cons, des , prix, date_prod, date_fin);	
		op.add(m);
		
		MedicamentBeans mb = new MedicamentBeans();	
		mb.setList(op.getAll());	
		req.setAttribute("model", mb);
		req.getRequestDispatcher("gestion_medicamans.jsp").forward(req, resp);	
        }
	}
	}
