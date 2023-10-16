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
public class RecherchePopulationVille extends MenuService {

	@Override
	public void traiter(List<Ville> listeVille, Scanner scanner) {
		String nomCommune;
		System.out.println("Saisissez la ville dont vous souhaitez connaitre la population :");
		nomCommune=scanner.nextLine();
		for (Ville ville :listeVille ) {
			if(ville.getNomCommune().equals(nomCommune)) {
				System.out.println(ville.toString());
			}
		}
	}

} 