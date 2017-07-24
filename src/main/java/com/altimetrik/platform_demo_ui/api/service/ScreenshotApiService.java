package com.altimetrik.platform_demo_ui.api.service;

import com.altimetrik.platform_demo_ui.models.Screenshot;


import com.altimetrik.platform-demo-ui.exception.NotFoundException;
import java.util.List;

public interface ScreenshotApiService {
  
      List<Screenshot> findAllScreenshot()
      throws NotFoundException;
  
      Screenshot updateScreenshot(Screenshot screenshot)
      throws NotFoundException;
  
      Screenshot addScreenshot(Screenshot screenshot)
      throws NotFoundException;
  
      Screenshot findByIdScreenshot(Integer id)
      throws NotFoundException;
  
      void deleteScreenshot(Integer id)
      throws NotFoundException;
  
}

