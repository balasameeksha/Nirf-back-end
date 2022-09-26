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
@Table(name="student_strength")

public class Nirfstrength {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long strength_ID;
	
@Column(name= "strength_allprograms")	
private String stp1;

@Column(name= "strength_male")	
private String stp2;

@Column(name= "strength_female")	
private String stp3;

@Column(name= "strength_total")	
private String stp4;

@Column(name= "strength_incity")	
private String stp5;

@Column(name= "strength_outcity")	
private String stp6;

@Column(name= "strength_outcountry")	
private String stp7;

@Column(name= "strength_ecobackward")	
private String stp8;

@Column(name= "strength_socialchallenged")	
private String stp9;

@Column(name= "strength_fullfeeCG")	
private String stp10;

@Column(name= "strength_fullfeeIF")	
private String stp11;

@Column(name= "strength_fullfeePB")	
private String stp12;

@Column(name= "strength_nofullfee")	
private String stp13;

public Long getStrength_ID() {
	return strength_ID;
}

public void setStrength_ID(Long strength_ID) {
	this.strength_ID = strength_ID;
}

public String getStp1() {
	return stp1;
}

public void setStp1(String stp1) {
	this.stp1 = stp1;
}

public String getStp2() {
	return stp2;
}

public void setStp2(String stp2) {
	this.stp2 = stp2;
}

public String getStp3() {
	return stp3;
}

public void setStp3(String stp3) {
	this.stp3 = stp3;
}

public String getStp4() {
	return stp4;
}

public void setStp4(String stp4) {
	this.stp4 = stp4;
}

public String getStp5() {
	return stp5;
}

public void setStp5(String stp5) {
	this.stp5 = stp5;
}

public String getStp6() {
	return stp6;
}

public void setStp6(String stp6) {
	this.stp6 = stp6;
}

public String getStp7() {
	return stp7;
}

public void setStp7(String stp7) {
	this.stp7 = stp7;
}

public String getStp8() {
	return stp8;
}

public void setStp8(String stp8) {
	this.stp8 = stp8;
}

public String getStp9() {
	return stp9;
}

public void setStp9(String stp9) {
	this.stp9 = stp9;
}

public String getStp10() {
	return stp10;
}

public void setStp10(String stp10) {
	this.stp10 = stp10;
}

public String getStp11() {
	return stp11;
}

public void setStp11(String stp11) {
	this.stp11 = stp11;
}

public String getStp12() {
	return stp12;
}

public void setStp12(String stp12) {
	this.stp12 = stp12;
}

public String getStp13() {
	return stp13;
}

public void setStp13(String stp13) {
	this.stp13 = stp13;
}

}