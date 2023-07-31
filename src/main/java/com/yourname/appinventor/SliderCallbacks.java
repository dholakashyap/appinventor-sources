```java
package com.yourname.appinventor;

public interface SliderCallbacks {

    // Callback when an image is selected
    void onImageSelected(SliderItem sliderItem);

    // Callback when image loading is completed
    void onImageLoadingComplete(SliderItem sliderItem);

    // Callback when image loading fails
    void onImageLoadingFailed(SliderItem sliderItem, Exception exception);
}
```