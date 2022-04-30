package model;

public enum TypeService {
	AGUA("�gua"),
	LUZ("Luz");
	
	private String type;
	
	private TypeService(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
}
