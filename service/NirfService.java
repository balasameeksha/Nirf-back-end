package com.adiverse.erp.service;


import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adiverse.erp.model.nirf;
import com.adiverse.erp.repository.NirfRepo;

@Service
@Transactional
public class NirfService
{
	@Autowired
	private  NirfRepo extendedRepository;
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());

  
	public nirf extendedInfo(nirf extendedProfile)
			 {
    	
    	return extendedRepository.save(extendedProfile);

	}
	

	  
	  public List<nirf> getAllExtendedData() {
	    try {
	      List<nirf> extended = new ArrayList<nirf>();
	     
	      extendedRepository.findAll().forEach(extended::add);
	   
	      return extended;
	    
	   
	  }catch (Exception e) { return null;}
	    
	
}
}