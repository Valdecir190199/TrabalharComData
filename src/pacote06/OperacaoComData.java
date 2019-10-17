package pacote06;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class OperacaoComData {
	
	public static void main(String[] args) {
		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		
		Calendar gc = Calendar.getInstance();
		
		System.out.println(df.format(gc.getTime()));
		
		// Adiciona 10 dias
		
		gc.add(GregorianCalendar.DAY_OF_MONTH, 10);
		
		System.out.println(df.format(gc.getTime()));
	}

}
