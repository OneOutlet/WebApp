package com.oneoutlet.webportal.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.oneoutlet.webportal.BO.ServiceIronWorkBO;
import com.oneoutlet.webportal.DAO.ServiceIronWorkDAO;
import com.oneoutlet.webportal.DTO.ServiceIronWorkDTO;

@Service
public class IronWorkServiceImp implements IronWorkService {

	@Autowired
	ServiceIronWorkDAO serviceIronWorkDAO;
	
	@Override
	public int insertDataOfIronWork(ServiceIronWorkDTO dto) {
		
			String currentTime=null;
			int count=0;
			
			ServiceIronWorkBO bo= new ServiceIronWorkBO();

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
	        
	        count=serviceIronWorkDAO.insertIronWorkData(bo);
			
			return count;
	}

}
