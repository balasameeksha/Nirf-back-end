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
@Table(name="pg111_past3yrs")

public class Pgprogram111{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long pg111_ID;
	
@Column(name= "pg111_acyear1")	
private String pg3y1;

@Column(name= "pg111_1styrintake")	
private String pg3t1;

@Column(name= "pg111_1styradmits")	
private String pg3t2;

@Column(name= "pg111_acyear2")	
private String pg3y2;

@Column(name= "pg111_lateralentry")	
private String pg3t3;

@Column(name= "pg111_acyear3")	
private String pg3y3;

@Column(name= "pg111_mintime")	
private String pg3t4;

@Column(name= "pg111_studentsplaced")	
private String pg3t5;

@Column(name= "pg111_mediansalary")	
private String pg3t6;

@Column(name= "pg111_higherstudies")	
private String pg3t7;

public Long getPg111_ID() {
	return pg111_ID;
}

public void setPg111_ID(Long pg111_ID) {
	this.pg111_ID = pg111_ID;
}

public String getPg3y1() {
	return pg3y1;
}

public void setPg3y1(String pg3y1) {
	this.pg3y1 = pg3y1;
}

public String getPg3t1() {
	return pg3t1;
}

public void setPg3t1(String pg3t1) {
	this.pg3t1 = pg3t1;
}

public String getPg3t2() {
	return pg3t2;
}

public void setPg3t2(String pg3t2) {
	this.pg3t2 = pg3t2;
}

public String getPg3y2() {
	return pg3y2;
}

public void setPg3y2(String pg3y2) {
	this.pg3y2 = pg3y2;
}

public String getPg3t3() {
	return pg3t3;
}

public void setPg3t3(String pg3t3) {
	this.pg3t3 = pg3t3;
}

public String getPg3y3() {
	return pg3y3;
}

public void setPg3y3(String pg3y3) {
	this.pg3y3 = pg3y3;
}

public String getPg3t4() {
	return pg3t4;
}

public void setPg3t4(String pg3t4) {
	this.pg3t4 = pg3t4;
}

public String getPg3t5() {
	return pg3t5;
}

public void setPg3t5(String pg3t5) {
	this.pg3t5 = pg3t5;
}

public String getPg3t6() {
	return pg3t6;
}

public void setPg3t6(String pg3t6) {
	this.pg3t6 = pg3t6;
}

public String getPg3t7() {
	return pg3t7;
}

public void setPg3t7(String pg3t7) {
	this.pg3t7 = pg3t7;
}


}