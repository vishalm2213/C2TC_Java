package com.cg.placementmanagement.service;

import com.cg.placementmanagement.entity.Certificate;
import com.cg.placementmanagement.repository.ICertificateRepository;
import com.cg.placementmanagement.repository.ICertificateRepositoryImpl;

public class ICertificateServiceImpl implements ICertificateService{

	private ICertificateRepository dao;

	public ICertificateServiceImpl() {
	dao = new ICertificateRepositoryImpl();	
    }

	@Override
	public Certificate addCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.addCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.updateCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate searchCertificate(int id) {
	Certificate certificate = dao.searchCertificate(id);
		return certificate;
	}


	@Override
	public Certificate deleteCertificate(int id) {
	dao.beginTransaction();
	dao.deleteCertificate(id);
	dao.commitTransaction();
		return null;
	}

	

}

