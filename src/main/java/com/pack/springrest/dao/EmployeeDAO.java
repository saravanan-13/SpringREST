package com.pack.springrest.dao;

import java.util.List;

import com.pack.springrest.model.Employee;

public interface EmployeeDAO {

	public int register(Employee employee);
	public Employee login(Employee employee);
	public List<Employee> listAll();
	public Employee findById(int id);
	public int delete(int id);
	
}
