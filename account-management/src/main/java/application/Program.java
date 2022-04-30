package application;

import repository.ContratoRepository;
import service.GenerateFile;

public class Program {

	public static void main(String[] args) {
		
		ContratoRepository contracts = new ContratoRepository();
		
		GenerateFile.generateArquiveTxt(contracts.getContracts());
		System.out.println(contracts.getContracts());
		GenerateFile.generateArquiveCsv(contracts.getContracts());
		
	}
	

}
