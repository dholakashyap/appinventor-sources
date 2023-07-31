```java
package com.yourname.appinventor;

import android.graphics.Bitmap;

public class SliderItem {

    private Bitmap image;
    private String caption;

    public SliderItem(Bitmap image, String caption) {
        this.image = image;
        this.caption = caption;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }
}
```