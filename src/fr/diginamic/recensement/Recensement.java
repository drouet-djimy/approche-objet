package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Recensement {
	
	public static List<Ville> getListVille() throws IOException{
		Path path = Paths.get(
				"D:\\DEV\\Java\\workspace-pring-tool-suite-4-4.18.1\\approche-objet\\bin\\fr\\diginamic\\recensement\\tp 16 - recensement population 2016.csv");
		boolean exists = Files.exists(path);
		boolean estFichier = Files.isRegularFile(path);
		boolean estLisible = Files.isReadable(path);
// 		initie la liste des lignes du ficher et la liste de ville
		List<String> lines = null;
		List<Ville> recensement =new ArrayList<Ville>();
		//List<Ville> recensement = new ArrayList<Ville>();
//		initie le tableau de ligneSplit
		String[] ligneSplit = null;
//		Si le fichier existe le lit
		if (exists && estFichier && estLisible) {
			lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		}
// 		Pour chaques ligne créer une nouvelle ville basé sur les données du tableau et l'ajoute a la liste 'recensement'
		for (int i = 1; i < lines.size(); i++) {
			ligneSplit = lines.get(i).split(";");
			// créer une nouvelle ville basé sur les données du fichier, puis ajoute cette
			// ville a la liste 'recensement'
// 			Ville villeAdd =new Ville(int codeRegion, String nomRegion, int codeDepartement, int codeCommune, String nomCommune,int populationTotale)
			Ville villeAdd = new Ville(Integer.parseInt((ligneSplit[0]).replaceAll(" ", "")), // int codeRegion
					ligneSplit[1], // String nomRegion
					ligneSplit[2], // int codeDepartement
					Integer.parseInt((ligneSplit[5]).replaceAll(" ", "")), // int codeCommune
					ligneSplit[6], // String nomCommune
					Integer.parseInt((ligneSplit[9]).replaceAll(" ", ""))); // int populationTotale
			recensement.add(villeAdd);
		}
		return recensement;
	}
}
