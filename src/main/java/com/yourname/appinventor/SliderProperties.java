```java
package com.yourname.appinventor;

import android.graphics.Color;

public class SliderProperties {

    private int width;
    private int height;
    private int borderRadius;
    private int margin;
    private int padding;
    private String transitionEffect;
    private Color backgroundColor;

    public SliderProperties() {
        // Default properties
        this.width = 300;
        this.height = 200;
        this.borderRadius = 10;
        this.margin = 5;
        this.padding = 5;
        this.transitionEffect = "slide";
        this.backgroundColor = Color.WHITE;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBorderRadius() {
        return borderRadius;
    }

    public void setBorderRadius(int borderRadius) {
        this.borderRadius = borderRadius;
    }

    public int getMargin() {
        return margin;
    }

    public void setMargin(int margin) {
        this.margin = margin;
    }

    public int getPadding() {
        return padding;
    }

    public void setPadding(int padding) {
        this.padding = padding;
    }

    public String getTransitionEffect() {
        return transitionEffect;
    }

    public void setTransitionEffect(String transitionEffect) {
        this.transitionEffect = transitionEffect;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
}
```