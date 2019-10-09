package com.bd.eshopper.api.car.metier;

import com.bd.eshopper.api.car.entity.CompagnieVehicule;
import java.util.List;

public interface CompagnieVehiculeMetier {

	public CompagnieVehicule save(CompagnieVehicule o) ;
	public List<CompagnieVehicule> getAll();
	public CompagnieVehicule upadete(CompagnieVehicule o) ;
	public Long delete(Long id ) ;
	public CompagnieVehicule findOne(Long id) ;
	public CompagnieVehicule findByNom(String nom);
	
}
