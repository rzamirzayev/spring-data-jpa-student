package com.example.starter.repository;

import com.example.starter.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    @Query(value = "select * from student.student", nativeQuery = true)
    List<Student> GetAllStudents();

    @Query(value = "from Student s Where s.id= :studentId")
    Optional<Student> GetStudentById(Integer id);
}
