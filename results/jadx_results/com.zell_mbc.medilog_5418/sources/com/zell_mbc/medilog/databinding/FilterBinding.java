package com.zell_mbc.medilog.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.zell_mbc.medilog.R;
/* loaded from: classes2.dex */
public final class FilterBinding implements ViewBinding {
    public final MaterialButton btCancel;
    public final MaterialButton btDeleteFilterEnd;
    public final MaterialButton btDeleteFilterStart;
    public final MaterialButton btEndDate;
    public final MaterialButton btSave;
    public final MaterialButton btStartDate;
    public final EditText etRollingValue;
    public final RadioButton rbOff;
    public final RadioButton rbRolling;
    public final RadioButton rbStatic;
    private final ConstraintLayout rootView;
    public final Spinner spRollingTimeframe;
    public final MaterialTextView tvHeader;
    public final TextView tvTimeframe;

    private FilterBinding(ConstraintLayout rootView, MaterialButton btCancel, MaterialButton btDeleteFilterEnd, MaterialButton btDeleteFilterStart, MaterialButton btEndDate, MaterialButton btSave, MaterialButton btStartDate, EditText etRollingValue, RadioButton rbOff, RadioButton rbRolling, RadioButton rbStatic, Spinner spRollingTimeframe, MaterialTextView tvHeader, TextView tvTimeframe) {
        this.rootView = rootView;
        this.btCancel = btCancel;
        this.btDeleteFilterEnd = btDeleteFilterEnd;
        this.btDeleteFilterStart = btDeleteFilterStart;
        this.btEndDate = btEndDate;
        this.btSave = btSave;
        this.btStartDate = btStartDate;
        this.etRollingValue = etRollingValue;
        this.rbOff = rbOff;
        this.rbRolling = rbRolling;
        this.rbStatic = rbStatic;
        this.spRollingTimeframe = spRollingTimeframe;
        this.tvHeader = tvHeader;
        this.tvTimeframe = tvTimeframe;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FilterBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FilterBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.filter, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FilterBinding bind(View rootView) {
        int i = R.id.btCancel;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(rootView, R.id.btCancel);
        if (materialButton != null) {
            i = R.id.btDeleteFilterEnd;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(rootView, R.id.btDeleteFilterEnd);
            if (materialButton2 != null) {
                i = R.id.btDeleteFilterStart;
                MaterialButton materialButton3 = (MaterialButton) ViewBindings.findChildViewById(rootView, R.id.btDeleteFilterStart);
                if (materialButton3 != null) {
                    i = R.id.btEndDate;
                    MaterialButton materialButton4 = (MaterialButton) ViewBindings.findChildViewById(rootView, R.id.btEndDate);
                    if (materialButton4 != null) {
                        i = R.id.btSave;
                        MaterialButton materialButton5 = (MaterialButton) ViewBindings.findChildViewById(rootView, R.id.btSave);
                        if (materialButton5 != null) {
                            i = R.id.btStartDate;
                            MaterialButton materialButton6 = (MaterialButton) ViewBindings.findChildViewById(rootView, R.id.btStartDate);
                            if (materialButton6 != null) {
                                i = R.id.etRollingValue;
                                EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.etRollingValue);
                                if (editText != null) {
                                    i = R.id.rbOff;
                                    RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(rootView, R.id.rbOff);
                                    if (radioButton != null) {
                                        i = R.id.rbRolling;
                                        RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(rootView, R.id.rbRolling);
                                        if (radioButton2 != null) {
                                            i = R.id.rbStatic;
                                            RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(rootView, R.id.rbStatic);
                                            if (radioButton3 != null) {
                                                i = R.id.spRollingTimeframe;
                                                Spinner spinner = (Spinner) ViewBindings.findChildViewById(rootView, R.id.spRollingTimeframe);
                                                if (spinner != null) {
                                                    i = R.id.tvHeader;
                                                    MaterialTextView materialTextView = (MaterialTextView) ViewBindings.findChildViewById(rootView, R.id.tvHeader);
                                                    if (materialTextView != null) {
                                                        i = R.id.tvTimeframe;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvTimeframe);
                                                        if (textView != null) {
                                                            return new FilterBinding((ConstraintLayout) rootView, materialButton, materialButton2, materialButton3, materialButton4, materialButton5, materialButton6, editText, radioButton, radioButton2, radioButton3, spinner, materialTextView, textView);
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
