```java
package com.plus.sliderx;

import android.view.ViewGroup;
import android.widget.FrameLayout;

public class DesignCustomization {

    private int sliderWidth;
    private int sliderHeight;
    private int borderRadius;
    private int margins;
    private int padding;
    private String transitionEffects;

    public DesignCustomization() {
        // Default values
        this.sliderWidth = 300;
        this.sliderHeight = 200;
        this.borderRadius = 10;
        this.margins = 10;
        this.padding = 10;
        this.transitionEffects = "slide";
    }

    public void adjustSliderProperties(int width, int height, int borderRadius, int margins, int padding, String transitionEffects) {
        this.sliderWidth = width;
        this.sliderHeight = height;
        this.borderRadius = borderRadius;
        this.margins = margins;
        this.padding = padding;
        this.transitionEffects = transitionEffects;
    }

    public void applyDesign(FrameLayout sliderContainer) {
        ViewGroup.LayoutParams params = sliderContainer.getLayoutParams();
        params.width = this.sliderWidth;
        params.height = this.sliderHeight;
        sliderContainer.setLayoutParams(params);
        sliderContainer.setPadding(this.padding, this.padding, this.padding, this.padding);
        sliderContainer.setMargin(this.margins, this.margins, this.margins, this.margins);
        sliderContainer.setRadius(this.borderRadius);
        sliderContainer.setTransitionEffect(this.transitionEffects);
    }
}
```