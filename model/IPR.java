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
@Table(name="ipr")

public class IPR {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long ipr_ID;

@Column(name= "ipr_program")	
private String iprp1;

@Column(name= "ipr_calendaryear")	
private String ipry1;

@Column(name= "ipr_value")	
private String iprv1;



public Long getIpr_ID() {
	return ipr_ID;
}

public void setIpr_ID(Long ipr_ID) {
	this.ipr_ID = ipr_ID;
}

public String getIprp1() {
	return iprp1;
}

public void setIprp1(String iprp1) {
	this.iprp1 = iprp1;
}

public String getIpry1() {
	return ipry1;
}

public void setIpry1(String ipry1) {
	this.ipry1 = ipry1;
}

public String getIprv1() {
	return iprv1;
}

public void setIprv1(String iprv1) {
	this.iprv1 = iprv1;
}


}