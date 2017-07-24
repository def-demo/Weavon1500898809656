package com.altimetrik.platform_demo_ui.models;

import com.altimetrik.platform_demo_ui.models.Product;

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

public class Screenshot  {
  
  
   
  
  @Id
   
  
  private Integer id = null;
  
   
   
  
  private String screenshot = null;
  
   
   
  
  private String type = null;
  
   
    @OneToOne(fetch = FetchType.EAGER )
  @JoinColumn(name = "id", insertable=false, updatable=false) 
  
  private Product product = null;

  
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
  public String getScreenshot() {
    return screenshot;
  }
  public void setScreenshot(String screenshot) {
    this.screenshot = screenshot;
  }

  
  /**
   * {}
   **/
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * {"foreignKeyColumn":"id","relation":"OneToOne"}
   **/
  public Product getProduct() {
    return product;
  }
  public void setProduct(Product product) {
    this.product = product;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Screenshot screenshot = (Screenshot) o;
    return Objects.equals(id, screenshot.id) &&
        Objects.equals(screenshot, screenshot.screenshot) &&
        Objects.equals(type, screenshot.type) &&
        Objects.equals(product, screenshot.product);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, screenshot, type, product);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Screenshot {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  screenshot: ").append(screenshot).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  product: ").append(product).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

