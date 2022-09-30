package org.mars_sim.rest.model;



public class Person implements Referencable {
    private String name; 
    private String type; 
    private int identifier; 
    private String job; 
    private String role; 
    private String gender; 
    private String building; 
    private PhysicalCondition condition; 
    private String task;
    private ReportingAuthority authority;
    private Settlement settlement; 

    Person(String name, String type, int identifier, String job, String role, String gender, String building,
            PhysicalCondition condition, String task, ReportingAuthority authority, Settlement settlement) {
        this.name = name;
        this.type = type;
        this.identifier = identifier;
        this.job = job;
        this.role = role;
        this.gender = gender;
        this.building = building;
        this.condition = condition;
        this.task = task;
        this.authority = authority;
        this.settlement = settlement;
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
    public String getJob() {
        return job;
    }
    public String getRole() {
        return role;
    }
    public String getGender() {
        return gender;
    }
    public String getBuilding() {
        return building;
    }
    public PhysicalCondition getCondition() {
        return condition;
    }
    public String getTask() {
        return task;
    }
    public ReportingAuthority getAuthority() {
        return authority;
    }
    public Settlement getSettlement() {
        return settlement;
    }


}
