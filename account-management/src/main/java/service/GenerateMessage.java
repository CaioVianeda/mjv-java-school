package service;

import java.time.format.DateTimeFormatter;

import model.Contract;

public class GenerateMessage {

	static public StringBuilder generateContract(Contract contract) {
		StringBuilder sb = new StringBuilder();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		sb.append("Senhor(a) ");
		sb.append(contract.getRegister().getNome());
		sb.append(" cpf de n�mero ");
		sb.append(contract.getRegister().getCpf());
		sb.append(", informamos que conforme contrato com protocolo de n�mero ");
		sb.append(contract.getProcolo());
		sb.append(" est� agendado para a data\\hora ");
		sb.append(contract.getDate().format(dtf));
		sb.append(" " + contract.getHour()+"h");
		sb.append(" a instalação do serviço de "+ contract.getTypeService().getType());
		sb.append(" com taxa de valor R$" + contract.getValue());
		sb.append(" em sua resid�ncia localizada no endereço abaixo: ").append('\n');
		sb.append("• Logradouro: " + contract.getRegister().getLogradouro());
		sb.append("• Complemento: " + contract.getRegister().getComplement());
		sb.append("• Bairro: " + contract.getRegister().getBairro());
		sb.append("• Cidade: " + contract.getRegister().getCidade());
		sb.append("• Cep: "+ contract.getRegister().getCep());
		return sb;
	}
	
	static public StringBuilder generateLayoutTxt(Contract contract) {
		
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%011d",Long.valueOf(contract.getRegister().getCpf().toString().replaceAll("\\D", ""))));
		sb.append(String.format("%06d",Long.valueOf(contract.getRegister().getRg().toString().replaceAll("\\D", ""))));
		sb.append(formatToLenght(30, contract.getRegister().getNome().toUpperCase()));
		sb.append(String.format("%011d",Long.valueOf(contract.getRegister().getCelular().toString().replaceAll("\\D", ""))));
		sb.append(formatToLenght(20, contract.getRegister().getLogradouro().toUpperCase()));
		sb.append(String.format("%06d",Long.valueOf(contract.getRegister().getNumero().toString())));
		sb.append(formatToLenght(10, contract.getRegister().getComplement().toUpperCase()));
		sb.append(formatToLenght(15, contract.getRegister().getBairro().toUpperCase()));
		sb.append(formatToLenght(30, contract.getRegister().getCidade().toUpperCase()));
		sb.append(formatToLenght(2, contract.getRegister().getUf().toUpperCase()));
		sb.append(String.format("%08d",Long.valueOf(contract.getRegister().getCep().toString().replaceAll("\\D", ""))));
		sb.append(contract.getRegister().getPais());
		sb.append(contract.getProcolo());
		sb.append(contract.getDate().toString().replaceAll("-", ""));
		sb.append(contract.getHour().toString().replaceAll(":", ""));
		sb.append(contract.getTypeService().toString().substring(0,1));
		sb.append(String.format("%08d",Long.valueOf(contract.getValue().toString().replaceAll("\\D", ""))));
		sb.append(contract.getTypeNotification());
		sb.append("\n");
		return sb;
	}
	
	static public String formatToLenght(int lenght, String str) {
		
		if(str.length() >= lenght) {
			return str.substring(0,lenght);
		}else {
			
			if(lenght < 10) {
				return str.formatted("%-0"+lenght+"s", str);
			}else {
				return str.formatted("%-"+lenght+"s", str);
			}
		}
	}
	
	static StringBuilder generateLayoutCsv(Contract c) {
		
		StringBuilder sb = new StringBuilder();
	
		sb.append(String.format("%011d",Long.valueOf(c.getRegister().getCpf().toString().replaceAll("\\D", "")))+";");
		sb.append(String.format("%06d",Long.valueOf(c.getRegister().getRg().toString().replaceAll("\\D", "")))+";");
		sb.append(formatToLenght(30, c.getRegister().getNome().toUpperCase()));
		sb.append(String.format("%011d",Long.valueOf(c.getRegister().getCelular().toString().replaceAll("\\D", "")))+";");
		sb.append(formatToLenght(20, c.getRegister().getLogradouro().toUpperCase())+";");
		sb.append(String.format("%06d",Long.valueOf(c.getRegister().getNumero().toString()))+";");
		sb.append(formatToLenght(10, c.getRegister().getComplement().toUpperCase())+";");
		sb.append(formatToLenght(15, c.getRegister().getBairro().toUpperCase())+";");
		sb.append(formatToLenght(30, c.getRegister().getCidade().toUpperCase())+";");
		sb.append(formatToLenght(2, c.getRegister().getUf().toUpperCase())+";");
		sb.append(String.format("%08d",Long.valueOf(c.getRegister().getCep().toString().replaceAll("\\D", "")))+";");
		sb.append(c.getRegister().getPais()+";");
		sb.append(c.getProcolo()+";");
		sb.append(c.getDate().toString().replaceAll("-", "")+";");
		sb.append(c.getHour().toString().replaceAll(":", "")+";");
		sb.append(c.getTypeService().toString().substring(0,1)+";");
		sb.append(String.format("%08d",Long.valueOf(c.getValue().toString().replaceAll("\\D", "")))+";");
		sb.append(c.getTypeNotification()+";");
		sb.append("\n");
		
		return sb;
		
	}
	
}
