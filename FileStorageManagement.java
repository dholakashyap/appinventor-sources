```java
package com.plus.appzenx;

import io.appwrite.Client;
import io.appwrite.services.Storage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class FileStorageManagement {

    private Client client;
    private Storage storage;

    public FileStorageManagement(Client client) {
        this.client = client;
        this.storage = new Storage(client);
    }

    public void uploadFile(String filePath) {
        File file = new File(filePath);
        Map<String, String> readPermissions = new HashMap<>();
        readPermissions.put("role", "*");
        try {
            storage.createFile(file, readPermissions, new HashMap<>()).get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void downloadFile(String fileId, String outputFilePath) {
        try {
            File outputFile = new File(outputFilePath);
            storage.getFileDownload(fileId).get().writeTo(outputFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteFile(String fileId) {
        try {
            storage.deleteFile(fileId).get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```