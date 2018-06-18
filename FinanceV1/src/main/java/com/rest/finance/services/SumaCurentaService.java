package com.rest.finance.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rest.finance.entitys.AddedMoney;
import com.rest.finance.entitys.SumaCurenta;
import com.rest.finance.entitys.Valuta;
import com.rest.finance.resourcesinterfaces.SumaCurentaRepositiory;

@Service
public class SumaCurentaService {

	@Autowired
	private SumaCurentaRepositiory repositiory;
	
	public List<SumaCurenta> findAllSumeCurente(){
		List<SumaCurenta> sumaCurentaList = new ArrayList<>();
		this.repositiory.findAll().forEach(sumaCurentaList::add);
		
		return sumaCurentaList;
	}
	
	public void modifySumaCurenta(AddedMoney money) {
		this.sumaCurentaLaAdaugare(money);
		
	}
	
	@Transactional
	public void sumaCurentaLaAdaugare(AddedMoney money) {
		double sumaDeBaniAdaugata = money.getSumaDeBani();
		Valuta valutaAlBanelorAdaugati = money.getValuta(); 
		if(!this.sumaCurentaByValutaIsEmpty(money.getValuta())) {
			SumaCurenta sumaCurenta = new SumaCurenta(sumaDeBaniAdaugata, valutaAlBanelorAdaugati);
			this.repositiory.save(sumaCurenta);

		} else {
			double sumaCurenta = this.findSumaCurentaByValuta(valutaAlBanelorAdaugati);
			double newSumaCurenta = sumaCurenta + sumaDeBaniAdaugata;
			this.repositiory.modifySumaCurenta(newSumaCurenta, valutaAlBanelorAdaugati);
		}
	}
	
	public long countSumaCurenta() {
		long nrOfCurrentSum = this.repositiory.count();
		
		return nrOfCurrentSum;
	}
	
	public boolean sumaCurentaByValutaIsEmpty(Valuta valuta) {
		boolean existsValuta = this.repositiory.existsByValuta(valuta);
		
		return existsValuta;
	}
	
	public double findSumaCurentaByValuta(Valuta valuta) {
		double sumaCurenta = this.repositiory.findSumaCurentaByValuta(valuta);
		
		return sumaCurenta;
	}
	
	
}
