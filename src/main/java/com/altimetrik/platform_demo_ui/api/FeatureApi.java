package com.altimetrik.platform_demo_ui.api;

import com.altimetrik.platform_demo_ui.models.*;

import com.altimetrik.platform_demo_ui.api.service.FeatureApiService;

import com.altimetrik.platform-demo-ui.exception.NotFoundException;

import com.altimetrik.platform_demo_ui.models.Feature;


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

public class FeatureApi {

   @Autowired
   private FeatureApiService service;
  

  @RequestMapping(value = "/feature", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<Feature>> findAllFeature()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<Feature>>(service.findAllFeature(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/feature", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< Feature> updateFeature(@RequestBody Feature feature
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Feature>(service.updateFeature(feature), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/feature", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< Feature> addFeature(@RequestBody Feature feature
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Feature>(service.addFeature(feature), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/feature/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< Feature> findByIdFeature(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Feature>(service.findByIdFeature(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/feature/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteFeature(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteFeature(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

