package model;

public class Register {
	
	private String cpf;
	private String rg;
	private String nome;
	private String celular;
	private String logradouro;
	private String numero;
	private String complement;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	private Paises pais;
	
	public Register(String cpf, String rg, String nome, String celular, String logradouro, String numero,
			String complement, String bairro, String cidade, String uf, String cep, Paises pais) {
		super();
		this.cpf = cpf;
		this.rg = rg;
		this.nome = nome;
		this.celular = celular;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complement = complement;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
		this.pais = pais;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public Paises getPais() {
		return pais;
	}
	public void setPais(Paises pais) {
		this.pais = pais;
	}




	

	
	
	
	
}
