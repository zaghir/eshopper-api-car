package com.bd.eshopper.api.car.metier.implementation;

import com.bd.eshopper.api.car.dao.AcrissCarCode2Repository;
import com.bd.eshopper.api.car.entity.AcrissCarCode2;
import com.bd.eshopper.api.car.metier.AcrissCarCode2Metier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AcrissCarCode2Impl implements AcrissCarCode2Metier {
	
	@Autowired
	private AcrissCarCode2Repository acrissCarCode2Repositorie ;

	@Override
	public AcrissCarCode2 save(AcrissCarCode2 o) {
		AcrissCarCode2 a = new AcrissCarCode2() ;
		if(acrissCarCode2Repositorie.getOne(o.getCode()) == null){
			return acrissCarCode2Repositorie.save(o);
		}else{
			 a.setTypeVehicule("existe deja"); 
			 return a;
		}	
	}

	@Override
	public List<AcrissCarCode2> getAll() {
		return acrissCarCode2Repositorie.findAll();
	}

	@Override
	public AcrissCarCode2 update(AcrissCarCode2 o) {
		return acrissCarCode2Repositorie.save(o);
	}

	@Override
	public String delete(String code) {
		if (acrissCarCode2Repositorie.getOne(code) != null) {
			acrissCarCode2Repositorie.deleteById(code);
		}
		return code ;
	}


	@Override
	public AcrissCarCode2 findOne(String code) {
		return acrissCarCode2Repositorie.getOne(code);
	}

	
	

}
