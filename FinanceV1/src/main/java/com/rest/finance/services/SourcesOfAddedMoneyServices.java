package com.rest.finance.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.finance.entitys.SourceOfAddedMoney;
import com.rest.finance.resourcesinterfaces.SourcesOfAddedMoneyRepository;

@Service
public class SourcesOfAddedMoneyServices {
	
	@Autowired
	private SourcesOfAddedMoneyRepository sourcesRepository;
	
	public List<SourceOfAddedMoney> getAllSourcesOfMoney(){
		List<SourceOfAddedMoney> list = new ArrayList<>();
		this.sourcesRepository.findAll().forEach(list::add);
		
		return list;
	}
	
	public void addSourcesOfMoney(SourceOfAddedMoney source) {
		this.sourcesRepository.save(source);
	}

}
