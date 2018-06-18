package com.rest.finance.resourcesinterfaces;


import org.springframework.data.repository.CrudRepository;

import com.rest.finance.entitys.SourceOfAddedMoney;

public interface SourcesOfAddedMoneyRepository extends CrudRepository<SourceOfAddedMoney, Long>{

}
