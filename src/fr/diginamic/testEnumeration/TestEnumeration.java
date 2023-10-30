package fr.diginamic.testEnumeration;

public class TestEnumeration {
	public static void main(String[] args) {
		Saison[] listeSaison = Saison.values();
		String nom = "ETE";
		for (Saison saison : listeSaison) {
			System.out.println(saison.getLibelle());
		}
		System.out.println("\n" + Saison.valueOf(nom).getLibelle());
		
		System.out.println(Saison.getSaison("Printemps"));
	}
}
