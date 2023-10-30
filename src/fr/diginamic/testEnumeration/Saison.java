package fr.diginamic.testEnumeration;

public enum Saison {

	PRINTEMPS("Printemps", 0), ETE("Ete", 1), AUTOMNE("Automne", 2), HIVER("Hiver", 3);

	private String libelle;
	int numeroOrdre;

	private Saison(String nom, int numeroOrdre) {
		this.libelle = nom;
		this.numeroOrdre = numeroOrdre;
	}

	/**
	 * @return the nom
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * @return the numeroOrdre
	 */
	public int getNumeroOrdre() {
		return numeroOrdre;
	}

	/**
	 * @param numeroOrdre the numeroOrdre to set
	 */
	public void setNumeroOrdre(int numeroOrdre) {
		this.numeroOrdre = numeroOrdre;
	}

	public static Saison getSaison(String nom) {
		Saison[] saisons = Saison.values();
		for (Saison saison : saisons) {
			if (saison.getLibelle().equals(nom)) {
				return saison;
			}
		}
		return null;
	}

}
