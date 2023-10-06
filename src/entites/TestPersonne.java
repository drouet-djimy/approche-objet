package entites;

import entites2.Personne;

public class TestPersonne {
	public static void main(String[] args) {
		Personne Djimy = new Personne();
		AdressePostale adresseDjimy = new AdressePostale();
		adresseDjimy.ville = "Beaupreau";
		adresseDjimy.numeroRue = 306;
		adresseDjimy.libelleRue = "Le moulin du pont";
		adresseDjimy.codePostal = 49600;

		Djimy.nom = "Drouet";
		Djimy.prenom = "Djimy";
		Djimy.adresse = adresseDjimy;

		Personne Bastien = new Personne();
		AdressePostale adresseBastien = new AdressePostale();
		adresseBastien.ville="La rochelle";
		adresseBastien.numeroRue=24;
		adresseBastien.libelleRue="Rue de périgné";
		adresseBastien.codePostal=17000;
		
		Bastien.nom="Rollat";
		Bastien.prenom="Bastien";
		Bastien.adresse =adresseBastien;
	}
}
