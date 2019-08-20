package com.example.more.datasources.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

/**
 * @author liukunkun
 * @Create 2019/8/19
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef="entityManagerFactoryTailflog",
        transactionManagerRef="transactionManagerTailflog",
        basePackages= { "com.example.more.datasources.mapper.tailflog" }) //设置Repository所在位置
public class TailfLogConfig {

    @Bean(name = "tailflogDataSource")
    @Primary
    @Qualifier("tailflogDataSource")
    @ConfigurationProperties(prefix="spring.datasource.tailflog")
    public DataSource tailflogDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Autowired
    @Qualifier("tailflogDataSource")
    private DataSource tailflogDataSource;

    @Primary
    @Bean(name = "entityManagerPrimary")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return entityManagerFactoryTailflog(builder).getObject().createEntityManager();
    }

    //@Autowired
    //private JpaProperties jpaProperties;
    //private Map<String, Object> getVendorProperties() {
    //    return jpaProperties.getHibernateProperties(new HibernateSettings());//与1.5版本不同,注意.
    //}

    @Primary
    @Bean(name = "entityManagerFactoryTailflog")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryTailflog(EntityManagerFactoryBuilder builder) {
        return builder.dataSource(tailflogDataSource)
                //.properties(getVendorProperties())
                .packages("com.example.more.datasources.entity.tailflog")
                .persistenceUnit("tailflogPersistenceUnit")
                .build();
    }

    @Primary
    @Bean(name = "transactionManagerTailflog")
    public PlatformTransactionManager transactionManagerTailflog(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactoryTailflog(builder).getObject());
    }


}
