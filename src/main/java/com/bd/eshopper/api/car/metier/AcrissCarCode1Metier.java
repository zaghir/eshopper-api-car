package com.bd.eshopper.api.car.metier;

import com.bd.eshopper.api.car.entity.AcrissCarCode1;
import java.util.List;

public interface AcrissCarCode1Metier {
	
	public AcrissCarCode1 save(AcrissCarCode1 o) ;
	public List<AcrissCarCode1> getAll();
	public AcrissCarCode1 update(AcrissCarCode1 o) ;
	public String delete(String code) ;
	public AcrissCarCode1 findOne(String code) ;
	

}
