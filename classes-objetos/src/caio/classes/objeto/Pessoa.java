package caio.classes.objeto;

public class Pessoa {
	String nome;
	String cpf;
	String endereco;
	
	Pessoa (String cpf, String nome, String endereco){
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	Pessoa (String cpf, String nome){
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = "Não informado";
	}
	
	Pessoa (){
		
	}
	
}
