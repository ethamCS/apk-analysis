package com.zell_mbc.medilog.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.zell_mbc.medilog.R;
/* loaded from: classes2.dex */
public final class TemperatureEditformBinding implements ViewBinding {
    public final FloatingActionButton btDelete;
    public final FloatingActionButton btSave;
    public final EditText etComment;
    public final TextView etDate;
    public final EditText etTemperature;
    public final TextView etTime;
    private final ConstraintLayout rootView;
    public final TextView temperature;
    public final TextView tvDateLabel;
    public final TextView tvTime;
    public final TextView tvUnit;

    private TemperatureEditformBinding(ConstraintLayout rootView, FloatingActionButton btDelete, FloatingActionButton btSave, EditText etComment, TextView etDate, EditText etTemperature, TextView etTime, TextView temperature, TextView tvDateLabel, TextView tvTime, TextView tvUnit) {
        this.rootView = rootView;
        this.btDelete = btDelete;
        this.btSave = btSave;
        this.etComment = etComment;
        this.etDate = etDate;
        this.etTemperature = etTemperature;
        this.etTime = etTime;
        this.temperature = temperature;
        this.tvDateLabel = tvDateLabel;
        this.tvTime = tvTime;
        this.tvUnit = tvUnit;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static TemperatureEditformBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static TemperatureEditformBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.temperature_editform, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static TemperatureEditformBinding bind(View rootView) {
        int i = R.id.btDelete;
        FloatingActionButton floatingActionButton = (FloatingActionButton) ViewBindings.findChildViewById(rootView, R.id.btDelete);
        if (floatingActionButton != null) {
            i = R.id.btSave;
            FloatingActionButton floatingActionButton2 = (FloatingActionButton) ViewBindings.findChildViewById(rootView, R.id.btSave);
            if (floatingActionButton2 != null) {
                i = R.id.etComment;
                EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.etComment);
                if (editText != null) {
                    i = R.id.etDate;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.etDate);
                    if (textView != null) {
                        i = R.id.etTemperature;
                        EditText editText2 = (EditText) ViewBindings.findChildViewById(rootView, R.id.etTemperature);
                        if (editText2 != null) {
                            i = R.id.etTime;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.etTime);
                            if (textView2 != null) {
                                i = R.id.temperature;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.temperature);
                                if (textView3 != null) {
                                    i = R.id.tvDateLabel;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvDateLabel);
                                    if (textView4 != null) {
                                        i = R.id.tvTime;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvTime);
                                        if (textView5 != null) {
                                            i = R.id.tvUnit;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvUnit);
                                            if (textView6 != null) {
                                                return new TemperatureEditformBinding((ConstraintLayout) rootView, floatingActionButton, floatingActionButton2, editText, textView, editText2, textView2, textView3, textView4, textView5, textView6);
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
