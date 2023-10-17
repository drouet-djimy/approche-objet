package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
long debut = System.currentTimeMillis();

	StringBuilder string = new StringBuilder();
	
	for (int i=0;i<100000;i++) {
		string.append(i);
	}
long fin = System.currentTimeMillis();
System.out.println("en utilisant le string builder :");
System.out.println("Temps ecoule en millisecondes :"+(fin-debut));
System.out.println("\n---------------------------------------------------");

long debut2 = System.currentTimeMillis();

String str="0";

for (int i=0;i<100000;i++) {
	str=str+i;
}
long fin2 = System.currentTimeMillis();
System.out.println("sans utiliser le string builder :");
System.out.println("Temps ecoule en millisecondes :"+(fin2-debut2));


	}

}
