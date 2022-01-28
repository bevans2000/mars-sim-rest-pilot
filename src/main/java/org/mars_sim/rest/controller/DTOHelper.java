package org.mars_sim.rest.controller;

import org.mars_sim.rest.dto.ReportingAuthorityDTO;
import org.mars_sim.rest.dto.UnitReferenceDTO;
import org.mars_sim.rest.model.ReportingAuthority;
import org.mars_sim.rest.model.Unit;

public class DTOHelper {

    public static ReportingAuthorityDTO convertReportingAutorityToDTO(ReportingAuthority authority) {
        ReportingAuthorityDTO dto = new ReportingAuthorityDTO();
        dto.setName(authority.getName());
        dto.setObjective(authority.getObjective());
        //dto.setAgenda(authority.getAgenda());
        return dto;
    }

    public static UnitReferenceDTO loadUnitReferenceDTO(Unit source, UnitReferenceDTO dto) {
        dto.setType(source.getType());
        dto.setName(source.getName());
        dto.setIdentifer(source.getIdentifer());
    
        return dto;
    }
    
}
