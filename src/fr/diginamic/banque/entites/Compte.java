package fr.diginamic.banque.entites;
public class Compte {
	int numero =145865;
	float solde =14500.49f;
	
	public Compte(int numero, float solde) {
		this.numero = numero;
		this.solde = solde;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the solde
	 */
	public float getSolde() {
		return solde;
	}

	/**
	 * @param solde the solde to set
	 */
	public void setSolde(float solde) {
		this.solde = solde;
	}
	
}
