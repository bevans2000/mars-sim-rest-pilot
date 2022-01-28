package org.mars_sim.rest.model;

import java.util.ArrayList;
import java.util.List;

/**
 * A mocked up Simulation to emulate the Simulation engine
 */
public class Simulation {
    private final static String SETTLEMENT_TYPE = "settlement";
    private final static String PERSON_TYPE = "person";

    private List<Person> persons;
    private List<Settlement> settlements;

    /**
     * Creates a static object model
     */
    public Simulation() {
        ReportingAuthority ra1 = new ReportingAuthority("NASA", "Find life");
        ReportingAuthority ra2 = new ReportingAuthority("RKA", "Explore Space");

        Settlement s1 = new Settlement("New Boston", SETTLEMENT_TYPE, 0, ra1, 1.2D, 100.2D, 12343.6D, 76559.22D, 985.1D);
        Settlement s2 = new Settlement("New Moscow", SETTLEMENT_TYPE, 1, ra2, 4545.1D, 343.5D, 0, 3434.0D, 9785.1D);
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
        persons.add(new Person("Karen Wilson", PERSON_TYPE, 3, "Pilot", "Mission Specialist", "Female", "Lab",
                                "Good", "Good", "Repairing Vehicle", ra2, s1));
    }

    public List<Person> getPersons() {
        return persons;
    }

    public List<Settlement> getSettlements() {
        return settlements;
    }
}
