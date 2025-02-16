package com.example.demo.service;

import com.example.demo.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);
    public List<Department> fetchDepartmentList = List.of();

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId);

    public void deleteById(Long departmentId);

    public Department updateById(Long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);
}
