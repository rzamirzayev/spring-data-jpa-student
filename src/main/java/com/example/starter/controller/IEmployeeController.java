package com.example.starter.controller;

import com.example.starter.dto.Employee.DtoEmployee;

import java.util.List;

public interface IEmployeeController {
    public List<DtoEmployee> getAllEmployees();
}
