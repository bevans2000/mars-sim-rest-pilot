package org.mars_sim.rest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Settlement implements Unit {
    @Getter private String name; 
    @Getter private String type; 
    @Getter private int identifer; 
}
