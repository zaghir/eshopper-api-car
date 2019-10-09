package com.bd.eshopper.api.car.metier.implementation;

import java.util.List;
import com.bd.eshopper.api.car.dao.DevisRepository;
import com.bd.eshopper.api.car.entity.Devis;
import com.bd.eshopper.api.car.metier.DevisMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DevisImpl implements DevisMetier {
	
	@Autowired
	private DevisRepository devisRepository ;

	@Override
	public Devis save(Devis o) {
		Devis a = new Devis() ;
		if(o.getCode() != null ){
			if(devisRepository.findByCode(o.getCode()) == null){
				a = devisRepository.save(o) ;
			}else{
				a.setNom("existe deja");
				a.setCode("existe deja");
			}
		}
		return a ;	
	}

	@Override
	public List<Devis> getAll() {
		return devisRepository.findAll();
	}

	@Override
	public Devis update(Devis o) {
		return devisRepository.save(o);
	}

	@Override
	public Long delete(Long id) {
		if(devisRepository.getOne(id) != null)
		devisRepository.deleteById(id);
		return id;
	}

	@Override
	public Devis findOne(Long id) {
		return devisRepository.getOne(id);
	}
	

}
