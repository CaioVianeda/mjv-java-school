package aula20221404;

import java.util.Calendar;
import java.util.TimeZone;


public class CalendarExemplo2 {

	public static void main(String[] args) {
		
		Calendar calendar2 = Calendar.getInstance();
		
		Calendar calendar1 = Calendar.getInstance();
		
		
		// os metodos before e after retornam um boolean
		boolean before1 = calendar1.before(calendar2);
		boolean after1 = calendar1.after(calendar2);
		boolean after2 = calendar2.after(calendar1);
		boolean before2 = calendar2.before(calendar1);
		
		/*System.out.println("Primeiro Calendar:");
		System.out.println("O calendário 1 é uma data anterior ao calendário 2 ?: " + before1);
		System.out.println("O calendário 1 é uma data posterior ao calendário 2 ?: " + after1);
		System.out.println();
		System.out.println("Segundo Calendar:");
		System.out.println("O calendário 2 é uma data anterior ao calendário 1 ?: "+ before2);
		System.out.println("O calendário 2 é uma data posterior ao calendário 1 ?: "+ after2);*/
		
		System.out.println();
		
		// EXEMPLO DE APLICAÇÃO
        
  		boolean schedulingVerify = calendar2.after(calendar1);
  		
  
		System.out.println("\n\n");
		
		//4. Método .set é sobrecarregado, assim como o getInstance;
		
		//(int year, int month, int date, int hourOfDay, int minute, int second);
		Calendar example1 = Calendar.getInstance();
		example1.set(Calendar.YEAR,2020);
		System.out.println(example1);
		System.out.println(example1.get(Calendar.DAY_OF_MONTH));
        Calendar example2 = Calendar.getInstance(TimeZone.getTimeZone("Brasil"));
        System.out.println("4: " + example2);
        
        //5.
        
        Calendar now = getCalendar(2,4,2022);
        System.out.println("\n\nConstruindo um Calendar:");
        System.out.println(now);
		
	}
	
	//5. Construir um Calendario:
	 public static Calendar getCalendar(int day, int month, int year){
	        Calendar date = Calendar.getInstance();
	        date.set(Calendar.YEAR, year);
	        date.set(Calendar.MONTH, month+1);
	        date.set(Calendar.DAY_OF_MONTH, day);
	        date.set(Calendar.HOUR, 15);
	        System.out.println("5: " + date);
	        return date;
	    }
	   
		
		

}
