```java
package com.plus.appzenx;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Support {

    private static final Logger LOGGER = Logger.getLogger(Support.class.getName());

    public static void logError(String message, Exception e) {
        LOGGER.log(Level.SEVERE, message, e);
    }

    public static void logInfo(String message) {
        LOGGER.log(Level.INFO, message);
    }

    public static void logWarning(String message) {
        LOGGER.log(Level.WARNING, message);
    }

    public static void provideSupport(String issue) {
        // This method can be used to connect to a support system, like a ticketing system or a forum.
        // For the purpose of this example, we will just log the issue.
        logInfo("Support requested for issue: " + issue);
    }
}
```