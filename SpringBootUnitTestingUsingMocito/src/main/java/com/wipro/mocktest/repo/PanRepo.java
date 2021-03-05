package com.wipro.mocktest.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.mocktest.model.PanDetails;

@Repository
public interface PanRepo extends JpaRepository<PanDetails, Integer> {

	//Custom methods
    List<PanDetails> findByAddress(String address);
	
	
}
