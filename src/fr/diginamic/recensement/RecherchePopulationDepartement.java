package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

public class RecherchePopulationDepartement extends MenuService {

	@Override
	public void traiter(List<Ville> listeVille, Scanner scanner) {
		String numDepartement;
		int nbHabitantTotal = 0;
		System.out.println("Saisissez le departement dont vous souhaitez connaitre la population :");
		numDepartement=scanner.nextLine();
		for (Ville ville :listeVille ) {
			if(ville.getCodeDepartement().equals(numDepartement)) {
				nbHabitantTotal=nbHabitantTotal+ville.getPopulationTotale();
			}
		}
		System.out.println("Au total il y a "+nbHabitantTotal+" habitants dans le "+numDepartement);
	}

}
