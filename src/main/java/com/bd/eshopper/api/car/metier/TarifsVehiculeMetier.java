package com.bd.eshopper.api.car.metier;

import com.bd.eshopper.api.car.entity.TarifsVehicule;
import java.util.List;

public interface TarifsVehiculeMetier {
	
	public TarifsVehicule save(TarifsVehicule o) ;
	public List<TarifsVehicule> getAll();
	public TarifsVehicule update(TarifsVehicule o) ;
	public Long delete(Long id);
	public TarifsVehicule findOne(Long id) ;

}
