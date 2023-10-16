package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Recherche10VillePlusPeuple extends MenuService {

	public Recherche10VillePlusPeuple() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void traiter(List<Ville> listeVille, Scanner scanner) {
		// TODO Auto-generated method stub

		List<Ville> listeVilleTri = new ArrayList<Ville>();
		System.out.println(
				"Voici les 10 villes de France comptant le plus d'habitants :");
		
		Collections.sort(listeVille, new ComparatorPopulation());
		for (int i =0; i<10;i++) {
			listeVilleTri.add(listeVille.get(i));
		}
		for (Ville ville : listeVilleTri) {
			System.out.println(ville.toString());
		}

	}

}
