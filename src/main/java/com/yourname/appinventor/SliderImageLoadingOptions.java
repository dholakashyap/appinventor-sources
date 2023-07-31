package com.yourname.appinventor;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Callback;
import android.widget.ImageView;

public class SliderImageLoadingOptions {

    private String placeholder;
    private String errorImage;

    public SliderImageLoadingOptions(String placeholder, String errorImage) {
        this.placeholder = placeholder;
        this.errorImage = errorImage;
    }

    public void loadImage(ImageView imageView, String imageUrl) {
        Picasso.get()
                .load(imageUrl)
                .placeholder(placeholder)
                .error(errorImage)
                .into(imageView, new Callback() {
                    @Override
                    public void onSuccess() {
                        // Image successfully loaded
                    }

                    @Override
                    public void onError(Exception e) {
                        // Error occurred while loading image
                    }
                });
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public String getErrorImage() {
        return errorImage;
    }

    public void setErrorImage(String errorImage) {
        this.errorImage = errorImage;
    }
}