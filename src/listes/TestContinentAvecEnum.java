package listes;

import java.util.ArrayList;

public class TestContinentAvecEnum {
	public static void main(String[]args) {
		ArrayList<Ville> listeVille = new ArrayList<Ville>();
		listeVille.add(new Ville("New York", 21, Continent.AMERIQUE));
		listeVille.add(new Ville("Paris", 2, Continent.EUROPE));
		listeVille.add(new Ville("Pekin", 21, Continent.ASIE));
		listeVille.add(new Ville("Moscou", 12, Continent.ASIE));
		listeVille.add(new Ville("Berlin", 4, Continent.EUROPE));
		listeVille.add(new Ville("Sydney", 5, Continent.OCEANIE));
		listeVille.add(new Ville("Sao Paulo", 12, Continent.AMERIQUE));
		listeVille.add(new Ville("Dakar", 1, Continent.AFRIQUE));
		
		for (Ville ville:listeVille) {
			System.out.println(ville.toString());
		}
	}
}
