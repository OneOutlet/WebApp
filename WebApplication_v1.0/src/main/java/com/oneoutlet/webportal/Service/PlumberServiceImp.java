package com.oneoutlet.webportal.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.oneoutlet.webportal.BO.ServicePlumberBO;
import com.oneoutlet.webportal.DAO.ServicePlumberDAO;
import com.oneoutlet.webportal.DTO.ServicePlumberDTO;

@Service("eService")
public class PlumberServiceImp implements PlumberService {

	@Autowired
	ServicePlumberDAO servicePlumberDAO;
	
	@Override
	public int insertDataOfPlumber(ServicePlumberDTO dto) {
			
			String currentTime=null;
			int count=0;
			
			ServicePlumberBO bo= new ServicePlumberBO();

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
	        
	        count=servicePlumberDAO.insertPlumberData(bo);
			
			return count;
	}

}
