package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {

	public TestMaison() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maison maison1= new Maison();
		
		Chambre chambre1 = new Chambre(14, 1);
		Chambre chambreEnfant = new Chambre(9, 1);
		Chambre chambreParentale = new Chambre(18, 1);
		Wc Wc =new Wc(4, 0);
		SalleDeBain sdb= new SalleDeBain(8, 1);
		Cuisine cuisine = new Cuisine(10, 0);
		Salon salon = new Salon(27, 0);
		maison1.ajouterPiece(null);
		maison1.ajouterPiece(chambre1);
		maison1.ajouterPiece(chambreEnfant);
		maison1.ajouterPiece(chambreParentale);
		maison1.ajouterPiece(Wc);
		maison1.ajouterPiece(sdb);
		maison1.ajouterPiece(cuisine);
		maison1.ajouterPiece(salon);
		
		System.out.println("La superficie totale est de : "+maison1.getSuperficietotale());
		System.out.println("La superficie du rez de chausse est de : "+maison1.getSuperficieParEtage(0));
		System.out.println("La superficie du 1er etage est de : "+maison1.getSuperficieParEtage(1));
		
		System.out.println("La superficie total de toutes les chambres est de : "+maison1.getSuperficieParTypePiece("Chambre"));
		System.out.println("Le nombre de pieces de type 'Chambre' est de  : "+maison1.getNbPiecesParTypePiece("Chambre"));

		
	}

}
