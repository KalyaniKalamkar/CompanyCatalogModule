package com.Company.CatalogModule;

import org.springframework.stereotype.Service;

@Service
public class UserModule
{

	private int custid;
	private String custnm;
	private String pass;
	private String usertype;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustnm() {
		return custnm;
	}
	public void setCustnm(String custnm) {
		this.custnm = custnm;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	
	
}
