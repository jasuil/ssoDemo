package com.example.demo;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
@MapperScan("com.example.demo.mapper")
public class sessionFactConf {
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource ds) throws Exception {

	    SqlSessionFactoryBean factory = new SqlSessionFactoryBean();

	    factory.setDataSource(ds);

	    factory.setMapperLocations(
	        new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/cubrid/mapper/*.xml") // A
	    );
	    return factory.getObject();

	}



	@Bean
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory factory) {

	    return new SqlSessionTemplate(factory);


	}
}
