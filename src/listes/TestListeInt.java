package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeInt {

	public static void main(String args[]) {
		ArrayList<Integer> liste = new ArrayList<Integer>();
		liste.add(-1);
		liste.add(5);
		liste.add(7);
		liste.add(3);
		liste.add(-2);
		liste.add(4);
		liste.add(8);
		liste.add(5);

		for (int entier : liste) {
			System.out.print(entier + " ");
		}
		// taille de la liste
		System.out.print(liste.size());
		// nombre max de la liste
		int max = Collections.max(liste);
		System.out.println("\nLe nombre maximum de la liste est : " + max);
		// trouve le plus petit nombre de la liste
		int min = Collections.min(liste);
		// parcours de la liste et suppression du plus petit nombre
		Iterator<Integer> iter = liste.iterator();
		while (iter.hasNext()) {
			int nombre = iter.next();
			if (nombre == min) {
				iter.remove();
			}
		}
		// parcours de la liste et affichage
		for (int entier : liste) {
			System.out.print(entier + " ");
		}

		// transforme les élements négatifs en positifs
		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i) < 0) {
				liste.set(i, liste.get(i) * -1);
			}
		}
		// parcours de la liste et affichage
		System.out.println("");
		for (int entier : liste) {
			System.out.print(entier + " ");
		}
	}

}
