package com.Company.CatalogModule;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cominfo")

public class CompanyEntity {
	
	@Id
	@Column(name="cid")
	private int cid;
	
	@Column(name="cnm")
	private String cnm;
	
	@Column(name="founded")
	private int founded;
	
	@Column(name="category")
	private  String category;
	
	@Column(name="country")
	private String country;
	
	@Column(name="empno")
	private int empno;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCnm() {
		return cnm;
	}

	public void setCnm(String cnm) {
		this.cnm = cnm;
	}

	public int getFounded() {
		return founded;
	}

	public void setFounded(int founded) {
		this.founded = founded;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	
	
	

}
