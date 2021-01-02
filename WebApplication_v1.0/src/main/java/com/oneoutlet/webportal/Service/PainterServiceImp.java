package com.oneoutlet.webportal.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.oneoutlet.webportal.BO.ServicePainterBO;
import com.oneoutlet.webportal.DAO.ServicePainterDAO;
import com.oneoutlet.webportal.DTO.ServicePainterDTO;

@Service("eService")
public class PainterServiceImp implements PainterService {

	@Autowired
	ServicePainterDAO servicePainterDAO;
	
	
	@Override
	public int insertDataOfPainter(ServicePainterDTO dto) {
		
			
			String currentTime=null;
			int count=0;
			
			ServicePainterBO bo= new ServicePainterBO();

	         //Calculating Time
			
			 SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			 
			 Date date=new Date();
			 
			currentTime=simpleDateFormat.format(date);
			
			//Inserting Data into BO Object
			
			bo.setCustomer_Name(dto.getCustomer_Name());
			bo.setMobile(dto.getMobile());
			bo.setEmail(dto.getEmail());
	        bo.setAddress(dto.getAddress());
	        bo.setTime(currentTime);
	        
	        count=servicePainterDAO.insertPainterData(bo);
			
			return count;
	}

}
