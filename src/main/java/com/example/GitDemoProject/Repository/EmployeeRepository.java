package com.example.GitDemoProject.Repository;

import com.example.GitDemoProject.Entity.EmployeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeDetails, Long> {
}
