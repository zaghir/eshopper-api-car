package com.bd.eshopper.api.car.metier.implementation;

import java.util.List;

import com.bd.eshopper.api.car.dao.ReservationVehiculeRepository;
import com.bd.eshopper.api.car.entity.ReservationVehicule;
import com.bd.eshopper.api.car.metier.ReservationVehiculeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationVehiculeImpl implements ReservationVehiculeMetier {

	@Autowired
	private ReservationVehiculeRepository reservationVehiculeRepository;
	
	//@Autowired
	//private ClientRepository clientRepository ;
	//Another API

/*	@Override
	public ReservationVehicule save(ReservationVehicule o) {

		o.setClient(clientRepository.save(o.getClient()));
		o.setCodeReservation(reservationVehiculeRepository.generatCodeReservazation(o.getVehicule().getId())) ;		
		return reservationVehiculeRepository.save(o);

	}*/

	@Override
	public List<ReservationVehicule> getAll() {
		return reservationVehiculeRepository.findAll();
	}

	@Override
	public Long delete(Long id) {
		if (reservationVehiculeRepository.getOne(id) != null) {
			reservationVehiculeRepository.deleteById(id);
			return id;
		} else {
			return 0L;
		}
	}

	@Override
	public ReservationVehicule update(ReservationVehicule o) {
		return reservationVehiculeRepository.save(o);
	}

	@Override
	public ReservationVehicule findOne(Long id) {
		return reservationVehiculeRepository.getOne(id);
	}

	@Override
	public ReservationVehicule getReservationByCode(String id) {
		
		return reservationVehiculeRepository.getReservationByCode(id);
	}
	
	

}
