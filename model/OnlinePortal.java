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
@Table(name="online_portal")

public class OnlinePortal {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long onlineportal_ID;

@Column(name= "onlineportal_name")	
private String onpot1;

@Column(name= "onlineportal_onlineclasses")	
private String onpot2;

@Column(name= "onlineportal_totalonline")	
private String onpot3;

@Column(name= "onlineportal_totalcredits")	
private String onpot4;

public Long getOnlineportal_ID() {
	return onlineportal_ID;
}

public void setOnlineportal_ID(Long onlineportal_ID) {
	this.onlineportal_ID = onlineportal_ID;
}

public String getOnpot1() {
	return onpot1;
}

public void setOnpot1(String onpot1) {
	this.onpot1 = onpot1;
}

public String getOnpot2() {
	return onpot2;
}

public void setOnpot2(String onpot2) {
	this.onpot2 = onpot2;
}

public String getOnpot3() {
	return onpot3;
}

public void setOnpot3(String onpot3) {
	this.onpot3 = onpot3;
}

public String getOnpot4() {
	return onpot4;
}

public void setOnpot4(String onpot4) {
	this.onpot4 = onpot4;
}



}