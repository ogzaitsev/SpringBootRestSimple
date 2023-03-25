package com.ogzaitsev.springbootrestsimple.controller;

import com.ogzaitsev.springbootrestsimple.entity.Employee;
import com.ogzaitsev.springbootrestsimple.exception.NoSuchEmployeeException;
import com.ogzaitsev.springbootrestsimple.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyRESTController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/")
    public List<Employee> test() {
        List<Employee> result = service.getAllEmployees();
        System.out.println(result);
        return result;
    }

    @GetMapping("/get/{id}")
    public Employee getEmployee(@PathVariable int id) {
        Employee result = service.getEmployee(id);
        if(result == null) {
            throw new NoSuchEmployeeException("there is no employee with id "+ id);
        }
        return result;
    }

//    @PostMapping("/")
//    public Employee addEmployee(@RequestBody Employee employee) {
//        service.saveEmployee(employee);
//        return employee;
//    }
//    @PutMapping ("/")
//    public Employee updateEmployee(@RequestBody Employee employee) {
//        service.updateEmployee(employee);
//        return employee;
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public String deleteEmployee(@PathVariable int id) {
//        String response;
//        if(service.deleteEmployee(id)) {
//            response = "Employee ID=" + id + " was deleted";
//        } else {
//            throw new NoSuchEmployeeException("There is no employee with id=" + id);
//        }
//        return response;
//    }
}
