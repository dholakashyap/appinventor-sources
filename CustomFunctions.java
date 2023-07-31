```java
package com.plus.appzenx;

import io.appwrite.Client;
import io.appwrite.services.Functions;

public class CustomFunctions {

    private Client client;
    private Functions functions;

    public CustomFunctions(Client client) {
        this.client = client;
        this.functions = new Functions(client);
    }

    public void createFunction(String name, String runtime) {
        try {
            functions.createFunction(name, runtime)
                .addOnSuccessListener(response -> {
                    // Handle success
                })
                .addOnFailureListener(exception -> {
                    // Handle error
                });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listFunctions() {
        try {
            functions.listFunctions()
                .addOnSuccessListener(response -> {
                    // Handle success
                })
                .addOnFailureListener(exception -> {
                    // Handle error
                });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getFunction(String functionId) {
        try {
            functions.getFunction(functionId)
                .addOnSuccessListener(response -> {
                    // Handle success
                })
                .addOnFailureListener(exception -> {
                    // Handle error
                });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteFunction(String functionId) {
        try {
            functions.deleteFunction(functionId)
                .addOnSuccessListener(response -> {
                    // Handle success
                })
                .addOnFailureListener(exception -> {
                    // Handle error
                });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```