package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class Contract {
	
	private StringBuilder procolo;
	private LocalDate date;
	private LocalTime hour;
	private TypeService typeService;
	private Double value;
	private TypeNotification typeNotification;
	


	private Register register;
	
	public Contract(LocalDate date, LocalTime hour, TypeService typeService,Register register,TypeNotification typeNotification) {
		this.procolo = generateProtocol(date);
		this.date = date;
		this.hour = hour;
		
		if(typeService == TypeService.AGUA) {
			this.value = 137.21;
		}else {
			this.value = 132.15;
		}
		
		this.typeService = typeService;
		this.register = register;
		this.typeNotification = typeNotification;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public LocalTime getHour() {
		return hour;
	}
	
	public StringBuilder getProcolo() {
		return procolo;
	}
	public Double getValue() {
		return value;
	}
	public TypeService getTypeService() {
		return typeService;
	}
	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}
	public Register getRegister() {
		return register;
	}
	
	public TypeNotification getTypeNotification() {
		return typeNotification;
	}
	
	public StringBuilder generateProtocol(LocalDate date) {
		
		Random rand = new Random();	
		StringBuilder str = new StringBuilder();
		int aux;
		
		str.append(date.getYear());
		
		if(date.getMonthValue() < 10) {
			str.append("0");
			str.append(date.getMonthValue());
		}else {
			str.append(date.getMonthValue());
		}
		
		for(aux = 0; aux < 1000;) {
			aux = rand.nextInt(9999);
		}
		
		str.append(aux);
		
		return str;
	}

	@Override
	public String toString() {
		return "Contract [procolo=" + procolo + ", date=" + date + ", hour=" + hour + ", value=" + value
				+ ", typeService=" + typeService + ", register=" + register + "]";
	}
	
	
	
	
}
