package aula20221404;

import java.util.Calendar;

public class CalendarExemplo {

	public static void main(String[] args) {
		
//		 1. A Classe Calendar, é uma classe abstrata.
//       Através dela é possível converter entre um tempo em especifico em campos de calendário, como ANO,MES,DIA DO MES.
//       E também manipulação dos campos de calendário, como pegar a data da proxima semana.

// 		 2. Por ser uma classe abstrata, não é possível criar uma instancia da mesma. Nisso é possivel criar um
//     	método que pode construir uma instancia de calendário formatado como queremos.;

		Calendar calendario = Calendar.getInstance();
		System.out.println(calendario);
		

		
		calendario.add(Calendar.YEAR, 10); 
		Integer ano = calendario.get(Calendar.YEAR); 
		System.out.println("Ano: " + ano);
			
		
	}

}
