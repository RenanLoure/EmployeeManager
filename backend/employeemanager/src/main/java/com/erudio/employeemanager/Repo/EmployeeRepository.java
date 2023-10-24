package com.erudio.employeemanager.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erudio.employeemanager.Model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Long>{
  
}
