package pacote05;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class SetDate {

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(Calendar.YEAR, 2015);
		
		gc.set(Calendar.MONTH, Calendar.AUGUST);
		
		gc.set(Calendar.DAY_OF_MONTH, 5);
		
		System.out.println("Ano: "+gc.get(Calendar.YEAR));

		System.out.println("Mês: " + gc.get(Calendar.MONTH));

		System.out.println("Dia do Mês: " + gc.get(Calendar.DAY_OF_MONTH));
	}
	
}
