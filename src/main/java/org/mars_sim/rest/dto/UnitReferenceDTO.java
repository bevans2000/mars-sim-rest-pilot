package org.mars_sim.rest.dto;

import lombok.Getter;
import lombok.Setter;

public class UnitReferenceDTO {
    @Getter @Setter private String name; 
    @Getter @Setter private String type; 
    @Getter @Setter private int identifier; 
}
