package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {
	public static void main(String[]args) {
		Cercle cercle1=CercleFactory.Create(2);
		Cercle cercle2=CercleFactory.Create(5);
		
		System.out.println("le perimetre du cercle 1 de rayon "+cercle1.getRayon()+" = "+cercle1.perimetre()+" et sa surface est de : "+cercle1.surface());
		System.out.println("le perimetre du cercle 2 de rayon "+cercle2.getRayon()+" = "+cercle2.perimetre()+" et sa surface est de : "+cercle2.surface());

	}
}
