package pacote;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.crypto.Data;

public class AnoMesDia {


	void PegarData(int dia, int mes, int ano) {
		

		
		DateFormat dff = DateFormat.getDateInstance(DateFormat.FULL);
		
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(Calendar.DAY_OF_MONTH, dia);
		
		gc.set(Calendar.MONTH, mes);
		
		gc.set(Calendar.YEAR, ano);
		
		System.out.println(dff.format(gc.getTime()));
		
	}
	


}
