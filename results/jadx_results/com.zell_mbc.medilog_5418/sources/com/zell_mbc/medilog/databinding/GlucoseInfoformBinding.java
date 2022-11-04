package com.zell_mbc.medilog.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import com.zell_mbc.medilog.R;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class GlucoseInfoformBinding implements ViewBinding {
    public final ComposeView glucoseInfoView;
    private final ComposeView rootView;

    private GlucoseInfoformBinding(ComposeView rootView, ComposeView glucoseInfoView) {
        this.rootView = rootView;
        this.glucoseInfoView = glucoseInfoView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ComposeView getRoot() {
        return this.rootView;
    }

    public static GlucoseInfoformBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static GlucoseInfoformBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.glucose_infoform, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlucoseInfoformBinding bind(View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        ComposeView composeView = (ComposeView) rootView;
        return new GlucoseInfoformBinding(composeView, composeView);
    }
}
