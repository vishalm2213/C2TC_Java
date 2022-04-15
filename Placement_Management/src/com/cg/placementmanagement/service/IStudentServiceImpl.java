package com.cg.placementmanagement.service;

import com.cg.placementmanagement.entity.Student;
import com.cg.placementmanagement.repository.IStudentRepository;
import com.cg.placementmanagement.repository.IStudentRepositoryImpl;

public class IStudentServiceImpl implements IStudentService{

	private IStudentRepository dao;

	public IStudentServiceImpl() {
	dao = new IStudentRepositoryImpl();	
    }

	@Override
	public Student addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTranscation();
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTranscation();
		return student;
	}

	@Override
	public Student searchStudentById(int id) {
	Student student = dao.searchStudentById(id);
		return student;
	}

	@Override
	public Student searchStudentByHallTicket(int ticketNo) {
	Student student =dao.searchStudentByHallTicket(ticketNo);
		return student;
	}

	@Override
	public Student deleteStudent(Student student) {
	dao.beginTransaction();
	dao.deleteStudent(student);
	dao.commitTranscation();
		return student;
	}

	

}

