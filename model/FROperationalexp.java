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
@Table(name="fr_operationalexp")

public class FROperationalexp {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long froperationalexp_ID;
	
	@Column(name= "froperationalexp_program")	
private String frop1;
	
@Column(name= "froperationalexp_academicyear")	
private String froy1;

@Column(name= "froperationalexp_value")	
private String frov1;

public Long getFroperationalexp_ID() {
	return froperationalexp_ID;
}

public void setFroperationalexp_ID(Long froperationalexp_ID) {
	this.froperationalexp_ID = froperationalexp_ID;
}

public String getFrop1() {
	return frop1;
}

public void setFrop1(String frop1) {
	this.frop1 = frop1;
}

public String getFroy1() {
	return froy1;
}

public void setFroy1(String froy1) {
	this.froy1 = froy1;
}

public String getFrov1() {
	return frov1;
}

public void setFrov1(String frov1) {
	this.frov1 = frov1;
}



}
