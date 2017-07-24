package com.altimetrik.platform_demo_ui.models.repository;

import com.altimetrik.platform_demo_ui.models.*;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface UiGroupRepository extends JpaRepository<UiGroup, Integer>{

}



