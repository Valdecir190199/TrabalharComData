package pacote03;

import java.text.SimpleDateFormat;
import java.util.Date;

//
//Símbolo	Significado	Apresentação	Exemplo
//G	era designator	(Text)	AD
//y	Ano	(Number)	1996
//M	Mês do ano	(Text & Number)	July & 07
//d	Dia do mês	(Number)	10
//h	Hora em AM/PM (1~12)	(Number)	12
//H	Hora do dia (0~23)	(Number)	0
//m	Minuto da hora	(Number)	30
//s	Segundo do minuto	(Number)	55
//S	Milissegundo	(Number)	978
//E	Dia da semana	(Text)	Tuesday
//D	Dia do ano	(Number)	189
//F	Dia da semana no mês	(Number)	2 (2nd Wed in July)
//w	Semana do ano	(Number)	27
//W	Semana no mês	(Number)	2
//a	AM / PM	(Text)	PM
//k	Hora do dia (1~24)	(Number)	24
//K	Hora em AM/PM (0~11)	(Number)	0
//z	Zona de Tempo	(Text)	Pacific Standard Time

public class SimpleDateFormatt {

	
	public static void main(String[] args) {
		Date data = new Date();
		System.out.println(data);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println(sdf.format(data));
		
	}
	
}
