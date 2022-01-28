package org.mars_sim.rest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Settlement implements Unit {

    @Getter private String name; 
    @Getter private String type; 
    @Getter private int identifier; 
    @Getter ReportingAuthority authority;
    @Getter private double power;
    @Getter private double oxygen;
    @Getter private double hydrogen;
    @Getter private double water;
    @Getter private double methane;

    public int getCitizens() {
        return 2;
    }
}
