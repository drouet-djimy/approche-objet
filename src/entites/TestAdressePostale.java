package entites;

public class TestAdressePostale {
	public static void main (String[]args) {
		AdressePostale adresseDjimy = new AdressePostale();
		
		adresseDjimy.ville="Beaupreau";
		adresseDjimy.numeroRue =306;
		adresseDjimy.libelleRue = "Le moulin du pont";
		adresseDjimy.codePostal =49600;
		
		AdressePostale adresseBastien = new AdressePostale();
		
		adresseBastien.ville="La rochelle";
		adresseBastien.numeroRue=24;
		adresseBastien.libelleRue="Rue de périgné";
		adresseBastien.codePostal=17000;
		
	}
}
