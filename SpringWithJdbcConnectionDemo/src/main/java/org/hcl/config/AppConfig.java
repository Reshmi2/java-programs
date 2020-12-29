package org.hcl.config;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfig {
	@Value("$(driver)")
	private String driver;
	@Value("$(url)")
	private String url;
	@Value("$(uname)")
	private String uname;
	@Value("$(pwd)")
	private String pwd;
	@Bean(name="datasource")
	public DataSource datasource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName(driver);
		datasource.setUrl(url);
		datasource.setUsername(uname);
		datasource.setPassword(pwd);
		return datasource;
	}
	

	@Bean
	public static PropertyPlaceholderConfigurer placeholderConfigurer() {
		PropertyPlaceholderConfigurer conf = new PropertyPlaceholderConfigurer();
		ClassPathResource resource = new ClassPathResource("database.properties");
		conf.setLocation(resource);
		return conf;
	}
}
