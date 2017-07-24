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

public class Feature  {
  
  
   
  
  @Id
   
  
  private Integer id = null;
  
   
   
  
  private String heading = null;
  
   
   
  
  private String icon = null;
  
   
   
  
  private String shortdesc = null;
  
   
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
  public String getHeading() {
    return heading;
  }
  public void setHeading(String heading) {
    this.heading = heading;
  }

  
  /**
   * {}
   **/
  public String getIcon() {
    return icon;
  }
  public void setIcon(String icon) {
    this.icon = icon;
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
    Feature feature = (Feature) o;
    return Objects.equals(id, feature.id) &&
        Objects.equals(heading, feature.heading) &&
        Objects.equals(icon, feature.icon) &&
        Objects.equals(shortdesc, feature.shortdesc) &&
        Objects.equals(product, feature.product);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, heading, icon, shortdesc, product);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feature {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  heading: ").append(heading).append("\n");
    sb.append("  icon: ").append(icon).append("\n");
    sb.append("  shortdesc: ").append(shortdesc).append("\n");
    sb.append("  product: ").append(product).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

