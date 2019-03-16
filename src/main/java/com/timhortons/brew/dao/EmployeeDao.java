package com.timhortons.brew.dao;

import org.springframework.data.repository.CrudRepository;

import com.timhortons.brew.entity.Employee;

public interface EmployeeDao extends CrudRepository<Employee, String> {

}
