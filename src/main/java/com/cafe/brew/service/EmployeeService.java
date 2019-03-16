package com.cafe.brew.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe.brew.dao.EmployeeDao;
import com.cafe.brew.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	public List<Employee> getAll() {
		List<Employee> employees = new ArrayList<Employee>();
		employeeDao.findAll().forEach(employees::add);
		return employees;
	}
}
