package entites2;

import entites.*;

public class Personne {
	
	public String nom;
	public String prenom;
	public AdressePostale adresse;
	
	public Personne(String nom, String prenom, AdressePostale adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	public void getPrenomNom() {
		System.out.println("Prénom : "+prenom);
		System.out.println("nom : "+nom);
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public AdressePostale getAdresse() {
		return adresse;
	}
	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}
	
	
	
}
