package com.oneoutlet.webportal.BO;

import java.util.Date;

import lombok.Data;

@Data
public class ServiceEventBO {
	
	private String Customer_Name;
	private String mobile;
	private String email; 
	private String event;
	private String Address;
	private Date Time;

}
