package org.example.datastores;

import org.example.models.User;

/**
 * @author Amit Chawla
 **/
public class IddpDataStore extends BaseDataStore implements org.example.datastores.interfaces.IddpDataStore {

    @Override
    public User getUserById(String userId) {
        return new User(userId);
    }

    @Override
    public void createUser(User user) {

    }
}
