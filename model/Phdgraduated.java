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
@Table(name="phd_graduated")

public class Phdgraduated {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long phdgraduated_ID;
	
@Column(name= "phdgraduated_shift")	
private String phd2s1;

@Column(name= "phdgraduated_academicyear")	
private String phd2y1;

@Column(name= "phdgraduated_totalstudents")	
private String phd2t1;

public Long getPhdgraduated_ID() {
	return phdgraduated_ID;
}

public void setPhdgraduated_ID(Long phdgraduated_ID) {
	this.phdgraduated_ID = phdgraduated_ID;
}

public String getPhd2s1() {
	return phd2s1;
}

public void setPhd2s1(String phd2s1) {
	this.phd2s1 = phd2s1;
}

public String getPhd2y1() {
	return phd2y1;
}

public void setPhd2y1(String phd2y1) {
	this.phd2y1 = phd2y1;
}

public String getPhd2t1() {
	return phd2t1;
}

public void setPhd2t1(String phd2t1) {
	this.phd2t1 = phd2t1;
}

}