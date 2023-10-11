package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

	public static void main(String args[]) {
		ArrayList<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");

		ArrayList<String> liste2 = new ArrayList<String>();
		liste1.add("Blanc");
		liste1.add("Bleu");
		liste1.add("Orange");
		// TODO Auto-generated constructor stub

		ArrayList<String> liste3 = new ArrayList<String>();

		for (int i = 0; i < liste1.size(); i++) {
			liste3.add(liste1.get(i));
		}
		for (int i = 0; i < liste2.size(); i++) {
			liste3.add(liste2.get(i));
		}
	}

}
