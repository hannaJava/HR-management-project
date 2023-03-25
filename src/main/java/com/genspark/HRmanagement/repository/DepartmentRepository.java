package com.genspark.HRmanagement.repository;

import com.genspark.HRmanagement.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

    List<Department> getByDepartmentLocation(String location);
}
