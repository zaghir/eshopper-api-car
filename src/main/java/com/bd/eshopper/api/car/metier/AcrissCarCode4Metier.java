package com.bd.eshopper.api.car.metier;

import com.bd.eshopper.api.car.entity.AcrissCarCode4;
import java.util.List;

public interface AcrissCarCode4Metier {
	
	public AcrissCarCode4 save(AcrissCarCode4 o) ;
	public List<AcrissCarCode4> getAll();
	public AcrissCarCode4 update(AcrissCarCode4 o) ;
	public String delete(String code) ;
	public AcrissCarCode4 findOne(String code) ;

}
