package com.rest.finance.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rest.finance.entitys.AddedMoney;
import com.rest.finance.entitys.SumaCurenta;
import com.rest.finance.resourcesinterfaces.AddedMoneyRepository;
import com.rest.finance.resourcesinterfaces.SumaCurentaRepositiory;

@Service
public class AddedMoneyServices {
	
	@Autowired
	private AddedMoneyRepository addedMoneyRepository;
	@Autowired
	private SumaCurentaService curentaRepositiory;
	
	public List<AddedMoney> getAllAddedMoney(){
		List<AddedMoney> addedMoneysList = new ArrayList<>();
		this.addedMoneyRepository.findAll().forEach(addedMoneysList::add);
		
		return addedMoneysList;
		
	}
	@Transactional
	public void addMoney(AddedMoney money) {
//		SumaCurenta sumaCurenta = new SumaCurenta();
//		sumaCurenta.setSumaCurenta(money.getSumaDeBani());
//		sumaCurenta.setValuta(money.getValuta());
//		this.curentaRepositiory.save(sumaCurenta);
		
		this.addedMoneyRepository.save(money);
		this.curentaRepositiory.modifySumaCurenta(money);
	}
	
	public List<AddedMoney> findBySourceOfAddedMoneyId(Long id){
		List<AddedMoney> moneyList = new ArrayList<>();
		this.addedMoneyRepository.findBySourceOfAddedMoneyId(id).forEach(moneyList::add);
		
		return moneyList;
	}
}
