package com.cg.placementmanagement.service;

import com.cg.placementmanagement.entity.Student;

public interface IStudentService {
	
	public Student addStudent(Student student);    //create
	public Student updateStudent(Student student);   //update
	public Student searchStudentById(int id);         //Retrieval
	public Student searchStudentByHallTicket(int ticketNo);  //Retrieval
	public Student deleteStudent(Student student);    //Delete

}
