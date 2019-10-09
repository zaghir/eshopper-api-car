package com.bd.eshopper.api.car.metier.implementation;

import java.util.List;
import com.bd.eshopper.api.car.dao.AcrissCarCode3Repository;
import com.bd.eshopper.api.car.entity.AcrissCarCode3;
import com.bd.eshopper.api.car.metier.AcrissCarCode3Metier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcrissCarCode3Impl implements AcrissCarCode3Metier {
	
	@Autowired
	private AcrissCarCode3Repository acrissCarCode3Repository;

	@Override
	public AcrissCarCode3 save(AcrissCarCode3 o) {
		AcrissCarCode3 a = new AcrissCarCode3() ;
		if(acrissCarCode3Repository.getOne(o.getCode()) == null){
			return acrissCarCode3Repository.save(o);
		}else{
			 a.setDrive("existe deja"); 
			 a.setTransmission("existe deja");
			 return a;
		}			
	}

	@Override
	public List<AcrissCarCode3> getAll() {
		return acrissCarCode3Repository.findAll();
	}

	@Override
	public AcrissCarCode3 update(AcrissCarCode3 o) {
		return acrissCarCode3Repository.save(o);
	}

	@Override
	public String delete(String code) {
		if (acrissCarCode3Repository.getOne(code) != null) {
			acrissCarCode3Repository.deleteById(code);
		}
		return code ;
	}

	@Override
	public AcrissCarCode3 findOne(String code) {
		return acrissCarCode3Repository.getOne(code);
	}
	
	

}
