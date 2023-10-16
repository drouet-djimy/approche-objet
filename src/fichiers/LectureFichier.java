package fichiers;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		// initie le tableau de ligneSplit
		String[] ligneSplit = null;
		// initie liste de ville
		List<Ville> listeVille = new ArrayList<Ville>();
		// inite le chemin du document a écrire et celui a lire
		List<String> entete = new ArrayList<String>();
		List<String> listeVilleString = new ArrayList<String>();
		Path path = Paths.get(
				"D:\\DEV\\Java\\workspace-pring-tool-suite-4-4.18.1\\approche-objet\\src\\fichiers\\recensement.csv");

		Path path2 = Paths.get(
				"D:\\DEV\\Java\\workspace-pring-tool-suite-4-4.18.1\\approche-objet\\src\\fichiers\\listeVille.csv");

		boolean exists = Files.exists(path);
		boolean estFichier = Files.isRegularFile(path);
		boolean estLisible = Files.isReadable(path);
		// initie la liste des lignes
		List<String> lines = null;
		// si le fichier existe, que c'est un fichier et qu'il est lisible alors
		// enregistre chaque ligne dans la liste 'lines'
		if (exists == true && estFichier == true && estLisible == true) {
			lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		}
		for (String ligne : lines) {
			ligneSplit = ligne.split(";");
		}
		for (int i = 1; i < lines.size(); i++) {
			listeVille.add(new Ville(ligneSplit[6], ligneSplit[0], ligneSplit[1],
					Integer.parseInt((ligneSplit[9]).replaceAll(" ", ""))));
			System.out.println(Integer.parseInt((ligneSplit[9]).replaceAll(" ", "")));
//			if (Integer.parseInt((ligneSplit[9]).replaceAll(" ", "")) > 25000) {
//				listeVilleString.add((ligneSplit[6] + ";" + ligneSplit[0] + ";" + ligneSplit[1] + ";" + ligneSplit[9]));
//				System.out.println(listeVilleString);
//			}
		}

		// création du fichier
		String formaterHeader = (ligneSplit[6] + ";" + ligneSplit[0] + ";" + ligneSplit[1] + ";" + ligneSplit[9]);
		entete.add(formaterHeader);
		if (Files.exists(path2) == false) {
			Files.createFile(path2);
		}
		Files.write(path2, entete, StandardOpenOption.APPEND);
		Files.write(path2, listeVilleString, StandardOpenOption.APPEND);
		System.out.println(entete);
	}
}
