package fr.diginamic.jdr.creature;

public class Gobelin extends Creature {

	public Gobelin() {
		super(((int) (Math.random() * (11 - 5) + 5)), ((int) (Math.random() * (16 - 10) + 10)));
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Gobelin";
	}

}
