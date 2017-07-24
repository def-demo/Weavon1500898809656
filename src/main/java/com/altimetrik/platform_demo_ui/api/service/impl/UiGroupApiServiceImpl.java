package com.altimetrik.platform_demo_ui.api.service.impl;

import com.altimetrik.platform_demo_ui.api.service.*;
import com.altimetrik.platform_demo_ui.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.platform_demo_ui.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.platform_demo_ui.models.UiGroup;


import java.util.List;
import com.altimetrik.platform-demo-ui.exception.NotFoundException;


@Service
@Transactional
public class UiGroupApiServiceImpl implements UiGroupApiService {
		  	  
	  @Autowired
	
  	  private UiGroupRepository  uiGroupRepository ;
	   
  
  
				
			
      @Override
      public List<UiGroup> findAllUiGroup()
      throws NotFoundException {
      
        
  		
  		
  			return uiGroupRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public UiGroup updateUiGroup(UiGroup uiGroup)
      throws NotFoundException {
      
         
        	return uiGroupRepository.save(uiGroup);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public UiGroup addUiGroup(UiGroup uiGroup)
      throws NotFoundException {
      
         
        	return uiGroupRepository.save(uiGroup);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public UiGroup findByIdUiGroup(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return uiGroupRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteUiGroup(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

