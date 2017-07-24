package com.altimetrik.platform_demo_ui.api.service.impl;

import com.altimetrik.platform_demo_ui.api.service.*;
import com.altimetrik.platform_demo_ui.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.platform_demo_ui.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.platform_demo_ui.models.Screenshot;


import java.util.List;
import com.altimetrik.platform-demo-ui.exception.NotFoundException;


@Service
@Transactional
public class ScreenshotApiServiceImpl implements ScreenshotApiService {
		  	  
	  @Autowired
	
  	  private ScreenshotRepository  screenshotRepository ;
	   
  
  
				
			
      @Override
      public List<Screenshot> findAllScreenshot()
      throws NotFoundException {
      
        
  		
  		
  			return screenshotRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Screenshot updateScreenshot(Screenshot screenshot)
      throws NotFoundException {
      
         
        	return screenshotRepository.save(screenshot);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Screenshot addScreenshot(Screenshot screenshot)
      throws NotFoundException {
      
         
        	return screenshotRepository.save(screenshot);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Screenshot findByIdScreenshot(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return screenshotRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteScreenshot(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

