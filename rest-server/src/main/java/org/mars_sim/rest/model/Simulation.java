package org.mars_sim.rest.model;

import java.util.ArrayList;
import java.util.List;

/**
 * A mocked up Simulation to emulate the Simulation engine
 */
public class Simulation {
    private static final String SETTLEMENT_TYPE = "settlement";
    private static final String PERSON_TYPE = "person";

    private List<Person> persons;
    private List<Settlement> settlements;

    /**
     * Creates a static object model
     */
    public Simulation() {
        ReportingAuthority ra1 = new ReportingAuthority("NASA", "Find life", List.of("Agenda 1"));
        ReportingAuthority ra2 = new ReportingAuthority("RKA", "Explore Space", List.of("Agenda 1", "Agenda 2"));

        Settlement s1 = new Settlement("New Boston", SETTLEMENT_TYPE, 1, ra1, 1.2D, 100.2D, 12343.6D, 76559.22D, 985.1D, 10);
        Settlement s2 = new Settlement("New Moscow", SETTLEMENT_TYPE, 2, ra2, 4545.1D, 343.5D, 0, 3434.0D, 9785.1D, 2);
        settlements = new ArrayList<>();
        settlements.add(s1);
        settlements.add(s2);

        persons = new ArrayList<>();
        PhysicalCondition condition1 = new PhysicalCondition(1F, "Well", 123.45F);
        persons.add(new Person("Fred Smith", PERSON_TYPE, 4, "Chef", "Head of Agriculture", "Male", "Lander Hab 1",
                                condition1, "Cooking", ra1, s1));
        PhysicalCondition condition2 = new PhysicalCondition(0.8F, "OK", 5645645.34F);
        persons.add(new Person("Alex Turner", PERSON_TYPE, 1, "Engineer", "Head of Maintenance", "Male", "Garage",
                                condition2, "Resting", ra2, s2));
        PhysicalCondition condition3 = new PhysicalCondition(0.1F, "Poor", 48937.1F);
        persons.add(new Person("Wendy Ford", PERSON_TYPE, 2, "Scientist", "Commander", "Female", "Lab",
                                condition3, "Reading", ra2, s1));
        PhysicalCondition condition4 = new PhysicalCondition(0.5F, "OK", 456565.4F);
        persons.add(new Person("Karen Wilson", PERSON_TYPE, 3, "Pilot", "Mission Specialist", "Female", "Lab",
                                condition4, "Repairing Vehicle", ra2, s1));
    }

    public List<Person> getPersons() {
        return persons;
    }

    public List<Settlement> getSettlements() {
        return settlements;
    }
}
