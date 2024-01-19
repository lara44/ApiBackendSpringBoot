package com.service.ApiBackendSpringBoot.services;

import com.service.ApiBackendSpringBoot.entities.Employee;
import com.service.ApiBackendSpringBoot.repositories.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> listEmployees() {
        return employeeRepository.findAll();
    }
}
