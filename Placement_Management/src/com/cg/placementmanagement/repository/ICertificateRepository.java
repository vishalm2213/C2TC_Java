package com.cg.placementmanagement.repository;

import com.cg.placementmanagement.entity.Certificate;
import com.cg.placementmanagement.entity.Student;

public interface ICertificateRepository {
	public Certificate addCertificate(Certificate certificate);
	public Certificate updateCertificate(Certificate certificate);
	public Certificate searchCertificate(int id);
	public Certificate deleteCertificate(int id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
