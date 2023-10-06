package entites;

import entites2.Personne;

public class TestPersonne {
	public static void main(String[] args) {
		
		AdressePostale adresseDjimy = new AdressePostale(306,"Le moulin du pont",49600,"Beaupreau en mauges");
		Personne Djimy = new Personne("Drouet","Djimy",adresseDjimy);
		
		AdressePostale adresseBastien = new AdressePostale(24,"Rue de périgné",17000,"La rochelle");
		Personne Bastien = new Personne("Rollat","Bastien",adresseBastien);
		
		System.out.println("Affichage de Djimy : " + Djimy);
		System.out.println("Affichage de Bastien : " + Bastien);

	}
}
