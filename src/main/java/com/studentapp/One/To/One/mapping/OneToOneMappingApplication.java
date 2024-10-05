package com.studentapp.One.To.One.mapping;

import com.studentapp.One.To.One.mapping.model.Address;
import com.studentapp.One.To.One.mapping.model.Student;
import com.studentapp.One.To.One.mapping.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToOneMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OneToOneMappingApplication.class, args);
	}
	@Autowired
     private IStudentService iStudentService;

	@Override
	public void run(String... args) throws Exception {

		Address address = new Address("Paris","Parian State");
		Student student = new Student("IVO","Mathematics",address);
		iStudentService.addStudent(student);
/*
		// Get method by Id
		 Student nstudent = iStudentService.getById(6);
		 System.out.println(nstudent);

		 // update query
		nstudent.setDepartment("Physics");
		iStudentService.updateStudent(nstudent);
		System.out.println("After update");
		System.out.println(nstudent);

       // Get all the students
		iStudentService.getAdd().forEach(System.out::println);

		// How to change the address property
		Address address1 = nstudent.getAddress();
		      address1.setCity("Yaounde");
			  nstudent.setAddress(address1);
*/
		 iStudentService.getByDepartment("CSE").forEach(System.out::println);

		 // Get all students who belong to a particular city
		iStudentService.getCity("Paris").forEach(System.out::println);

		




	}
}
