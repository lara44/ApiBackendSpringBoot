package com.service.ApiBackendSpringBoot.controllers;

import com.service.ApiBackendSpringBoot.entities.Employee;
import com.service.ApiBackendSpringBoot.services.EmployeeService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public ResponseEntity <List<Employee>> listEmployees(){
        List<Employee> employees = employeeService.listEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
}
