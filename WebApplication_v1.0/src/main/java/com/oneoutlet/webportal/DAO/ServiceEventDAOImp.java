package com.oneoutlet.webportal.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import com.oneoutlet.webportal.BO.ServiceEventBO;

public abstract class ServiceEventDAOImp implements ServiceEventDAO {

	@Autowired
	private SimpleJdbcInsert simplejdbcInser;

	@Autowired
	private AllServiceTable allSeviceTable;

	@Lookup
	public abstract SimpleJdbcInsert getInsert();
	
	@Override
	public int insertEventData(ServiceEventBO eventBO) {
		
			int count = 0, countService = 0, countTable = 0;

			simplejdbcInser = getInsert();

			simplejdbcInser.withTableName("service_event");

			BeanPropertySqlParameterSource beanPropertySqlParameterSource = new BeanPropertySqlParameterSource(
					eventBO);

			countService = simplejdbcInser.execute(beanPropertySqlParameterSource);

			countTable = allSeviceTable.insertTableDetailData("service_event",
					eventBO.getCustomer_Name(), eventBO.getTime());

			if (countService == 1 && countTable == 1)
				count = 1;

			return count;
	}

}
