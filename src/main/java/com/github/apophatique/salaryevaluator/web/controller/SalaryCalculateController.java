package com.github.apophatique.salaryevaluator.web.controller;

import com.github.apophatique.salaryevaluator.core.IEmployeeRepository;
import com.github.apophatique.salaryevaluator.web.model.AddEmployerRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@Controller
@RequestMapping("/calculate-salary")
public class SalaryCalculateController {
    private final IEmployeeRepository databaseEmployeeRepository;

    public SalaryCalculateController(final IEmployeeRepository databaseEmployeeRepository) {
        this.databaseEmployeeRepository = databaseEmployeeRepository;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public ResponseEntity createTask(@Valid @RequestBody final AddEmployerRequest addEmployerRequest) {
        URI location = UriComponentsBuilder
                .fromPath("/calculate-salary/")
                .path(String.valueOf(dataBaseTasksRepository.addTask(addTaskRequest).getId()))
                .build()
                .toUri();

        return ResponseEntity
                .created(location)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .build();
    }
}
