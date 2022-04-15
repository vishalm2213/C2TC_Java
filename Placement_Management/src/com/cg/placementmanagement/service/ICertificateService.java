package com.cg.placementmanagement.service;

import com.cg.placementmanagement.entity.Certificate;

public interface ICertificateService {
	public Certificate addCertificate(Certificate certificate);
	public Certificate updateCertificate(Certificate certificate);
	public Certificate searchCertificate(int id);
	public Certificate deleteCertificate(int id);
}
