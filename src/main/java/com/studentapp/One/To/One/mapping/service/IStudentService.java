package com.studentapp.One.To.One.mapping.service;

import com.studentapp.One.To.One.mapping.model.Student;

import java.util.List;

public interface IStudentService {
    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(Student student);

    Student getById(int id);
    List<Student> getAdd();
    List<Student> getByDepartment(String department);

    List<Student> getCity(String city);


}
