package com.example.starter.dto.Student;

import com.example.starter.dto.Course.DtoCourse;
import com.example.starter.entities.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoStudent {
    private Integer id;
    private String firstName;
    private String lastName;
    private List<DtoCourse> course=new ArrayList<>();
}
