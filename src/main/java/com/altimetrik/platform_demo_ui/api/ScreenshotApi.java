package com.altimetrik.platform_demo_ui.api;

import com.altimetrik.platform_demo_ui.models.*;

import com.altimetrik.platform_demo_ui.api.service.ScreenshotApiService;

import com.altimetrik.platform-demo-ui.exception.NotFoundException;

import com.altimetrik.platform_demo_ui.models.Screenshot;


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

public class ScreenshotApi {

   @Autowired
   private ScreenshotApiService service;
  

  @RequestMapping(value = "/screenshot", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<Screenshot>> findAllScreenshot()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<Screenshot>>(service.findAllScreenshot(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/screenshot", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< Screenshot> updateScreenshot(@RequestBody Screenshot screenshot
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Screenshot>(service.updateScreenshot(screenshot), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/screenshot", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< Screenshot> addScreenshot(@RequestBody Screenshot screenshot
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Screenshot>(service.addScreenshot(screenshot), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/screenshot/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< Screenshot> findByIdScreenshot(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Screenshot>(service.findByIdScreenshot(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/screenshot/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteScreenshot(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteScreenshot(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

