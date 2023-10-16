package fichiers;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path path = Paths.get(
				"D:\\DEV\\Java\\workspace-pring-tool-suite-4-4.18.1\\approche-objet\\src\\fichiers\\recensement.csv");
		Path path2 = Paths.get(
				"D:\\DEV\\Java\\workspace-pring-tool-suite-4-4.18.1\\approche-objet\\src\\fichiers\\recensement2.csv");

		boolean exists = Files.exists(path);
		boolean estFichier = Files.isRegularFile(path);
		boolean estLisible = Files.isReadable(path);
		List<String> lines = null;
		if (exists == true && estFichier == true && estLisible == true) {
			lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		}

		ArrayList<String> lignes = new ArrayList<String>();
		for (int i = 0; i < 100; i++) {
			lignes.add(lines.get(i));
		}

		if (Files.exists(path2) == false) {
			Files.createFile(path2);
		}
		Files.write(path2, lignes, StandardOpenOption.APPEND);

	}

}
