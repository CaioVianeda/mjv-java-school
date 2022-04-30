package repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import model.Contract;
import model.Paises;
import model.Register;
import model.TypeNotification;
import model.TypeService;

public class ContratoRepository {
	
	private List<Contract> contracts = new ArrayList<Contract>();
	
	public void listContracts() {
		
		Register register = new Register("234.765.987-27", "337655", "Raimundo Nonato Loureiro Castelo Branco", "(11) 99768-1515","Rua Sebastião Firmino"
				,"123", "AP 210 BL CENTAURO", "São Sebastião", "São Raimundo Nonato","Sp","07.210.715", Paises.BR);
		
		Contract contract = new Contract(LocalDate.of(2022, 2, 21), LocalTime.of(16, 0), TypeService.AGUA, register, TypeNotification.W);
		
		
		contracts.add(contract);
		
	}

	public List<Contract> getContracts() {
		listContracts();
		return contracts;
	}
	
}
