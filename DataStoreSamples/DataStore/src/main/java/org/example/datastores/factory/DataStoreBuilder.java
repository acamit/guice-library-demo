package org.example.datastores.factory;

import lombok.Builder;
import org.example.datastores.BaseDataStore;
import org.example.datastores.IdcsDataStore;
import org.example.datastores.IddpDataStore;
import org.example.datastores.interfaces.DataStore;

/**
 * @author Amit Chawla
 **/
@Builder
public class DataStoreBuilder {
    private final String clientType;
    private final String connectionString;

    public DataStore build() {
        BaseDataStore dataStore;
        switch (clientType) {
            case "IDCS":
                dataStore = new IdcsDataStore();
                break;
            case "IDDP":
                dataStore = new IddpDataStore();
                break;
                default:
                    throw new RuntimeException("Unsupported client type: " + clientType);
        }
        dataStore.connectionString = connectionString;
        return dataStore;
    }
}
