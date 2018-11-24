package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.properties")
public class s {

/*	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;
	@Value("${spring.datasource.driverClassName}")
	private String driverClassName;
	
	@Lazy
	@Bean(destroyMethod = "close")
	public DataSource dataSource() {
		final HikariConfig conf = new HikariConfig();
		conf.setUsername(username);
		conf.setPassword(password);
		
		conf.addDataSourceProperty("url", url);
		conf.setDataSourceClassName(driverClassName);
		conf.setLeakDetectionThreshold(2000);
		conf.setPoolName("jsiPool");
		
		final HikariDataSource datasouce = new HikariDataSource(conf);
		return datasouce;
	}*/
}
