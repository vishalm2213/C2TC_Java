package com.cg.placementmanagement.repository;

import com.cg.placementmanagement.entity.Placement;

public interface IPlacementRepository {
	public Placement addPlacement(Placement placement);  // C
	public Placement updatePlacement(Placement placement); // U
	public Placement searchPlacement(int id); // R
	public boolean cancelPlacement(int id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
