package org.example.datastores;

import org.example.datastores.interfaces.DataStore;

/**
 * @author Amit Chawla
 **/
public class BaseDataStore implements DataStore {
    public String connectionString;

    @Override
    public void openConnection() {
        System.out.println("Opening connection to: " + connectionString);
    }

    @Override
    public void closeConnection() {
        System.out.println("Closing connection");
    }
}
