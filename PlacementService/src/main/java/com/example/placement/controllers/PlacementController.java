package com.example.placement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.placement.entities.Placement;
import com.example.placement.serviceimpl.PlacementServiceImplementation;

@RestController
@RequestMapping("/placement")
public class PlacementController {
	
	@Autowired
	private PlacementServiceImplementation psi;
	
	@GetMapping("/student/{studentId}")
	public List<Placement> getPlacementDetails(@PathVariable int studentId)
	{
		System.out.println("controller called" + studentId);
		return psi.getPlacementDetailsByUserId(studentId);
		
	}

}
