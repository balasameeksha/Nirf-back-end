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
@Table(name="research_details")

public class Researchdetails{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long research_ID;
	
@Column(name= "research_program")	
private String rep1;	
	
@Column(name= "researchAcademicyear")	
private String rey1;

@Column(name= "research_value")	
private String rev1;


public Long getResearch_ID() {
	return research_ID;
}

public void setResearch_ID(Long research_ID) {
	this.research_ID = research_ID;
}

public String getRep1() {
	return rep1;
}

public void setRep1(String rep1) {
	this.rep1 = rep1;
}

public String getRey1() {
	return rey1;
}

public void setRey1(String rey1) {
	this.rey1 = rey1;
}

public String getRev1() {
	return rev1;
}

public void setRev1(String rev1) {
	this.rev1 = rev1;
}



}