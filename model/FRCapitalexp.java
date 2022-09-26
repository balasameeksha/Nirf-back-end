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
@Table(name="fr_capitalexp")

public class FRCapitalexp {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long frcapitalexp_ID;


@Column(name= "frcapitalexp_program")	
private String frcp1;

@Column(name= "frcapitalexp_academicyear")	
private String frcy1;

@Column(name= "frcapitalexp_value")	
private String frcv1;

public Long getFrcapitalexp_ID() {
	return frcapitalexp_ID;
}

public void setFrcapitalexp_ID(Long frcapitalexp_ID) {
	this.frcapitalexp_ID = frcapitalexp_ID;
}

public String getFrcp1() {
	return frcp1;
}

public void setFrcp1(String frcp1) {
	this.frcp1 = frcp1;
}

public String getFrcy1() {
	return frcy1;
}

public void setFrcy1(String frcy1) {
	this.frcy1 = frcy1;
}

public String getFrcv1() {
	return frcv1;
}

public void setFrcv1(String frcv1) {
	this.frcv1 = frcv1;
}


}
