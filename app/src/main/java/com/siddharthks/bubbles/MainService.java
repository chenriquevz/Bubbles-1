package com.siddharthks.bubbles;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.view.Gravity;

import com.siddharthks.bubbleslib.BubbleConfig;
import com.siddharthks.bubbleslib.BubbleService;
import com.siddharthks.bubbleslib.R;

public class MainService extends BubbleService {
    @Override
    protected BubbleConfig getConfig() {
        Context context = getApplicationContext();
        return new BubbleConfig.Builder()
                .bubbleIcon(ContextCompat.getDrawable(context, R.drawable.web_icon))
                .removeBubbleIcon(ContextCompat.getDrawable(context, com.siddharthks.bubbleslib.R.drawable.close_default_icon))
                .bubbleIconDp(54)
                .expandableView(getInflater().inflate(R.layout.sample_view, null))
                .removeBubbleIconDp(54)
                .paddingDp(4)
                .borderRadiusDp(0)
                .physicsEnabled(true)
                .expandableColor(Color.WHITE)
                .triangleColor(0xFF215A64)
                .gravity(Gravity.LEFT)
                .build();
    }
}