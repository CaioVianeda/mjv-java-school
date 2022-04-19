package aula20221404;

import java.time.LocalDateTime;

public class LocalDateTimeExemplo2 {

	public static void main(String[] args) {
		
		LocalDateTime teste = LocalDateTime.now();
		System.out.println(teste);

		System.out.println(teste.plusYears(-20));
		System.out.println(teste.minusDays(-30));

	}

}
