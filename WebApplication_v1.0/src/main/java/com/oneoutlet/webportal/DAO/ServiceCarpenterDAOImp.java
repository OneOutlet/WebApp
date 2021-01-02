package com.oneoutlet.webportal.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import com.oneoutlet.webportal.BO.ServiceCarpenterBO;


@Repository
public abstract class ServiceCarpenterDAOImp implements ServiceCarpenterDAO {

	@Autowired
	private SimpleJdbcInsert simplejdbcInser;

	@Autowired
	private AllServiceTable allSeviceTable;

	@Lookup
	public abstract SimpleJdbcInsert getInsert();
	
	@Override
	public int insertCarpenterData(ServiceCarpenterBO carpenterBO) {
		
			int count = 0, countService = 0, countTable = 0;

			simplejdbcInser = getInsert();

			simplejdbcInser.withTableName("service_carpanter");

			BeanPropertySqlParameterSource beanPropertySqlParameterSource = new BeanPropertySqlParameterSource(
					carpenterBO);

			countService = simplejdbcInser.execute(beanPropertySqlParameterSource);

			countTable = allSeviceTable.insertTableDetailData("service_carpanter",
					carpenterBO.getCustomer_Name(), carpenterBO.getTime());

			if (countService == 1 && countTable == 1)
				count = 1;

			return count;
		
	}

}
