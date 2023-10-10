package fr.diginamic.jdr.Test;

import fr.diginamic.jdr.Personnage;
public class TestPersonnage {

	public static void main(String[]args) {
		Personnage Tazzeur= new Personnage();
		System.out.println(Tazzeur.getForce());
		System.out.println(Tazzeur.getHp());
		Tazzeur.getStats();

	}
}
