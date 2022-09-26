package com.adiverse.erp.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
//import javax.persistence.EmbeddedId;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name = "sanctioned_intake")
//@IdClass(nirfId.class)
public class nirf implements Serializable {


	/*
	 * @EmbeddedId private nirfId nirf_id;
	 * 
	 * public nirfId getNirf_id() { return nirf_id; }
	 * 
	 * public void setNirf_id(nirfId nirf_id) { this.nirf_id = nirf_id; }
	 */

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long college_ID;
	
	@Column(name = "sanctionedProgram")
	private String satp1;

	@Column(name = "sanctionedAcademicyear")
	private String say1;

	@Column(name = "sanctioned_value")
	private String sav1;

	@OneToMany(targetEntity = Nirfstrength.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "nirf_foreignkey", referencedColumnName = "college_ID")
	private List<Nirfstrength> nirfstrength;

	@OneToMany(targetEntity = Ugprogram.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "nirf_foreignkey", referencedColumnName = "college_ID")
	private List<Ugprogram> ugprogram;

	@OneToMany(targetEntity = Pgprogram.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "nirf_foreignkey", referencedColumnName = "college_ID")
	private List<Pgprogram> pgprogram2;

	@OneToMany(targetEntity = Pgprogram111.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "nirf_foreignkey", referencedColumnName = "college_ID")
	private List<Pgprogram111> pgprogram3;

	@OneToMany(targetEntity = Phdgraduated.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "nirf_foreignkey", referencedColumnName = "college_ID")
	private List<Phdgraduated> phdgraduated;

	@OneToMany(targetEntity = Onlineed.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "nirf_foreignkey", referencedColumnName = "college_ID")
	private List<Onlineed> onlineed;

	@OneToMany(targetEntity = FRCapitalexp.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "nirf_foreignkey", referencedColumnName = "college_ID")
	private List<FRCapitalexp> frcapex;

	@OneToMany(targetEntity = FROperationalexp.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "nirf_foreignkey", referencedColumnName = "college_ID")
	private List<FROperationalexp> fropex;

	@OneToMany(targetEntity = IPR.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "nirf_foreignkey", referencedColumnName = "college_ID")
	private List<IPR> ipr;

	@OneToMany(targetEntity = Researchdetails.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "nirf_foreignkey", referencedColumnName = "college_ID")
	private List<Researchdetails> researchdetails;

	@OneToMany(targetEntity = Consultancyproject.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "nirf_foreignkey", referencedColumnName = "college_ID")
	private List<Consultancyproject> consultancyproj;

	@OneToMany(targetEntity = Executivedevprogram.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "nirf_foreignkey", referencedColumnName = "college_ID")
	private List<Executivedevprogram> executivedevprogram;

	@OneToMany(targetEntity = PCSfacilities.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "nirf_foreignkey", referencedColumnName = "college_ID")
	private List<PCSfacilities> pcfacilities;

	@OneToMany(targetEntity = NbaAccrediation.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "nirf_foreignkey", referencedColumnName = "college_ID")
	private List<NbaAccrediation> nba;

	@OneToMany(targetEntity = Naacaccrediation.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "nirf_foreignkey", referencedColumnName = "college_ID")
	private List<Naacaccrediation> naac;

	@OneToMany(targetEntity = Naac2.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "nirf_foreignkey", referencedColumnName = "college_ID")
	private List<Naac2> naac2;

	@OneToMany(targetEntity = Phdpg.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "nirf_foreignkey", referencedColumnName = "college_ID")
	private List<Phdpg> phdpg;

	@OneToMany(targetEntity = Phdpg1.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "nirf_foreignkey", referencedColumnName = "college_ID")
	private List<Phdpg1> phdpg1;

	@OneToMany(targetEntity = Phdtotal.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "nirf_foreignkey", referencedColumnName = "college_ID")
	private List<Phdtotal> phdtotal;

	@OneToMany(targetEntity = OnlinePortal.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "nirf_foreignkey", referencedColumnName = "college_ID")
	private List<OnlinePortal> onlineportal;
	
	public List<Nirfstrength> getNirfstrength() {
		return nirfstrength;
	}

	public void setNirfstrength(List<Nirfstrength> nirfstrength) {
		this.nirfstrength = nirfstrength;
	}

