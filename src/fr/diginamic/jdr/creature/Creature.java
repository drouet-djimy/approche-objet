package fr.diginamic.jdr.creature;

public abstract class Creature {
	int force;
	int Hp;
	
	public Creature(int force, int Hp) {
		this.force=force;
		this.Hp=Hp;
		// TODO Auto-generated constructor stub
	}
	public void getStats() {
		System.out.println("les stats de la creature " +getType()+ " sont : "+ force+ " points de force, "+Hp+" points de vie.");
	}
	
	public abstract String getType();
	
	/**
	 * @return the force
	 */
	public int getForce() {
		return force;
	}
	/**
	 * @param force the force to set
	 */
	public void setForce(int force) {
		this.force = force;
	}
	/**
	 * @return the hp
	 */
	public int getHp() {
		return Hp;
	}
	/**
	 * @param hp the hp to set
	 */
	public void setHp(int hp) {
		Hp = hp;
	}
	
	public static Creature invoqueCreature() {
		int random;
		random=(int) (Math.random()*3);
			if(random==1) {
				return new Loup();
			}
			else if(random==2) {
				return new Gobelin();
			}
			else {
				return new Troll();
			}
		
	}
	
}
