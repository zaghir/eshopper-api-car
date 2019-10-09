package com.bd.eshopper.api.car.dao;

import com.bd.eshopper.api.car.entity.Devis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DevisRepository extends JpaRepository<Devis, Long> {
	
	@Query("select d from Devis d where d.code like :code")
	public Devis findByCode(@Param(value="code") String code);

}
