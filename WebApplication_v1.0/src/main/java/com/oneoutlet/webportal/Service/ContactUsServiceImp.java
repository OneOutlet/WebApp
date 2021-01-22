package com.oneoutlet.webportal.Service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oneoutlet.webportal.BO.ContactUsBO;
import com.oneoutlet.webportal.DAO.ContactUsDAO;
import com.oneoutlet.webportal.DTO.ContactUsDTO;

@Service
public class ContactUsServiceImp implements ContactUsService {
	
	@Autowired
    private ContactUsDAO contactUsDAO;
	
	@Override
	public int insertDataOfContactUs(ContactUsDTO dto) {
		
		int count=0;
		
		ContactUsBO bo=null;
		
		bo=new ContactUsBO();
		
		bo.setCustomer_Name(dto.getCustomer_Name());
		bo.setMobile(dto.getMobile());
		bo.setEmail(dto.getEmail());
		bo.setIssue(dto.getIssue());
		bo.setTime(LocalDateTime.now());
		
		count=contactUsDAO.insertContactUsData(bo);
		
		return count;
	}

}
