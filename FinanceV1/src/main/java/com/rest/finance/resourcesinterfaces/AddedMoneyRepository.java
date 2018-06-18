package com.rest.finance.resourcesinterfaces;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rest.finance.entitys.AddedMoney;

public interface AddedMoneyRepository extends CrudRepository<AddedMoney, Long>{
	List<AddedMoney> findBySourceOfAddedMoneyId(Long id);
}
