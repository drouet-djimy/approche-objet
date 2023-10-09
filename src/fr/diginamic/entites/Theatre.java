package fr.diginamic.entites;

public class Theatre {
	String nom;
	int personneMax=784;
	int nbInscrit=0;
	double recette=0;

	
	/**
	 * @param nom
	 * @param personneMax
	 * @param nbInscrit
	 * @param recette
	 */
	public Theatre(String nom, int personneMax, int nbInscrit, double recette) {
		super();
		this.nom = nom;
		this.personneMax = personneMax;
		this.nbInscrit = nbInscrit;
		this.recette = recette;
	}

	public void inscrire(int nbInscription, double prix) {
		if (nbInscrit+nbInscription<=personneMax) {
			nbInscrit=nbInscrit+nbInscription;
			recette=recette+(nbInscription*prix);
			System.out.println("Votre inscription a bien ete prise en compte pour "+nbInscription +" places au prix de "+prix);
		}
		else if(nbInscrit==personneMax) {
			System.out.println("Desole la capacite maximum de la salle est deja atteinte");
		}
		
		else if(nbInscrit+nbInscription>personneMax || nbInscrit<=personneMax) {
			System.out.println("Desole il ne reste pas assez de place pour cette inscription, il le nous reste plus que "+(personneMax-nbInscrit)+" places");
		}
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the personneMax
	 */
	public int getPersonneMax() {
		return personneMax;
	}

	/**
	 * @param personneMax the personneMax to set
	 */
	public void setPersonneMax(int personneMax) {
		this.personneMax = personneMax;
	}

	/**
	 * @return the nbInscrit
	 */
	public int getNbInscrit() {
		return nbInscrit;
	}

	/**
	 * @param nbInscrit the nbInscrit to set
	 */
	public void setNbInscrit(int nbInscrit) {
		this.nbInscrit = nbInscrit;
	}

	/**
	 * @return the recette
	 */
	public double getRecette() {
		return recette;
	}

	/**
	 * @param recette the recette to set
	 */
	public void setRecette(double recette) {
		this.recette = recette;
	}
	
	
}
