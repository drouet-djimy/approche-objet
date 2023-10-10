/**
 * 
 */
package fr.diginamic.formes;

/**
 * @author Djimy
 *
 */
public class Cercle extends Forme {
	double rayon;
	/**
	 * 
	 */
	public Cercle(double rayon) {
		this.rayon=rayon;
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calculerSurface() {
		double surface=3.14*rayon*rayon;		
		return surface;
	}
	@Override
	public double calculerPerimetre() {
		double perimetre=3.14*2*rayon;		
		return perimetre;
	}
	
	/**
	 * @return the rayon
	 */
	public double getRayon() {
		return rayon;
	}
	/**
	 * @param rayon the rayon to set
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
}
