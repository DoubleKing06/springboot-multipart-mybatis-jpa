package com.example.more.datasources.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author liukunkun
 * @Create 2019/8/19
 */
@Configuration
@MapperScan(basePackages= "com.example.more.datasources.mapper.zentao",sqlSessionFactoryRef = "zentaoSqlSessionFactory")
@EnableTransactionManagement
public class ZentaoConfig {
        @Bean(name = "zentaoDataSource")
        @Qualifier("zentaoDataSource")
        @ConfigurationProperties(prefix = "spring.datasource.zentao")
        public DataSource zentaoDataSource() {
            return DataSourceBuilder.create().build();
        }

        @Autowired
        @Qualifier("zentaoDataSource")
        private DataSource zentaoDataSource;

        @Bean(name = "zentaoSqlSessionFactory")
        public SqlSessionFactory zentaoSqlSessionFactory(@Qualifier("zentaoDataSource") DataSource zentaoDataSource) throws Exception {
            SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
            bean.setDataSource(zentaoDataSource);
            bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/zentao/*.xml"));
            return bean.getObject();
        }

        @Bean(name = "zentaoTransactionManager")
        public DataSourceTransactionManager zentaoTransactionManager() {
            return new DataSourceTransactionManager(zentaoDataSource);
        }

/*        @Bean(name = "zentaoSqlSessionTemplate")
        //   @Primary
        public SqlSessionTemplate zentaoSqlSessionTemplate(@Qualifier("zentaoSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
            return new SqlSessionTemplate(sqlSessionFactory);
        }*/
    }
