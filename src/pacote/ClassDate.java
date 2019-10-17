package pacote;

import java.util.Date;

public class ClassDate {

	public static void main(String[] args) {
		
		Date dataAtual = new Date();
		
		System.out.println(dataAtual);
		
		Date dataUnix = new Date(1427964000773L);
		
		System.out.println(dataUnix);
		
	}
	
}
