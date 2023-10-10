package fr.diginamic.chaines;

import entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;2 523.5";
		System.out.println("Premier caractere : " + chaine.charAt(0));
		System.out.println("La longueure de la chaine est de :" + chaine.length());
		System.out.println("L'index du premier ';' est :" + chaine.indexOf(';'));
		System.out.println("La chaine contenu entre l'index 7 et l'index 13 est : " + chaine.substring(7, 13));
		System.out.println("Le nom de famille est : " + chaine.substring(0, 7).toUpperCase());
		System.out.println("Le prenom est : " + chaine.substring(7, 13).toLowerCase());
		String[] tableau;
		tableau = chaine.split(";");

		for (int i = 0; i < tableau.length; i++) {
			System.out.println(tableau[i]);
		}

		Salarie salarie1 = new Salarie();
		salarie1.setNom(tableau[0].toUpperCase());
		salarie1.setPrenom(tableau[1]);
		salarie1.setSalaire(Double.parseDouble(tableau[2].replace(" ", "")));
		System.out.println(salarie1.toString());
	}
}
