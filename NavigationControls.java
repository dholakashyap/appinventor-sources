```java
package com.plus.sliderx;

import android.view.MotionEvent;
import android.view.View;

public class NavigationControls {

    private float swipeLeft;
    private float swipeRight;

    public NavigationControls() {
        this.swipeLeft = 0;
        this.swipeRight = 0;
    }

    public void implementSwipe(View view) {
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        swipeRight = event.getX();
                        break;
                    case MotionEvent.ACTION_UP:
                        swipeLeft = event.getX();
                        float deltaX = swipeRight - swipeLeft;
                        if (Math.abs(deltaX) > 150) {
                            if (swipeRight > swipeLeft) {
                                // Swipe right
                                navigateImages("right");
                            } else {
                                // Swipe left
                                navigateImages("left");
                            }
                        }
                        break;
                }
                return true;
            }
        });
    }

    private void navigateImages(String direction) {
        // Logic to navigate images based on direction
    }
}
```