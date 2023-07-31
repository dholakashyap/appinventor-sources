```java
package com.plus.sliderx;

import android.os.Handler;

public class Autoplay {

    private int autoplayInterval;
    private Handler autoplayHandler;
    private Runnable autoplayRunnable;

    public Autoplay(int autoplayInterval) {
        this.autoplayInterval = autoplayInterval;
        this.autoplayHandler = new Handler();
    }

    public void enableAutoplay(Runnable action) {
        this.autoplayRunnable = new Runnable() {
            @Override
            public void run() {
                action.run();
                autoplayHandler.postDelayed(this, autoplayInterval);
            }
        };
        this.autoplayHandler.postDelayed(autoplayRunnable, autoplayInterval);
    }

    public void stopAutoplay() {
        this.autoplayHandler.removeCallbacks(autoplayRunnable);
    }
}
```