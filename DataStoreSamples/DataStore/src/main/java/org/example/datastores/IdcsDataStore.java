package org.example.datastores;

import org.example.models.Entity;

/**
 * @author Amit Chawla
 **/
public class IdcsDataStore extends BaseDataStore  implements org.example.datastores.interfaces.IdcsDataStore {
    @Override
    public Entity getById(String id) {
        return new Entity(id);
    }

    @Override
    public void create(Entity entity) {
        System.out.println("IdcsDataStore create");
    }
}
