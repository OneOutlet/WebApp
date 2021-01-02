package com.oneoutlet.webportal.DTO;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ServicePainterDTO {
	
	@NotBlank(message = "Please Fill the Customer Name")
	private String Customer_Name;
	@NotBlank(message = "Please Fill the Mobile Number")
	@Size(min=10,max=11,message="Mobile Number Can Not more then 11")
	private String mobile;
	@NotBlank(message = "Please Fill the Your Email Address")
	private String email;
	@NotBlank(message = "Please Fill the Your Complete Address")
	private String Address;

}
