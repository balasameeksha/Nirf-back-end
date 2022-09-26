package com.adiverse.erp.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="online_education")

public class Onlineed {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long onlineed_ID;
	
@Column(name= "onlineed_entity1")	
private String ont1;

@Column(name= "onlineed_entity2")	
private String ont2;

@Column(name= "onlineed_entity3")	
private String ont3;

@Column(name= "onlineed_entity4")	
private String ont4;

@Column(name= "onlineed_entity5")	
private String ont5;


public String getOnt1() {
	return ont1;
}

public void setOnt1(String ont1) {
	this.ont1 = ont1;
}

public String getOnt2() {
	return ont2;
}

public void setOnt2(String ont2) {
	this.ont2 = ont2;
}

public String getOnt3() {
	return ont3;
}

public void setOnt3(String ont3) {
	this.ont3 = ont3;
}

public String getOnt4() {
	return ont4;
}

public void setOnt4(String ont4) {
	this.ont4 = ont4;
}

public String getOnt5() {
	return ont5;
}

public void setOnt5(String ont5) {
	this.ont5 = ont5;
}

public Long getOnlineed_ID() {
	return onlineed_ID;
}

public void setOnlineed_ID(Long onlineed_ID) {
	this.onlineed_ID = onlineed_ID;
}





}






