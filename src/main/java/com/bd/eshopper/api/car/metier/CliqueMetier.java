package com.bd.eshopper.api.car.metier;

import com.bd.eshopper.api.car.entity.Clique;
import java.util.List;

public interface CliqueMetier {
	
	public Clique save(Clique o) ;
	public List<Clique> getAll();
	public Clique update(Clique o) ;
	public Long delete(Long id ) ;
	public Clique findOne(Long id ) ;

}
