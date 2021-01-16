package com.oneoutlet.webportal.Cfg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.zaxxer.hikari.HikariDataSource;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "com.oneoutlet.webportal.Service", "com.oneoutlet.webportal.DAO","com.oneoutlet.webportal.Controller" })
@PropertySource("classpath:/com/oneoutlet/common/dbConnection.properties")
public class OneoutletCfg {

	@Autowired
	Environment evn;

	@Bean
	public InternalResourceViewResolver viewResolver() {
	
		InternalResourceViewResolver viewRes = new InternalResourceViewResolver();
		viewRes.setViewClass(JstlView.class);
		viewRes.setPrefix("/WEB-INF/view/");
		viewRes.setSuffix(".jsp");

		return viewRes;
	}

	@Bean
	public HikariDataSource dataSource() {

		HikariDataSource hkDataSource = new HikariDataSource();

		hkDataSource.setDriverClassName(evn.getProperty("jdbc.className"));

		hkDataSource.setJdbcUrl(evn.getProperty("jdbc.url"));

		hkDataSource.setUsername(evn.getProperty("jdbc.username"));

		hkDataSource.setPassword(evn.getProperty("jdbc.password"));

		return hkDataSource;
	}

	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public SimpleJdbcInsert simpleJdbcInsert() {

		SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(dataSource());

		return simpleJdbcInsert;
	}
}
