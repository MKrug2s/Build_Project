package org.h_brs.coolemicroservices.service.pdo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT")
public class Adress {
	public Adress(int personID) {
		this.personID= personID;
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_seq")
	@SequenceGenerator(name = "ADDRESS_ID", sequenceName = "ADDRESS_ID", allocationSize = 1)
	@Column(name = "ID")
	private Integer id;
	@Column(name = "LAND")
	private String land;
	@Column(name = "PLZ")
	private String plz;
	@Column(name = "ORT")
	private String ort;
	@Column(name = "STRASSE")
	private String strasse;
	@Column(name = "HAUSNUMMER")
	private String hausnummer;
	@Column(name = "PERSONID")
	private Integer personID ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPersonID() {
		return personID;
	}
	public void setPersonID(Integer personID) {
		this.personID = personID;
	}
	
	public String getLand() {
		return land;
	}
	public void setLand(String land) {
		this.land = land;
	}
	public String getPlz() {
		return plz;
	}
	public void setPlz(String plz) {
		this.plz = plz;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public String getHausnummer() {
		return hausnummer;
	}
	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}

}