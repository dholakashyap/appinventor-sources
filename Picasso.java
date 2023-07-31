```java
package com.plus.sliderx;

import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Callback;

public class PicassoImageLoader {

    private String imagePlaceholder;
    private String errorHandling;

    public PicassoImageLoader(String imagePlaceholder, String errorHandling) {
        this.imagePlaceholder = imagePlaceholder;
        this.errorHandling = errorHandling;
    }

    public void loadImageAsync(String imageUrl, ImageView imageView) {
        Picasso.get()
                .load(imageUrl)
                .placeholder(Integer.parseInt(imagePlaceholder))
                .error(Integer.parseInt(errorHandling))
                .into(imageView, new Callback() {
                    @Override
                    public void onSuccess() {
                        // Trigger imageLoadedEvent
                    }

                    @Override
                    public void onError(Exception e) {
                        // Handle error
                    }
                });
    }
}
```