package com.example.demo.controller;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping(value = "/department")
    public Department saveDepartment(@RequestBody Department department) {
        return  departmentService.saveDepartment(department);
    }

    @GetMapping(value = "/department")
    public List<Department>fetchDepartment(){
        return departmentService.fetchDepartmentList;
    }

    @GetMapping(value = "/department/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping(value = "/department/{id}")
    public String deleteById(@PathVariable("id") Long departmentId){
        departmentService.deleteById(departmentId);
        return "deleted successfully";
    }

    @PutMapping(value = "/department/{id}")
    public Department updateById(@PathVariable("id")Long departmentId, @RequestBody Department department){
        return departmentService.updateById(departmentId,department);
    }

    @GetMapping(value = "/department/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentByName(departmentName);
    }

}
