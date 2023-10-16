package fr.diginamic.recensement;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class RechercheRegionPlusPeuple extends MenuService {

	public RechercheRegionPlusPeuple() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void traiter(List<Ville> listeVille, Scanner scanner) {
		// Compter les habitants par region : aggrégation.

		// Etape 1 : créer une map avec pour clé la region et pour valeur un
		// compteur.
		HashMap<String, Integer> comptage = new HashMap<>();

		// Etape 2 : initialiser les compteurs
		for (Ville ville : listeVille) {
			if (comptage.get(ville.getNomRegion()) == null) {
				comptage.put(ville.getNomRegion(), 0);
			}
		}
		// Etape 3 : comptage
		for (Ville ville : listeVille) {
			if (ville.getPopulationTotale() == 0) {

			}
			Integer compteur = ville.getPopulationTotale();
			compteur = compteur + comptage.get(ville.getPopulationTotale());
			comptage.put(ville.getNomRegion(), compteur);
		}
		System.out.println(comptage);
	}
}
