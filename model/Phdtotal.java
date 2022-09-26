package com.adiverse.erp.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Entity;

import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="phd_total")
public class Phdtotal {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long phdtotal_ID;
	
@Column(name= "phdtotal_fulltime")	
private String phd1t1;

@Column(name= "phdtotal_parttime")	
private String phd1t2;

public Long getPhdtotal_ID() {
	return phdtotal_ID;
}

public void setPhdtotal_ID(Long phdtotal_ID) {
	this.phdtotal_ID = phdtotal_ID;
}

public String getPhd1t1() {
	return phd1t1;
}

public void setPhd1t1(String phd1t1) {
	this.phd1t1 = phd1t1;
}

public String getPhd1t2() {
	return phd1t2;
}

public void setPhd1t2(String phd1t2) {
	this.phd1t2 = phd1t2;
}

}
