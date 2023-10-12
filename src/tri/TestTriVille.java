package tri;

import java.util.ArrayList;
import java.util.Collections;

import listes.Ville;

public class TestTriVille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Ville> listeVille = new ArrayList<Ville>();
		listeVille.add(new Ville("Nice", 343000));
		listeVille.add(new Ville("Carcassonne", 47800));
		listeVille.add(new Ville("Narbonne", 53400));
		listeVille.add(new Ville("Lyon", 484000));
		listeVille.add(new Ville("Foix", 9700));
		listeVille.add(new Ville("Pau", 77200));
		listeVille.add(new Ville("Marseille", 850700));
		listeVille.add(new Ville("Tarbes", 40600));

		// trie par nombre d'habitants
		System.out.println("Trie par nombre d'habitants :");
		Collections.sort(listeVille, new ComparatorHabitant());
		for (Ville ville : listeVille) {
			System.out.println(ville.getNom() + " " + ville.getNbHabitants());
		}

		System.out.println(" \n-----------------------------------------------------------------------\n");
		
		// trie par nom d'habitants
		System.out.println("Trie par nom de ville : ");
		Collections.sort(listeVille, new ComparatorNom());
		for (Ville ville : listeVille) {
			System.out.println(ville.getNom() + " " + ville.getNbHabitants());
		}
	}

}
