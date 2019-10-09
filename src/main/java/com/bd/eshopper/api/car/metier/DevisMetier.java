package com.bd.eshopper.api.car.metier;

import com.bd.eshopper.api.car.entity.Devis;
import java.util.List;

public interface DevisMetier {
	
	public Devis save(Devis o) ;
	public List<Devis> getAll();
	public Devis update(Devis o ) ;
	public Long delete(Long id ) ;
	public Devis findOne(Long id) ;

}
