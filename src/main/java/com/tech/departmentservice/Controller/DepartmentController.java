package com.tech.departmentservice.Controller;

import com.tech.departmentservice.Model.Department;
import com.tech.departmentservice.Service.DepartmentService;
import com.tech.departmentservice.exception.DepartmentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/save")
    public Department save(@RequestBody Department department){
        return departmentService.save(department);

    }
    @GetMapping("/getDepartment/{id}")
    public Department findById(@PathVariable Long id) throws DepartmentNotFoundException {
        return departmentService.findById(id);
    }

    @GetMapping("/getDepartments")
    public List<Department> findAll(){
        return departmentService.findAll();
    }
    @GetMapping("/withEmployees")
    public List<Department> findAllWithEmployees(){

        return departmentService.setEmployeeUsingDepartmentId();
    }
}
