package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestPays {

	public static void main(String[] args) {
		HashSet<Pays> set = new HashSet<Pays>();
		Pays usa = new Pays("USA", 323000000, 70248.63);
		Pays france = new Pays("France", 68042591, 43658.98);
		Pays allemagne = new Pays("Allemagne", 83240000, 51203.55);
		Pays uk = new Pays("UK", 66022000, 46510.28);
		Pays italie = new Pays("Italie", 60300000, 35657.50);
		Pays japon = new Pays("Japon", 125700000, 39312.66);
		Pays chine = new Pays("Chine", 1300000000, 12556.33);
		Pays russie = new Pays("Russie", 125700000, 12194.78);
		Pays inde = new Pays("Inde", 1428600000, 2256.59);
		set.add(usa);
		set.add(france);
		set.add(allemagne);
		set.add(uk);
		set.add(italie);
		set.add(japon);
		set.add(chine);
		set.add(russie);
		set.add(inde);

		// permet de définir le pays avec le plus haut PIB
		double pibMax = 0;
		for (Pays pays : set) {
			if (pays.getPibHabitant() > pibMax) {
				pibMax = pays.getPibHabitant();
			}
		}

		// affiche le pays avec le plus haut PIB
		for (Pays pays : set) {
			if (pays.getPibHabitant() == pibMax) {
				System.out.println("Le pays ayant le plus gros PIB/habitant est le : " + pays.getNom()
						+ " avec un PIB de " + pays.getPibHabitant() + " par habitant");
			}
		}

		// permet de définir le pays avec le plus haut PIB total
		double pibTotalMax = 0;
		for (Pays pays : set) {
			if (pays.getPibHabitant() * pays.getNbHabitant() > pibTotalMax) {
				pibTotalMax = pays.getPibHabitant() * pays.getNbHabitant();
			}
		}
		// affiche le pays avec le plus haut PIB total
		for (Pays pays : set) {
			if (pays.getPibHabitant() * pays.getNbHabitant() == pibTotalMax) {
				System.out.println("Le pays ayant le plus gros PIB total est le : " + pays.getNom()
						+ " avec un PIB total de " + pibTotalMax);
			}
		}
		// permet de définir le pays avec le plus petit PIB total
		double pibTotalMin = pibTotalMax;
		for (Pays pays : set) {
			if (pays.getPibHabitant() * pays.getNbHabitant() < pibTotalMin) {
				pibTotalMin = pays.getPibHabitant() * pays.getNbHabitant();
			}
		}
		// Met en majuscule le Pays avec le plus petit PIB total
		for (Pays pays : set) {
			if (pays.getPibHabitant() * pays.getNbHabitant() == pibTotalMin) {
				pays.setNom(pays.getNom().toUpperCase());
			}
		}
		
		Iterator<Pays> iter=set.iterator();
		while(iter.hasNext()) {
			Pays pays=iter.next();
			if (pays.getPibHabitant() * pays.getNbHabitant() == pibTotalMin) {
				iter.remove();
			}
		}
		for (Pays pays :set) {
			System.out.println(pays.toString()+" PIB total : "+pays.getNbHabitant()*pays.getPibHabitant());
		}
	}
		
}
