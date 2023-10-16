package fr.diginamic.recensement;

import java.util.Comparator;

public class ComparatorPopulation implements Comparator<Ville> {

	public int compare(Ville v1, Ville v2) {
		int resultat=0;
		if(v1.getPopulationTotale() <v2.getPopulationTotale()) {
			resultat=1;
		}
		if(v1.getPopulationTotale() > v2.getPopulationTotale()) {
			resultat=-1;
		}
		return resultat;
	}
}
