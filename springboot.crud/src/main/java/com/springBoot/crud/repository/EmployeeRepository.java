package com.springBoot.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.crud.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
