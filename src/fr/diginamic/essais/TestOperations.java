package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
	public static void main(String[]args) {
		System.out.println("le resultat de l'operation 5+4 = "+Operations.calcul(5d, 4d, '+'));
		System.out.println("le resultat de l'operation 5-4 = "+Operations.calcul(5d, 4d, '-'));
		System.out.println("le resultat de l'operation 5*4 = "+Operations.calcul(5d, 4d, '*'));
		System.out.println("le resultat de l'operation 5/4 = "+Operations.calcul(5d, 4d, '/'));
	}
}
