package org.mars_sim.rest.model;


public class PhysicalCondition {
    private float performance;
    private String health;
    private float energy;
    
    PhysicalCondition(float performance, String health, float energy) {
        this.performance = performance;
        this.health = health;
        this.energy = energy;
    }

    public float getPerformance() {
        return performance;
    }
    public String getHealth() {
        return health;
    }
    public float getEnergy() {
        return energy;
    }

    
}
