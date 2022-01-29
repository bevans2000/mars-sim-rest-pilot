package org.mars_sim.rest.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Detailed representation of a Settlement
 */
public class SettlementDTO extends SettlementSummaryDTO {
    @Getter @Setter private ReportingAuthorityDTO authority;
    @Getter @Setter private int citizens;
}
