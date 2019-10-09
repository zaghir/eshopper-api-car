package com.bd.eshopper.api.car.metier;

import com.bd.eshopper.api.car.entity.ReservationVehicule;
import java.util.List;

public interface ReservationVehiculeMetier {
	//public ReservationVehicule save(ReservationVehicule o) ;
	public List<ReservationVehicule> getAll();
	public Long delete(Long id );
	public ReservationVehicule update(ReservationVehicule o );
	public ReservationVehicule findOne(Long id) ;	
	public ReservationVehicule getReservationByCode(String id);
	
}
