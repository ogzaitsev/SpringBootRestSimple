package com.ogzaitsev.springbootrestsimple.dao;

import com.ogzaitsev.springbootrestsimple.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public Employee getEmployee(int id);

    public void saveEmployee(Employee employee);

    public boolean deleteEmployee(int id);

}
