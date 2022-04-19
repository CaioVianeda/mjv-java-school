package aula20221404;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExemplo3 {
	
	public static void main(String[] args) {

		LocalDateTime agora = LocalDateTime.now();
	    
	    /*
	     * LocalDateTime
	     * yyyy/mm/ddThh:mm:ss.
	     */
	    System.out.println(agora);
	    
	    String formatData = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	    String formatHora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
	    String formatDataHora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
	    
	    System.out.println(formatData);
	    System.out.println(formatHora);
	    System.out.println(formatDataHora);
	    
	    System.out.println(LocalDateTime.now().plusDays(1).plusMonths(1));
	    System.out.println(LocalDateTime.now().plusDays(1).plusMonths(1).plusHours(2));
	    System.out.println(LocalDateTime.now().minusDays(1).minusMonths(1).minusYears(1));
	    
	    System.out.println(LocalDateTime.of(2021, 04, 18, 10, 18, 30));
	    
	    System.out.println(LocalDateTime.now().getYear());
	    System.out.println(LocalDateTime.now().getMonth());
	    System.out.println(LocalDateTime.now().getDayOfMonth());
	    System.out.println(LocalDateTime.now().getDayOfWeek());
	    
	    System.out.println(LocalDateTime.now().isAfter(LocalDateTime.now().plusDays(1)));
	    System.out.println(LocalDateTime.now().isBefore(LocalDateTime.now().plusDays(1)));
	    System.out.println(LocalDateTime.now().isEqual(LocalDateTime.now()));
	    
	    System.out.println(LocalDateTime.parse("2022-04-18 18:30:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
	    
	    System.out.println(LocalDateTime.now().getDayOfWeek());
	}
}
