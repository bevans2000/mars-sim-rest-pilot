package org.mars_sim.rest.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Summary of a Settlement commonly used in tables
 */
@Getter @Setter
public class SettlementSummaryDTO extends ReferencableDTO {
    private double power;
    private double oxygen;
    private double hydrogen;
    private double water;
    private double methane;    
}
