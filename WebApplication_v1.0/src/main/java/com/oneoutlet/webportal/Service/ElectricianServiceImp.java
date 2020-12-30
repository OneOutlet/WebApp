package com.oneoutlet.webportal.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oneoutlet.webportal.BO.ServiceElectricianBO;
import com.oneoutlet.webportal.DAO.ServiceElectricianDAO;
import com.oneoutlet.webportal.DTO.ServiceElectricianDTO;

@Service("eService")
public class ElectricianServiceImp implements ElectricianService {

	@Autowired
	ServiceElectricianDAO electricanDAO;
	
	@Override
	public int insertDataOfElectrician(ServiceElectricianDTO dto) {
		
		String currentTime=null;
		int count=0;
		
		ServiceElectricianBO bo= new ServiceElectricianBO();

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
        
        count=electricanDAO.insertElectricianData(bo);
		
		return count;
	}

}
