package com.test.spring01.test;

public class Test05DTO2 {
	private String name;

	private int kor;
	private int eng;
	private int mat;
	private int sci;
	private int his;
	private int tot;
	private double avg;
	
	public int tot(int kor, int eng,int mat,int sci, int his) {
		int tot = kor+eng+mat+sci+his;
		return tot;
	}
	public double avg(int tot) {
		double avg = (double)tot/5.0;
		return avg;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getSci() {
		return sci;
	}
	public void setSci(int sci) {
		this.sci = sci;
	}
	public int getHis() {
		return his;
	}
	public void setHis(int his) {
		this.his = his;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	public void proc() {
		tot = kor+eng+mat+sci+his;
		avg = (double)tot/5.0;
	}

	
	
}
