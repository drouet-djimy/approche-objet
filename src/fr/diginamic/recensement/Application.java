package fr.diginamic.recensement;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		String choix;

		System.out.println("1. Population d'une ville donnee");
		System.out.println("2. Population d'un departement donnee");
		System.out.println("3. Population d'une region donnee");
		System.out.println("4. Afficher les 10 regions les plus peuples");
		System.out.println("5. Afficher les 10 departements les plus peuples");
		System.out.println("6. Afficher les 10 villes les plus peuples d'un departement");
		System.out.println("7. Afficher les 10 villes les plus peuples d'une region");
		System.out.println("8. Afficher les 10 villes les plus peuples de France");
		System.out.println("9. Sortir");
		choix = scanner.nextLine();
		List<Ville> listeVille = Recensement.getListVille();
		switch (choix) {
		case "1": {
			RecherchePopulationVille recherche = new RecherchePopulationVille();
			recherche.traiter(listeVille, scanner);
			break;
		}
		case "2": {
			RecherchePopulationDepartement recherche = new RecherchePopulationDepartement();
			recherche.traiter(listeVille, scanner);
			break;
		}
		case "3": {
			RecherchePopulationRegion recherche = new RecherchePopulationRegion();
			recherche.traiter(listeVille, scanner);
			break;
		}
		case "4": {
			RechercheRegionPlusPeuple recherche = new RechercheRegionPlusPeuple();
			recherche.traiter(listeVille, scanner);
			break;
		}
		case "5": {
			RechercheDepartementPlusPeuple recherche = new RechercheDepartementPlusPeuple();
			recherche.traiter(listeVille, scanner);
			break;
		}
		case "6": {
			Recherche10VilleDepartementPlusPeuple recherche = new Recherche10VilleDepartementPlusPeuple();
			recherche.traiter(listeVille, scanner);
			break;
		}
		case "7": {
			Recherche10VilleRegionPlusPeuple recherche = new Recherche10VilleRegionPlusPeuple();
			recherche.traiter(listeVille, scanner);
			break;
		}
		case "8": {
			Recherche10VillePlusPeuple recherche = new Recherche10VillePlusPeuple();
			recherche.traiter(listeVille, scanner);
			break;
		}
		case "9": {
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choix);
		}
	}
}
