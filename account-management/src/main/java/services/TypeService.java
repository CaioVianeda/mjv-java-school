package services;

public enum TypeService {
	AGUA("Água"),
	LUZ("Luz");
	
	private String type;
	
	private TypeService(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
}
