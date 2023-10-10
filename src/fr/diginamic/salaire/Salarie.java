package fr.diginamic.salaire;

public class Salarie extends Intervenant {
	double salaire;
	
	public Salarie(String nom, String prenom,double salaire) {
		super(nom, prenom);
		this.salaire=salaire;
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return salaire;
	}
	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return "Salarie";
	}
	

}
