package org.mars_sim.rest.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.mars_sim.rest.dto.PersonDTO;
import org.mars_sim.rest.dto.PersonSummaryDTO;
import org.mars_sim.rest.dto.UnitReferenceDTO;
import org.mars_sim.rest.model.Person;
import org.mars_sim.rest.model.Simulation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private Simulation sim;

    @GetMapping("")
    List<PersonSummaryDTO> getPersons() {
        return sim.getPersons().stream().map(s -> convertPersonToSummaryDTO(s)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public PersonDTO getPerson(@PathVariable int id) {
        Person s = sim.getPersons().get(id);
        return convertPersonToDTO(s);
    }

    private PersonDTO convertPersonToDTO(Person source) {
        PersonDTO dto = new PersonDTO();
        loadPersonSummaryDTO(source, dto);
        dto.setAuthority(DTOHelper.convertReportingAutorityToDTO(source.getAuthority()));
        dto.setSettlement(DTOHelper.loadUnitReferenceDTO(source.getSettlement(), new UnitReferenceDTO()));

        return dto;
    }

    private PersonSummaryDTO convertPersonToSummaryDTO(Person source) {
        return loadPersonSummaryDTO(source, new PersonSummaryDTO());
    }

    private PersonSummaryDTO loadPersonSummaryDTO(Person source, PersonSummaryDTO dto) {
        DTOHelper.loadUnitReferenceDTO(source, dto);

        dto.setBuilding(source.getBuilding());
        dto.setGender(source.getGender());
        dto.setHealth(source.getHealth());
        dto.setPerformance(source.getPerformance());
        dto.setJob(source.getJob());
        dto.setRole(source.getRole());
        dto.setTask(source.getTask());
        return dto;
    }
}
