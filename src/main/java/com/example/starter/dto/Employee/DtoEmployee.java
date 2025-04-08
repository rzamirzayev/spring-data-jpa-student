package com.example.starter.dto.Employee;

import com.example.starter.dto.Department.DtoDepartment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoEmployee {
    private Long id;
    private String name;
    private DtoDepartment department;
}
