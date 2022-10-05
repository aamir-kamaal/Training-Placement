package com.example.placement.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.placement.entities.Placement;
import com.example.placement.repo.PlacementRepository;
import com.example.placement.services.PlacementService;

@Service
public class PlacementServiceImplementation implements PlacementService {
	
	@Autowired
	private PlacementRepository placementRepository;

	@Override
	public List<Placement> getPlacementDetailsByUserId(int studentId) {
		
		return placementRepository.findAll();
	}

}
