package com.bd.eshopper.api.car.dao;

import java.util.List;

import com.bd.eshopper.api.car.entity.AcrissCarCode1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AcrissCarCode1Repository extends JpaRepository<AcrissCarCode1, String> {

	@Query("select a from AcrissCarCode1 a where a.code = :code and a.categorie = :categorie" )
	List<AcrissCarCode1> findByCodeAndCategorie(@Param(value = "code") String code , @Param(value = "categorie") String categorie);
	

}
