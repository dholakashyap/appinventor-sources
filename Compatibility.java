```java
package com.plus.appzenx;

import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.runtime.util.SdkLevel;

@SimpleObject
public class Compatibility {

    private static final String MINIMUM_SDK = "7";

    public Compatibility() {
        checkCompatibility();
    }

    private void checkCompatibility() {
        if (SdkLevel.getLevel() < SdkLevel.LEVEL_DONUT) {
            throw new IllegalStateException("This extension is not compatible with this version of App Inventor");
        }
    }

    public static boolean isCompatible() {
        return SdkLevel.getLevel() >= SdkLevel.LEVEL_DONUT;
    }

    public static String getMinimumSdk() {
        return MINIMUM_SDK;
    }
}
```