package com.xworkz.trainee.servlet;

public class Trainee {
	
	private String name;
	private String type;
	private String yop;
	private String education;
	
	public Trainee() {
		super();
	}

	public Trainee(String name, String type, String yop, String education) {
		super();
		this.name = name;
		this.type = type;
		this.yop = yop;
		this.education = education;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getYop() {
		return yop;
	}

	public void setYop(String yop) {
		this.yop = yop;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}
	
	
	

}
