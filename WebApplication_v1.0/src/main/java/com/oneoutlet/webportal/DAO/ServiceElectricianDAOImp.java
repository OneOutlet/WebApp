package com.oneoutlet.webportal.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.oneoutlet.webportal.BO.ServiceElectricianBO;

@Repository
public abstract class ServiceElectricianDAOImp implements ServiceElectricianDAO {

	@Autowired
	private SimpleJdbcInsert simplejdbcInser;
	
	@Lookup
	public abstract SimpleJdbcInsert getInsert();

	@Override
	public int insertElectricianData(ServiceElectricianBO serviceElectricianBO) {
	
		int count = 0;

		simplejdbcInser=getInsert();
		
		simplejdbcInser.withTableName("service_electrician");
		
		BeanPropertySqlParameterSource beanPropertySqlParameterSource = new BeanPropertySqlParameterSource(
				serviceElectricianBO);

		count = simplejdbcInser.execute(beanPropertySqlParameterSource);
		
		return count;
	}
	
	

}
