package org.mars_sim.rest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Person implements Referencable {
    @Getter private String name; 
    @Getter private String type; 
    @Getter private int identifier; 
    @Getter private String job; 
    @Getter private String role; 
    @Getter private String gender; 
    @Getter private String building; 
    @Getter private String health; 
    @Getter private String performance;
    @Getter private String task;
    @Getter private ReportingAuthority authority;
    @Getter private Settlement settlement; 

}
