```java
package com.yourname.appinventor;

import android.os.Handler;

public class SliderAutoplay {

    private boolean autoplay = false;
    private int delayInterval = 3000; // Default delay interval is 3 seconds
    private Handler autoplayHandler;
    private Runnable autoplayRunnable;

    public SliderAutoplay() {
        autoplayHandler = new Handler();
        autoplayRunnable = new Runnable() {
            @Override
            public void run() {
                if (autoplay) {
                    SliderView sliderView = SliderView.getInstance();
                    sliderView.nextSlide();
                    autoplayHandler.postDelayed(this, delayInterval);
                }
            }
        };
    }

    public void startAutoplay() {
        if (!autoplay) {
            autoplay = true;
            autoplayHandler.postDelayed(autoplayRunnable, delayInterval);
        }
    }

    public void stopAutoplay() {
        if (autoplay) {
            autoplay = false;
            autoplayHandler.removeCallbacks(autoplayRunnable);
        }
    }

    public void setDelayInterval(int delayInterval) {
        this.delayInterval = delayInterval;
    }

    public int getDelayInterval() {
        return delayInterval;
    }

    public boolean isAutoplay() {
        return autoplay;
    }
}
```