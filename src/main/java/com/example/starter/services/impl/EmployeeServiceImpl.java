package com.example.starter.services.impl;

import com.example.starter.dto.Department.DtoDepartment;
import com.example.starter.dto.Employee.DtoEmployee;
import com.example.starter.entities.Employee;
import com.example.starter.repository.EmployeeRepository;
import com.example.starter.services.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<DtoEmployee> getAllEmployees() {
        List<DtoEmployee> dtoEmployeeList = new ArrayList<>();
        List<Employee> employeeList = employeeRepository.findAll();
        if (!employeeList.isEmpty() && employeeList!=null ) {
            for (Employee employee : employeeList) {
                DtoEmployee dtoEmployee = new DtoEmployee();
                BeanUtils.copyProperties(employee, dtoEmployee);

                dtoEmployee.setDepartment(new DtoDepartment(employee.getDepartment().getId(),
                        employee.getDepartment().getDepartmentName()));

                dtoEmployeeList.add(dtoEmployee);
            }
        }
        return  dtoEmployeeList;
    }
}
