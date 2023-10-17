package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
	public static void main(String[]args) {
		Calendar cal= Calendar.getInstance();
		cal.set(2016, 4, 19, 23, 59, 30);
		Date date=cal.getTime();
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formateur.format(date));
		
		Calendar calendrier= Calendar.getInstance();
		Date dateRN=calendrier.getTime();
		SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd à HH:mm:ss");
		System.out.println(formateur2.format(dateRN));
		
		System.out.println("\n-----------------------");
		System.out.println("Francais :");
		SimpleDateFormat formateurFrance = new SimpleDateFormat("yyyy/MM/dd EEEE MMMM à HH:mm:ss", Locale.FRANCE);
		System.out.println(formateurFrance.format(dateRN));
		
		System.out.println("\n-----------------------");
		System.out.println("Russe :");
		SimpleDateFormat formateurRusse = new SimpleDateFormat("yyyy/MM/dd EEEE MMMM à HH:mm:ss",new Locale ("ru","RU"));
		System.out.println(formateurRusse.format(dateRN));
		
		System.out.println("\n-----------------------");
		System.out.println("Chine :");
		SimpleDateFormat formateurChine = new SimpleDateFormat("yyyy/MM/dd EEEE MMMMM à HH:mm:ss",Locale.CHINA);
		System.out.println(formateurChine.format(dateRN));
		
		System.out.println("\n-----------------------");
		System.out.println("Allemand :");
		SimpleDateFormat formateurAllemand = new SimpleDateFormat("yyyy/MM/dd EEEE MMMM à HH:mm:ss",Locale.GERMANY);
		System.out.println(formateurAllemand.format(dateRN));
	}
}
