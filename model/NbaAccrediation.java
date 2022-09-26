package com.adiverse.erp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name="nba_accrediation")

public class NbaAccrediation {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long nba_ID;
	
@Column(name= "nba_entity")	
private String nbaf1;

@Column(name= "nba_value")	
private String nbav1;

public Long getNba_ID() {
	return nba_ID;
}

public void setNba_ID(Long nba_ID) {
	this.nba_ID = nba_ID;
}

public String getNbaf1() {
	return nbaf1;
}

public void setNbaf1(String nbaf1) {
	this.nbaf1 = nbaf1;
}

public String getNbav1() {
	return nbav1;
}

public void setNbav1(String nbav1) {
	this.nbav1 = nbav1;
}


}
