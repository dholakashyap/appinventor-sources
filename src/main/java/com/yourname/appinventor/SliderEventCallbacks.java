```java
package com.yourname.appinventor;

public interface SliderEventCallbacks {

    // Callback for image selection event
    void onImageSelected(SliderItem sliderItem);

    // Callback for completion of image loading event
    void onImageLoadingComplete(SliderItem sliderItem);

    // Callback for image loading error event
    void onImageLoadingError(SliderItem sliderItem, Exception exception);
}
```