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
@Table(name="naac_accrediation")

public class Naacaccrediation {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long naac_ID;

@Column(name= "naac_validfrom")	
private String naact1;

@Column(name= "naac_validto")	
private String naact2;

@Column(name= "naac_cgpa")	
private String naact3;

public Long getNaac_ID() {
	return naac_ID;
}

public void setNaac_ID(Long naac_ID) {
	this.naac_ID = naac_ID;
}

public String getNaact1() {
	return naact1;
}

public void setNaact1(String naact1) {
	this.naact1 = naact1;
}

public String getNaact2() {
	return naact2;
}

public void setNaact2(String naact2) {
	this.naact2 = naact2;
}

public String getNaact3() {
	return naact3;
}

public void setNaact3(String naact3) {
	this.naact3 = naact3;
}


}
