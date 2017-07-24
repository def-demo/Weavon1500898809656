package com.altimetrik.platform_demo_ui.api.service;

import com.altimetrik.platform_demo_ui.models.Product;


import com.altimetrik.platform-demo-ui.exception.NotFoundException;
import java.util.List;

public interface ProductApiService {
  
      List<Product> findAllProduct()
      throws NotFoundException;
  
      Product updateProduct(Product product)
      throws NotFoundException;
  
      Product addProduct(Product product)
      throws NotFoundException;
  
      Product findByIdProduct(String id)
      throws NotFoundException;
  
      void deleteProduct(String id)
      throws NotFoundException;
  
}

