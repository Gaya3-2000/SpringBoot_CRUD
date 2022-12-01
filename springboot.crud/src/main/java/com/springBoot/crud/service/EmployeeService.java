package com.springBoot.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.crud.entity.Employee;
import com.springBoot.crud.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
    private EmployeeRepository employeeRepository;
	
	public Employee save(Employee emp) {
		return employeeRepository.save(emp);
	}
	
	public Employee getEmployee(int id) {
		return employeeRepository.findById(id).get();
	}
	
	public Employee update(Employee employee) {
		 Employee emp=employeeRepository.findById(employee.getId()).get();
		 
		 emp.setName(employee.getName());
		 emp.setAge(employee.getAge());
		 
		 return employeeRepository.save(emp);
	}
	
	public String delete(int id) {
		employeeRepository.deleteById(id);
		return "Entity deleted " +id;
	}

	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
}
