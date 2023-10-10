/**
 * 
 */
package fr.diginamic.formes;

/**
 * @author Djimy Drouet
 *
 */
public class Carre extends Forme {
	double longueur;
	/**
	 * 
	 */
	public Carre(double longueur) {
		this.longueur=longueur;
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calculerSurface() {
		double surface=longueur*longueur;		
		return surface;
	}
	@Override
	public double calculerPerimetre() {
		double perimetre=4*longueur;		
		return perimetre;
	}
	
	/**
	 * @return the longueur
	 */
	public double getLongueur() {
		return longueur;
	}
	/**
	 * @param longueur the longueur to set
	 */
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
	
}
