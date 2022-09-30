package org.mars_sim.rest.model;

import java.util.List;


public class ReportingAuthority {
    private String name; 
    private String objective; 
    private List<String> agenda;
    
    ReportingAuthority(String name, String objective, List<String> agenda) {
        this.name = name;
        this.objective = objective;
        this.agenda = agenda;
    }
    public String getName() {
        return name;
    }
    public String getObjective() {
        return objective;
    }
    public List<String> getAgenda() {
        return agenda;
    }
    
    
}
