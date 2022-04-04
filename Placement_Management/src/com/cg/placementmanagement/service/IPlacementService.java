package com.cg.placementmanagement.service;

import com.cg.placementmanagement.entity.Placement;

public interface IPlacementService {

	public Placement addPlacement(Placement placement);  // C
	public Placement updatePlacement(Placement placement); // U
	public Placement searchPlacement(int id); // R
	public boolean cancelPlacement(int id); 
}
