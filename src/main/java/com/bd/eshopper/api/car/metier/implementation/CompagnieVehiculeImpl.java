package com.bd.eshopper.api.car.metier.implementation;

import com.bd.eshopper.api.car.dao.CompagnieVehiculeRepository;
import com.bd.eshopper.api.car.entity.CompagnieVehicule;
import com.bd.eshopper.api.car.metier.CompagnieVehiculeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompagnieVehiculeImpl implements CompagnieVehiculeMetier {

	@Autowired
	private CompagnieVehiculeRepository compagineVehiculeRepository;

	@Override
	public CompagnieVehicule save(CompagnieVehicule o) {
		CompagnieVehicule a = new CompagnieVehicule();		
		if (o.getId() == null) {
			if (o.getNom() != null) {
				if (compagineVehiculeRepository.findByNom(o.getNom()) == null) {
					a = compagineVehiculeRepository.save(o);
				} else {
					a.setNom("exite deja");
				}
			}
		}
		return a;
	}

	@Override
	public List<CompagnieVehicule> getAll() {
		return compagineVehiculeRepository.findAll();
	}

	@Override
	public CompagnieVehicule upadete(CompagnieVehicule o) {
		return compagineVehiculeRepository.save(o);
	}

	@Override
	public Long delete(Long id) {
		if (compagineVehiculeRepository.getOne(id) != null) {
			compagineVehiculeRepository.deleteById(id);
			return id;
		} else {
			return 0L;
		}
	}

	@Override
	public CompagnieVehicule findOne(Long id) {
		return compagineVehiculeRepository.getOne(id);
	}

	@Override
	public CompagnieVehicule findByNom(String nom) {
		return compagineVehiculeRepository.findByNom(nom);
	}

}
