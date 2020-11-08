package com.ssafy.happyhouse.repository.dto;

import java.sql.Timestamp;

public class Member {
	private String id;
	private String pw;
	private String email;
	private String gender;
	private String phone;
	private Timestamp birthday;
	private int grade;
	private Timestamp bandate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Timestamp getBirthday() {
		return birthday;
	}

	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Timestamp getBandate() {
		return bandate;
	}

	public void setBandate(Timestamp bandate) {
		this.bandate = bandate;
	}

}
