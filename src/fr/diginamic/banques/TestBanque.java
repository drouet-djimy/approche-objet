package fr.diginamic.banques;
import fr.diginamic.banque.entites.Compte;

public class TestBanque {
	public static void main(String[]args) {
		
		Compte compte1= new Compte(123456,14500.57d);
		
		System.out.println(compte1.toString());
	}
}
