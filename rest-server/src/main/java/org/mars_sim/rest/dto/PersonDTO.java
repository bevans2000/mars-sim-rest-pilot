package org.mars_sim.rest.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
public class PersonDTO extends PersonSummaryDTO {
 
    private ReferencableDTO settlement; 
    

    private ReportingAuthorityDTO authority; 
}