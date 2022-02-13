package org.mars_sim.rest.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.mars_sim.rest.dto.PersonDTO;
import org.mars_sim.rest.dto.PersonSummaryDTO;
import org.mars_sim.rest.model.Person;
import org.mars_sim.rest.model.Simulation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private Simulation sim;

    @Autowired
    private ModelMapper mapper;

    @GetMapping("")
    List<PersonSummaryDTO> getPersons(@RequestParam(required=false) Integer settlementId) {
        Stream<Person> found = null;
        if (settlementId != null) {
            found = sim.getPersons().stream().filter(p -> p.getSettlement().getIdentifier() == settlementId);
        }
        else {
            found = sim.getPersons().stream();
        }
        return found.map(s -> mapper.map(s, PersonSummaryDTO.class)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public PersonDTO getPerson(@PathVariable int id) {
        Person s = sim.getPersons().get(id-1);
        return mapper.map(s, PersonDTO.class);
    }
}