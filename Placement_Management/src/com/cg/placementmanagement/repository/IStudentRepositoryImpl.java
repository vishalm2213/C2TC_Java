package com.cg.placementmanagement.repository;

import javax.persistence.EntityManager;
import com.cg.placementmanagement.entity.Student;

public class IStudentRepositoryImpl implements IStudentRepository {

	private EntityManager entityManager;
	
	public IStudentRepositoryImpl()   
    {
		entityManager=JPAUtil. getEntityManager();
	}

	@Override
	public Student addStudent(Student student) {
		entityManager.persist(student);
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		entityManager.merge(student);
		return student;
	}

	@Override
	public Student searchStudentById(int id) {
		Student student=entityManager.find(Student.class,id);
		return student;
	}

	@Override
	public Student searchStudentByHallTicket(int ticketNo) {
		Student student=entityManager.find(Student.class,ticketNo);
		return student;
	}

	@Override
	public Student deleteStudent(Student student) {
		entityManager.remove(student);
		return student;
	}


	@Override
	public void commitTranscation() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}
}
