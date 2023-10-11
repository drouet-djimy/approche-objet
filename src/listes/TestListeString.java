package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] agrs) {
		int nbLettre = 0;
		ArrayList<String> liste = new ArrayList<String>();
		liste.add("Nice");
		liste.add("Carcassonne");
		liste.add("Narbonne");
		liste.add("Lyon");
		liste.add("Foix");
		liste.add("Pau");
		liste.add("Marseille");
		liste.add("Tarbes");

		// recherche du plus grand nombre de lettre dans la liste
		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i).length() > nbLettre) {
				nbLettre = (liste.get(i).length());
			}
		}
		// affichage de la ville avec le plus de lettre de la liste
		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i).length() == nbLettre) {
				System.out.println(liste.get(i));
			}
		}
		// mettre toutes les villes de la liste en majuscule
		for (int i = 0; i < liste.size(); i++) {
			liste.set(i, liste.get(i).toUpperCase());
		}
		// affichage de la liste
		for (String ville : liste) {
			System.out.print(ville + " ");
		}

		// parcours de la liste et suppression des villes commencant par N
		Iterator<String> iter = liste.iterator();
		while (iter.hasNext()) {
			String ville = iter.next();
			if (ville.charAt(0)=='N') {
				iter.remove();
			}
		}
		
		// affichage de la liste
			System.out.println("");
				for (String ville : liste) {
					System.out.print(ville + " ");
				}
	}

}
