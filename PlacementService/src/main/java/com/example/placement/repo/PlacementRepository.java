package com.example.placement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.placement.entities.Placement;

public interface PlacementRepository extends JpaRepository<Placement, Integer> {

}
