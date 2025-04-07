package com.example.starter.services.impl;

import com.example.starter.dto.Course.DtoCourse;
import com.example.starter.dto.Student.DtoStudent;
import com.example.starter.dto.Student.DtoStudentIU;
import com.example.starter.entities.Course;
import com.example.starter.entities.Student;
import com.example.starter.repository.StudentRepository;
import com.example.starter.services.IStudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU) {
        DtoStudent response = new DtoStudent();
        Student student = new Student();
        BeanUtils.copyProperties(dtoStudentIU, student);
        Student dbStudent= studentRepository.save(student);
        BeanUtils.copyProperties(dbStudent,response);
        return response;
    }

    @Override
    public List<DtoStudent> GetAllStudents() {
        List<DtoStudent> dtoList = new ArrayList<>();
        List<Student> studentList = studentRepository.GetAllStudents();
        for(Student student : studentList){
            DtoStudent dtoStudent = new DtoStudent();
            BeanUtils.copyProperties(student,dtoStudent);
            dtoList.add(dtoStudent);
        }
        return dtoList;
    }

    @Override
    public DtoStudent getStudentById(Integer id) {
        DtoStudent dtoStudent = new DtoStudent();

        Optional<Student> optional= studentRepository.findById(id);
        if(optional.isEmpty()) return null;
        Student dbStudent = optional.get();
        BeanUtils.copyProperties(dbStudent,dtoStudent);
        if(dbStudent.getCourses()!=null && !dbStudent.getCourses().isEmpty()){
            for (Course course : dbStudent.getCourses()) {
                DtoCourse dtoCourse = new DtoCourse();
                BeanUtils.copyProperties(course,dtoCourse);
                dtoStudent.getCourse().add(dtoCourse);
            }
        }
        return dtoStudent;


    }

    @Override
    public void deleteStudentById(Integer id) {
        Optional<Student> optional= studentRepository.findById(id);
        if(optional.isPresent()){
            studentRepository.delete(optional.get());
        }
    }

    @Override
    public DtoStudent updateStudent(Integer id, DtoStudentIU DtoStudentIU) {

        DtoStudent response = new DtoStudent();

        Optional<Student> optional= studentRepository.findById(id);

        if(optional.isPresent()){
            Student dbStudent = optional.get();
            dbStudent.setFirstName(DtoStudentIU.getFirstName());
            dbStudent.setLastName(DtoStudentIU.getLastName());
            dbStudent.setBirthOfDate(DtoStudentIU.getDateOfBirth());

            Student updatedStudent=studentRepository.save(dbStudent);
            BeanUtils.copyProperties(updatedStudent,response);
            return response;
        }
        return null;
    }
}
