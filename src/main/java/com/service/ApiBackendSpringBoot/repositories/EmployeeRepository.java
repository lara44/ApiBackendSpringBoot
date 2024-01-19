package com.service.ApiBackendSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.service.ApiBackendSpringBoot.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
