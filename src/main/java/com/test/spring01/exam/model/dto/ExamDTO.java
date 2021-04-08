package com.test.spring01.exam.model.dto;

import java.util.Calendar;
import java.util.Date;

public class ExamDTO {
	private int no;
	private String name;
	private	String jumin;
	private String gender;
	private int age;
	private Date regi_date;
	
	
	public void proc() {
		int bornYear = Integer.parseInt(jumin.substring(0,2));
		int month = Integer.parseInt(jumin.substring(2,4));
		int date = Integer.parseInt(jumin.substring(4,6));
		
		int gender_ = Integer.parseInt(jumin.substring(6,7));
		
		if (gender_==1||gender_==3) {
			gender = "남자";
		}else if (gender_==2||gender_==4){
			gender = "여자";
		}else {
			gender = "알수 없음";
		}
		
		int[] today = getDateTime();
	
		
		if(month>=today[2]) {
			if(bornYear>=today[1]) {
				age = 1;
			}else {
				age = 2;
			}
		}else {
			age = 3;
		}
		
		
		
		
		
	}
	public int[] getDateTime() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		int[] result = new int[6];
		result[0]=year;
		result[1]=month;
		result[2]=day;
		result[3]=hour;
		result[4]=min;
		result[5]=sec;
		
		return result;
		
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJumin() {
		return jumin;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getRegi_date() {
		return regi_date;
	}
	public void setRegi_date(Date regi_date) {
		this.regi_date = regi_date;
	}
	
	
	
	
	
}
