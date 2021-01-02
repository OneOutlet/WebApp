package com.oneoutlet.webportal.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oneoutlet.webportal.DTO.ServiceCarpenterDTO;
import com.oneoutlet.webportal.DTO.ServiceElectricianDTO;
import com.oneoutlet.webportal.DTO.ServiceEventDTO;
import com.oneoutlet.webportal.DTO.ServiceIronWorkDTO;
import com.oneoutlet.webportal.DTO.ServicePainterDTO;
import com.oneoutlet.webportal.DTO.ServicePlumberDTO;
import com.oneoutlet.webportal.Service.CarpenterService;
import com.oneoutlet.webportal.Service.ElectricianService;
import com.oneoutlet.webportal.Service.EventService;
import com.oneoutlet.webportal.Service.IronWorkService;
import com.oneoutlet.webportal.Service.PainterService;
import com.oneoutlet.webportal.Service.PlumberService;

@Controller
public class ServiceController {

	@Autowired
	private ElectricianService electricianService;
	
	@Autowired
	private CarpenterService carpenterService ;
	
	@Autowired
	private EventService eventService;
	
	@Autowired
	private IronWorkService ironWorkService ;
	
	@Autowired
	private PainterService painterService;
	
	@Autowired
	private PlumberService plumberService;
	
	

	@RequestMapping("/")
	public String home(@ModelAttribute("serviceElectrician") ServiceElectricianDTO serviceElectrician,
			           @ModelAttribute("serviceCarpenter") ServiceCarpenterDTO serviceCarpenter,
			           @ModelAttribute("serviceEvent") ServiceEventDTO serviceEvent ,
			           @ModelAttribute("serviceIronWork") ServiceIronWorkDTO serviceIronWork,
			           @ModelAttribute("servicePainter") ServicePainterDTO servicePainter,
			           @ModelAttribute("servicePlumber") ServicePlumberDTO servicePlumber) {

		return "home";

	}

	@RequestMapping(value = "/regitercarpenterservice", method = RequestMethod.POST)
	public String regitercarpenterservice(
			@Valid @ModelAttribute("serviceCarpenter") ServiceCarpenterDTO serviceCarpenter,
			BindingResult result) {

		if(result.hasErrors()) {
		
			return "home";
		
		}
		
		carpenterService.insertDataOfCarpenter(serviceCarpenter);
		
		return "home";

	}
	
	
	@RequestMapping(value = "/regiterelecrtonicservice", method = RequestMethod.POST)
	public String regiterelecrtonicservice(
			@Valid  @ModelAttribute("serviceElectrician") ServiceElectricianDTO serviceElectrician,
			BindingResult result) {

		if(result.hasErrors()) {
		
			return "home";
		
		}
		
		electricianService.insertDataOfElectrician(serviceElectrician);
		
		return "home";

	}
	
	@RequestMapping(value = "/regitereventservice", method = RequestMethod.POST)
	public String regitereventservice(
			@Valid @ModelAttribute("serviceEvent") ServiceEventDTO serviceEvent,
			BindingResult result) {

		if(result.hasErrors()) {
		
			return "home";
		
		}
		eventService.insertDataOfEvent(serviceEvent);
		
		
		return "home";

	}
	
	@RequestMapping(value = "/regiterironworkservice", method = RequestMethod.POST)
	public String regiterironworkservice(
			@Valid @ModelAttribute("serviceIronWork") ServiceIronWorkDTO serviceIronWork,
			BindingResult result) {

		if(result.hasErrors()) {
		
			return "home";
		
		}
		
		ironWorkService.insertDataOfIronWork(serviceIronWork);
		
		return "home";

	}
	
	@RequestMapping(value = "/regiterpainterservice", method = RequestMethod.POST)
	public String regiterpainterservice(
			@Valid  @ModelAttribute("servicePainter") ServicePainterDTO servicePainter,
			BindingResult result) {

		if(result.hasErrors()) {
		
			return "home";
		
		}
		
		painterService.insertDataOfPainter(servicePainter);
		
		return "home";

	}
	
	@RequestMapping(value = "/regiterplumberservice", method = RequestMethod.POST)
	public String regiterplumberservice(
			@Valid    @ModelAttribute("servicePlumber") ServicePlumberDTO servicePlumber,
			BindingResult result) {

		if(result.hasErrors()) {
		
			return "home";
		
		}
		
		plumberService.insertDataOfPlumber(servicePlumber);
		
		return "home";

	}
	
	

}
