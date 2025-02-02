package org.example.datastores.factory;

import org.example.datastores.interfaces.DataStore;

/**
 * @author Amit Chawla
 **/
public abstract class DataStoreFactory {
    public abstract DataStore createDataStore();
}

