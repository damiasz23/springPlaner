package com.sda.planer.service;

import com.sda.planer.model.Employee;
import com.sda.planer.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class EmployeeService {


    private EmployeeRepository employeeRepository;


    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

//    @PostConstruct
//    public void init() {
//        employeeRepository.save(getExampleEmployee());
//        employeeRepository.save(getExampleEmployee());
//        employeeRepository.save(getExampleEmployee());
//        employeeRepository.save(getExampleEmployee());
//        employeeRepository.save(getExampleEmployee());
//        employeeRepository.save(getExampleEmployee());
//
//        employeeRepository.findAll().forEach(employee -> System.out.println(employee));
////        users.forEach(System.out::println);
//    }
//
//    public Employee getExampleEmployee() {
//        Employee employee = new Employee();
//        employee.setFirstName(employee.getFirstName());
//        employee.setLastName(employee.getLastName());
//        employee.setPhoneNumber("12368643");
//        employee.setEmail(employee.getEmail());
//        employee.setDepartment(employee.getDepartment());
//
//        return employee;
//    }

    public List<Employee> getAllEmployees() {
        return StreamSupport.stream(employeeRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public Employee get(long id) {
        return employeeRepository.findOne(id);
    }


}
