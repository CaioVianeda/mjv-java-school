package util;

public class FormaterUtil {
	public static String formatarCpf(String cpf) {
		String part1 = cpf.substring(0,3);
		String part2 = cpf.substring(3,6);
		String part3 = cpf.substring(6,9);
		String part4 = cpf.substring(10,11);
		
		return part1+"."+part2+"."+part3+"-"+part4;
	}
	
	public static String formatarCep(String cep) {
		String part1 = cep.substring(0,2);
		String part2 = cep.substring(2,5);
		String part3 = cep.substring(5,8);
		
		return part1+"."+part2+"-"+part3;
	}
}

