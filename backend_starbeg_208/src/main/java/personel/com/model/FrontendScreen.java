package personel.com.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import personel.com.model.BuildTool;
import personel.com.model.FrontendApp;
import personel.com.model.Architecture;
import personel.com.model.Server;
import personel.com.model.PackageManagement;
import personel.com.model.FrontendScreen;
import personel.com.model.Project;
import personel.com.model.complex.BasicDetails;
import personel.com.model.complex.AdvancedDetails;
import personel.com.converter.DurationConverter;
import personel.com.converter.UUIDToByteConverter;
import personel.com.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "FrontendScreen")
@Table(name = "\"FrontendScreen\"", schema =  "\"db\"")
@Data
                        
public class FrontendScreen {
	public FrontendScreen () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"FeScreenId\"", nullable = true )
  private Integer feScreenId;
	  
  @Column(name = "\"ScreenName\"", nullable = true )
  private String screenName;
  
	  
  @Column(name = "\"ScreenDescription\"", nullable = true )
  private String screenDescription;
  
	  
  @Column(name = "\"Documentation\"", nullable = true )
  private String documentation;
  
	  
  @Column(name = "\"ScreenLayout\"", nullable = true )
  private String screenLayout;
  
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "FrontendScreen [" 
  + "FeScreenId= " + feScreenId  + ", " 
  + "ScreenName= " + screenName  + ", " 
  + "ScreenDescription= " + screenDescription  + ", " 
  + "Documentation= " + documentation  + ", " 
  + "ScreenLayout= " + screenLayout 
 + "]";
	}
	
}