package com.oneoutlet.webportal.DAO;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public abstract class AllServiceTable {

	@Autowired
	private SimpleJdbcInsert simplejdbcInser;
	
	@Lookup
	public abstract SimpleJdbcInsert getInsert();

	
	public int insertTableDetailData(String serviceName,String customerName,String time) {
	
		int count = 0;

		simplejdbcInser=getInsert();
		
		simplejdbcInser.withTableName("service_all");
		
		Map<String,Object> map=new HashMap();
		
		map.put("Service_Name", serviceName);
		map.put("Customer_Name", customerName);
		map.put("Time",time);

		count = simplejdbcInser.execute(map);
		
		return count;
	}
	
}
