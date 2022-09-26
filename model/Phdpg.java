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
@Table(name="phd_pg")
public class Phdpg {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long phdpg_ID;
	
@Column(name= "phdpg_academicyear")	
private String phd4y1;

@Column(name= "phdpg_totalstudents")	
private String phd4t1;


public Long getPhdpg_ID() {
	return phdpg_ID;
}

public void setPhdpg_ID(Long phdpg_ID) {
	this.phdpg_ID = phdpg_ID;
}

public String getPhd4y1() {
	return phd4y1;
}

public void setPhd4y1(String phd4y1) {
	this.phd4y1 = phd4y1;
}

public String getPhd4t1() {
	return phd4t1;
}

public void setPhd4t1(String phd4t1) {
	this.phd4t1 = phd4t1;
}


}
