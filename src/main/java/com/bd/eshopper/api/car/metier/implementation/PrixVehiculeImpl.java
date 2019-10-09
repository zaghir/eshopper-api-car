package com.bd.eshopper.api.car.metier.implementation;

import java.util.List;
import com.bd.eshopper.api.car.dao.PrixVehiculeRepository;
import com.bd.eshopper.api.car.entity.PrixVehicule;
import com.bd.eshopper.api.car.metier.PrixVehiculeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PrixVehiculeImpl implements PrixVehiculeMetier {

	@Autowired
	private PrixVehiculeRepository prixRepository;

	@Override
	public PrixVehicule save(PrixVehicule o) {
		return prixRepository.save(o);
	}

	@Override
	public List<PrixVehicule> getAll() {
		return prixRepository.findAll();
	}

	@Override
	public PrixVehicule update(PrixVehicule o) {
		return prixRepository.save(o);
	}

	@Override
	public Long delete(Long id) {

		prixRepository.deleteById(id);
		return id;

	}

	@Override
	public PrixVehicule findOne(Long id) {
		return prixRepository.getOne(id);
	}


}
