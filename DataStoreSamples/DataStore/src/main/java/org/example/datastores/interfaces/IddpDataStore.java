package org.example.datastores.interfaces;

import org.example.models.User;

/**
 * @author Amit Chawla
 **/
public interface IddpDataStore extends DataStore{
    User getUserById(String userId);
    void createUser(User user);
}
