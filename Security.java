```java
package com.plus.appzenx;

import io.appwrite.Client;
import io.appwrite.services.Account;

public class Security {

    private Client client;
    private Account account;

    public Security(Client client) {
        this.client = client;
        this.account = new Account(client);
    }

    public void register(String email, String password) {
        try {
            account.create(email, password);
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
            account.deleteSessions();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isAuthenticated() {
        try {
            account.get();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
```