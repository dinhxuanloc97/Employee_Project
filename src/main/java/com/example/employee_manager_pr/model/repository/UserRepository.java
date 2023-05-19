package com.example.employee_manager_pr.model.repository;

import com.example.employee_manager_pr.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Employee,Integer> {
}
