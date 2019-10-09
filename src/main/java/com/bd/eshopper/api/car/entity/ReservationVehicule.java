package com.bd.eshopper.api.car.entity;

import java.sql.Time;
import java.util.Date;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class ReservationVehicule  {
	//extends reservation
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id ;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date datePret ;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy" )
	private Date dateRetour ;
	
	private Time heurePret ;
	private Time heureRetour ;
	private Boolean valid ;

	@Column(columnDefinition ="Decimal(10,2)")
	private Double prix ;
	
	@ManyToOne
	@JoinColumn(name="vehicule_id")
	private Vehicule vehicule;
	
	
	public ReservationVehicule() {
		super();
	}

	public Date getDatePret() {
		return datePret;
	}

	public void setDatePret(Date datePret) {
		this.datePret = datePret;
	}

	public Date getDateRetour() {
		return dateRetour;
	}

	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}

	public Time getHeurePret() {
		return heurePret;
	}

	public void setHeurePret(Time heurePret) {
		this.heurePret = heurePret;
	}

	public Time getHeureRetour() {
		return heureRetour;
	}

	public void setHeureRetour(Time heureRetour) {
		this.heureRetour = heureRetour;
	}

	public Boolean getValid() {
		return valid;
	}

	public void setValid(Boolean valid) {
		this.valid = valid;
	}
	
	public Vehicule getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
