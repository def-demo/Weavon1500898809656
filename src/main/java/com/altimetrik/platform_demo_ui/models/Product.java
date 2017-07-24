package com.altimetrik.platform_demo_ui.models;

import com.altimetrik.platform_demo_ui.models.UiGroup;

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

public class Product  {
  
  
   
  
  @Id
   
  
  private String id = null;
  
   
   
  
  private String changelog = null;
  
   
   
  
  private String codename = null;
  
   
   
  
  private String demoserver = null;
  
   
   
  
  private String examplescreens = null;
  
   
   
  
  private String exampletitle = null;
  
   
   
  
  private String image = null;
  
   
   
  
  private String landingScreen = null;
  
   
   
  
  private String longdesc = null;
  
   
   
  
  private String name = null;
  
   
   
  
  private String presentation = null;
  
   
   
  
  private String releaseNotes = null;
  
   
   
  
  private String repo = null;
  
   
   
  
  private String shortdesc = null;
  
   
   
  
  private String testbed = null;
  
   
   
  
  private String title = null;
  
   
   
  
  private String video = null;
  
   
    @OneToOne(fetch = FetchType.EAGER )
  @JoinColumn(name = "id", insertable=false, updatable=false) 
  
  private UiGroup uiGroup = null;

  
  /**
   * {"primaryKey":true}
   **/
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * {}
   **/
  public String getChangelog() {
    return changelog;
  }
  public void setChangelog(String changelog) {
    this.changelog = changelog;
  }

  
  /**
   * {}
   **/
  public String getCodename() {
    return codename;
  }
  public void setCodename(String codename) {
    this.codename = codename;
  }

  
  /**
   * {}
   **/
  public String getDemoserver() {
    return demoserver;
  }
  public void setDemoserver(String demoserver) {
    this.demoserver = demoserver;
  }

  
  /**
   * {}
   **/
  public String getExamplescreens() {
    return examplescreens;
  }
  public void setExamplescreens(String examplescreens) {
    this.examplescreens = examplescreens;
  }

  
  /**
   * {}
   **/
  public String getExampletitle() {
    return exampletitle;
  }
  public void setExampletitle(String exampletitle) {
    this.exampletitle = exampletitle;
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
  public String getLongdesc() {
    return longdesc;
  }
  public void setLongdesc(String longdesc) {
    this.longdesc = longdesc;
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
  public String getPresentation() {
    return presentation;
  }
  public void setPresentation(String presentation) {
    this.presentation = presentation;
  }

  
  /**
   * {}
   **/
  public String getReleaseNotes() {
    return releaseNotes;
  }
  public void setReleaseNotes(String releaseNotes) {
    this.releaseNotes = releaseNotes;
  }

  
  /**
   * {}
   **/
  public String getRepo() {
    return repo;
  }
  public void setRepo(String repo) {
    this.repo = repo;
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
   * {}
   **/
  public String getTestbed() {
    return testbed;
  }
  public void setTestbed(String testbed) {
    this.testbed = testbed;
  }

  
  /**
   * {}
   **/
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * {}
   **/
  public String getVideo() {
    return video;
  }
  public void setVideo(String video) {
    this.video = video;
  }

  
  /**
   * {"foreignKeyColumn":"id","relation":"OneToOne"}
   **/
  public UiGroup getUiGroup() {
    return uiGroup;
  }
  public void setUiGroup(UiGroup uiGroup) {
    this.uiGroup = uiGroup;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(id, product.id) &&
        Objects.equals(changelog, product.changelog) &&
        Objects.equals(codename, product.codename) &&
        Objects.equals(demoserver, product.demoserver) &&
        Objects.equals(examplescreens, product.examplescreens) &&
        Objects.equals(exampletitle, product.exampletitle) &&
        Objects.equals(image, product.image) &&
        Objects.equals(landingScreen, product.landingScreen) &&
        Objects.equals(longdesc, product.longdesc) &&
        Objects.equals(name, product.name) &&
        Objects.equals(presentation, product.presentation) &&
        Objects.equals(releaseNotes, product.releaseNotes) &&
        Objects.equals(repo, product.repo) &&
        Objects.equals(shortdesc, product.shortdesc) &&
        Objects.equals(testbed, product.testbed) &&
        Objects.equals(title, product.title) &&
        Objects.equals(video, product.video) &&
        Objects.equals(uiGroup, product.uiGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, changelog, codename, demoserver, examplescreens, exampletitle, image, landingScreen, longdesc, name, presentation, releaseNotes, repo, shortdesc, testbed, title, video, uiGroup);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  changelog: ").append(changelog).append("\n");
    sb.append("  codename: ").append(codename).append("\n");
    sb.append("  demoserver: ").append(demoserver).append("\n");
    sb.append("  examplescreens: ").append(examplescreens).append("\n");
    sb.append("  exampletitle: ").append(exampletitle).append("\n");
    sb.append("  image: ").append(image).append("\n");
    sb.append("  landingScreen: ").append(landingScreen).append("\n");
    sb.append("  longdesc: ").append(longdesc).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  presentation: ").append(presentation).append("\n");
    sb.append("  releaseNotes: ").append(releaseNotes).append("\n");
    sb.append("  repo: ").append(repo).append("\n");
    sb.append("  shortdesc: ").append(shortdesc).append("\n");
    sb.append("  testbed: ").append(testbed).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  video: ").append(video).append("\n");
    sb.append("  uiGroup: ").append(uiGroup).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

