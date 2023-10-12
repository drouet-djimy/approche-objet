package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		ArrayList<Pays> listePays = new ArrayList<Pays>();
		listePays.add(new Pays("France", 65, "Europe"));
		listePays.add(new Pays("Allemagne", 80, "Europe"));
		listePays.add(new Pays("Belgique", 10, "Europe"));
		listePays.add(new Pays("Russie", 150, "Asie"));
		listePays.add(new Pays("Chine", 1400, "Asie"));
		listePays.add(new Pays("Indonesie", 220, "Oceanie"));
		listePays.add(new Pays("Australie", 20, "Oceanie"));

		// Compter les pays par continent : aggrégation.

		// Etape 1 : créer une map avec pour clé le continent et pour valeur un
		// compteur.
		HashMap<String, Integer> comptage = new HashMap<>();

		// Etape 2 : initialiser les compteurs
		for (Pays pays : listePays) {
			if (comptage.get(pays.getContinent()) == null) {
				comptage.put(pays.getContinent(), 0);
			}
		}
		// Etape 3 : comptage
		for (Pays pays : listePays) {
			Integer compteur = comptage.get(pays.getContinent());
			compteur++;
			comptage.put(pays.getContinent(), compteur);
		}
		System.out.println(comptage);
	}
}
