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
@Table(name="naac2")

public class Naac2 {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long nba_ID;
	
@Column(name= "naac_entity")	
private String naacf1;

@Column(name= "naac_value")	
private String naacv1;

public Long getNba_ID() {
	return nba_ID;
}

public void setNba_ID(Long nba_ID) {
	this.nba_ID = nba_ID;
}

public String getNaacf1() {
	return naacf1;
}

public void setNaacf1(String naacf1) {
	this.naacf1 = naacf1;
}

public String getNaacv1() {
	return naacv1;
}

public void setNaacv1(String naacv1) {
	this.naacv1 = naacv1;
}


}
