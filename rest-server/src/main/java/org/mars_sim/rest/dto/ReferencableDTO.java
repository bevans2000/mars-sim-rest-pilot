package org.mars_sim.rest.dto;


import lombok.Getter;
import lombok.Setter;

/**
 * Defines the JSON representation for a Reference to an entity
 */
@Getter @Setter
public class ReferencableDTO {

    private String name; 

    private String type; 

    private int identifier; 
}
