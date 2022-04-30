package service;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import model.Contract;

public class GenerateFile {
	
	static public void saveContract(Contract contract) {
		write(GenerateMessage.generateContract(contract).toString(), ("contratos/contrato-"+contract.getProcolo()));
	}
	
	static public void generateArquiveTxt(List<Contract> contracts) {
		
		StringBuilder sb = new StringBuilder();
	
		for(Contract c : contracts) {
			sb.append(GenerateMessage.generateLayoutTxt(c));
		}
		
		write(sb.toString(),"/agua-luz-contratos.txt");
	}
	
	static public void generateArquiveCsv(List<Contract> contracts) {
		
		StringBuilder sb = new StringBuilder();
	
		for(Contract c : contracts) {
			sb.append(GenerateMessage.generateLayoutCsv(c));
		}
		
		write(sb.toString(),"/agua-luz-contratos.csv");
	}
	
	private static void write(String str, String nameArq) {
		File dir = new File("C:/Estudos/mjv-java-school/agua-luz-output");
		dir.mkdir();
		
		Path path = Paths.get(dir.getAbsolutePath(), nameArq);
		
		try {
			Files.write(path, str.getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
