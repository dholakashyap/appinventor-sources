```java
package com.plus.appzenx;

import io.appwrite.Client;
import io.appwrite.services.Database;

public class DatabaseOperations {

    private Client client;
    private Database database;

    public DatabaseOperations(Client client) {
        this.client = client;
        this.database = new Database(client);
    }

    public void createRecord(String collectionId, Map<String, Object> data) {
        database.createDocument(collectionId, data)
            .then(response -> System.out.println(response))
            .catch(error -> System.out.println(error));
    }

    public void readRecord(String collectionId, String documentId) {
        database.getDocument(collectionId, documentId)
            .then(response -> System.out.println(response))
            .catch(error -> System.out.println(error));
    }

    public void updateRecord(String collectionId, String documentId, Map<String, Object> data) {
        database.updateDocument(collectionId, documentId, data)
            .then(response -> System.out.println(response))
            .catch(error -> System.out.println(error));
    }

    public void deleteRecord(String collectionId, String documentId) {
        database.deleteDocument(collectionId, documentId)
            .then(response -> System.out.println(response))
            .catch(error -> System.out.println(error));
    }
}
```