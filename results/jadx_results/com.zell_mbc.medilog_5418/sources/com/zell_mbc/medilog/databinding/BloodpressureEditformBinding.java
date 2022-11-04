package com.zell_mbc.medilog.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.zell_mbc.medilog.R;
/* loaded from: classes2.dex */
public final class BloodpressureEditformBinding implements ViewBinding {
    public final FloatingActionButton btDelete;
    public final ImageView btHeartRhythm;
    public final FloatingActionButton btSave;
    public final EditText etComment;
    public final TextView etDate;
    public final EditText etDia;
    public final EditText etPulse;
    public final EditText etSys;
    public final TextView etTime;
    private final ConstraintLayout rootView;
    public final TextView tvDateLabel;
    public final TextView tvDia;
    public final TextView tvPulse;
    public final TextView tvSys;
    public final TextView tvTime;

    private BloodpressureEditformBinding(ConstraintLayout rootView, FloatingActionButton btDelete, ImageView btHeartRhythm, FloatingActionButton btSave, EditText etComment, TextView etDate, EditText etDia, EditText etPulse, EditText etSys, TextView etTime, TextView tvDateLabel, TextView tvDia, TextView tvPulse, TextView tvSys, TextView tvTime) {
        this.rootView = rootView;
        this.btDelete = btDelete;
        this.btHeartRhythm = btHeartRhythm;
        this.btSave = btSave;
        this.etComment = etComment;
        this.etDate = etDate;
        this.etDia = etDia;
        this.etPulse = etPulse;
        this.etSys = etSys;
        this.etTime = etTime;
        this.tvDateLabel = tvDateLabel;
        this.tvDia = tvDia;
        this.tvPulse = tvPulse;
        this.tvSys = tvSys;
        this.tvTime = tvTime;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static BloodpressureEditformBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static BloodpressureEditformBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.bloodpressure_editform, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static BloodpressureEditformBinding bind(View rootView) {
        int i = R.id.btDelete;
        FloatingActionButton floatingActionButton = (FloatingActionButton) ViewBindings.findChildViewById(rootView, R.id.btDelete);
        if (floatingActionButton != null) {
            i = R.id.btHeartRhythm;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.btHeartRhythm);
            if (imageView != null) {
                i = R.id.btSave;
                FloatingActionButton floatingActionButton2 = (FloatingActionButton) ViewBindings.findChildViewById(rootView, R.id.btSave);
                if (floatingActionButton2 != null) {
                    i = R.id.etComment;
                    EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.etComment);
                    if (editText != null) {
                        i = R.id.etDate;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.etDate);
                        if (textView != null) {
                            i = R.id.etDia;
                            EditText editText2 = (EditText) ViewBindings.findChildViewById(rootView, R.id.etDia);
                            if (editText2 != null) {
                                i = R.id.etPulse;
                                EditText editText3 = (EditText) ViewBindings.findChildViewById(rootView, R.id.etPulse);
                                if (editText3 != null) {
                                    i = R.id.etSys;
                                    EditText editText4 = (EditText) ViewBindings.findChildViewById(rootView, R.id.etSys);
                                    if (editText4 != null) {
                                        i = R.id.etTime;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.etTime);
                                        if (textView2 != null) {
                                            i = R.id.tvDateLabel;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvDateLabel);
                                            if (textView3 != null) {
                                                i = R.id.tvDia;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvDia);
                                                if (textView4 != null) {
                                                    i = R.id.tvPulse;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvPulse);
                                                    if (textView5 != null) {
                                                        i = R.id.tvSys;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvSys);
                                                        if (textView6 != null) {
                                                            i = R.id.tvTime;
                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvTime);
                                                            if (textView7 != null) {
                                                                return new BloodpressureEditformBinding((ConstraintLayout) rootView, floatingActionButton, imageView, floatingActionButton2, editText, textView, editText2, editText3, editText4, textView2, textView3, textView4, textView5, textView6, textView7);
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
