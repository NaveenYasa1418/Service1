package com.tech.departmentservice.feign;

import com.tech.departmentservice.response.EmployeeResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "EMPLOYEE-SERVICE",url = "http://localhost:8081")
public interface EmployeeClient {
    @GetMapping("/employee/getEmployeesByDepartment/{id}")
    public List<EmployeeResponse> findEmployeeByDepartmentId(@PathVariable Long id);
}
