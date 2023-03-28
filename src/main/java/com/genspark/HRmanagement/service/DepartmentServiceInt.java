package com.genspark.HRmanagement.service;

import com.genspark.HRmanagement.model.Department;

import java.util.List;

public interface DepartmentServiceInt {
    Department saveDepartment(Department department);
    List<Department> getAllDepartments();
    Department getDepartmentById(long id);
    List<Department> getDepartmentByDepartmentLocation(String location);

    Department deleteDepartment(long id);

    void updateDepartment(long id,Department department);
}
