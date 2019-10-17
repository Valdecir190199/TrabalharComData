package pacote02;

import java.text.DateFormat;
import java.util.Date;

public class FormatarDataFormat {
	public static void main(String[] args) {
		
		Date data = new Date();
		
		System.out.println(data);
		
		DateFormat dfs = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(dfs.format(data)); // 16/10/19
		
		DateFormat dfm = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(dfm.format(data)); // 16/10/2019
		
		DateFormat dfl = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(dfl.format(data)); // 16 de outubro de 2019
		
		DateFormat dff = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(dff.format(data)); // Terça-Feira, 10 de Outubro
		
		
		
	}

}
