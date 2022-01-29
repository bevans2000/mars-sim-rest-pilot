package org.mars_sim.rest.model;

/**
 * Represents an entity that can be accessed via the RestAPI.
 */
public interface Referencable {
    String getName();
    String getType();
    int getIdentifier();
}
