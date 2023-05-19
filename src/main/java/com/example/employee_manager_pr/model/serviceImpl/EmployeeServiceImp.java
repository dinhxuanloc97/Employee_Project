package com.example.employee_manager_pr.model.serviceImpl;

import com.example.employee_manager_pr.model.entity.Employee;
import com.example.employee_manager_pr.model.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImp implements EmployeeService {
    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Employee findById(Integer id) {
        return null;
    }

    @Override
    public Employee saveOrUpdate(Employee employee) {
        return null;
    }

    @Override
    public Employee delete(Integer id) {
        return null;
    }
}
