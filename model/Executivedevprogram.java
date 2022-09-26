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
@Table(name="executive_dev")

public class Executivedevprogram{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long executivedev_ID;
	
@Column(name= "executivedev_program")	
private String exp1;
	
@Column(name= "executivedev_Academicyear")	
private String exy1;

@Column(name= "executivedev_value")	
private String exv1;


public Long getExecutivedev_ID() {
	return executivedev_ID;
}

public void setExecutivedev_ID(Long executivedev_ID) {
	this.executivedev_ID = executivedev_ID;
}

public String getExp1() {
	return exp1;
}

public void setExp1(String exp1) {
	this.exp1 = exp1;
}

public String getExy1() {
	return exy1;
}

public void setExy1(String exy1) {
	this.exy1 = exy1;
}

public String getExv1() {
	return exv1;
}

public void setExv1(String exv1) {
	this.exv1 = exv1;
}


}
