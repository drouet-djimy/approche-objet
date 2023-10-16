package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Recherche10VilleDepartementPlusPeuple extends MenuService {

	@Override
	public void traiter(List<Ville> listeVille, Scanner scanner) {
		String numDepartement;
		List<Ville> listeVilleDepartement = new ArrayList<Ville>();
		System.out.println(
				"Saisissez le numéro de département dont vous souhaitez connaitre les 10 villes les plus peuples :");
		numDepartement = scanner.nextLine();
		for (Ville ville : listeVille) {
			if (ville.getCodeDepartement().equals(numDepartement)) {
				listeVilleDepartement.add(ville);
			}
		}
		Collections.sort(listeVilleDepartement, new ComparatorPopulation());
		for (int i = 0; i < 10; i++) {
			System.out.println(listeVilleDepartement.get(i).getNomCommune() +" "+listeVilleDepartement.get(i).getPopulationTotale()+" habitants");
		}
	}
}
