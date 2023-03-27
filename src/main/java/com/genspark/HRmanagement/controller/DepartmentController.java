package com.genspark.HRmanagement.controller;

import com.genspark.HRmanagement.model.Department;
import com.genspark.HRmanagement.service.DepartmentServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/department")
@CrossOrigin("*")
public class DepartmentController {
    @Autowired
    DepartmentServiceInt departmentService;
    @GetMapping("/getAll")
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }
    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") long id){
        return departmentService.getDepartmentById(id);
    }
    @PostMapping("/add")
    public Department saveDepartment(@RequestBody Department department){
        departmentService.saveDepartment(department);
        return departmentService.getDepartmentById(department.getId());
    }

}
