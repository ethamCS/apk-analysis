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
public final class OximetryEditformBinding implements ViewBinding {
    public final FloatingActionButton btDelete;
    public final FloatingActionButton btSave;
    public final EditText etComment;
    public final TextView etDate;
    public final EditText etOximetry;
    public final EditText etPulse;
    public final TextView etTime;
    private final ConstraintLayout rootView;
    public final TextView tvDateLabel;
    public final TextView tvOximetry;
    public final TextView tvPulse;
    public final TextView tvPulseUnit;
    public final TextView tvTime;
    public final TextView tvUnit;

    private OximetryEditformBinding(ConstraintLayout rootView, FloatingActionButton btDelete, FloatingActionButton btSave, EditText etComment, TextView etDate, EditText etOximetry, EditText etPulse, TextView etTime, TextView tvDateLabel, TextView tvOximetry, TextView tvPulse, TextView tvPulseUnit, TextView tvTime, TextView tvUnit) {
        this.rootView = rootView;
        this.btDelete = btDelete;
        this.btSave = btSave;
        this.etComment = etComment;
        this.etDate = etDate;
        this.etOximetry = etOximetry;
        this.etPulse = etPulse;
        this.etTime = etTime;
        this.tvDateLabel = tvDateLabel;
        this.tvOximetry = tvOximetry;
        this.tvPulse = tvPulse;
        this.tvPulseUnit = tvPulseUnit;
        this.tvTime = tvTime;
        this.tvUnit = tvUnit;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static OximetryEditformBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static OximetryEditformBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.oximetry_editform, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static OximetryEditformBinding bind(View rootView) {
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
                        i = R.id.etOximetry;
                        EditText editText2 = (EditText) ViewBindings.findChildViewById(rootView, R.id.etOximetry);
                        if (editText2 != null) {
                            i = R.id.etPulse;
                            EditText editText3 = (EditText) ViewBindings.findChildViewById(rootView, R.id.etPulse);
                            if (editText3 != null) {
                                i = R.id.etTime;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.etTime);
                                if (textView2 != null) {
                                    i = R.id.tvDateLabel;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvDateLabel);
                                    if (textView3 != null) {
                                        i = R.id.tvOximetry;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvOximetry);
                                        if (textView4 != null) {
                                            i = R.id.tvPulse;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvPulse);
                                            if (textView5 != null) {
                                                i = R.id.tvPulseUnit;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvPulseUnit);
                                                if (textView6 != null) {
                                                    i = R.id.tvTime;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvTime);
                                                    if (textView7 != null) {
                                                        i = R.id.tvUnit;
                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvUnit);
                                                        if (textView8 != null) {
                                                            return new OximetryEditformBinding((ConstraintLayout) rootView, floatingActionButton, floatingActionButton2, editText, textView, editText2, editText3, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
