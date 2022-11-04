package com.zell_mbc.medilog.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import com.zell_mbc.medilog.R;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class TemperatureInfoformBinding implements ViewBinding {
    private final ComposeView rootView;
    public final ComposeView temperatureInfoView;

    private TemperatureInfoformBinding(ComposeView rootView, ComposeView temperatureInfoView) {
        this.rootView = rootView;
        this.temperatureInfoView = temperatureInfoView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ComposeView getRoot() {
        return this.rootView;
    }

    public static TemperatureInfoformBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static TemperatureInfoformBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.temperature_infoform, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static TemperatureInfoformBinding bind(View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        ComposeView composeView = (ComposeView) rootView;
        return new TemperatureInfoformBinding(composeView, composeView);
    }
}