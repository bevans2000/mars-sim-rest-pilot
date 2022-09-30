package org.mars_sim.rest.mapper;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mars_sim.rest.dto.PersonDTO;
import org.mars_sim.rest.dto.PersonSummaryDTO;
import org.mars_sim.rest.model.Person;


@Mapper
public interface PersonMapper {
    @Mapping(target = "conditionPerformance", source="condition.performance")
    @Mapping(target = "conditionEnergy", source="condition.energy")
    @Mapping(target = "conditionHealth", source="condition.health")
    PersonSummaryDTO toSummary(Person source);

    @InheritConfiguration(name = "toSummary")
    PersonDTO toFull(Person source);   
}