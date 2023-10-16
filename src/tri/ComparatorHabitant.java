package tri;

import java.util.Comparator;

import listes.Ville;

public class ComparatorHabitant implements Comparator<Ville> {

	@Override
	public int compare(Ville v1, Ville v2) {
		int resultat;
		if(v1.getNbHabitants() >v2.getNbHabitants()) {
			resultat=1;
		}
		if(v1.getNbHabitants() < v2.getNbHabitants()) {
			resultat=-1;
		}
		else {
			resultat=0;
		}
		return resultat;
	}

}
