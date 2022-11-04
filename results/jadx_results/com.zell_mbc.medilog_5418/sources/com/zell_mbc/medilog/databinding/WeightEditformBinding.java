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
public final class WeightEditformBinding implements ViewBinding {
    public final FloatingActionButton btDelete;
    public final FloatingActionButton btSave;
    public final EditText etBodyFat;
    public final EditText etComment;
    public final TextView etDate;
    public final TextView etTime;
    public final EditText etWeight;
    private final ConstraintLayout rootView;
    public final TextView tvBodyFat;
    public final TextView tvDateLabel;
    public final TextView tvFatUnit;
    public final TextView tvTime;
    public final TextView tvWeight;
    public final TextView tvWeightUnit;

    private WeightEditformBinding(ConstraintLayout rootView, FloatingActionButton btDelete, FloatingActionButton btSave, EditText etBodyFat, EditText etComment, TextView etDate, TextView etTime, EditText etWeight, TextView tvBodyFat, TextView tvDateLabel, TextView tvFatUnit, TextView tvTime, TextView tvWeight, TextView tvWeightUnit) {
        this.rootView = rootView;
        this.btDelete = btDelete;
        this.btSave = btSave;
        this.etBodyFat = etBodyFat;
        this.etComment = etComment;
        this.etDate = etDate;
        this.etTime = etTime;
        this.etWeight = etWeight;
        this.tvBodyFat = tvBodyFat;
        this.tvDateLabel = tvDateLabel;
        this.tvFatUnit = tvFatUnit;
        this.tvTime = tvTime;
        this.tvWeight = tvWeight;
        this.tvWeightUnit = tvWeightUnit;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static WeightEditformBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static WeightEditformBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.weight_editform, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static WeightEditformBinding bind(View rootView) {
        int i = R.id.btDelete;
        FloatingActionButton floatingActionButton = (FloatingActionButton) ViewBindings.findChildViewById(rootView, R.id.btDelete);
        if (floatingActionButton != null) {
            i = R.id.btSave;
            FloatingActionButton floatingActionButton2 = (FloatingActionButton) ViewBindings.findChildViewById(rootView, R.id.btSave);
            if (floatingActionButton2 != null) {
                i = R.id.etBodyFat;
                EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.etBodyFat);
                if (editText != null) {
                    i = R.id.etComment;
                    EditText editText2 = (EditText) ViewBindings.findChildViewById(rootView, R.id.etComment);
                    if (editText2 != null) {
                        i = R.id.etDate;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.etDate);
                        if (textView != null) {
                            i = R.id.etTime;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.etTime);
                            if (textView2 != null) {
                                i = R.id.etWeight;
                                EditText editText3 = (EditText) ViewBindings.findChildViewById(rootView, R.id.etWeight);
                                if (editText3 != null) {
                                    i = R.id.tvBodyFat;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvBodyFat);
                                    if (textView3 != null) {
                                        i = R.id.tvDateLabel;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvDateLabel);
                                        if (textView4 != null) {
                                            i = R.id.tvFatUnit;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvFatUnit);
                                            if (textView5 != null) {
                                                i = R.id.tvTime;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvTime);
                                                if (textView6 != null) {
                                                    i = R.id.tvWeight;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvWeight);
                                                    if (textView7 != null) {
                                                        i = R.id.tvWeightUnit;
                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvWeightUnit);
                                                        if (textView8 != null) {
                                                            return new WeightEditformBinding((ConstraintLayout) rootView, floatingActionButton, floatingActionButton2, editText, editText2, textView, textView2, editText3, textView3, textView4, textView5, textView6, textView7, textView8);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
