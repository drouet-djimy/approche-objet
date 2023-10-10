package fr.diginamic.jdr;

import java.util.Scanner;

import fr.diginamic.jdr.creature.*;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choix = 0;
		Scanner scanner = new Scanner(System.in);
		Personnage perso = null;
		
		perso = new Personnage();
		System.out.println("Entrez le nom de votre personnage :");
		String nom = scanner.next();
		perso.setNom(nom);
		System.out.println("Votre personnage s'appele desormais : " + perso.getNom());
		perso.getStats();
		
		
		while (choix < 4) {
			System.out.println("1 : Creation de personnage");
			System.out.println("2 : Combattre une creature");
			System.out.println("3 : Afficher le score");
			System.out.println("4 : Sortir");

			choix = scanner.nextInt();

			if (choix == 1) {
				perso = new Personnage();
				System.out.println("Entrez le nom de votre personnage :");
				nom = scanner.next();
				perso.setNom(nom);
				System.out.println("Votre personnage s'appele desormais : " + perso.getNom());
				perso.getStats();
			}

			if (choix == 2) {
				if (perso.getHp() >= 0) {
					Creature creature = Creature.invoqueCreature();
					while (creature.getHp() > 0 && perso.getHp() > 0) {
						int attackPlayer = (perso.getForce() + (int) (Math.random() * 10));
						int attackCreature = creature.getForce() + (int) (Math.random() * 10);
						if (attackPlayer > attackCreature) {
							creature.setHp(creature.getHp() - (attackPlayer - attackCreature));

						} else if (attackCreature > attackPlayer) {
							perso.setHp(perso.getHp() - (attackCreature - attackPlayer));
						}
					}
					if (perso.getHp() > 0) {
						System.out.println("\n"+perso.getNom() + " Viens de remporter son combat contre un "+creature.getType()+" \n");
						perso.setScore(perso.getScore() + 1);
					} else {
						System.out.println(perso.getNom() + "\n Est mort. Il a obtenu le score de " + perso.getScore()
								+ " points. Veuillez creer un nouveau personnage.");
					}
				}

			}

			if (choix == 3) {
				System.out.println("\n"+perso.getNom() + " a un score de : " + perso.getScore() + " Points \n");
			}
		}
	}
}
