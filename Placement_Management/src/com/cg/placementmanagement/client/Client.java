package com.cg.placementmanagement.client;

import com.cg.placementmanagement.entity.Certificate;
import com.cg.placementmanagement.entity.College;
import com.cg.placementmanagement.entity.Placement;
import com.cg.placementmanagement.entity.Student;
import com.cg.placementmanagement.entity.User;
import com.cg.placementmanagement.service.ICertificateService;
import com.cg.placementmanagement.service.ICertificateServiceImpl;
import com.cg.placementmanagement.service.ICollegeService;
import com.cg.placementmanagement.service.ICollegeServiceImpl;
import com.cg.placementmanagement.service.IPlacementService;
import com.cg.placementmanagement.service.IPlacementServiceImpl;
import com.cg.placementmanagement.service.IStudentService;
import com.cg.placementmanagement.service.IStudentServiceImpl;
import com.cg.placementmanagement.service.IUserService;
import com.cg.placementmanagement.service.IUserServiceImpl;

public class Client {

	public static void main(String[] args) {
		Placement placement = new Placement();
		Placement placement1 = new Placement();
		Student student = new Student();
		Student student1 = new Student();
		Certificate certificate = new Certificate();
		Certificate certificate1 = new Certificate();
		User user = new User();
		College college = new College();
		IPlacementService service = new IPlacementServiceImpl();
		ICertificateService service4 = new ICertificateServiceImpl();
		IUserService service3 = new IUserServiceImpl();	
		ICollegeService service1 = new ICollegeServiceImpl();
		IStudentService service2 = new IStudentServiceImpl();

		
		//Create 
		
		
	
		  
		//Update
		//placement = service.searchPlacement(1); 
		//placement.setName("Tulip"); 
		//placement.setDate(2002); 
		//placement.setQualification("MSc");
		//placement.setYear(2021); 
		//service.updatePlacement(placement);
		//System.out.println("Data is updated successfully");
		 
		
//		//Retrieval
//		placement = service.searchPlacement(1);
//		System.out.println(placement.getName());
//		System.out.println(placement.getCollege());
//		System.out.println(placement.getDate());
//		System.out.println(placement.getQualification());
//		System.out.println(placement.getYear());
//		
//		//Cancel
//		boolean placement1 = service.cancelPlacement(1);
//		System.out.println("Cancel is performed successfully");
		
		


		//Create
		
		
		
		 
//		//Update
//		college.setCollegeName("Stanford"); 
//		service1.updateCollege(college);
//		System.out.println("Data is updated successfully");
//		 
//		//Retrieval
//		college = service1.searchCollege(1);
//		System.out.println(college.getId());
//		System.out.println(college.getCollegeAdmin());
//		System.out.println(college.getCollegeName());
//		System.out.println(college.getLocation());
//		
//		//Delete
//		boolean college1 = service1.deleteCollege(1);
//		System.out.println("Delete is performed successfully");
//		
		

		
	    //Create
		student.setId(3);
		student.setName("Emma");
		student.setRoll(50);
		student.setQualification("BSc");
		student.setCourse("CS");
		student.setYear(2021);
		student.setHallTicketNo(123437);
		student1.setId(4);
		student1.setName("Emily");
		student1.setRoll(60);
		student1.setQualification("MSc");
		student1.setCourse("IT");
		student1.setYear(2022);
		student1.setHallTicketNo(123457);
		
		
	    certificate.setId(5);
		certificate.setYear(2022);
		certificate1.setId(6);
		certificate1.setYear(2021);
		
		college.setId(1); 
		college.setCollegeName("MIT");
		college.setLocation("Boston");
		
		placement.setId(1); 
		placement.setName("Rose"); 
		placement.setDate(2001);
		placement.setQualification("BSc"); 
		placement.setYear(2022);
		placement1.setId(1); 
		placement1.setName("Violet"); 
		placement1.setDate(2002);
		placement1.setQualification("BE"); 
		placement1.setYear(2021);
		
		user.setUser_id(1);
		user.setName("Anchal");
		user.setPassword("Anchal1");
		user.setType("USER");
		
		student.setCertificate(certificate);
		certificate.setStudent(student);
		college.setCollegeAdmin(user);
		user.setCollege(college);
		college.addStudent(student);
		college.addCertificate(certificate);
		college.addStudent(student1);
		college.addCertificate(certificate1);
		college.addPlacement(placement1);
		
		

//	    //Retrieve
//		student=service2.searchStudentById(3);
//		System.out.println(student.getName());
//		System.out.println(student.getHallTicketNo());
//	    
//		//Update
//		student=service2.searchStudentById(3);
//		student.setRoll(30);
//		service2.updateStudent(student);
//		System.out.println("Data is updated successfully");
	    
		//Delete
		//student=service2.searchStudentById(3);
		//service2.deleteStudent(student);
		//System.out.println("Delete is performed successfully");
		
		

		
		//Create
		
		
		
		
//		//Retrieve
//		user = service3.searchUserById(1);
//		System.out.println(user.getName());
//		System.out.println(user.getPassword());
//		System.out.println(user.getType());
//		
//	    //Update
//		user = service3.searchUserById(1);
//		user.setName("Priyanka");
//		user.setPassword("Priyanka5");
//		user.setType("USER");
//		service3.updateUser(user);
//		System.out.println("Data is updated successfully");
		
		//Delete
		//user = service3.searchUserById(1);
		//service3.deleteUser(user);
		//System.out.println("Delete is performed successfully");
		service3.addUser(user);
		service1.addCollege(college);
		service.addPlacement(placement);
		service2.addStudent(student);
		service4.addCertificate(certificate);
		System.out.println("Data is added successfully");

	}		
}


