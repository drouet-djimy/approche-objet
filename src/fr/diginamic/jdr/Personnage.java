package fr.diginamic.jdr;

public class Personnage {
	int force=(int) (Math.random() * (19 - 12) + 12);
	int Hp = (int) (Math.random() * (51 - 20) + 20);
	int score=0;
	String nom = "nomParDefaut";
	public Personnage() {
		// TODO Auto-generated constructor stub
	}
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
	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom=nom;
	}
	
	public void getStats() {
		System.out.println("les stats de "+nom+" sont : "+ force+ " points de force, "+Hp+" points de vie et "+score+" points de score \n");
	}
}
