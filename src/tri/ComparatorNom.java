package tri;

import java.util.Comparator;

import listes.Ville;

public class ComparatorNom implements Comparator<Ville> {

	public ComparatorNom() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Ville v1, Ville v2) {
		// TODO Auto-generated method stub
		return v1.getNom().compareTo(v2.getNom());
	}

}
