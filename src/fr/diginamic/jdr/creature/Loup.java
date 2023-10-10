/**
 * 
 */
package fr.diginamic.jdr.creature;

/**
 * @author Djimy Drouet
 *
 */
public class Loup extends Creature {
	/**
	 * @param force
	 * @param Hp
	 */
	public Loup() {
		super(((int) (Math.random() * (9 - 3) + 3)), ((int) (Math.random() * (11 - 5) + 5)));
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Loup";
	}
}
