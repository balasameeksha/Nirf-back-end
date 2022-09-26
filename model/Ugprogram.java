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
@Table(name="ug_past3yrs")

public class Ugprogram {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long ug_ID;
	
@Column(name= "ug_acyear1")	
private String ugy1;

@Column(name= "ug_1styrintake")	
private String ugt1;

@Column(name= "ug_1styradmits")	
private String ugt2;

@Column(name= "ug_acyear2")	
private String ugy2;

@Column(name= "ug_lateralentry")	
private String ugt3;

@Column(name= "ug_acyear3")	
private String ugy3;

@Column(name= "ug_mintime")	
private String ugt4;

@Column(name= "ug_studentsplaced")	
private String ugt5;

@Column(name= "ug_mediansalary")	
private String ugt6;

@Column(name= "ug_higherstudies")	
private String ugt7;

public String getUgy1() {
	return ugy1;
}

public void setUgy1(String ugy1) {
	this.ugy1 = ugy1;
}

public String getUgt1() {
	return ugt1;
}

public void setUgt1(String ugt1) {
	this.ugt1 = ugt1;
}

public String getUgt2() {
	return ugt2;
}

public void setUgt2(String ugt2) {
	this.ugt2 = ugt2;
}

public String getUgy2() {
	return ugy2;
}

public void setUgy2(String ugy2) {
	this.ugy2 = ugy2;
}

public String getUgt3() {
	return ugt3;
}

public void setUgt3(String ugt3) {
	this.ugt3 = ugt3;
}

public String getUgy3() {
	return ugy3;
}

public void setUgy3(String ugy3) {
	this.ugy3 = ugy3;
}

public String getUgt4() {
	return ugt4;
}

public void setUgt4(String ugt4) {
	this.ugt4 = ugt4;
}

public String getUgt5() {
	return ugt5;
}

public void setUgt5(String ugt5) {
	this.ugt5 = ugt5;
}

public String getUgt6() {
	return ugt6;
}

public void setUgt6(String ugt6) {
	this.ugt6 = ugt6;
}

public String getUgt7() {
	return ugt7;
}

public void setUgt7(String ugt7) {
	this.ugt7 = ugt7;
}

public Long getUg_ID() {
	return ug_ID;
}

public void setUg_ID(Long ug_ID) {
	this.ug_ID = ug_ID;
}



}