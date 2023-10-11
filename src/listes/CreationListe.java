package listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			arraylist.add(i);
		}
		System.out.println(arraylist.size());
	}
}
