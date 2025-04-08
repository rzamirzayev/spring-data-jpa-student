package com.example.starter.services;

import com.example.starter.dto.Student.DtoStudent;
import com.example.starter.dto.Student.DtoStudentIU;

import java.util.List;

public interface IStudentService {
    public DtoStudent saveStudent(DtoStudentIU student);
    public List<DtoStudent> GetAllStudents();
    public DtoStudent getStudentById(Integer id);
    public void deleteStudentById(Integer id);
    public DtoStudent updateStudent(Integer id,DtoStudentIU DtoStudentIU);
}
