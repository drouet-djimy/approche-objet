package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
	public static void main(String[]args) {
		System.out.println("La moyenne de ce tableau est de : "+CalculMoyenne.calcul());
		
		CalculMoyenne.ajout(20);
		
		System.out.println("La moyenne de ce tableau est de : "+CalculMoyenne.calcul());

	}
}
