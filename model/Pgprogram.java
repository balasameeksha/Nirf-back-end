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
@Table(name="pg_past3yrs")

public class Pgprogram {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long pg_ID;
	
@Column(name= "pg_acyear1")	
private String pg2y1;

@Column(name= "pg_1styrintake")	
private String pg2t1;

@Column(name= "pg_1styradmits")	
private String pg2t2;

@Column(name= "pg_acyear2")	
private String pg2y2;

@Column(name= "pg_mintime")	
private String pg2t3;

@Column(name= "pg_studentsplaced")	
private String pg2t4;

@Column(name= "pg_mediansalary")	
private String pg2t5;

@Column(name= "pg_higherstudies")	
private String pg2t6;

public Long getPg_ID() {
	return pg_ID;
}

public void setPg_ID(Long pg_ID) {
	this.pg_ID = pg_ID;
}

public String getPg2y1() {
	return pg2y1;
}

public void setPg2y1(String pg2y1) {
	this.pg2y1 = pg2y1;
}

public String getPg2t1() {
	return pg2t1;
}

public void setPg2t1(String pg2t1) {
	this.pg2t1 = pg2t1;
}

public String getPg2t2() {
	return pg2t2;
}

public void setPg2t2(String pg2t2) {
	this.pg2t2 = pg2t2;
}

public String getPg2y2() {
	return pg2y2;
}

public void setPg2y2(String pg2y2) {
	this.pg2y2 = pg2y2;
}

public String getPg2t3() {
	return pg2t3;
}

public void setPg2t3(String pg2t3) {
	this.pg2t3 = pg2t3;
}

public String getPg2t4() {
	return pg2t4;
}

public void setPg2t4(String pg2t4) {
	this.pg2t4 = pg2t4;
}

public String getPg2t5() {
	return pg2t5;
}

public void setPg2t5(String pg2t5) {
	this.pg2t5 = pg2t5;
}

public String getPg2t6() {
	return pg2t6;
}

public void setPg2t6(String pg2t6) {
	this.pg2t6 = pg2t6;
}



}


