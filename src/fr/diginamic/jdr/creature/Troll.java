package fr.diginamic.jdr.creature;

public class Troll extends Creature {

	public Troll() {
		super(((int) (Math.random() * (16 - 10) + 10)), ((int) (Math.random() * (31 - 20) + 20)));
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Troll";
	}

}
