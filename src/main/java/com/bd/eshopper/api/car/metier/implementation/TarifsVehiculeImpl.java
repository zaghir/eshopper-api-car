package com.bd.eshopper.api.car.metier.implementation;

import com.bd.eshopper.api.car.dao.TarifsVehiculeRepository;
import com.bd.eshopper.api.car.entity.TarifsVehicule;
import com.bd.eshopper.api.car.metier.TarifsVehiculeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TarifsVehiculeImpl implements TarifsVehiculeMetier {
	
	@Autowired
	private TarifsVehiculeRepository tarifsRepository ;

	@Override
	public TarifsVehicule save(TarifsVehicule o) {
		
		TarifsVehicule a = new TarifsVehicule() ;		
		if(o.getId() == null){	
			System.out.println("------"+o.getType());
			if(tarifsRepository.findByTypeVehicule(o.getType()) == null){
				a =  tarifsRepository.save(o);
			}else{
				a.setType("existe deja");
			}			
		}
		return a ;
	}

	@Override
	public List<TarifsVehicule> getAll() {
		return tarifsRepository.findAll();
	}

	@Override
	public TarifsVehicule update(TarifsVehicule o) {
		return tarifsRepository.save(o);
	}

	@Override
	public Long delete(Long id) {
		if(tarifsRepository.getOne(id) != null){
			tarifsRepository.deleteById(id);
			return id ;
		}else{
			return 0L ;
		}
	}

	@Override
	public TarifsVehicule findOne(Long id) {
		return tarifsRepository.getOne(id);
	}
	
	

}
