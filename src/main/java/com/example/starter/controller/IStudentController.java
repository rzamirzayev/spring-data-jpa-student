package com.example.starter.controller;

import com.example.starter.dto.Student.DtoStudent;
import com.example.starter.dto.Student.DtoStudentIU;

import java.util.List;

public interface IStudentController {
    public DtoStudent saveStudent(DtoStudentIU DtoStudentIU);
    public List<DtoStudent> GetAllStudents();
    public DtoStudent getStudentById(Integer id);
    public void deleteStudentById(Integer id);
    public DtoStudent updateStudent(Integer id,DtoStudentIU DtoStudentIU);
}
