package com.github.apophatique.salaryevaluator.config;

import com.github.apophatique.salaryevaluator.core.DatabaseEmployeesRepository;
import com.github.apophatique.salaryevaluator.core.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Spring configuration file for ITaskRepository interface.
 */
@Configuration
public class DataBaseTasksRepositoryConfig {
    /**
     * This method presents a Bean of repository based on PostgreSQL.
     *
     * @param jdbcOperations JdbcTemplate instance.
     * @return ITaskRepository instance that represents tasks repository.
     */
    @Bean
    public IEmployeeRepository dataBaseTasksRepository(
            @Qualifier("tasksJdbcOperations") final JdbcTemplate jdbcOperations) {
        return new DatabaseEmployeesRepository(jdbcOperations);
    }
}