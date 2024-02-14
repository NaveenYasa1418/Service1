package com.tech.departmentservice.Repository;

import com.tech.departmentservice.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
