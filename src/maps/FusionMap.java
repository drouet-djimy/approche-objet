package maps;

import java.util.HashMap;

public class FusionMap {

	public static void main(String[] args) {
		// Creation de map1
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");

		// Creation de map2
		HashMap<Integer, String> map2 = new HashMap<>();
		map1.put(4, "Blanc");
		map1.put(5, "Bleu");
		map1.put(6, "Orange");
		//création de map3
		HashMap<Integer, String> map3 = new HashMap<>();

		for (Integer key :map1.keySet()) {
			map3.put(key, map1.get(key));
		}
		
		for (Integer key :map2.keySet()) {
			map3.put(key, map2.get(key));
		}
		
		for(Integer key :map3.keySet()) {
			System.out.println(map3.get(key));
		}
	}

}
