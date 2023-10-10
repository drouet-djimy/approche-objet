package fr.diginamic.essais;

import fr.diginamic.formes.*;

public class TesteForme {
	
	public static void main (String[]args) {
	Forme cercle=new Cercle(4);
	Forme carre = new Carre(10);
	Forme rectangle = new Rectangle(10, 5);
	System.out.println("pour le cercle :");
	AffichageForme.AffichageForme(cercle);
	System.out.println("pour le carre :");
	AffichageForme.AffichageForme(carre);
	System.out.println("pour le rectangle :");
	AffichageForme.AffichageForme(rectangle);
	}
}
