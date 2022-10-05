package com.example.placement.services;

import java.util.List;

import com.example.placement.entities.Placement;

public interface PlacementService {
	
	public List<Placement> getPlacementDetailsByUserId(int studentId);

}
