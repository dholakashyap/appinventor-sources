```java
package com.plus.appzenx;

import io.appwrite.Client;
import io.appwrite.services.Account;

public class AccountManagement {

    private Client client;
    private Account account;

    public AccountManagement() {
        client = new Client();
        account = new Account(client);
    }

    public void setEndpointAndProject(String endpoint, String projectId) {
        client.setEndpoint(endpoint);
        client.setProject(projectId);
    }

    public void register(String email, String password, String name) {
        try {
            account.create(email, password, name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void login(String email, String password) {
        try {
            account.createSession(email, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void logout() {
        try {
            account.deleteSession("current");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getUser() {
        try {
            account.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```