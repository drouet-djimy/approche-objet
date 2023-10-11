package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {

	public static void main(String[]args) {
		HashSet<String> set = new HashSet<String>();
		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("UK");
		set.add("italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Russie");
		set.add("Inde");
		
		int lettreMax=0;
		//boucle permettant de définir la ville avec le plus grand nombre de lettre
		for(String ville:set) {
			if(ville.length()>lettreMax) {
				lettreMax=ville.length();
			}
		}
		
		Iterator<String> iter = set.iterator();
			while(iter.hasNext()) {
				String ville=iter.next();
				if(ville.length()==lettreMax) {
					iter.remove();
				}
			}
			//boucle permettant de définir la ville avec le plus grand nombre de lettre
			for(String ville:set) {
				System.out.print(ville+" ");
			}
		
	}

}
