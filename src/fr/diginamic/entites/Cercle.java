package fr.diginamic.entites;

public class Cercle {
	double rayon;

	/**
	 * @param rayon
	 */
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	public double surface() {
		double surface;
		surface=rayon*rayon*3.14;
		return surface;
	}
	
	public double perimetre() {
		double perimetre;
		perimetre=2*3.14*rayon;
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
