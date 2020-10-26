package com.github.apophatique.salaryevaluator.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Configuration file for the Data source.
 */
@Configuration
public class DataSourceConfig {
    /**
     * This method returns Data source instance.
     * @return Data source instance
     */
    @Bean
    @FlywayDataSource
    @Qualifier("employeeDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.employee")
    public DataSource tasksDataSource() {
        return DataSourceBuilder.create().build();
    }
}
