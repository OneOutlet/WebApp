package com.oneoutlet.webportal.Controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oneoutlet.webportal.DTO.ContactUsDTO;
import com.oneoutlet.webportal.DTO.ServiceCarpenterDTO;
import com.oneoutlet.webportal.DTO.ServiceElectricianDTO;
import com.oneoutlet.webportal.DTO.ServiceEventDTO;
import com.oneoutlet.webportal.DTO.ServiceIronWorkDTO;
import com.oneoutlet.webportal.DTO.ServicePainterDTO;
import com.oneoutlet.webportal.DTO.ServicePlumberDTO;
import com.oneoutlet.webportal.Service.CarpenterService;
import com.oneoutlet.webportal.Service.ContactUsService;
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
	private CarpenterService carpenterService;

	@Autowired
	private EventService eventService;

	@Autowired
	private IronWorkService ironWorkService;

	@Autowired
	private PainterService painterService;

	@Autowired
	private PlumberService plumberService;
	
	@Autowired
	private ContactUsService contactUsService;

	@RequestMapping({"/","home"})
	public String home(@ModelAttribute("serviceElectrician") ServiceElectricianDTO serviceElectrician,
			@ModelAttribute("serviceCarpenter") ServiceCarpenterDTO serviceCarpenter,
			@ModelAttribute("serviceEvent") ServiceEventDTO serviceEvent,
			@ModelAttribute("serviceIronWork") ServiceIronWorkDTO serviceIronWork,
			@ModelAttribute("servicePainter") ServicePainterDTO servicePainter,
			@ModelAttribute("servicePlumber") ServicePlumberDTO servicePlumber,
			@ModelAttribute("contactUs") ContactUsDTO contactUs) {

		try {
			return "home";
			
		} catch (IllegalStateException e) {

			System.out.println("ServiceController.home()");
			
			e.printStackTrace();
			
			return "error";
		}

	}

	@RequestMapping(value = "/regitercarpenterservice", method = RequestMethod.POST)
	public String regitercarpenterservice(
			@ModelAttribute("serviceElectrician") ServiceElectricianDTO serviceElectrician,
			@ModelAttribute("serviceEvent") ServiceEventDTO serviceEvent,
			@ModelAttribute("serviceIronWork") ServiceIronWorkDTO serviceIronWork,
			@ModelAttribute("servicePainter") ServicePainterDTO servicePainter,
			@ModelAttribute("servicePlumber") ServicePlumberDTO servicePlumber,
			@ModelAttribute("contactUs") ContactUsDTO contactUs,
			@Valid @ModelAttribute("serviceCarpenter") ServiceCarpenterDTO serviceCarpenter,
			BindingResult resultCarpenter,Model m) {

		if (resultCarpenter.hasErrors()) {

			m.addAttribute("act", "reqCarpenter");
			return "home";

		}

		try {
			carpenterService.insertDataOfCarpenter(serviceCarpenter);

			return "redirect:home?actsuccess=reqCarpenter";
			
		} catch (IllegalStateException e) {
		
			System.out.println("ServiceController.home()");
			
			e.printStackTrace();
			
			return "error";
		}

	}

	@RequestMapping(value = "/regiterelecrtonicservice", method = RequestMethod.POST)
	public String regiterelecrtonicservice(

			@ModelAttribute("serviceCarpenter") ServiceCarpenterDTO serviceCarpenter,

			@ModelAttribute("serviceEvent") ServiceEventDTO serviceEvent,

			@ModelAttribute("serviceIronWork") ServiceIronWorkDTO serviceIronWork,

			@ModelAttribute("servicePainter") ServicePainterDTO servicePainter,

			@ModelAttribute("servicePlumber") ServicePlumberDTO servicePlumber,
			
			@ModelAttribute("contactUs") ContactUsDTO contactUs,

			@Valid @ModelAttribute("serviceElectrician") ServiceElectricianDTO serviceElectrician,
			BindingResult resultElectrician,Model m) {

		if (resultElectrician.hasErrors()) {

			m.addAttribute("act", "reqElectrician");
			return "home";

		}

		try {
			electricianService.insertDataOfElectrician(serviceElectrician);

			return "redirect:home?actsuccess=reqElectrician";
		
		} catch (IllegalStateException e) {
		
			System.out.println("ServiceController.home()");
			
			e.printStackTrace();
			
			return "error";
		}

	}

	@RequestMapping(value = "/regitereventservice", method = RequestMethod.POST)
	public String regitereventservice(@ModelAttribute("serviceElectrician") ServiceElectricianDTO serviceElectrician,

			@ModelAttribute("serviceCarpenter") ServiceCarpenterDTO serviceCarpenter,

			@ModelAttribute("serviceIronWork") ServiceIronWorkDTO serviceIronWork,

			@ModelAttribute("servicePainter") ServicePainterDTO servicePainter,
			
			@ModelAttribute("servicePlumber") ServicePlumberDTO servicePlumber,
			
			@ModelAttribute("contactUs") ContactUsDTO contactUs,

			@Valid @ModelAttribute("serviceEvent") ServiceEventDTO serviceEvent, 
			BindingResult resultEvent,Model m) {

		if (resultEvent.hasErrors()) {

			m.addAttribute("act", "reqEvent");
			return "home";

		}
		try {
			eventService.insertDataOfEvent(serviceEvent);

			return "redirect:home?actsuccess=reqEvent";
			
		} catch (IllegalStateException e) {
			
			System.out.println("ServiceController.home()");
			
			e.printStackTrace();
			
			return "error";
		}

	}

	@RequestMapping(value = "/regiterironworkservice", method = RequestMethod.POST)
	public String regiterironworkservice(@ModelAttribute("serviceElectrician") ServiceElectricianDTO serviceElectrician,

			@ModelAttribute("serviceCarpenter") ServiceCarpenterDTO serviceCarpenter,

			@ModelAttribute("serviceEvent") ServiceEventDTO serviceEvent,

			@ModelAttribute("servicePainter") ServicePainterDTO servicePainter,

			@ModelAttribute("servicePlumber") ServicePlumberDTO servicePlumber,
			
			@ModelAttribute("contactUs") ContactUsDTO contactUs,

			@Valid @ModelAttribute("serviceIronWork") ServiceIronWorkDTO serviceIronWork,
			BindingResult resultIronWork,Model m) {

		if (resultIronWork.hasErrors()) {
			
            m.addAttribute("act", "reqIronWork");
			return "home";
		}

		try {
			ironWorkService.insertDataOfIronWork(serviceIronWork);

			return "redirect:home?actsuccess=reqIronWork";
		
		} catch (IllegalStateException e) {
		
			System.out.println("ServiceController.home()");
			
			e.printStackTrace();

			return "error";

		}

	}

	@RequestMapping(value = "/regiterpainterservice", method = RequestMethod.POST)
	public String regiterpainterservice(@ModelAttribute("serviceElectrician") ServiceElectricianDTO serviceElectrician,
			@ModelAttribute("serviceCarpenter") ServiceCarpenterDTO serviceCarpenter,
			@ModelAttribute("serviceEvent") ServiceEventDTO serviceEvent,
			@ModelAttribute("serviceIronWork") ServiceIronWorkDTO serviceIronWork,
			@ModelAttribute("servicePlumber") ServicePlumberDTO servicePlumber,
			@ModelAttribute("contactUs") ContactUsDTO contactUs,
			@Valid @ModelAttribute("servicePainter") ServicePainterDTO servicePainter,
			BindingResult resultPainter,Model m) {

		if (resultPainter.hasErrors()) {

			 m.addAttribute("act", "reqPainter");
			return "home";

		}

		try {
			painterService.insertDataOfPainter(servicePainter);

			return "redirect:home?actsuccess=reqPainter";
		
		} catch (IllegalStateException e) {
			
			System.out.println("ServiceController.home()");
			
			e.printStackTrace();
			
			return "error";
		}

	}

	@RequestMapping(value = "/regiterplumberservice", method = RequestMethod.POST)
	public String regiterplumberservice(@ModelAttribute("serviceElectrician") ServiceElectricianDTO serviceElectrician,
			@ModelAttribute("serviceCarpenter") ServiceCarpenterDTO serviceCarpenter,
			@ModelAttribute("serviceEvent") ServiceEventDTO serviceEvent,
			@ModelAttribute("serviceIronWork") ServiceIronWorkDTO serviceIronWork,
			@ModelAttribute("servicePainter") ServicePainterDTO servicePainter,
			@ModelAttribute("contactUs") ContactUsDTO contactUs,
			@Valid @ModelAttribute("servicePlumber") ServicePlumberDTO servicePlumber, 
			BindingResult resultPlumber,Model m) {

		if (resultPlumber.hasErrors()) {

			m.addAttribute("act", "reqPlumber");
			return "home";

		}

		try {
			plumberService.insertDataOfPlumber(servicePlumber);

			return "redirect:home?actsuccess=reqPlumber";
		
		} catch (IllegalStateException e) {
		
			System.out.println("ServiceController.home()");
			
			e.printStackTrace();
			
			return "error";
		}

	}
	
	@RequestMapping(value = "/contactus", method = RequestMethod.POST)
	public String contactus(@ModelAttribute("serviceElectrician") ServiceElectricianDTO serviceElectrician,
			@ModelAttribute("serviceCarpenter") ServiceCarpenterDTO serviceCarpenter,
			@ModelAttribute("serviceEvent") ServiceEventDTO serviceEvent,
			@ModelAttribute("serviceIronWork") ServiceIronWorkDTO serviceIronWork,
			@ModelAttribute("servicePainter") ServicePainterDTO servicePainter,
			@ModelAttribute("servicePlumber") ServicePlumberDTO servicePlumber,
			@Valid @ModelAttribute("contactUs") ContactUsDTO contactUs, 
			BindingResult resultContactUs,Model m) {

		if (resultContactUs.hasErrors()) {

			m.addAttribute("act", "reqContactUs");
			return "home";

		}

		try {
			
			contactUsService.insertDataOfContactUs(contactUs);
			
			return "redirect:home?actsuccess=reqContactUs";
		
		} catch (IllegalStateException e) {
		
			System.out.println("ServiceController.home()");
			
			e.printStackTrace();
			
			return "error";
		}

	}

}
