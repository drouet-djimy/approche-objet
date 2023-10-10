/**
 * 
 */
package fr.diginamic.formes;

/**
 * @author Djimy
 *
 */
public class Rectangle extends Forme {
	double longueur;
	double largeur;
	/**
	 * 
	 */
	public Rectangle(double longueur, double largeur) {
		this.longueur=longueur;
		this.largeur=largeur;
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calculerSurface() {
		double surface=longueur*largeur;		
		return surface;
	}
	@Override
	public double calculerPerimetre() {
		double perimetre=((2*longueur)+(2*largeur));		
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
	/**
	 * @return the largeur
	 */
	public double getLargeur() {
		return largeur;
	}
	/**
	 * @param largeur the largeur to set
	 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	

}
