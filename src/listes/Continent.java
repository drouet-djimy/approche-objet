package listes;

public enum Continent {
	EUROPE ("Europe"),
	ASIE ("Asie"),
	AMERIQUE("Amerique"),
	AFRIQUE ("Afrique"),
	OCEANIE ("Oceanie");
	String libelle;
	
	private Continent(String libelle) {
		this.libelle=libelle;
	}

	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
}
