package org.mars_sim.rest.dto;

import lombok.Getter;
import lombok.Setter;

public class PersonDTO extends PersonSummaryDTO {
    @Getter @Setter private ReferencableDTO settlement; 
    @Getter @Setter private ReportingAuthorityDTO authority; 
}