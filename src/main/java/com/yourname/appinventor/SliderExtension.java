```java
package com.yourname.appinventor;

import android.content.Context;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.runtime.*;
import com.google.appinventor.components.common.ComponentCategory;

@DesignerComponent(version = 1, description = "An extension for creating an image slider or carousel", 
                   category = ComponentCategory.EXTENSION, nonVisible = true, iconName = "images/extension.png")
@UsesLibraries(libraries = "cardview.jar,picasso.jar")
public class SliderExtension extends AndroidNonvisibleComponent {

    private Context context;
    private SliderView sliderView;
    private SliderProperties sliderProperties;
    private SliderCallbacks sliderCallbacks;

    public SliderExtension(ComponentContainer container){
        super(container.$form());
        this.context = container.$context();
        this.sliderView = new SliderView(context);
        this.sliderProperties = new SliderProperties();
        this.sliderCallbacks = new SliderCallbacks();
    }

    @SimpleFunction(description = "Create a new slider view")
    public void CreateSliderView() {
        sliderView.createSliderView(sliderProperties, sliderCallbacks);
    }

    @SimpleProperty(description = "Set the properties of the slider")
    public void SetSliderProperties(SliderProperties properties) {
        this.sliderProperties = properties;
    }

    @SimpleFunction(description = "Load images into the slider")
    public void LoadImages(String[] imageUrls) {
        SliderAdapter sliderAdapter = new SliderAdapter(context, imageUrls);
        sliderView.setAdapter(sliderAdapter);
    }

    @SimpleEvent(description = "Event triggered when an image is selected")
    public void ImageSelected(int position) {
        EventDispatcher.dispatchEvent(this, "ImageSelected", position);
    }

    @SimpleEvent(description = "Event triggered when image loading is completed")
    public void ImageLoadingCompleted() {
        EventDispatcher.dispatchEvent(this, "ImageLoadingCompleted");
    }
}
```