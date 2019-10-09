package com.bd.eshopper.api.car.metier.implementation;

import com.bd.eshopper.api.car.dao.CliqueRepository;
import com.bd.eshopper.api.car.entity.Clique;
import com.bd.eshopper.api.car.metier.CliqueMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CliqueImpl implements CliqueMetier {
	
	@Autowired
	private CliqueRepository cliqueRepository;

	@Override
	public Clique save(Clique o) {
		Clique a = new Clique() ;
		if(cliqueRepository.getOne(o.getId()) == null){
			return cliqueRepository.save(o);
		}else{
			 return a;
		}		
	}

	@Override
	public List<Clique> getAll() {
		return cliqueRepository.findAll();
	}

	@Override
	public Clique update(Clique o) {
		return cliqueRepository.save(o);
	}

	@Override
	public Long delete(Long id) {
		if(cliqueRepository.getOne(id) != null){
			cliqueRepository.deleteById(id);
			return id;	
		}else{
			return 0L ;
		}
	}

	@Override
	public Clique findOne(Long id) {		
		return cliqueRepository.getOne(id);
	}

}
