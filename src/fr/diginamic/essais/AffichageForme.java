package fr.diginamic.essais;

import fr.diginamic.formes.*;
public class AffichageForme {
	
		 public static void AffichageForme(Forme forme) {
			double surface=forme.calculerSurface();
			double perimetre=forme.calculerPerimetre();
			System.out.println("La surface est de : "+surface+" et le perimetre est de : "+perimetre+"\n");
		}
	

}
