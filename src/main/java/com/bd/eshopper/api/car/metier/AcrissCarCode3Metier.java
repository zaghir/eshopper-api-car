package com.bd.eshopper.api.car.metier;

import com.bd.eshopper.api.car.entity.AcrissCarCode3;
import java.util.List;

public interface AcrissCarCode3Metier {
	
	public AcrissCarCode3 save(AcrissCarCode3 o) ;
	public List<AcrissCarCode3> getAll();
	public AcrissCarCode3 update(AcrissCarCode3 o) ;
	public String delete(String code) ;
	public AcrissCarCode3 findOne(String code) ;

}
