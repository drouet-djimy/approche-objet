package fr.diginamic.banques;
import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
	public static void main(String[]args) {
		
		Compte cpt1= new Compte(123456,14500.57d);
		CompteTaux cptTaux = new CompteTaux(111111, 35.42, 0.15);
		Compte[] tab= {cpt1,cptTaux};
		
		for(int i =0; i<tab.length;i++) {
			System.out.println(tab[i]);
		}
		
	}
}
