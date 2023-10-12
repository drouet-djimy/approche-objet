package listes;

public class Ville implements Comparable<Ville>{
	String nom;
	int nbHabitants;
	
	public Ville() {
		nom="ville";
		nbHabitants=0;
		
	}
	/**
	 * @param nom
	 * @param nbHabitants
	 */
	public Ville(String nom, int nbHabitants) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
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
		System.out.println(nom+ " Avec "+nbHabitants+" habitants");
	}
	
	@Override
	public int compareTo(Ville ville) {
		int resultat;
		if(this.nbHabitants >ville.getNbHabitants()) {
			resultat=1;
		}
		if(this.nbHabitants < ville.getNbHabitants()) {
			resultat=-1;
		}
		else {
			resultat=0;
		}
		return resultat;
	}
	
	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitants=" + nbHabitants + "]";
	}
	
	
}
