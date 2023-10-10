package fr.diginamic.salaire;

public abstract class Intervenant {
	String nom;
	String prenom;
	
	public Intervenant(String nom, String prenom) {
		this.nom=nom;
		this.prenom=prenom;
	}
	
	public abstract double getSalaire();

	public abstract String getStatus();
	
	public void afficherDonnees() {
		System.out.println(getStatus()+" [ "+"Nom :"+nom+ " | Prenom : "+prenom+"  | Salaire : "+getSalaire()+" ]");
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
}
