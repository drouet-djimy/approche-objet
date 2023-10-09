package fr.diginamic.banque.entites;

public class Compte {
	int numero;
	double moontant;
	
	public Compte(int numero, double moontant) {
		super();
		this.numero = numero;
		this.moontant = moontant;
		
		
	}

	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", moontant=" + moontant + "]";
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
	public double getMoontant() {
		return moontant;
	}

	/**
	 * @param moontant the moontant to set
	 */
	public void setMoontant(double moontant) {
		this.moontant = moontant;
	}
	
}
