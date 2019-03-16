package com.timhortons.brew.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.timhortons.brew.entity.Employee;
import com.timhortons.brew.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping("/getAll")
	public @ResponseBody List<Employee> getAll() {
		return employeeService.getAll();
	}
}
