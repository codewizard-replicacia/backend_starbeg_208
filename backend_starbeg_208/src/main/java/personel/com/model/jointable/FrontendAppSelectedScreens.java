package personel.com.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import personel.com.model.BuildTool;
import personel.com.model.FrontendApp;
import personel.com.model.Architecture;
import personel.com.model.Server;
import personel.com.model.PackageManagement;
import personel.com.model.FrontendScreen;
import personel.com.model.Project;
import personel.com.model.complex.BasicDetails;
import personel.com.model.complex.AdvancedDetails;

@Entity(name = "FrontendAppSelectedScreens")
@Table(schema = "\"db\"", name = "\"FrontendAppSelectedScreens\"")
@Data
public class FrontendAppSelectedScreens{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"AppId\"")
	private Long appId;

    
    @Column(name = "\"FeScreenId\"")
    private Integer feScreenId;
 
}