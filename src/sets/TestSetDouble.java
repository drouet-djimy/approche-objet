package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {

	public static void main(String[] args) {
		HashSet<Double> set = new HashSet<Double>();
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
		Double max = -99999999999999999999999999d;
		Double min = 99999999999999999999999999d;
		//boucle qui affiche le set 
				for (Double valeur : set) {
					System.out.print(valeur+" ");
				}
				
		// boucle parcourant le set et enregistrant la plus grande et la plus petite
		// valeur
		for (Double valeur : set) {
			if (valeur > max) {
				max = valeur;
			}
			if (valeur < min) {
				min = valeur;
			}
		}
		System.out.println("\nLa valeur max du set est : " + max);

		// boucle parcourant le set et supprimant la plus petite valeur
		Iterator<Double> iter = set.iterator();
		while (iter.hasNext()) {
			Double valeur = iter.next();
			if (valeur == min) {
				iter.remove();
			}
		}
		
		//boucle qui affiche le set 
		for (Double valeur : set) {
			System.out.print(valeur+" ");
		}
	}
}
