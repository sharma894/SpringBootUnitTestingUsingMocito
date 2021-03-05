package com.wipro.mocktest.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.mocktest.model.PanDetails;
import com.wipro.mocktest.repo.PanRepo;

@Service
public class PanService {
	
	@Autowired
	private PanRepo panrepo;
	
	//Post Service adding view postman
	public PanDetails addUser(PanDetails pandetails) {
		return panrepo.save(pandetails);
	}
	
	//Get All Records of panCard
	public List<PanDetails> getAllPanDetails(){
		 List<PanDetails> pd= panrepo.findAll();
		 
		 System.out.println("getting All data from MockDB " + pd);
		 
		 return pd;
	}
	
	//Find by address
	public List<PanDetails> getDetailsByAddress(String address){
		List<PanDetails> add= panrepo.findByAddress(address);
		
		System.out.println("Data coming from mock"  + add);
		return add;
	}
	
	// Pan Details By id
	 public PanDetails get(Integer id) {
	        return panrepo.findById(id).get();
	    }
	     
	 // Delete user by id
	    public void delete(Integer id) {
	        panrepo.deleteById(id);
	    }
	    
	    //Update the pan user details
	    public PanDetails updateEmployee(PanDetails pe) {
			 return panrepo.save(pe);
	    }
	
	
	
	
	
	
	
	
	

}
