```java
package com.plus.sliderx;

public class ImageCaptions {

    private String captionText;
    private String captionPosition;
    private String captionStyle;

    public ImageCaptions(String captionText, String captionPosition, String captionStyle) {
        this.captionText = captionText;
        this.captionPosition = captionPosition;
        this.captionStyle = captionStyle;
    }

    public String getCaptionText() {
        return captionText;
    }

    public void setCaptionText(String captionText) {
        this.captionText = captionText;
    }

    public String getCaptionPosition() {
        return captionPosition;
    }

    public void setCaptionPosition(String captionPosition) {
        this.captionPosition = captionPosition;
    }

    public String getCaptionStyle() {
        return captionStyle;
    }

    public void setCaptionStyle(String captionStyle) {
        this.captionStyle = captionStyle;
    }

    public void addImageCaption() {
        // Code to add caption to image goes here
    }
}
```