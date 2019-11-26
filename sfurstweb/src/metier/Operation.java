package metier;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;


public class Operation {

	private ArrayList<Medicament> lst = new ArrayList<>();

	public ArrayList<Medicament> getLst() {
		return lst;
	}

	public void setLst(ArrayList<Medicament> lst) {
		this.lst = lst;
	}
	
	public void add(Medicament m)
	{
		try {
			//1 
			Class.forName("com.mysql.jdbc.Driver");
			//2
			java.sql.Connection cn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionpharmacie","root","");
			//3
			PreparedStatement pr =cn.prepareStatement("INSERT INTO medicament VALUES(NULL,?,?,?,?,?,?) ");
			pr.setString(1,m.getNom());
			pr.setString(2,m.getCons());
			pr.setString(3,m.getDes());
			pr.setString(4,m.getPrix());
			pr.setString(5,m.getDate_prod());
			pr.setString(6,m.getDate_fin());
			//4
			pr.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lst.add(m);
	}
    
	public void remove(Long id)
	
	{
		try {
			//1 
			Class.forName("com.mysql.jdbc.Driver");
			//2
			java.sql.Connection cn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionpharmacie","root","");
			//3
			PreparedStatement pr =cn.prepareStatement("DELETE FROM medicament where id =? ");
		pr.setLong(1,id);
			//4
			pr.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
		/*for(Medicament m : lst)
		{
			if(m.getId() == id)
			{
				lst.remove(m);
				break;
			}
		}*/
	}

    public ArrayList<Medicament> getAll(){
    	ArrayList<Medicament> listmedicament = new ArrayList<Medicament>() ;
		try {
			//1 
			Class.forName("com.mysql.jdbc.Driver");
			//2
			java.sql.Connection cn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionpharmacie","root","");
			//3
			PreparedStatement pr = cn.prepareStatement("SELECT * FROM medicament");	
			//4
			ResultSet rs=pr.executeQuery();
			//5
			while (rs.next()){
				Medicament m =new Medicament();
				m.setId(rs.getLong("id"));
				m.setNom(rs.getString("nom"));
				m.setPrix(rs.getString("prix"));
				m.setDes(rs.getString("description"));
				m.setDate_prod(rs.getString("date_de_production"));
				m.setDate_fin(rs.getString("date_de_fin"));
				m.setCons(rs.getString("concentration"));
				listmedicament.add(m);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
    	return listmedicament;
    }
    
    public ArrayList<Medicament> getMoc(String nm){
	ArrayList<Medicament> listmedicament = new ArrayList<Medicament>() ;
	try {
		//1 
		Class.forName("com.mysql.jdbc.Driver");
		//2
		java.sql.Connection cn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionpharmacie","root","");
		//3
		PreparedStatement pr =cn.prepareStatement("SELECT * FROM medicament WHERE nom = ? ");	
		//4
		pr.setString(1,nm);
		ResultSet rs=pr.executeQuery();
		//5
		
		while (rs.next()){
			Medicament m =new Medicament();
			m.setId(rs.getLong("id"));
			m.setNom(rs.getString("nom"));
			m.setPrix(rs.getString("prix"));
			m.setDes(rs.getString("description"));
			m.setDate_prod(rs.getString("date_de_production"));
			m.setDate_fin(rs.getString("date_de_fin"));
			m.setCons(rs.getString("concentration"));
			listmedicament.add(m);
			
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();}
	return listmedicament;
}
}
