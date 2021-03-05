package com.wipro.mocktest.Controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.mocktest.model.PanDetails;
import com.wipro.mocktest.service.PanService;

@RestController
public class PanDetailsController {
	
	@Autowired
	private PanService panservice;
	
	@PostMapping("/save")
  public PanDetails saveUser(PanDetails user) {
	  return panservice.addUser(user);
  }
	
	@GetMapping("/getDt")
	public List<PanDetails> getUsers(){
		 return panservice.getAllPanDetails();
	}
	
	@GetMapping("/getAddress{address}")
	public List<PanDetails> findUserByAddress(@PathVariable String add){
		return panservice.getDetailsByAddress(add);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
