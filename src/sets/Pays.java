package sets;

public class Pays {
	String nom;
	int nbHabitant;
	double pibHabitant;
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
	 * @return the nbHabitant
	 */
	public int getNbHabitant() {
		return nbHabitant;
	}
	/**
	 * @param nbHabitant the nbHabitant to set
	 */
	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}
	/**
	 * @return the pibHabitant
	 */
	public double getPibHabitant() {
		return pibHabitant;
	}
	/**
	 * @param pibHabitant the pibHabitant to set
	 */
	public void setPibHabitant(double pibHabitant) {
		this.pibHabitant = pibHabitant;
	}
	/**
	 * @param nom
	 * @param nbHabitant
	 * @param pibHabitant
	 */
	public Pays(String nom, int nbHabitant, double pibHabitant) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.pibHabitant = pibHabitant;
	}
	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nbHabitant=" + nbHabitant + ", pibHabitant=" + pibHabitant + "]";
	}

	
}
