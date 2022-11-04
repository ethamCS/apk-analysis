package com.zell_mbc.medilog.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import com.zell_mbc.medilog.R;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class BloodpressureInfoformBinding implements ViewBinding {
    public final ComposeView bloodPressureInfoView;
    private final ComposeView rootView;

    private BloodpressureInfoformBinding(ComposeView rootView, ComposeView bloodPressureInfoView) {
        this.rootView = rootView;
        this.bloodPressureInfoView = bloodPressureInfoView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ComposeView getRoot() {
        return this.rootView;
    }

    public static BloodpressureInfoformBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static BloodpressureInfoformBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.bloodpressure_infoform, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static BloodpressureInfoformBinding bind(View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        ComposeView composeView = (ComposeView) rootView;
        return new BloodpressureInfoformBinding(composeView, composeView);
    }
}
