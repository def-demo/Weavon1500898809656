package com.altimetrik.platform_demo_ui.api;

import com.altimetrik.platform_demo_ui.models.*;

import com.altimetrik.platform_demo_ui.api.service.UiGroupApiService;

import com.altimetrik.platform-demo-ui.exception.NotFoundException;

import com.altimetrik.platform_demo_ui.models.UiGroup;


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

public class UiGroupApi {

   @Autowired
   private UiGroupApiService service;
  

  @RequestMapping(value = "/ui_group", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<UiGroup>> findAllUiGroup()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<UiGroup>>(service.findAllUiGroup(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/ui_group", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< UiGroup> updateUiGroup(@RequestBody UiGroup uiGroup
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<UiGroup>(service.updateUiGroup(uiGroup), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/ui_group", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< UiGroup> addUiGroup(@RequestBody UiGroup uiGroup
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<UiGroup>(service.addUiGroup(uiGroup), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/ui_group/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< UiGroup> findByIdUiGroup(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<UiGroup>(service.findByIdUiGroup(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/ui_group/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteUiGroup(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteUiGroup(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

