package entites;

public class TestAdressePostale {
	public static void main (String[]args) {
		AdressePostale adresseDjimy = new AdressePostale(306,"Le moulin du pont",49600,"Beaupreau en mauges");
		AdressePostale adresseBastien = new AdressePostale(24,"Rue de périgné",17000,"La rochelle");
		
		System.out.println("adresse de Djimy = "+adresseDjimy);
		System.out.println("adresse de Bastien = "+adresseBastien);

	}
}
