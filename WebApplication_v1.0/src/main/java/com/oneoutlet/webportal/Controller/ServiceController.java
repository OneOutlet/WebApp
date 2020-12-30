package com.oneoutlet.webportal.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oneoutlet.webportal.DTO.ServiceElectricianDTO;
import com.oneoutlet.webportal.Service.ElectricianService;

@Controller
public class ServiceController {

	@Autowired
	private ElectricianService electricianService;

	@RequestMapping("/")
	public String home(@ModelAttribute("serviceElectrician") ServiceElectricianDTO serviceElectrician) {

		return "home";

	}

	@RequestMapping(value = "/regiterelecrtonicservice", method = RequestMethod.POST)
	public String regiterelecrtonicservice(
			@Valid @ModelAttribute("serviceElectrician") ServiceElectricianDTO serviceElectrician,
			BindingResult result) {

		if(result.hasErrors()) {
		
			return "home";
		
		}
		
		electricianService.insertDataOfElectrician(serviceElectrician);
		
		return "home";

	}

}
