package com.ogzaitsev.springbootrestsimple.dao;

import com.ogzaitsev.springbootrestsimple.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
