package com.cg.placementmanagement.repository;

import javax.persistence.EntityManager;

import com.cg.placementmanagement.entity.Certificate;
import com.cg.placementmanagement.entity.Certificate;

public class ICertificateRepositoryImpl implements ICertificateRepository{

	private EntityManager entityManager;
	
	public ICertificateRepositoryImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Certificate addCertificate(Certificate certificate) {
		entityManager.persist(certificate);
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		entityManager.merge(certificate);
		return certificate;
	}

	@Override
	public Certificate deleteCertificate(int id) {
		entityManager.remove(id);
		return null;
	}
	

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public Certificate searchCertificate(int id) {
		Certificate certificate = entityManager.find(Certificate.class, id);
		return certificate;
	}

	}
