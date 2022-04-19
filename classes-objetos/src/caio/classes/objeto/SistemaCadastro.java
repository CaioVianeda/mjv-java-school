package caio.classes.objeto;

public class SistemaCadastro {

	public static void main(String[] args) {
		
		Pessoa caio = new Pessoa("12287540989", "Caio Vianeda");
		
		System.out.println(caio.nome);
		System.out.println(caio.cpf);
		System.out.println(caio.endereco);
		
		Pessoa marcos = new Pessoa("00584244455","Marcos Araujo");
		
		System.out.println(marcos.nome);
		System.out.println(marcos.cpf);


	}

}
