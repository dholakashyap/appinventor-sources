```java
package com.plus.appzenx;

import com.appwrite.Client;
import com.appwrite.services.Account;
import com.appwrite.services.Database;
import com.appwrite.services.Storage;

public class AppzenX {

    private Client client;
    private Account account;
    private Database database;
    private Storage storage;

    public AppzenX(String endpoint, String projectID) {
        client = new Client()
            .setEndpoint(endpoint)
            .setProject(projectID);

        account = new Account(client);
        database = new Database(client);
        storage = new Storage(client);
    }

    // Account Management
    public void register(String email, String password) {
        account.create(email, password);
    }

    public void login(String email, String password) {
        account.createSession(email, password);
    }

    public void logout() {
        account.deleteSession("current");
    }

    // Database Operations
    public void createRecord(String collectionId, Map<String, Object> data) {
        database.createDocument(collectionId, data);
    }

    public void readRecord(String documentId) {
        database.getDocument(documentId);
    }

    public void updateRecord(String documentId, Map<String, Object> data) {
        database.updateDocument(documentId, data);
    }

    public void deleteRecord(String documentId) {
        database.deleteDocument(documentId);
    }

    // File and Storage Management
    public void uploadFile(String path) {
        storage.createFile(path);
    }

    public void downloadFile(String fileId) {
        storage.getFileDownload(fileId);
    }

    public void deleteFile(String fileId) {
        storage.deleteFile(fileId);
    }

    // Custom Functions and Event Handlers to be implemented in respective classes
}
```