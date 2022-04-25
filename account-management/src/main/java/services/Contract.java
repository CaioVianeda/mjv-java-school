package services;

import java.time.LocalDate;
import java.util.Calendar;

public class Contract {
	
	private String procolo;
	private Calendar date;
	private LocalDate hour;
	private Double value;
	private TypeService typeService;
	public String getProcolo() {
		return procolo;
	}
	public void setProcolo(String procolo) {
		this.procolo = procolo;
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	public LocalDate getHour() {
		return hour;
	}
	public void setHour(LocalDate hour) {
		this.hour = hour;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public TypeService getTypeService() {
		return typeService;
	}
	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}
	
	
}
