package com.zell_mbc.medilog.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import com.zell_mbc.medilog.R;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class ChangelogBinding implements ViewBinding {
    public final ComposeView changelogView;
    private final ComposeView rootView;

    private ChangelogBinding(ComposeView rootView, ComposeView changelogView) {
        this.rootView = rootView;
        this.changelogView = changelogView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ComposeView getRoot() {
        return this.rootView;
    }

    public static ChangelogBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ChangelogBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.changelog, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ChangelogBinding bind(View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        ComposeView composeView = (ComposeView) rootView;
        return new ChangelogBinding(composeView, composeView);
    }
}
