package com.studentapp.One.To.One.mapping.model;

import jakarta.persistence.*;

@Entity

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int studentId;
    private String studentName;
    private String department;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    Address address ;

    public Student() {
    }

    public Student(String studentName, String department, Address address) {
        this.studentName = studentName;
        this.department = department;
        this.address = address;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getDepartment() {
        return department;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", department='" + department + '\'' +
                ", address=" + address +
                '}';
    }
}
