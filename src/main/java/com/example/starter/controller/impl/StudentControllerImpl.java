package com.example.starter.controller.impl;

import com.example.starter.controller.IStudentController;
import com.example.starter.dto.DtoStudent;
import com.example.starter.dto.DtoStudentIU;
import com.example.starter.services.IStudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IStudentController {
    @Autowired
    private IStudentService studentService;

    @PostMapping(path = "/save")
    @Override
    public DtoStudent saveStudent(@RequestBody @Valid DtoStudentIU DtoStudentIU) {
        return studentService.saveStudent(DtoStudentIU);
    }

    @GetMapping(path = "/list")
    @Override
    public List<DtoStudent> GetAllStudents() {
        return studentService.GetAllStudents();
    }

    @Override
    @GetMapping(path = "/list/{id}")
    public DtoStudent getStudentById(@PathVariable(name = "id",required = true) Integer id) {
        return studentService.getStudentById(id);
    }

    @DeleteMapping(path = "/delete/{id}")
    @Override
    public void deleteStudentById(@PathVariable(name = "id",required = true) Integer id) {
        studentService.deleteStudentById(id);
    }

    @PutMapping(path = "/update/{id}")
    @Override
    public DtoStudent updateStudent(@PathVariable(name = "id",required = true) Integer id,@RequestBody DtoStudentIU DtoStudentIU) {
        return studentService.updateStudent(id, DtoStudentIU);
    }

}
