package org.mars_sim.rest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class PhysicalCondition {
    private float performance;
    private String health;
    private float energy;
}
