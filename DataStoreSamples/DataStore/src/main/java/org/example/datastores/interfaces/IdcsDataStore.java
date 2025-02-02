package org.example.datastores.interfaces;

import org.example.models.Entity;

/**
 * @author Amit Chawla
 **/
public interface IdcsDataStore extends DataStore {
    Entity getById(String id);
    void create(Entity entity);
}
