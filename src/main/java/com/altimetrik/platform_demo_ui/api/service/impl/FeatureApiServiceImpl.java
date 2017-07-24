package com.altimetrik.platform_demo_ui.api.service.impl;

import com.altimetrik.platform_demo_ui.api.service.*;
import com.altimetrik.platform_demo_ui.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.platform_demo_ui.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.platform_demo_ui.models.Feature;


import java.util.List;
import com.altimetrik.platform-demo-ui.exception.NotFoundException;


@Service
@Transactional
public class FeatureApiServiceImpl implements FeatureApiService {
		  	  
	  @Autowired
	
  	  private FeatureRepository  featureRepository ;
	   
  
  
				
			
      @Override
      public List<Feature> findAllFeature()
      throws NotFoundException {
      
        
  		
  		
  			return featureRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Feature updateFeature(Feature feature)
      throws NotFoundException {
      
         
        	return featureRepository.save(feature);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Feature addFeature(Feature feature)
      throws NotFoundException {
      
         
        	return featureRepository.save(feature);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Feature findByIdFeature(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return featureRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteFeature(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

