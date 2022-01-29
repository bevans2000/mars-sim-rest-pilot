package org.mars_sim.rest.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Defines the JSON representation for a Reference to an entity
 */
public class ReferencableDTO {
    @Getter @Setter private String name; 
    @Getter @Setter private String type; 
    @Getter @Setter private int identifier; 
}
