package org.mars_sim.rest.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Summary of a Person commonly used in tables
 */
public class PersonSummaryDTO extends ReferencableDTO {
   @Getter @Setter private String job; 
   @Getter @Setter private String role; 
   @Getter @Setter private String gender; 
   @Getter @Setter private String building; 
   @Getter @Setter private String health; 
   @Getter @Setter private String performance;
   @Getter @Setter private String task;  
}
