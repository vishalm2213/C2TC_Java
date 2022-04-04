package com.cg.placementmanagement.client;

import com.cg.placementmanagement.entity.Placement;
import com.cg.placementmanagement.service.IPlacementService;
import com.cg.placementmanagement.service.IPlacementServiceImpl;

public class Client {

	public static void main(String[] args) {
		Placement placement = new Placement();
		IPlacementService service = new IPlacementServiceImpl();	

		/*
		 * //Create placement.setId(1); placement.setName("Rose");
		 * placement.setCollege("Royal"); placement.setDate(2001);
		 * placement.setQualification("BSc"); placement.setYear(2022);
		 * service.addPlacement(placement);
		 * System.out.println("Data is added successfully");
		 * 
		 * //Update placement.setName("Tulip"); placement.setCollege("MIT");
		 * placement.setDate(2002); placement.setQualification("MSc");
		 * placement.setYear(2021); service.updatePlacement(placement);
		 * System.out.println("Data is updated successfully");
		 */
		
		//Retrieval
		placement = service.searchPlacement(1);
		System.out.println(placement.getName());
		System.out.println(placement.getCollege());
		System.out.println(placement.getDate());
		System.out.println(placement.getQualification());
		System.out.println(placement.getYear());
		
		//Cancel
		boolean placement1 = service.cancelPlacement(1);
		System.out.println("Cancel is performed successfully");
	}

}
