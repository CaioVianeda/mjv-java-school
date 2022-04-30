package model;

public enum TypeNotification {
	S("SMS"),
	W("Whatsapp");
	
	private String typeNotification;
	
	private TypeNotification(String typeNotification) {
		this.typeNotification = typeNotification;
	}


	public String getTypeNotification() {
		return typeNotification;
	}


	
	
}
