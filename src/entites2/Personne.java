package entites2;

import entites.AdressePostale;

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
}
