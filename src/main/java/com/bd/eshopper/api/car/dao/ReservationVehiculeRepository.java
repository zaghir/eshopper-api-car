package com.bd.eshopper.api.car.dao;

import com.bd.eshopper.api.car.entity.ReservationVehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
;

@Repository
public interface ReservationVehiculeRepository extends JpaRepository<ReservationVehicule, Long> {

	@Query(value = "SELECT CONCAT ( 'RA-' , 'LPAD( :idVehicule ,6,'')' , '-', 'LPAD( max(r.id) + 1 ,7,'')') as codeR from ReservationVehicule r ", nativeQuery = true)
	public String generatCodeReservazation(@Param(value="idVehicule") Long idVehicule) ;

	@Query(value = "SELECT r FROM ReservationVehicule  r where r.codeReservation = :id ", nativeQuery = true)
	public ReservationVehicule getReservationByCode(@Param(value="id")String id);

}
