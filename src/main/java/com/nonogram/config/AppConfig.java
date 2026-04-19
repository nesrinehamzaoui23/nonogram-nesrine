package com.nonogram.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.nonogram")
public class AppConfig {

    // H2 in-memory database (data resets on restart — good for dev)
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("org.h2.Driver");
        ds.setUrl("jdbc:h2:mem:nonogramdb;DB_CLOSE_DELAY=-1;INIT=runscript from 'classpath:schema.sql'");
        ds.setUsername("sa");
        ds.setPassword("");
        return ds;
    }
}