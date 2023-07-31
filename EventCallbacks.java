```java
package com.plus.sliderx;

public class EventCallbacks {

    private EventListener imageSelectedEvent;
    private EventListener imageLoadedEvent;

    public EventCallbacks() {
        this.imageSelectedEvent = null;
        this.imageLoadedEvent = null;
    }

    public void setImageSelectedEvent(EventListener imageSelectedEvent) {
        this.imageSelectedEvent = imageSelectedEvent;
    }

    public void setImageLoadedEvent(EventListener imageLoadedEvent) {
        this.imageLoadedEvent = imageLoadedEvent;
    }

    public void onImageSelected(int imageIndex) {
        if (this.imageSelectedEvent != null) {
            this.imageSelectedEvent.onEvent(imageIndex);
        }
    }

    public void onImageLoaded(int imageIndex, boolean success) {
        if (this.imageLoadedEvent != null) {
            this.imageLoadedEvent.onEvent(imageIndex, success);
        }
    }

    public interface EventListener {
        void onEvent(int imageIndex);
        void onEvent(int imageIndex, boolean success);
    }
}
```