package com.oneoutlet.webportal.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.oneoutlet.webportal.BO.ServiceCarpenterBO;
import com.oneoutlet.webportal.DAO.ServiceCarpenterDAO;
import com.oneoutlet.webportal.DTO.ServiceCarpenterDTO;

@Service
public class CarpenterServiceImp implements CarpenterService {

	@Autowired
	ServiceCarpenterDAO serviceCarpenterDAO;
	
	@Override
	public int insertDataOfCarpenter(ServiceCarpenterDTO dto) {
		
			String currentTime=null;
			int count=0;
			
			ServiceCarpenterBO bo= new ServiceCarpenterBO();

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
	        
	        count=serviceCarpenterDAO.insertCarpenterData(bo);
			
			return count;
	}

}
