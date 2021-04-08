package com.test.spring01.test;

public class Test06DTO {
	private String pcode;
	private String pname;
	private int pprice;
	private int salepercent;
	private double saleamount;
	private String pcompany;
	
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	public int getSalepercent() {
		return salepercent;
	}
	public void setSalepercent(int salepercent) {
		this.salepercent = salepercent;
	}
	public double getSaleamount() {
		return saleamount;
	}
	public void setSaleamount(double saleamount) {
		this.saleamount = saleamount;
	}
	public String getPcompany() {
		return pcompany;
	}
	public void setPcompany(String pcompany) {
		this.pcompany = pcompany;
	}
	
	public void proc() {
		saleamount = pprice * salepercent/100;
	}
}
