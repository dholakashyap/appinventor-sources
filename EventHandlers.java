```java
package com.plus.appzenx;

import io.appwrite.Client;
import io.appwrite.services.Account;
import io.appwrite.exceptions.AppwriteException;

public class EventHandlers {

    private Client client;
    private Account account;

    public EventHandlers(Client client, Account account) {
        this.client = client;
        this.account = account;
    }

    public void onUserAuthenticationStatusChange() {
        try {
            String sessionId = account.getSession();
            if (sessionId != null) {
                // User is logged in
                System.out.println("User is logged in with session id: " + sessionId);
            } else {
                // User is logged out
                System.out.println("User is logged out");
            }
        } catch (AppwriteException e) {
            e.printStackTrace();
        }
    }

    public void onDatabaseOperation() {
        // Handle database operation events here
        System.out.println("Database operation performed");
    }

    public void onFileUpload() {
        // Handle file upload events here
        System.out.println("File uploaded");
    }

    public void onFileDownload() {
        // Handle file download events here
        System.out.println("File downloaded");
    }

    public void onFileDelete() {
        // Handle file delete events here
        System.out.println("File deleted");
    }

    public void onCustomFunctionExecution() {
        // Handle custom function execution events here
        System.out.println("Custom function executed");
    }
}
```