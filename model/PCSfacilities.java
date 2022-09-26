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
@Table(name="pcs_facilities")

public class PCSfacilities{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long pcs_ID;
	
@Column(name= "pcs_entity1")	
private String pcst1;

@Column(name= "pcs_entity2")	
private String pcst2;

@Column(name= "pcs_entity3")	
private String pcst3;


public String getPcst1() {
	return pcst1;
}

public void setPcst1(String pcst1) {
	this.pcst1 = pcst1;
}

public String getPcst2() {
	return pcst2;
}

public void setPcst2(String pcst2) {
	this.pcst2 = pcst2;
}

public String getPcst3() {
	return pcst3;
}

public void setPcst3(String pcst3) {
	this.pcst3 = pcst3;
}

public Long getPcs_ID() {
	return pcs_ID;
}

public void setPcs_ID(Long pcs_ID) {
	this.pcs_ID = pcs_ID;
}




}