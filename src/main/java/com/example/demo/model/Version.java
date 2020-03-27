package com.example.demo.model;

import java.util.Date;

public class Version {
	
	private String buildName;
	private int buildVersionNumber;
	private Date buildDate;
	
	
	public String getBuildName() {
		return buildName;
	}
	public void setBuildName(String buildName) {
		this.buildName = buildName;
	}
	public int getBuildVersionNumber() {
		return buildVersionNumber;
	}
	public void setBuildVersionNumber(int buildVersionNumber) {
		this.buildVersionNumber = buildVersionNumber;
	}
	public Date getBuildDate() {
		return buildDate;
	}
	public void setBuildDate(Date buildDate) {
		this.buildDate = buildDate;
	}
	
	

}
