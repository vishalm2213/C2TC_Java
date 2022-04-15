package com.cg.placementmanagement.repository;

import com.cg.placementmanagement.entity.Student;

public interface IStudentRepository {
	
	public Student addStudent(Student student);    //create
	public Student updateStudent(Student student);   //update
	public Student searchStudentById(int id);         //Retrieval
	public Student searchStudentByHallTicket(int ticketNo);  //Retrieval
	public Student deleteStudent(Student student);    //Delete


	public abstract void commitTranscation();
	public abstract void beginTransaction();

}
