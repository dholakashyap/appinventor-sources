```java
import io.appwrite.Client;
import io.appwrite.services.Database;
import io.appwrite.services.Storage;
import io.appwrite.services.Users;
import io.appwrite.services.Functions;
import io.appwrite.services.Account;
import java.util.Map;

public class AppWriteExtension {

    private Client client;
    private Users users;
    private Database database;
    private Storage storage;
    private Functions functions;
    private Account account;

    public AppWriteExtension(String apiKey, String endpoint) {
        client = new Client()
            .setEndpoint(endpoint)
            .setProject(apiKey);

        users = new Users(client);
        database = new Database(client);
        storage = new Storage(client);
        functions = new Functions(client);
        account = new Account(client);
    }

    public void signUp(String email, String password) {
        users.create(email, password);
    }

    public void login(String email, String password) {
        account.createSession(email, password);
    }

    public void logout() {
        account.deleteSession("current");
    }

    public void createRecord(String collection, Map<String, Object> data) {
        database.createDocument(collection, data);
    }

    public void readRecord(String collection, String documentId) {
        database.getDocument(collection, documentId);
    }

    public void updateRecord(String collection, String documentId, Map<String, Object> data) {
        database.updateDocument(collection, documentId, data);
    }

    public void deleteRecord(String collection, String documentId) {
        database.deleteDocument(collection, documentId);
    }

    public void uploadFile(String filePath) {
        storage.createFile(filePath);
    }

    public String getFileDownloadURL(String fileId) {
        return storage.getFileDownload(fileId);
    }

    public void startRealtimeCollaboration(String documentId) {
        // WebSocket implementation for real-time collaboration
    }

    public void sendCollaborationData(String data) {
        // WebSocket implementation for sending collaboration data
    }

    public void invokeCustomFunction(String functionName, Map<String, Object> params) {
        functions.createExecution(functionName, params);
    }

    public void sendPushNotification(String userId, String title, String message) {
        // Push notification implementation
    }

    public void setApiKey(String apiKey) {
        client.setProject(apiKey);
    }

    public String getApiKey() {
        return client.getProject();
    }

    public void setEndpoint(String endpoint) {
        client.setEndpoint(endpoint);
    }

    public String getEndpoint() {
        return client.getEndpoint();
    }
}
```