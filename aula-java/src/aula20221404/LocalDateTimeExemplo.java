package aula20221404;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;

public class LocalDateTimeExemplo {

	public static void main(String[] args) {
		
		
		/*
		 * LocalDateTime- É um objeto de data e hora imutável que mostra a data e hora, geralmente vista como ano-mês-dia-hora-minuto-segundo.
		 *  Outros campos de data e hora, como dia do ano, dia da semana e semana do ano, também podem ser acessados. 
		 *  O tempo é representado com precisão de nanossegundos. Esta classe não armazena nem representa um fuso horário. Esta é uma classe baseada em valor ;
		 *  o uso de operações de gualdade pode ter resultados imprevisíveis e deve ser evitado.*/
		
		

//         2. // Como LocalDate, o construtor é de acesso privado;
//               LocalDateTime now = new LocalDateTime();
             LocalDateTime now = LocalDateTime.now();
             LocalDateTime now2 = LocalDateTime.of(2022,10,20,20,40,50);
             System.out.println("2 :" + now);

             /*3*/
                 /*3.1.*/
             //Método que retorna o dia da semana(DayOfWeek) de uma determinada data.
             System.out.println("3.1: " + now.getDayOfWeek());

                 /*3.2.*/
             //Método que compara duas datas e retorna um boolean. True se a primeira data for a frente da outra e False caso não seja;
             LocalDateTime futureDate = LocalDateTime.now().plusYears(15);
             boolean isAfter = now.isAfter(futureDate);
             System.out.println("3.2: "+ isAfter);

                 /*3.3.*/
             //Método que retorna (LocalDate) apenas o tempo local.
             System.out.println("3.3: " + now.toLocalTime());


                 /*3.4.*/
             //Método que retorna o dia do ano (int)
             System.out.println("3.4 :" + now.getDayOfYear());

//             4. O Método sobrecarregado seria o LocalDateTime.of();
             LocalDateTime date = LocalDateTime.of(2025,10,15,14,20,14);

//             5. Quando precisamos ter um log de acesso:
             
                     LocalDateTime todayDate = LocalDateTime.now();
//                    5.1 Quando temos duas datas e saber quantos dias faltam para a outra data
                     LocalDateTime afterDate = LocalDateTime.now().plusDays(10);
                     System.out.println("5.1: " + todayDate.until(afterDate, ChronoUnit.DAYS));

	}

}
