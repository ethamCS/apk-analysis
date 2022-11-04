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
public final class GlucoseEditformBinding implements ViewBinding {
    public final FloatingActionButton btDelete;
    public final FloatingActionButton btSave;
    public final EditText etComment;
    public final TextView etDate;
    public final EditText etGlucose;
    public final EditText etKetone;
    public final TextView etTime;
    private final ConstraintLayout rootView;
    public final TextView tvDateLabel;
    public final TextView tvGKIText;
    public final TextView tvGKIValue;
    public final TextView tvGlucose;
    public final TextView tvKetone;
    public final TextView tvKetoneUnit;
    public final TextView tvTime;
    public final TextView tvUnit;

    private GlucoseEditformBinding(ConstraintLayout rootView, FloatingActionButton btDelete, FloatingActionButton btSave, EditText etComment, TextView etDate, EditText etGlucose, EditText etKetone, TextView etTime, TextView tvDateLabel, TextView tvGKIText, TextView tvGKIValue, TextView tvGlucose, TextView tvKetone, TextView tvKetoneUnit, TextView tvTime, TextView tvUnit) {
        this.rootView = rootView;
        this.btDelete = btDelete;
        this.btSave = btSave;
        this.etComment = etComment;
        this.etDate = etDate;
        this.etGlucose = etGlucose;
        this.etKetone = etKetone;
        this.etTime = etTime;
        this.tvDateLabel = tvDateLabel;
        this.tvGKIText = tvGKIText;
        this.tvGKIValue = tvGKIValue;
        this.tvGlucose = tvGlucose;
        this.tvKetone = tvKetone;
        this.tvKetoneUnit = tvKetoneUnit;
        this.tvTime = tvTime;
        this.tvUnit = tvUnit;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static GlucoseEditformBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static GlucoseEditformBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.glucose_editform, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlucoseEditformBinding bind(View rootView) {
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
                        i = R.id.etGlucose;
                        EditText editText2 = (EditText) ViewBindings.findChildViewById(rootView, R.id.etGlucose);
                        if (editText2 != null) {
                            i = R.id.etKetone;
                            EditText editText3 = (EditText) ViewBindings.findChildViewById(rootView, R.id.etKetone);
                            if (editText3 != null) {
                                i = R.id.etTime;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.etTime);
                                if (textView2 != null) {
                                    i = R.id.tvDateLabel;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvDateLabel);
                                    if (textView3 != null) {
                                        i = R.id.tvGKIText;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvGKIText);
                                        if (textView4 != null) {
                                            i = R.id.tvGKIValue;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvGKIValue);
                                            if (textView5 != null) {
                                                i = R.id.tvGlucose;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvGlucose);
                                                if (textView6 != null) {
                                                    i = R.id.tvKetone;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvKetone);
                                                    if (textView7 != null) {
                                                        i = R.id.tvKetoneUnit;
                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvKetoneUnit);
                                                        if (textView8 != null) {
                                                            i = R.id.tvTime;
                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvTime);
                                                            if (textView9 != null) {
                                                                i = R.id.tvUnit;
                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvUnit);
                                                                if (textView10 != null) {
                                                                    return new GlucoseEditformBinding((ConstraintLayout) rootView, floatingActionButton, floatingActionButton2, editText, textView, editText2, editText3, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
