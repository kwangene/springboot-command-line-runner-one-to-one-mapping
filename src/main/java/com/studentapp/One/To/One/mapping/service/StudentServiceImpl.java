package com.studentapp.One.To.One.mapping.service;

import com.studentapp.One.To.One.mapping.model.Student;
import com.studentapp.One.To.One.mapping.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentRepository iStudentRepository;
    @Override
    public void addStudent(Student student) {
        iStudentRepository.save(student);

    }

    @Override
    public void updateStudent(Student student) {
        iStudentRepository.save(student);

    }

    @Override
    public void deleteStudent(Student student) {
           iStudentRepository.delete(student);
    }

    @Override
    public Student getById(int id) {
      return iStudentRepository.findById(id).orElse(null);

    }

    @Override
    public List<Student> getAdd() {
        return iStudentRepository.findAll();
    }

    @Override
    public List<Student> getByDepartment(String department) {
        return iStudentRepository.findByDepartment(department);
    }

    @Override
    public List<Student> getCity(String city) {
        return iStudentRepository.findByAddressCity(city);
    }
}
