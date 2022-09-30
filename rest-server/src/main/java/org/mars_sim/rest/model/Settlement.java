package org.mars_sim.rest.model;

public class Settlement implements Referencable {

    private String name; 
    private String type; 
    private int identifier; 
    private ReportingAuthority authority;
    private double power;
    private double oxygen;
    private double hydrogen;
    private double water;
    private double methane;
    private int citizens;

    Settlement(String name, String type, int identifier, ReportingAuthority authority, double power,
            double oxygen, double hydrogen, double water, double methane, int citizens) {
        this.name = name;
        this.type = type;
        this.identifier = identifier;
        this.authority = authority;
        this.power = power;
        this.oxygen = oxygen;
        this.hydrogen = hydrogen;
        this.water = water;
        this.methane = methane;
        this.citizens = citizens;
    }

    public int getCitizens() {
        return citizens;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getIdentifier() {
        return identifier;
    }

    public ReportingAuthority getAuthority() {
        return authority;
    }

    public double getPower() {
        return power;
    }

    public double getOxygen() {
        return oxygen;
    }

    public double getHydrogen() {
        return hydrogen;
    }

    public double getWater() {
        return water;
    }

    public double getMethane() {
        return methane;
    }

    
}
