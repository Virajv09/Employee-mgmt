package com.example.crudapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.crudapp.model.Employee;
import com.example.crudapp.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    public List<Employee> getEmployees() {
        return repository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return repository.findById(id);
    }

    public Employee updateEmployee(Long id, Employee empDetails) {
        Employee emp = repository.findById(id).orElseThrow();
        emp.setName(empDetails.getName());
        emp.setEmail(empDetails.getEmail());
        emp.setDepartment(empDetails.getDepartment());
        return repository.save(emp);
    }

    public String deleteEmployee(Long id) {
        repository.deleteById(id);
        return "Employee removed with ID: " + id;
    }

    public void deleteEmployeeAll(){
        repository.deleteAll();
    }
}
