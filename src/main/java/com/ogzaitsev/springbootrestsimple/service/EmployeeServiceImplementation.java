package com.ogzaitsev.springbootrestsimple.service;

import com.ogzaitsev.springbootrestsimple.dao.EmployeeDAO;
import com.ogzaitsev.springbootrestsimple.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@org.springframework.stereotype.Service
public class EmployeeServiceImplementation implements EmployeeService {

    @Autowired
    private EmployeeDAO dao;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return dao.getAllEmployees();
    }

    @Override
    @Transactional
    public Employee getEmployee(int id) {
        return dao.getEmployee(id);
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        dao.saveEmployee(employee);
    }

    @Override
    @Transactional
    public boolean deleteEmployee(int id) {
        return dao.deleteEmployee(id);
    }

    @Override
    @Transactional
    public void updateEmployee(Employee employee) {
        dao.saveEmployee(employee);
    }
}
