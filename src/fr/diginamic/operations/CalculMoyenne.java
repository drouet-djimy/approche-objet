package fr.diginamic.operations;

public class CalculMoyenne {
	static double[] tableau={14,12.5,8.5,17,9,5};
	
	public static void ajout(double nombre) {
		double[] array2 = new double[tableau.length+1];
		for(int i=0;i<tableau.length;i++) {
			array2[i]=tableau[i];
		}
		array2[array2.length-1]=nombre;
		tableau=array2;
	}
	
	public static double calcul() {
		double moyenne=0;
		for (int i=0; i<tableau.length;i++) {
			moyenne=moyenne+tableau[i];
		}
		moyenne=moyenne/tableau.length;
		return moyenne;
	}
}
