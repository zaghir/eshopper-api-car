package com.bd.eshopper.api.car.metier.implementation;

import com.bd.eshopper.api.car.dao.AcrissCarCode1Repository;
import com.bd.eshopper.api.car.entity.AcrissCarCode1;
import com.bd.eshopper.api.car.metier.AcrissCarCode1Metier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AcrissCarCode1Impl implements AcrissCarCode1Metier {

	@Autowired
	private AcrissCarCode1Repository acrissCarCode1Repositorie;

	@Override
	public AcrissCarCode1 save(AcrissCarCode1 o) {
		AcrissCarCode1 a = new AcrissCarCode1();
		if (acrissCarCode1Repositorie.getOne(o.getCode()) == null) {
			return acrissCarCode1Repositorie.save(o);
		} else {
			a.setCategorie("existe deja");
			return a;
		}
	}

	@Override
	public List<AcrissCarCode1> getAll() {
		return acrissCarCode1Repositorie.findAll();
	}

	@Override
	public AcrissCarCode1 update(AcrissCarCode1 o) {
		return acrissCarCode1Repositorie.save(o);
	}

	@Override
	public String delete(String code) {
		if (acrissCarCode1Repositorie.getOne(code) != null) {
			acrissCarCode1Repositorie.deleteById(code);
		}
		return code ;
	}
	

	@Override
	public AcrissCarCode1 findOne(String code) {
		return acrissCarCode1Repositorie.getOne(code);
	}

}
