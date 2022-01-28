package org.mars_sim.rest.dto;

import lombok.Getter;
import lombok.Setter;

public class ReportingAuthorityDTO {
    @Getter @Setter private String name; 
    @Getter @Setter private String objective; 
    @Getter @Setter private String[] agenda; 

}