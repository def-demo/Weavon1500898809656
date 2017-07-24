package com.altimetrik.platform_demo_ui.models.repository;

import com.altimetrik.platform_demo_ui.models.*;

import com.altimetrik.platform_demo_ui.models.UiGroup;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface ProductRepository extends JpaRepository<Product, String>{

}



