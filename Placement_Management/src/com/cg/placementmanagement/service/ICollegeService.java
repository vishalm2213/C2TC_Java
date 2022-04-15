package com.cg.placementmanagement.service;

import com.cg.placementmanagement.entity.College;

public interface ICollegeService {

	public College addCollege(College college);  // C
	public College updateCollege(College college); // U
	public College searchCollege(int id); // R
	public boolean deleteCollege(int id);
	
}
