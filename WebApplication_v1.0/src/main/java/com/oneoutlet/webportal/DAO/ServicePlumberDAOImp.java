package com.oneoutlet.webportal.DAO;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.oneoutlet.webportal.BO.ServiceElectricianBO;
import com.oneoutlet.webportal.BO.ServicePlumberBO;

@Repository
public abstract class ServicePlumberDAOImp implements ServicePlumberDAO{

	@Autowired
	private SimpleJdbcInsert simplejdbcInser;

	@Autowired
	private AllServiceTable allSeviceTable;

	@Lookup
	public abstract SimpleJdbcInsert getInsert();
	
	@Override
	public int insertPlumberData(ServicePlumberBO plumberBO) {
		
			int count = 0, countService = 0, countTable = 0;

			simplejdbcInser = getInsert();

			simplejdbcInser.withTableName("service_plumber");

			BeanPropertySqlParameterSource beanPropertySqlParameterSource = new BeanPropertySqlParameterSource(
					plumberBO);

			countService = simplejdbcInser.execute(beanPropertySqlParameterSource);

			countTable = allSeviceTable.insertTableDetailData("service_plumber",
					plumberBO.getCustomer_Name(), plumberBO.getTime());

			if (countService == 1 && countTable == 1)
				count = 1;

			return count;
	}

	

}
