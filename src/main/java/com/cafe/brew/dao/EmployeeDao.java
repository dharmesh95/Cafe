package com.cafe.brew.dao;

import org.springframework.data.repository.CrudRepository;

import com.cafe.brew.entity.Employee;

public interface EmployeeDao extends CrudRepository<Employee, String> {

}
