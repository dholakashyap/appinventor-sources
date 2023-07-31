```java
package com.yourname.appinventor;

import android.view.MotionEvent;
import android.view.View;

public class SliderNavigationControls {

    private SliderView sliderView;

    public SliderNavigationControls(SliderView sliderView) {
        this.sliderView = sliderView;
    }

    public void enableSwipeNavigation() {
        sliderView.setOnTouchListener(new View.OnTouchListener() {
            float downX, upX;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    downX = event.getX();
                    return true;
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    upX = event.getX();

                    // swipe left to right
                    if (upX - downX > 100) {
                        sliderView.previousSlide();
                        return true;
                    }

                    // swipe right to left
                    if (downX - upX > 100) {
                        sliderView.nextSlide();
                        return true;
                    }
                }
                return false;
            }
        });
    }
}
```