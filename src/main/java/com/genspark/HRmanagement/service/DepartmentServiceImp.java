package com.genspark.HRmanagement.service;

import com.genspark.HRmanagement.exception.RecordNotFoundException;
import com.genspark.HRmanagement.model.Department;
import com.genspark.HRmanagement.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        return departmentRepository.findById(id).orElseThrow(()-> new RecordNotFoundException("no department exist with id: "+id));
    }

    @Override
    public List<Department> getDepartmentByDepartmentLocation(String location) {
        return departmentRepository.getByDepartmentLocation(location);
    }

    @Override
    public Department deleteDepartment(long id) {
        Department department=departmentRepository.findById(id).orElseThrow(()-> new RecordNotFoundException("no department exist with id: "+id));
       // if( department==null) return;
        departmentRepository.deleteById(id);
        return department;
    }

    @Override
    public void updateDepartment(long id,Department department) {
        Department optional=departmentRepository.findById(id).orElseThrow(()-> new RecordNotFoundException("no department exist with id: "+id));
        //Optional<Department> optional=departmentRepository.findById(id);
        Department dep;
        //if(optional.isPresent()){
            dep=optional;//.get();
            dep.setDepartmentLocation(department.getDepartmentLocation());
            dep.setDepartmentName(department.getDepartmentName());
            departmentRepository.save(dep);
       // }
    }
}
