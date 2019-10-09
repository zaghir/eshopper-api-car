package com.bd.eshopper.api.car.metier;

import com.bd.eshopper.api.car.entity.RechercheCritereVehicule;
import com.bd.eshopper.api.car.entity.Vehicule;
import java.util.List;

public interface VehiculeMetier {
	
	public Vehicule save(Vehicule o);
	public List<Vehicule> getAll();
	public Vehicule update(Vehicule o) ;
	public Long delete(Long id) ;
	public Vehicule findOne(Long id ) ;
	
	public List<Vehicule> rechercheVehiculePourLocation(RechercheCritereVehicule o);

}
