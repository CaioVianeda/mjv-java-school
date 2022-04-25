package client;

public class Register {
	
	private String cpf;
	private String name;
	private String rua;
	private String complement;
	private String cidade;
	private String cep;
	
	
	
	public Register(String cpf, String name, String rua, String complement, String cidade, String cep) {
		super();
		this.cpf = cpf;
		this.name = name;
		this.rua = rua;
		this.complement = complement;
		this.cidade = cidade;
		this.cep = cep;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	
}
