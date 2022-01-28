package org.mars_sim.rest.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Summary of a Settlement commonly used in tables
 */
public class SettlementSummaryDTO extends UnitReferenceDTO {
    @Getter @Setter private double power;
    @Getter @Setter private double oxygen;
    @Getter @Setter private double hydrogen;
    @Getter @Setter private double water;
    @Getter @Setter private double methane;    
}
