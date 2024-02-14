package com.tech.departmentservice.ServiceImpl;

import com.tech.departmentservice.Model.Department;
import com.tech.departmentservice.Repository.DepartmentRepository;
import com.tech.departmentservice.Service.DepartmentService;
import com.tech.departmentservice.exception.DepartmentNotFoundException;
import com.tech.departmentservice.feign.EmployeeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class DepartmentServiceImplementation implements DepartmentService {
    @Autowired
    private DepartmentRepository repository;
    @Autowired
    private EmployeeClient employeeClient;
    @Override
    public Department save(Department department) {

        return repository.save(department);
    }

    @Override
    public Department findById(Long id)throws DepartmentNotFoundException{
                     return repository.findById(id).orElseThrow();
                     }

    @Override
    public List<Department> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Department> setEmployeeUsingDepartmentId() {
        List<Department> departments=repository.findAll();
        departments.forEach(department -> department.setEmployees(employeeClient
                .findEmployeeByDepartmentId(department.getId())));
        return departments ;
    }
}
