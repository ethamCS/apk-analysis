package com.zell_mbc.medilog.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import com.zell_mbc.medilog.R;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class WaterInfoformBinding implements ViewBinding {
    private final ComposeView rootView;
    public final ComposeView waterInfoView;

    private WaterInfoformBinding(ComposeView rootView, ComposeView waterInfoView) {
        this.rootView = rootView;
        this.waterInfoView = waterInfoView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ComposeView getRoot() {
        return this.rootView;
    }

    public static WaterInfoformBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static WaterInfoformBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.water_infoform, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static WaterInfoformBinding bind(View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        ComposeView composeView = (ComposeView) rootView;
        return new WaterInfoformBinding(composeView, composeView);
    }
}
