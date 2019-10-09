package com.bd.eshopper.api.car.metier;

import com.bd.eshopper.api.car.entity.AgenceAuto;
import java.util.List;

public interface AgenceAutoMetier {
	
	public AgenceAuto save(AgenceAuto o);
	public List<AgenceAuto> getAll();
	public Long delete(Long id) ;
	public AgenceAuto update(AgenceAuto o);
	public AgenceAuto findOne(Long id) ;

}
