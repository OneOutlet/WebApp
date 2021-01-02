package com.oneoutlet.webportal.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.oneoutlet.webportal.BO.ServiceEventBO;
import com.oneoutlet.webportal.DAO.ServiceEventDAO;
import com.oneoutlet.webportal.DTO.ServiceEventDTO;

@Service("eService")
public class EventServiceImp implements EventService {

	@Autowired
	ServiceEventDAO serviceEventDAO;
	
	
	@Override
	public int insertDataOfEvent(ServiceEventDTO dto) {
		
		String currentTime=null;
			int count=0;
			
			ServiceEventBO bo= new ServiceEventBO();

	         //Calculating Time
			
			 SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			 
			 Date date=new Date();
			 
			currentTime=simpleDateFormat.format(date);
			
			//Inserting Data into BO Object
			
			bo.setCustomer_Name(dto.getCustomer_Name());
			bo.setMobile(dto.getMobile());
			bo.setEmail(dto.getEmail());
			bo.setEvent(dto.getEvent());
	        bo.setAddress(dto.getAddress());
	        bo.setTime(currentTime);
	        
	        count=serviceEventDAO.insertEventData(bo);
			
			return count;
	}

}
