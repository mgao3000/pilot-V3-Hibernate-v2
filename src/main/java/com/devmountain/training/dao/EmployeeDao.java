package com.devmountain.training.dao;

import com.devmountain.training.entity.Department;
import com.devmountain.training.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    Employee save(Employee employee, Department department);
    Integer updateEmployeeAddress(String name, String address);
    Employee update(Employee employee);
    boolean deleteByName(String name);
    boolean delete(Employee Employee);
    List<Employee> getEmployees();
    Employee getEmployeeById(Long id);
    Employee getEmployeeByName(String employeeName);
    Employee getEmployeeAndDepartmentById(Long id);

}
