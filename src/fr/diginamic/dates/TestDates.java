package fr.diginamic.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/YYYY");
		System.out.println(formateur.format(date));
		
		
		SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/yyyyy HH:mm:ss");
		String date2="19/09/2016 23:59:30";
		Date date3=formateur2.parse(date2);
		
		System.out.println(new SimpleDateFormat("\"yyyy/MM/d HH:mm:ss\"").format(date3));

		Date date4 = new Date();
		System.out.println(new SimpleDateFormat("\"yyyy/MM/d HH:mm:ss\"").format(date4));

		}
}
