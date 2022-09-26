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
@Table(name="consultancyproject")

public class Consultancyproject{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long consultancyproject_ID;
	
@Column(name= "consultancy_program")	
private String cop1;

@Column(name= "consultancyproject_Academicyear")	
private String coy1;

@Column(name= "consultancy_value")	
private String cov1;


public Long getConsultancyproject_ID() {
	return consultancyproject_ID;
}

public void setConsultancyproject_ID(Long consultancyproject_ID) {
	this.consultancyproject_ID = consultancyproject_ID;
}

public String getCop1() {
	return cop1;
}

public void setCop1(String cop1) {
	this.cop1 = cop1;
}

public String getCoy1() {
	return coy1;
}

public void setCoy1(String coy1) {
	this.coy1 = coy1;
}

public String getCov1() {
	return cov1;
}

public void setCov1(String cov1) {
	this.cov1 = cov1;
}


}
