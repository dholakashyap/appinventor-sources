```java
package com.yourname.appinventor;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.ViewGroup;

public class SliderView extends ViewPager {

    private SliderAdapter sliderAdapter;
    private SliderNavigationControls navigationControls;
    private SliderAutoplay autoplay;
    private SliderProperties sliderProperties;

    public SliderView(Context context, SliderProperties properties) {
        super(context);
        this.sliderProperties = properties;
        initSlider();
    }

    private void initSlider() {
        sliderAdapter = new SliderAdapter(getContext());
        setAdapter(sliderAdapter);

        navigationControls = new SliderNavigationControls(this);
        autoplay = new SliderAutoplay(this, sliderProperties.getDelayInterval());

        setPageTransformer(true, sliderProperties.getTransitionEffect());
        setClipToPadding(false);
        setPadding(sliderProperties.getPaddingLeft(), sliderProperties.getPaddingTop(), sliderProperties.getPaddingRight(), sliderProperties.getPaddingBottom());
        setOffscreenPageLimit(3);
    }

    public void addSliderItem(SliderItem item) {
        sliderAdapter.addItem(item);
        sliderAdapter.notifyDataSetChanged();
    }

    public void removeSliderItem(int position) {
        sliderAdapter.removeItem(position);
        sliderAdapter.notifyDataSetChanged();
    }

    public void setOnItemClickListener(SliderCallbacks.OnItemClickListener listener) {
        sliderAdapter.setOnItemClickListener(listener);
    }

    public void setOnItemLoadingListener(SliderCallbacks.OnItemLoadingListener listener) {
        sliderAdapter.setOnItemLoadingListener(listener);
    }

    public void startAutoplay() {
        autoplay.start();
    }

    public void stopAutoplay() {
        autoplay.stop();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (sliderProperties.isAutoplayEnabled()) {
            startAutoplay();
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        if (sliderProperties.isAutoplayEnabled()) {
            stopAutoplay();
        }
        super.onDetachedFromWindow();
    }

    @Override
    public boolean canScrollHorizontally(int direction) {
        return navigationControls.canScrollHorizontally(direction);
    }

    @Override
    public boolean canScrollVertically(int direction) {
        return navigationControls.canScrollVertically(direction);
    }
}
```