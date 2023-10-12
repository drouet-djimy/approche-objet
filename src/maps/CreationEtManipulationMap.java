package maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {

	public static void main(String[] args) {

		HashMap<Integer, String> mapVilles=new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34,"Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75,"Paris");
		mapVilles.put(31,"Toulouse");
		mapVilles.put(59,"Lille");
		mapVilles.put(69,"Lyon");
		mapVilles.put(33,"Bordeaux");
		
		Iterator<String> villeIte =mapVilles.values().iterator();
		while (villeIte.hasNext()) {
			String ville =villeIte.next();
			System.out.println(ville+" ");
		}
		
		System.out.println("\n");
		Iterator<Integer> villeKeyIte =mapVilles.keySet().iterator();
		while (villeKeyIte.hasNext()) {
			Integer keyVille =villeKeyIte.next();
			System.out.println(keyVille+" ");
		}
		System.out.println("la taille de la map mapVilles est de : "+mapVilles.size());
	}

}
