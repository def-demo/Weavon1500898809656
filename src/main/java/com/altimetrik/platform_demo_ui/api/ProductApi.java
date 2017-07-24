package com.altimetrik.platform_demo_ui.api;

import com.altimetrik.platform_demo_ui.models.*;

import com.altimetrik.platform_demo_ui.api.service.ProductApiService;

import com.altimetrik.platform-demo-ui.exception.NotFoundException;

import com.altimetrik.platform_demo_ui.models.Product;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/api" )

public class ProductApi {

   @Autowired
   private ProductApiService service;
  

  @RequestMapping(value = "/product", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<Product>> findAllProduct()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<Product>>(service.findAllProduct(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/product", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< Product> updateProduct(@RequestBody Product product
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Product>(service.updateProduct(product), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/product", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< Product> addProduct(@RequestBody Product product
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Product>(service.addProduct(product), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/product/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< Product> findByIdProduct(@PathVariable("id") String id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Product>(service.findByIdProduct(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/product/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteProduct(@PathVariable("id") String id
)
      throws NotFoundException {
        
       	  service.deleteProduct(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

