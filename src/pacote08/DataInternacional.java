package pacote08;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DataInternacional {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		DateFormat formatBrasil = DateFormat.getDateInstance(DateFormat.FULL, new Locale("pt","br"));
		System.out.println(formatBrasil.format(c.getTime()));
		
		DateFormat formatEUA = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
		System.out.println(formatEUA.format(c.getTime()));
		
		DateFormat formatItalian = DateFormat.getDateInstance(DateFormat.FULL, Locale.ITALIAN);
		System.out.println(formatItalian.format(c.getTime()));
		
		
	}
	
}
