package pacote09;


//Unix timestamp � o tempo em segundos que se
//passaram de 1970 
//at� um determinado momento.

public class TimeUnixTemp {

	public static void main(String[] args) {
		
		long unixTimeStamp = System.currentTimeMillis() / 1000L;
		
		System.out.println(unixTimeStamp);
		
	}
	
}
