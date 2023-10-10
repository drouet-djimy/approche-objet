package fr.diginamic.jdr.Test;

import fr.diginamic.jdr.creature.*;

public class TestCreature {

	public static void main(String[] args) {
		Loup loup = new Loup();
		Gobelin gobelin= new Gobelin();
		Troll troll=new Troll();
		loup.getStats();
		gobelin.getStats();
		troll.getStats();
		
		Creature creature= Creature.invoqueCreature();
		
		creature.getStats();
	}
	

}
