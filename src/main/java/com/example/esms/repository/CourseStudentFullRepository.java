package com.example.esms.repository;


import com.example.esms.courseStudent.CourseStudent;
import com.example.esms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseStudentFullRepository extends JpaRepository<CourseStudent, String> {
}