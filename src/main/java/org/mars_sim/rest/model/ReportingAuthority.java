package org.mars_sim.rest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ReportingAuthority {
    @Getter private String name; 
    @Getter private String objective; 
}
