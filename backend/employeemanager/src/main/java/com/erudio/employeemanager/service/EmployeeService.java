package com.erudio.employeemanager.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erudio.employeemanager.Model.Employee;
import com.erudio.employeemanager.Repo.EmployeeRepository;
import com.erudio.employeemanager.err.UserNotFoundException;

@Service
public class EmployeeService {

  @Autowired
  private EmployeeRepository employeeRepository;

  public Employee addEmployee(Employee employee) {
    employee.setEmployeeCode(UUID.randomUUID().toString());
    return employeeRepository.save(employee);
  }

  public List<Employee> findAllEmployees() {
    return employeeRepository.findAll();
  }

  public Employee updateEmployee(Employee employee) {
    return employeeRepository.save(employee);
  }

  public Employee findEmployeeById(Long id) {
    return employeeRepository.findById(id)
            .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
  }

  public void deleteEmployee(Long id){
    employeeRepository.findById(id);
  }
  
}
