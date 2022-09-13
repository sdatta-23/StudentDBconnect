package com.DBconnect.studentData.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {
	
	@Value("${spring.datasource.url}")
	private String url;
	
	@Value("${spring.datasource.username}")
	private String username;
	
	@Value("${spring.datasource.password}")
	private String password;
	
	@ConfigurationProperties(prefix="spring.datasource")
	public DataSource primaryDataSource() {
	    return DataSourceBuilder.create().build();
	}
	
//	@Bean
//	public DataSource dataSource() throws SQLException {
//        OracleDataSource dataSource = new OracleDataSource();
//		dataSource.setUser(username);
//		dataSource.setPassword(password);
//		dataSource.setURL(url); //"jdbc:oracle:thin:@//localhost:11521/ORCLPDB1"
//		//dataSource.setFastConnectionFailoverEnabled(true);
//		dataSource.setImplicitCachingEnabled(true);
//		//dataSource.setConnectionCachingEnabled(true);
//		return dataSource;
//	}
}

