package com.studentapp.One.To.One.mapping.repository;

import com.studentapp.One.To.One.mapping.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IStudentRepository extends JpaRepository<Student,Integer> {
    /* How to write derived queries
      findBy,readBy,getBy
    */

    List<Student>  findByDepartment(String department);

    //we want a query to get all students who belong to a particular city
    // since address is a child class under student

    List<Student>  findByAddressCity(String city);


}
