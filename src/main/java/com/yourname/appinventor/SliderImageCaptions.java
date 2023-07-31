package com.yourname.appinventor;

import android.view.View;
import android.widget.TextView;

public class SliderImageCaptions {

    private SliderItem sliderItem;
    private TextView captionView;

    public SliderImageCaptions(SliderItem sliderItem, View itemView) {
        this.sliderItem = sliderItem;
        this.captionView = itemView.findViewById(R.id.captionView);
    }

    public void setCaption(String caption) {
        sliderItem.setCaption(caption);
        captionView.setText(caption);
    }

    public String getCaption() {
        return sliderItem.getCaption();
    }

    public void showCaption() {
        captionView.setVisibility(View.VISIBLE);
    }

    public void hideCaption() {
        captionView.setVisibility(View.GONE);
    }
}