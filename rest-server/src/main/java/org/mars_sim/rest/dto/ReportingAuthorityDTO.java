package org.mars_sim.rest.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
public class ReportingAuthorityDTO {
    private String name; 
    private String objective; 
    private String[] agenda; 

}