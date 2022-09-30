package org.mars_sim.rest.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.mapstruct.factory.Mappers;
import org.mars_sim.rest.dto.SettlementDTO;
import org.mars_sim.rest.dto.SettlementSummaryDTO;
import org.mars_sim.rest.mapper.SettlementMapper;
import org.mars_sim.rest.model.Settlement;
import org.mars_sim.rest.model.Simulation;
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

    private SettlementMapper mapper = Mappers.getMapper(SettlementMapper.class);

    @GetMapping("")
    List<SettlementSummaryDTO> getSettlements() {
        return sim.getSettlements().stream().map(s -> mapper.toSummary(s)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public SettlementDTO getSettlement(@PathVariable int id) {
        Settlement s = sim.getSettlements().get(id-1);
        return mapper.toFull(s);
    }
}