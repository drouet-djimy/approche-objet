package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {
	public static void main(String[]args) {
		Theatre theatreNantes = new Theatre("theatreNantes",784,0,0);
		theatreNantes.inscrire(350, 17);
		theatreNantes.inscrire(400, 35);
		theatreNantes.inscrire(80, 17);
		
		System.out.println("Il y a "+theatreNantes.getNbInscrit()+" personnes inscrites");
		System.out.println("La recette est de : "+theatreNantes.getRecette());

	}
}
