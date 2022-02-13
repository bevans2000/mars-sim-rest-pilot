package org.mars_sim.rest.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.mars_sim.rest.dto.SettlementDTO;
import org.mars_sim.rest.dto.SettlementSummaryDTO;
import org.mars_sim.rest.model.Settlement;
import org.mars_sim.rest.model.Simulation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/settlement")
public class SettlementController {

    @Autowired
    private Simulation sim;

    @Autowired
    private ModelMapper mapper;

    @GetMapping("")
    List<SettlementSummaryDTO> getSettlements() {
        return sim.getSettlements().stream().map(s -> mapper.map(s, SettlementSummaryDTO.class)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public SettlementDTO getSettlement(@PathVariable int id) {
        Settlement s = sim.getSettlements().get(id-1);
        return mapper.map(s, SettlementDTO.class);
    }
}