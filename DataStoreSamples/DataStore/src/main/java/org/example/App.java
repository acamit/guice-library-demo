package org.example;

import org.example.datastores.IdcsDataStore;
import org.example.datastores.IddpDataStore;
import org.example.datastores.factory.DataStoreBuilder;
import org.example.models.Entity;
import org.example.models.User;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        var idcsStoreBuilder = DataStoreBuilder.builder()
                .clientType("IDCS")
                .connectionString("idcs://localhost")
                .build();
        var idcsStore = (IdcsDataStore) idcsStoreBuilder.build();
        // Can only use IDCS operations
        Entity entity = idcsStore.getById("123");

        // Create IDDP datastore
        var builder = DataStoreBuilder.builder()
                .clientType("IDDP")
                .connectionString("iddp://localhost")
                .build();
        var iddpStore = (IddpDataStore) builder.build();
        // Can only use IDDP operations
        User user = iddpStore.getUserById("456");
    }
}
