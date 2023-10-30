package listes;

import java.util.Objects;

public class Ville implements Comparable<Ville> {
	String nom;
	int nbHabitants;
	Continent continent;

	public Ville() {
		nom = "ville";
		nbHabitants = 0;
		continent=null;
	}

	/**CONSTRUCTOR
	 * @param nom
	 * @param nbHabitants
	 * @param continent
	 */
	public Ville(String nom, int nbHabitants,Continent continent) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.continent=continent;
	}
	
	/**CONSTRUCTOR
	 * @param nom
	 * @param nbHabitants
	 */
	public Ville(String nom, int nbHabitants) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.continent=null;
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
	 * @return the nbHabitants
	 */
	public int getNbHabitants() {
		return nbHabitants;
	}

	/**
	 * @param nbHabitants the nbHabitants to set
	 */
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	public void getInfos() {
		System.out.println(nom + " Avec " + nbHabitants + " habitants");
	}
	
	

	/**
	 * @return the continent
	 */
	public Continent getContinent() {
		return continent;
	}

	/**
	 * @param continent the continent to set
	 */
	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	@Override
	public int compareTo(Ville ville) {
		int resultat;
		if (this.nbHabitants > ville.getNbHabitants()) {
			resultat = 1;
		}
		if (this.nbHabitants < ville.getNbHabitants()) {
			resultat = -1;
		} else {
			resultat = 0;
		}
		return resultat;
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitants=" + nbHabitants+ ", continent=" + continent.getLibelle() + "]";
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Ville)) {
			return false;
		}
		Ville other = (Ville) object;
		return (Objects.equals(this.getNom(), other.getNom())&& this.getNbHabitants()==other.nbHabitants);
	}
	@Override
	public int hashCode() {
	    return (int) getNbHabitants()*getNom().hashCode();
	}

}
