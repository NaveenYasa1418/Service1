package com.tech.departmentservice.Service;

import com.tech.departmentservice.Model.Department;
import com.tech.departmentservice.exception.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    Department save(Department department);

    Department findById(Long id) throws DepartmentNotFoundException;

    List<Department> findAll();

    List<Department> setEmployeeUsingDepartmentId();
}