	public List<Ugprogram> getUgprogram() {
		return ugprogram;
	}

	public void setUgprogram(List<Ugprogram> ugprogram) {
		this.ugprogram = ugprogram;
	}

	public List<Pgprogram> getPgprogram2() {
		return pgprogram2;
	}

	public void setPgprogram2(List<Pgprogram> pgprogram2) {
		this.pgprogram2 = pgprogram2;
	}

	public List<Pgprogram111> getPgprogram3() {
		return pgprogram3;
	}

	public void setPgprogram3(List<Pgprogram111> pgprogram3) {
		this.pgprogram3 = pgprogram3;
	}

	public List<Phdgraduated> getPhdgraduated() {
		return phdgraduated;
	}

	public void setPhdgraduated(List<Phdgraduated> phdgraduated) {
		this.phdgraduated = phdgraduated;
	}

	public List<Onlineed> getOnlineed() {
		return onlineed;
	}

	public void setOnlineed(List<Onlineed> onlineed) {
		this.onlineed = onlineed;
	}

	public List<FRCapitalexp> getFrcapex() {
		return frcapex;
	}

	public void setFrcapex(List<FRCapitalexp> frcapex) {
		this.frcapex = frcapex;
	}

	public List<FROperationalexp> getFropex() {
		return fropex;
	}

	public void setFropex(List<FROperationalexp> fropex) {
		this.fropex = fropex;
	}

	public List<IPR> getIpr() {
		return ipr;
	}

	public void setIpr(List<IPR> ipr) {
		this.ipr = ipr;
	}

	public List<Researchdetails> getResearchdetails() {
		return researchdetails;
	}

	public void setResearchdetails(List<Researchdetails> researchdetails) {
		this.researchdetails = researchdetails;
	}

	public List<Consultancyproject> getConsultancyproj() {
		return consultancyproj;
	}

	public void setConsultancyproj(List<Consultancyproject> consultancyproj) {
		this.consultancyproj = consultancyproj;
	}

	public List<Executivedevprogram> getExecutivedevprogram() {
		return executivedevprogram;
	}

	public void setExecutivedevprogram(List<Executivedevprogram> executivedevprogram) {
		this.executivedevprogram = executivedevprogram;
	}

	public List<PCSfacilities> getPcfacilities() {
		return pcfacilities;
	}

	public void setPcfacilities(List<PCSfacilities> pcfacilities) {
		this.pcfacilities = pcfacilities;
	}

	public List<NbaAccrediation> getNba() {
		return nba;
	}

	public void setNba(List<NbaAccrediation> nba) {
		this.nba = nba;
	}

	public List<Naacaccrediation> getNaac() {
		return naac;
	}

	public void setNaac(List<Naacaccrediation> naac) {
		this.naac = naac;
	}

	public List<Naac2> getNaac2() {
		return naac2;
	}

	public void setNaac2(List<Naac2> naac2) {
		this.naac2 = naac2;
	}

	public List<Phdpg> getPhdpg() {
		return phdpg;
	}

	public void setPhdpg(List<Phdpg> phdpg) {
		this.phdpg = phdpg;
	}

	public List<Phdpg1> getPhdpg1() {
		return phdpg1;
	}

	public void setPhdpg1(List<Phdpg1> phdpg1) {
		this.phdpg1 = phdpg1;
	}

	public List<Phdtotal> getPhdtotal() {
		return phdtotal;
	}

	public void setPhdtotal(List<Phdtotal> phdtotal) {
		this.phdtotal = phdtotal;
	}

	public List<OnlinePortal> getOnlineportal() {
		return onlineportal;
	}

	public void setOnlineportal(List<OnlinePortal> onlineportal) {
		this.onlineportal = onlineportal;
	}

	public String getSatp1() {
		return satp1;
	}

	public void setSatp1(String satp1) {
		this.satp1 = satp1;
	}

	public String getSay1() {
		return say1;
	}

	public void setSay1(String say1) {
		this.say1 = say1;
	}

	public String getSav1() {
		return sav1;
	}

	public void setSav1(String sav1) {
		this.sav1 = sav1;
	}

	public Long getCollege_ID() {
		return college_ID;
	}

	public void setCollege_ID(Long college_ID) {
		this.college_ID = college_ID;
	}


}
