package com.github.apophatique.salaryevaluator.core;

import org.springframework.jdbc.core.JdbcOperations;

public class DatabaseEmployeesRepository implements IEmployeeRepository {
    private final JdbcOperations jdbcOperations;

    public DatabaseEmployeesRepository(final JdbcOperations jdbcOperations) {
        this.jdbcOperations = jdbcOperations;
    }


}
