package com.example.starter.dto.Course;

import com.example.starter.entities.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DtoCourse {
    private Long id;
    private String name;
}
