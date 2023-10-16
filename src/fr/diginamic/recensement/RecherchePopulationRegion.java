/**
 * 
 */
package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

/**
 * @author Djimy Drouet
 *
 */
public class RecherchePopulationRegion extends MenuService {

	@Override
	public void traiter(List<Ville> listeVille, Scanner scanner) {
		String nomRegion;
		int nbHabitantTotal = 0;
		System.out.println("Saisissez la region dont vous souhaitez connaitre la population :");
		nomRegion=scanner.nextLine();
		for (Ville ville :listeVille ) {
			if(ville.getNomRegion().equals(nomRegion)) {
				nbHabitantTotal=nbHabitantTotal+ville.getPopulationTotale();
			}
		}
		System.out.println("Au total il y a "+nbHabitantTotal+" habitants dans le departement "+nomRegion);

	}

}
