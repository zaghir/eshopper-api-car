package com.bd.eshopper.api.car.metier;

import com.bd.eshopper.api.car.entity.AcrissCarCode2;
import java.util.List;

public interface AcrissCarCode2Metier {
	public AcrissCarCode2 save(AcrissCarCode2 o) ;
	public List<AcrissCarCode2> getAll();
	public AcrissCarCode2 update(AcrissCarCode2 o) ;
	public String delete(String code) ;
	public AcrissCarCode2 findOne(String code) ;
}
