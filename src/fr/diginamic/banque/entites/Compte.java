package fr.diginamic.banque.entites;

public class Compte {
	int numero;
	double montant;
	
	public Compte(int numero, double moontant) {
		super();
		this.numero = numero;
		this.montant = moontant;
		
		
	}

	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", montant=" + montant + "]";
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
	 * @return the moontant
	 */
	public double getMontant() {
		return montant;
	}

	/**
	 * @param moontant the moontant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}
	
}
