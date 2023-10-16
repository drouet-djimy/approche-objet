package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Recherche10VilleRegionPlusPeuple extends MenuService {

	@Override
	public void traiter(List<Ville> listeVille, Scanner scanner) {
		String nomRegion;
		List<Ville> listeVilleRegion = new ArrayList<Ville>();
		System.out.println(
				"Saisissez le nom de la region dont vous souhaitez connaitre les 10 villes les plus peuples :");
		nomRegion = scanner.nextLine();
		for (Ville ville : listeVille) {
			if (ville.getNomRegion().equals(nomRegion)) {
				listeVilleRegion.add(ville);
			}
		}
		Collections.sort(listeVilleRegion, new ComparatorPopulation());
//		for (int i = 0; i < 10; i++) {
//			System.out.println(listeVilleRegion.get(i).getNomCommune() +" "+listeVilleRegion.get(i).getPopulationTotale()+" habitants");
//		}
		for (Ville ville :listeVilleRegion) {
			System.out.println(ville.toString());
		}
	}

}
