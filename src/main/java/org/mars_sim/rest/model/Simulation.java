package org.mars_sim.rest.model;

import java.util.ArrayList;
import java.util.List;

public class Simulation {
    private final static String SETTLEMENT_TYPE = "settlement";
    private final static String PERSON_TYPE = "person";


    private List<Person> persons;
    private List<Settlement> settlements;

    public Simulation() {
        ReportingAuthority ra1 = new ReportingAuthority("NASA", "Find life");
        ReportingAuthority ra2 = new ReportingAuthority("RKA", "Explore Space");

        Settlement s1 = new Settlement("New Boston", SETTLEMENT_TYPE, 0);
        Settlement s2 = new Settlement("New Moscow", SETTLEMENT_TYPE, 1);
        settlements = new ArrayList<>();
        settlements.add(s1);
        settlements.add(s2);

        persons = new ArrayList<>();
        persons.add(new Person("Fred Smith", PERSON_TYPE, 0, "Chef", "Head of Agriculture", "Male", "Lander Hab 1",
                                "Good", "Good", "Cooking", ra1, s1));
        persons.add(new Person("Alex Turner", PERSON_TYPE, 1, "Engineer", "Head of Maintenance", "Male", "Garage",
                                "Weak", "Poor", "Resting", ra2, s2));
        persons.add(new Person("Wendy Ford", PERSON_TYPE, 2, "Scientist", "Commander", "Female", "Lab",
        "Good", "Good", "Reading", ra2, s1));
    }

    public List<Person> getPersons() {
        return persons;
    }

}
