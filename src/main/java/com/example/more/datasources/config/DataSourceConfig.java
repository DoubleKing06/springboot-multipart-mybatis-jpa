package com.example.more.datasources.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;


/**
 * @author liukunkun
 * @Create 2019/8/19
 */
//@Configuration
public class DataSourceConfig {
/*    @Bean(name = "zentaoDataSource")
    @Qualifier("zentaoDataSource")
    @ConfigurationProperties(prefix="spring.datasource.zentao")
    public DataSource zentaoDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean(name = "tailflogDataSource")
    @Qualifier("tailflogDataSource")
    @Primary
    @ConfigurationProperties(prefix="spring.datasource.tailflog")
    public DataSource tailflogDataSource() {
        return DataSourceBuilder.create().build();
    }*/


}
