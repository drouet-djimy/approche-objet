package fichiers;

public class Ville {
	String nom;
	String codeDepartement;
	String nomRegion;
	int population;
	/**
	 * @param nom
	 * @param codeDepartement
	 * @param nomRegion
	 * @param population
	 */
	public Ville(String nom, String codeDepartement, String nomRegion, int population) {
		super();
		this.nom = nom;
		this.codeDepartement = codeDepartement;
		this.nomRegion = nomRegion;
		this.population = population;
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
	 * @return the codeDepartement
	 */
	public String getCodeDepartement() {
		return codeDepartement;
	}
	/**
	 * @param codeDepartement the codeDepartement to set
	 */
	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}
	/**
	 * @return the nomRegion
	 */
	public String getNomRegion() {
		return nomRegion;
	}
	/**
	 * @param nomRegion the nomRegion to set
	 */
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}
	/**
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}
	/**
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}
	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", codeDepartement=" + codeDepartement + ", nomRegion=" + nomRegion
				+ ", population=" + population + "]";
	}

	
}
