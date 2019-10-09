package com.bd.eshopper.api.car.dao;

import com.bd.eshopper.api.car.entity.CompagnieVehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CompagnieVehiculeRepository extends JpaRepository<CompagnieVehicule, Long> {
	
	@Query("select c from CompagnieVehicule c where c.nom like :nom")
	public CompagnieVehicule findByNom(@Param(value = "nom") String nom );

}
