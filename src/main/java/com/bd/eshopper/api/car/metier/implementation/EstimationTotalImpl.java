package com.bd.eshopper.api.car.metier.implementation;

import com.bd.eshopper.api.car.dao.EstimationTotalRepository;
import com.bd.eshopper.api.car.entity.EstimationTotal;
import com.bd.eshopper.api.car.metier.EstimationTotalMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstimationTotalImpl implements EstimationTotalMetier {
	
	@Autowired
	private EstimationTotalRepository estimationTotalRepository ;

	@Override
	public EstimationTotal save(EstimationTotal o) {
		EstimationTotal a = new EstimationTotal() ;
		if(estimationTotalRepository.getOne(o.getId()) == null){
			return estimationTotalRepository.save(o);
		}else{
			 a.setMontant(-0.0);			 
			 return a;
		}
	}

	@Override
	public List<EstimationTotal> getAll() {
		return estimationTotalRepository.findAll();
	}

	@Override
	public EstimationTotal update(EstimationTotal o) {
		return estimationTotalRepository.save(o);
	}

	@Override
	public Long delete(Long id) {
		if(estimationTotalRepository.getOne(id) != null){
			estimationTotalRepository.deleteById(id);
			return id;
		}else{
			return 0L;
		}
		
	}

	@Override
	public EstimationTotal findOne(Long id) {
		return estimationTotalRepository.getOne(id);
	}
	
	

}
