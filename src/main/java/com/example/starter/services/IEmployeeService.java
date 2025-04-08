package com.example.starter.services;

import com.example.starter.dto.Employee.DtoEmployee;

import java.util.List;

public interface IEmployeeService {
    public List<DtoEmployee> getAllEmployees();
}
