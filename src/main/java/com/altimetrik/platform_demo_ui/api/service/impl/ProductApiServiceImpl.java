package com.altimetrik.platform_demo_ui.api.service.impl;

import com.altimetrik.platform_demo_ui.api.service.*;
import com.altimetrik.platform_demo_ui.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.platform_demo_ui.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.platform_demo_ui.models.Product;


import java.util.List;
import com.altimetrik.platform-demo-ui.exception.NotFoundException;


@Service
@Transactional
public class ProductApiServiceImpl implements ProductApiService {
		  	  
	  @Autowired
	
  	  private ProductRepository  productRepository ;
	   
  
  
				
			
      @Override
      public List<Product> findAllProduct()
      throws NotFoundException {
      
        
  		
  		
  			return productRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Product updateProduct(Product product)
      throws NotFoundException {
      
         
        	return productRepository.save(product);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Product addProduct(Product product)
      throws NotFoundException {
      
         
        	return productRepository.save(product);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Product findByIdProduct(String id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return productRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteProduct(String id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

