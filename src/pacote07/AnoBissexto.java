package pacote07;

import java.util.GregorianCalendar;

public class AnoBissexto {

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.isLeapYear(2015)); // false não é bissexto
		System.out.println(gc.isLeapYear(2016)); // true é bissexto
	}
	
}
