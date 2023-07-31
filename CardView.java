```java
package com.plus.sliderx;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.view.ViewGroup;

public class SliderCardView extends CardView {

    public SliderCardView(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
    }

    public void designSlider(SliderProperties sliderProperties) {
        setRadius(sliderProperties.getBorderRadius());
        setCardElevation(sliderProperties.getElevation());
        setContentPadding(sliderProperties.getPadding(), sliderProperties.getPadding(),
                sliderProperties.getPadding(), sliderProperties.getPadding());
        setMaxCardElevation(sliderProperties.getMaxElevation());
    }
}
```