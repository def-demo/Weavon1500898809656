package com.altimetrik.platform_demo_ui.api.service;

import com.altimetrik.platform_demo_ui.models.Feature;


import com.altimetrik.platform-demo-ui.exception.NotFoundException;
import java.util.List;

public interface FeatureApiService {
  
      List<Feature> findAllFeature()
      throws NotFoundException;
  
      Feature updateFeature(Feature feature)
      throws NotFoundException;
  
      Feature addFeature(Feature feature)
      throws NotFoundException;
  
      Feature findByIdFeature(Integer id)
      throws NotFoundException;
  
      void deleteFeature(Integer id)
      throws NotFoundException;
  
}

