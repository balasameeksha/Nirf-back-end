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
@Table(name="phd_pg1")
public class Phdpg1 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long phdpg1_ID;

	@Column(name= "phdpg1_field")	
	private String phd3f1;

	@Column(name= "phdpg1_totalstudents")	
	private String phd3t1;

	public Long getPhdpg1_ID() {
		return phdpg1_ID;
	}

	public void setPhdpg1_ID(Long phdpg1_ID) {
		this.phdpg1_ID = phdpg1_ID;
	}

	public String getPhd3f1() {
		return phd3f1;
	}

	public void setPhd3f1(String phd3f1) {
		this.phd3f1 = phd3f1;
	}

	public String getPhd3t1() {
		return phd3t1;
	}

	public void setPhd3t1(String phd3t1) {
		this.phd3t1 = phd3t1;
	}

	
}
