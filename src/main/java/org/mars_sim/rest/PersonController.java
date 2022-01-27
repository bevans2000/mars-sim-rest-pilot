package org.mars_sim.rest;

import java.util.List;
import java.util.stream.Collectors;

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

    @GetMapping("/")
    List<PersonSummaryDTO> getPersons() {
        return sim.getPersons().stream().map(s -> convertPersonToSummaryDTO(s)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public PersonDTO getPerson(@PathVariable int id) {
        Person s = sim.getPersons().get(id);
        return convertPersonToDTO(s);
    }

    private PersonDTO convertPersonToDTO(Person s) {
        PersonDTO dto = new PersonDTO();
        return dto;
    }

    PersonSummaryDTO convertPersonToSummaryDTO(Person source) {
        PersonSummaryDTO dto = new PersonSummaryDTO();

        return dto;
    }
}
