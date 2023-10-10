package fr.diginamic.essais;

import fr.diginamic.salaire.*;
public class TestIntervenant {

	public static void main(String[]args) {
		Salarie salarie = new Salarie("LetoileDeMer", "Patrick", 1240);
		Pigiste pigiste = new Pigiste("Lebon", "hubert", 3, 340);
		
		System.out.println("le salaire de : "+salarie.getPrenom()+" "+salarie.getNom()+" est de : " + salarie.getSalaire());
		System.out.println("le salaire de : "+pigiste.getPrenom()+" "+pigiste.getNom()+" est de : " + pigiste.getSalaire());

		salarie.afficherDonnees();
		pigiste.afficherDonnees();
	}

}
