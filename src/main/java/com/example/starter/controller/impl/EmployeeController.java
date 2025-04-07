package com.example.starter.controller.impl;

import com.example.starter.controller.IEmployeeController;
import com.example.starter.dto.Employee.DtoEmployee;
import com.example.starter.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rest/api/employee")
public class EmployeeController implements IEmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @Override
    @GetMapping(path = "/list")
    public List<DtoEmployee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}
