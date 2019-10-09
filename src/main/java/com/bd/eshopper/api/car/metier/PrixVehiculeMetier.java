package com.bd.eshopper.api.car.metier;

import com.bd.eshopper.api.car.entity.PrixVehicule;
import java.util.List;

public interface PrixVehiculeMetier {
	
	public PrixVehicule save(PrixVehicule o) ;
	public List<PrixVehicule> getAll() ;
	public PrixVehicule update(PrixVehicule o);
	public Long delete(Long id);
	public PrixVehicule findOne(Long id);


}
