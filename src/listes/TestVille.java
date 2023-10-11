package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestVille {

	public static void main(String[] args) {
		ArrayList<Ville> listeVille = new ArrayList<Ville>();
		Ville ville1=new Ville("Nice",343000);
		Ville ville2=new Ville("Carcassonne",47800);
		Ville ville3=new Ville("Narbonne",53400);
		Ville ville4=new Ville("Lyon",484000);
		Ville ville5=new Ville("Foix",9700);
		Ville ville6=new Ville("Pau",77200);
		Ville ville7=new Ville("Marseille",850700);
		Ville ville8=new Ville("Tarbes",40600);
		
		listeVille.add(ville1);
		listeVille.add(ville2);
		listeVille.add(ville3);
		listeVille.add(ville4);
		listeVille.add(ville5);
		listeVille.add(ville6);
		listeVille.add(ville7);
		listeVille.add(ville8);
		
		int nbHabitantMax=0;
		int nbHabitantMin=10000000;
		
		//parcours la liste pour connaitre le nombre d'habitant max et min
		Iterator<Ville> iter = listeVille.iterator();
		while (iter.hasNext()) {
			Ville ville = iter.next();
			if (ville.getNbHabitants()>nbHabitantMax) {
				nbHabitantMax=ville.getNbHabitants();
			}
			else if(ville.getNbHabitants()<nbHabitantMin) {
				nbHabitantMin=ville.getNbHabitants();
			}
		}
		
		//parcours la liste pour afficher la ville avec le plus d'habitant
		Iterator<Ville> iterateur = listeVille.iterator();
		while (iterateur.hasNext()) {
			Ville ville = iterateur.next();
			if (ville.getNbHabitants()==nbHabitantMax) {
				System.out.println("la ville la plus peuple est : "+ville.getNom()+" avec "+ville.getNbHabitants()+" habitants");
			}
		}
		//parcours la liste pour supprimer la ville avec le moins d'habitant
		Iterator<Ville> it = listeVille.iterator();
		while (it.hasNext()) {
			Ville ville = it.next();
			if (ville.getNbHabitants()==nbHabitantMin) {
				it.remove();
			}
		}
		
		//parcour de la liste et modifie les villes de + de 100 000 habitants pour les mettre en majuscule
		for (int i = 0; i < listeVille.size(); i++) {
			if(listeVille.get(i).getNbHabitants()>=100000) {
				String nom=listeVille.get(i).getNom();
				Ville ville=listeVille.get(i);
				ville.setNom(nom.toUpperCase());
				listeVille.set(i, ville);
			
			}
		}	
			
		for (Ville ville : listeVille) {
			ville.getInfos();
		}

	}

}
