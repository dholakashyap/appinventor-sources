```java
package com.yourname.appinventor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.PagerAdapter;
import com.squareup.picasso.Picasso;
import java.util.List;

public class SliderAdapter extends PagerAdapter {

    private Context context;
    private List<SliderItem> sliderItems;
    private SliderCallbacks sliderCallbacks;

    public SliderAdapter(Context context, List<SliderItem> sliderItems, SliderCallbacks sliderCallbacks) {
        this.context = context;
        this.sliderItems = sliderItems;
        this.sliderCallbacks = sliderCallbacks;
    }

    @Override
    public int getCount() {
        return sliderItems.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.slider_item, container, false);
        ImageView imageView = view.findViewById(R.id.slider_image);
        TextView captionView = view.findViewById(R.id.slider_caption);
        CardView cardView = view.findViewById(R.id.slider_card);

        SliderItem sliderItem = sliderItems.get(position);
        SliderProperties properties = sliderItem.getProperties();

        Picasso.get().load(sliderItem.getImageUrl())
                .placeholder(properties.getPlaceholder())
                .error(properties.getErrorDrawable())
                .into(imageView);

        captionView.setText(sliderItem.getCaption());
        cardView.setRadius(properties.getBorderRadius());

        view.setOnClickListener(v -> sliderCallbacks.onImageSelected(position));

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
```