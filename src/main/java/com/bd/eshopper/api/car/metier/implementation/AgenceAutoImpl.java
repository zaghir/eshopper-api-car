package com.bd.eshopper.api.car.metier.implementation;

import com.bd.eshopper.api.car.dao.AgenceAutoRepository;
import com.bd.eshopper.api.car.entity.AgenceAuto;
import com.bd.eshopper.api.car.metier.AgenceAutoMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgenceAutoImpl implements AgenceAutoMetier {
	
	@Autowired
	private AgenceAutoRepository agenceRepsitory ;

	@Override
	public AgenceAuto save(AgenceAuto o) {
		AgenceAuto a = new AgenceAuto() ;
		if(o.getId() == null){
			if(agenceRepsitory.findByNom(o.getNom()) == null){
				a = agenceRepsitory.save(o);
				
			}else{
				 a.setAdresse("existe deja"); 
				 a.setLatitudeLocation(-0.0);
				 a.setLongitudeLocation(-0.0);
				 a.setNom("existe deja");
				 a.setVille("existe deja");
			}
		}
		 return a;		
	}

	@Override
	public List<AgenceAuto> getAll() {
		return agenceRepsitory.findAll();
		//return agenceRepsitory.getListAgenceAuto();
	}

	@Override
	public Long delete(Long id) {
		if(agenceRepsitory.getOne(id) != null){
			agenceRepsitory.deleteById(id);
			return id;	
		}else{
			return 0L ;
		}
		
	}

	@Override
	public AgenceAuto update(AgenceAuto o) {
		return agenceRepsitory.save(o);
	}

	@Override
	public AgenceAuto findOne(Long id) {
		return agenceRepsitory.getOne(id);
	}
	

}
