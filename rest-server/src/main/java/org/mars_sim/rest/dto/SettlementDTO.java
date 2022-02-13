package org.mars_sim.rest.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Detailed representation of a Settlement
 */
@Getter @Setter
public class SettlementDTO extends SettlementSummaryDTO {
    private ReportingAuthorityDTO authority;
    private int citizens;
}
