package com.bd.eshopper.api.car.metier;

import com.bd.eshopper.api.car.entity.EstimationTotal;
import java.util.List;

public interface EstimationTotalMetier {
	
	public EstimationTotal save(EstimationTotal o) ;
	public List<EstimationTotal> getAll();
	public EstimationTotal update(EstimationTotal o) ;
	public Long delete( Long id ) ;
	public EstimationTotal findOne(Long id) ;
	

}
