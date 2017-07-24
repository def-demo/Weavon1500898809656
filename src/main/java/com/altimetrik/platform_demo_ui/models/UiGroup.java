package com.altimetrik.platform_demo_ui.models;


import java.util.Objects;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;






@Entity

public class UiGroup  {
  
  
   
  
  @Id
   
  
  private Integer id = null;
  
   
   
  
  private String colorTheme = null;
  
   
   
  
  private String image = null;
  
   
   
  
  private String landingScreen = null;
  
   
   
  
  private String name = null;
  
   
   
  
  private String shortdesc = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   * {}
   **/
  public String getColorTheme() {
    return colorTheme;
  }
  public void setColorTheme(String colorTheme) {
    this.colorTheme = colorTheme;
  }

  
  /**
   * {}
   **/
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  
  /**
   * {}
   **/
  public String getLandingScreen() {
    return landingScreen;
  }
  public void setLandingScreen(String landingScreen) {
    this.landingScreen = landingScreen;
  }

  
  /**
   * {}
   **/
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * {}
   **/
  public String getShortdesc() {
    return shortdesc;
  }
  public void setShortdesc(String shortdesc) {
    this.shortdesc = shortdesc;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UiGroup uiGroup = (UiGroup) o;
    return Objects.equals(id, uiGroup.id) &&
        Objects.equals(colorTheme, uiGroup.colorTheme) &&
        Objects.equals(image, uiGroup.image) &&
        Objects.equals(landingScreen, uiGroup.landingScreen) &&
        Objects.equals(name, uiGroup.name) &&
        Objects.equals(shortdesc, uiGroup.shortdesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, colorTheme, image, landingScreen, name, shortdesc);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UiGroup {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  colorTheme: ").append(colorTheme).append("\n");
    sb.append("  image: ").append(image).append("\n");
    sb.append("  landingScreen: ").append(landingScreen).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  shortdesc: ").append(shortdesc).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

