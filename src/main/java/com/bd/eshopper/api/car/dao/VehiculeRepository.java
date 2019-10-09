package com.bd.eshopper.api.car.dao;

import com.bd.eshopper.api.car.entity.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {

	// @Query("delete from PrixVehicule p where p.id =:id")
	// public void deletePrixVehicule(@Param(value="id")Long id);

//	@Query("select v from Vehicule v where v.reserver = 0 and v.acrissCarCode1 =:categorie and v.acrissCarCode2 =:typeVehicule and v.acrissCarCode3=:transmission")
//	public List<Vehicule> rechercheVehiculePourLocation(
//			@Param(value="categorie")String categorie,
//			@Param(value="typeVehicule")String typeVehicule ,
//			@Param(value="transmission")String transmission);   where  acriss_car_code1_id =?0 and acriss_car_code2_id =?1 And acriss_car_code3_id =?2
	
	
	//@Query( value="select * from Vehicule where acriss_car_code1_id = 'C' and acriss_car_code2_id ='B' and acriss_car_code3_id = 'A' " , nativeQuery = true)	
	@Query("select v from Vehicule v where   v.acrissCarCode1.code = :categorie and v.acrissCarCode2.code = :typeVehicule  and v.acrissCarCode3.code = :transmission")
	public List<Vehicule> rechercheVehiculePourLocation(
			@Param(value="categorie")String categorie,
			@Param(value="typeVehicule")String typeVehicule ,
			@Param(value="transmission")String transmission);

}
