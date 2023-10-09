package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	double tauxRemuneration;
	public CompteTaux(int numero, double moontant, double tauxRemuneration) {
		super(numero, moontant);
		this.tauxRemuneration=tauxRemuneration;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CompteTaux ["+"numero=" + numero + ", montant=" + montant
				+", taux remuneration=" + tauxRemuneration+"]";
	}
	

}
