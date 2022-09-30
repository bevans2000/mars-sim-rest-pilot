package org.mars_sim.rest.mapper;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mars_sim.rest.dto.SettlementDTO;
import org.mars_sim.rest.dto.SettlementSummaryDTO;
import org.mars_sim.rest.model.Settlement;

@Mapper
public interface SettlementMapper {
    SettlementSummaryDTO toSummary(Settlement source);

    @InheritConfiguration(name = "toSummary")
    SettlementDTO toFull(Settlement source);   
}