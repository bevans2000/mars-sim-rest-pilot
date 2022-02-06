package org.mars_sim.rest.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ReportingAuthority {
    private String name; 
    private String objective; 
    private List<String> agenda = new ArrayList<>();
    
}
