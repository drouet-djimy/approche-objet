package fr.diginamic.recensement;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import maps.Pays;

public class RechercheDepartementPlusPeuple extends MenuService {

	@Override
	public void traiter(List<Ville> listeVille, Scanner scanner) {
		// Compter les habitants par region : aggrégation.

		// Etape 1 : créer une map avec pour clé la region et pour valeur un
		// compteur.
		HashMap<String, Integer> comptage = new HashMap<>();

		// Etape 2 : initialiser les compteurs
		for (Ville ville : listeVille) {
			System.out.println(ville.getPopulationTotale());
		}
		// Etape 3 : comptage
		for (Ville ville : listeVille) {
			if(ville.getPopulationTotale()==0) {
				
			}
			Integer compteur =ville.getPopulationTotale();
			compteur=compteur+comptage.get(ville.getPopulationTotale());
			comptage.put(ville.getCodeDepartement(), compteur);
		}
		System.out.println(comptage);
	}
}