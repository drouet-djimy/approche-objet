package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[]args) {
		double total=0;
		Credit op1 = new Credit("01/10/2023",556); 
		Credit op2 = new Credit("03/10/2023",23); 
		Debit op3 = new Debit("04/10/2023",305); 
		Credit op4 = new Credit("06/10/2023",23);
		Debit op5 = new Debit("09/10/2023",500); 
		
		Operation[] tab = {op1,op2,op3,op4,op5};
		
		for (int i =0; i<tab.length;i++) {
			System.out.println("L'operation a eu lieu le : "+tab[i].dateOperation+" avec un montant de : "+tab[i].montantOperation+" "+ tab[i].getType(tab[i]));
			
			if(tab[i].getType(tab[i])=="Debit") {
				total=total-tab[i].montantOperation;
			}
			else if(tab[i].getType(tab[i])=="Credit") {
				total=total+tab[i].montantOperation;
			}
		}
		System.out.println("Le total des operations est de : "+total);
		
	}

}
