/**
 * 
 */
package fr.diginamic.salaire;

/**
 * @author Djimy Drouet
 *
 */
public class Pigiste extends Intervenant {
	double nbJourTravailler;
	double tauxJournalier;
	/**
	 * @param nom
	 * @param prenom
	 */
	public Pigiste(String nom, String prenom,double nbJourTravailler,double tauxJournalier) {
		super(nom, prenom);
		this.nbJourTravailler=nbJourTravailler;
		this.tauxJournalier=tauxJournalier;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return nbJourTravailler*tauxJournalier;
	}

	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return "Pigiste";
	}

}
