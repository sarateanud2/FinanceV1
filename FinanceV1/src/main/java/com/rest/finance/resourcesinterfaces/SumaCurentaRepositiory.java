package com.rest.finance.resourcesinterfaces;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.rest.finance.entitys.SumaCurenta;
import com.rest.finance.entitys.Valuta;

public interface SumaCurentaRepositiory extends CrudRepository<SumaCurenta, Long> {

	@Modifying
	@Query("Update SumaCurenta sc set sc.sumaCurenta = ?1 where sc.valuta = ?2")
	void modifySumaCurenta(Double sumaCurenta, Valuta valuta);
	boolean existsByValuta(Valuta valuta);
	
//	@Modifying
	@Query("Select sc.sumaCurenta from SumaCurenta sc where sc.valuta = ?1")
	double findSumaCurentaByValuta(Valuta valuta);
	
}
