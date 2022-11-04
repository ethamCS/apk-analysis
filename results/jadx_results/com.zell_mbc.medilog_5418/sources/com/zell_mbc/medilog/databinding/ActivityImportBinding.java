package com.zell_mbc.medilog.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.zell_mbc.medilog.R;
/* loaded from: classes2.dex */
public final class ActivityImportBinding implements ViewBinding {
    public final Button button;
    public final ImageView imageView;
    public final ProgressBar pgPrimary;
    public final ProgressBar pgSecondary;
    private final ConstraintLayout rootView;
    public final TextView tvAddToDB;
    public final TextView tvCheckHeader;
    public final TextView tvDbPercentage;
    public final TextView tvDeleteData;
    public final TextView tvError;
    public final TextView tvFileOpen;
    public final TextView tvLoadRawData;
    public final TextView tvRecordsFound;

    private ActivityImportBinding(ConstraintLayout rootView, Button button, ImageView imageView, ProgressBar pgPrimary, ProgressBar pgSecondary, TextView tvAddToDB, TextView tvCheckHeader, TextView tvDbPercentage, TextView tvDeleteData, TextView tvError, TextView tvFileOpen, TextView tvLoadRawData, TextView tvRecordsFound) {
        this.rootView = rootView;
        this.button = button;
        this.imageView = imageView;
        this.pgPrimary = pgPrimary;
        this.pgSecondary = pgSecondary;
        this.tvAddToDB = tvAddToDB;
        this.tvCheckHeader = tvCheckHeader;
        this.tvDbPercentage = tvDbPercentage;
        this.tvDeleteData = tvDeleteData;
        this.tvError = tvError;
        this.tvFileOpen = tvFileOpen;
        this.tvLoadRawData = tvLoadRawData;
        this.tvRecordsFound = tvRecordsFound;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityImportBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityImportBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_import, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityImportBinding bind(View rootView) {
        int i = R.id.button;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.button);
        if (button != null) {
            i = R.id.imageView;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imageView);
            if (imageView != null) {
                i = R.id.pgPrimary;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.pgPrimary);
                if (progressBar != null) {
                    i = R.id.pgSecondary;
                    ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.pgSecondary);
                    if (progressBar2 != null) {
                        i = R.id.tvAddToDB;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvAddToDB);
                        if (textView != null) {
                            i = R.id.tvCheckHeader;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvCheckHeader);
                            if (textView2 != null) {
                                i = R.id.tvDbPercentage;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvDbPercentage);
                                if (textView3 != null) {
                                    i = R.id.tvDeleteData;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvDeleteData);
                                    if (textView4 != null) {
                                        i = R.id.tvError;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvError);
                                        if (textView5 != null) {
                                            i = R.id.tvFileOpen;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvFileOpen);
                                            if (textView6 != null) {
                                                i = R.id.tvLoadRawData;
                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvLoadRawData);
                                                if (textView7 != null) {
                                                    i = R.id.tvRecordsFound;
                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvRecordsFound);
                                                    if (textView8 != null) {
                                                        return new ActivityImportBinding((ConstraintLayout) rootView, button, imageView, progressBar, progressBar2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
