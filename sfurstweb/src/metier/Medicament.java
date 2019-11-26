package metier;

public class Medicament {
	 private Long id;
	 private String nom,prix,date_prod,date_fin,des,cons;
	 
	public String getCons() {
			return cons;
	}

	public void setCons(String cons) {
			this.cons = cons;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

	public String getDate_prod() {
		return date_prod;
	}

	public void setDate_prod(String date_prod) {
		this.date_prod = date_prod;
	}

	public String getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(String date_fin) {
		this.date_fin = date_fin;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	
    public Medicament(String nom,String cons, String des, String prix, String date_prod, String date_fin) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.date_prod = date_prod;
		this.date_fin = date_fin;
		this.des = des;
		this.cons = cons;
	}

	public Medicament() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medicament(Long id, String nom,String cons, String des, String prix, String date_prod, String date_fin) {
		super();
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.date_prod = date_prod;
		this.date_fin = date_fin;
		this.des = des;
		this.cons = cons;
	}
}
