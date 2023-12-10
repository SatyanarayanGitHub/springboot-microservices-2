package com.srysoft.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srysoft.department.entity.Department;
import com.srysoft.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("Inside saveDepartment method of DepartmentService");
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		log.info("Inside findDepartmentById method of DepartmentService");

		return departmentRepository.findByDepartmentId(departmentId);
	}
}
