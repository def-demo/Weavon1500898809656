package com.altimetrik.platform_demo_ui.api.service;

import com.altimetrik.platform_demo_ui.models.UiGroup;


import com.altimetrik.platform-demo-ui.exception.NotFoundException;
import java.util.List;

public interface UiGroupApiService {
  
      List<UiGroup> findAllUiGroup()
      throws NotFoundException;
  
      UiGroup updateUiGroup(UiGroup uiGroup)
      throws NotFoundException;
  
      UiGroup addUiGroup(UiGroup uiGroup)
      throws NotFoundException;
  
      UiGroup findByIdUiGroup(Integer id)
      throws NotFoundException;
  
      void deleteUiGroup(Integer id)
      throws NotFoundException;
  
}

