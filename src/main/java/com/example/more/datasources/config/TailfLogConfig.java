package com.example.more.datasources.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
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

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.Map;

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

    @Autowired
    private JpaProperties jpaProperties;
    @Resource
    private HibernateProperties hibernateProperties;

    @Primary
    @Bean(name = "entityManagerFactoryTailflog")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryTailflog(EntityManagerFactoryBuilder builder) {
        hibernateProperties.getNaming().setPhysicalStrategy("org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy");
        Map<String, Object> properties = hibernateProperties.determineHibernateProperties(jpaProperties.getProperties(), new HibernateSettings());
        return builder.dataSource(tailflogDataSource)
                .properties(properties)
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
