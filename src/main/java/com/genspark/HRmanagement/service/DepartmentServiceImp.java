package com.genspark.HRmanagement.service;

import com.genspark.HRmanagement.model.Department;
import com.genspark.HRmanagement.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentServiceImp implements DepartmentServiceInt{

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(long id) {
        return departmentRepository.getById(id);
    }

    @Override
    public List<Department> getDepartmentByDepartmentLocation(String location) {
        return departmentRepository.getByDepartmentLocation(location);
    }
}
