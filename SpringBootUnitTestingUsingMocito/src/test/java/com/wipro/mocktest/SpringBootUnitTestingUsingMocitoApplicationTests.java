package com.wipro.mocktest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.wipro.mocktest.model.PanDetails;
import com.wipro.mocktest.repo.PanRepo;
import com.wipro.mocktest.service.PanService;


@SpringBootTest
class SpringBootUnitTestingUsingMocitoApplicationTests {

	@Autowired
	private PanService panservice;
	
	@MockBean
	private PanRepo panrepo;
	
	
	@Test
	public void getPanDetailsUserTest() {
when(panrepo.findAll()).thenReturn(Stream.of(new PanDetails("alok", "das", "mbr"), new PanDetails("chindi", "raj", "b-block")).collect(Collectors.toList()));
     assertEquals(2, panservice.getAllPanDetails().size());
	}
	
	@Test
	public void getpanDetailsByAddress() {
		String address="mbr";
		when(panrepo.findByAddress(address)).thenReturn(Stream.of(new PanDetails("alok", "das", "mbr"), new PanDetails("chindi", "raj", "b-block")).collect(Collectors.toList()));
	     assertEquals(2, panservice.getDetailsByAddress(address).size());
		}	
		
		
	}
	
	
	
	
	
	
	


