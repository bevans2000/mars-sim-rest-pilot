package org.mars_sim.rest.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Summary of a Person commonly used in tables
 */
@Getter @Setter
public class PersonSummaryDTO extends ReferencableDTO {
   private String job; 
   private String role; 
   private String gender; 
   private String building; 

   private String conditionHealth; 
   private float conditionPerformance;
   private float conditionEnergy;
   
   private String task;  
}
