package model;

public enum Paises {
	BR("Brasil"),
	CH("Sui�a"),
	CN("China");
	
	private String pais;
	
	Paises(String  pais) {
		this.pais = pais;
	}

	public String getPais() {
		return pais;
	}
	
}
