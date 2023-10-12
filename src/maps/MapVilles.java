package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import listes.Ville;

public class MapVilles {

	public static void main(String[] args) {
		int nbHabitant;
		String nom;
		int nbHabitantMin = 999999999;
		HashMap<String, Integer> mapVille = new HashMap<>();
		ArrayList<Ville> listeVille = new ArrayList<Ville>();
		Ville ville1 = new Ville("Nice", 343000);
		Ville ville2 = new Ville("Carcassonne", 47800);
		Ville ville3 = new Ville("Narbonne", 53400);
		Ville ville4 = new Ville("Lyon", 484000);
		Ville ville5 = new Ville("Foix", 9700);
		Ville ville6 = new Ville("Pau", 77200);
		Ville ville7 = new Ville("Marseille", 850700);
		Ville ville8 = new Ville("Tarbes", 40600);

		listeVille.add(ville1);
		listeVille.add(ville2);
		listeVille.add(ville3);
		listeVille.add(ville4);
		listeVille.add(ville5);
		listeVille.add(ville6);
		listeVille.add(ville7);
		listeVille.add(ville8);

		// initie mapVille avec les données de listeVille
		for (Ville ville : listeVille) {
			nom = ville.getNom();
			nbHabitant = ville.getNbHabitants();
			mapVille.put(nom, nbHabitant);
		}
		// trouve le nombre minimum d'habitant
		Iterator<Integer> iter = mapVille.values().iterator();
		while (iter.hasNext()) {
			if (iter.next() < nbHabitantMin) {
				nbHabitantMin = iter.next();
			}
		}
		// supprime la ville avec le minimum d'habitant
		Iterator<Integer> itera = mapVille.values().iterator();
		while (itera.hasNext()) {
			if (itera.next() == nbHabitantMin) {
				iter.remove();
			}
		}
		for(String ville :mapVille.keySet()){
			System.out.println(ville);
		}
	}

}
