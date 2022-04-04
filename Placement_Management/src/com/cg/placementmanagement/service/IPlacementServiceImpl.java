package com.cg.placementmanagement.service;

import com.cg.placementmanagement.entity.Placement;
import com.cg.placementmanagement.repository.IPlacementRepository;
import com.cg.placementmanagement.repository.IPlacementRepositoryImpl;

public class IPlacementServiceImpl implements IPlacementService {

	IPlacementRepository dao;

	public IPlacementServiceImpl() {
		dao = new IPlacementRepositoryImpl();
	}
	
	@Override
	public Placement addPlacement(Placement placement) {
		dao.beginTransaction();
		dao.addPlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		dao.beginTransaction();
		dao.updatePlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	@Override
	public Placement searchPlacement(int id) {
		Placement placement = dao.searchPlacement(id);
		return placement;
	}

	@Override
	public boolean cancelPlacement(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
