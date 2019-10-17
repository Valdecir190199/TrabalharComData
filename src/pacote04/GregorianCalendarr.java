package pacote04;

import java.util.Calendar;
import java.util.GregorianCalendar;

//A classe Date é muito boa para pegar datas, 
//mas se você precisa acrescentar 10 dias na data, por exemplo, 
//você poderá utilizar a classe GregorianCalendar.

public class GregorianCalendarr {

	public static void main(String[] args) {
		
		
		GregorianCalendar gc = new GregorianCalendar();
		
		System.out.println("Ano: "+gc.get(Calendar.YEAR));
		System.out.println("Mês: "+gc.get(Calendar.MONTH));
		System.out.println("Dia da Semana: "+gc.get(Calendar.DAY_OF_WEEK));
		System.out.println("Dia do Ano: "+gc.get(Calendar.DAY_OF_YEAR));
		System.out.println("Semana do Ano: "+gc.get(Calendar.WEEK_OF_YEAR));
		System.out.println("Dia da Semana do Mês: "+gc.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("Hora: "+gc.get(Calendar.HOUR));
		System.out.println("AM/PM?: " + gc.get(Calendar.AM_PM));
		System.out.println("Hora do Dia: "+gc.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minuto: "+gc.get(Calendar.MINUTE));
		System.out.println("Segundo: "+gc.get(Calendar.SECOND));
	}
	
}
