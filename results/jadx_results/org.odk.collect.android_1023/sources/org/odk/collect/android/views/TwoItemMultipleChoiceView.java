package org.odk.collect.android.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.RelativeLayout;
import org.odk.collect.android.R;
/* loaded from: classes.dex */
public class TwoItemMultipleChoiceView extends RelativeLayout implements Checkable {
    public TwoItemMultipleChoiceView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public TwoItemMultipleChoiceView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TwoItemMultipleChoiceView(Context context) {
        super(context);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        CheckBox c = (CheckBox) findViewById(R.id.checkbox);
        return c.isChecked();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        CheckBox c = (CheckBox) findViewById(R.id.checkbox);
        c.setChecked(checked);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        CheckBox c = (CheckBox) findViewById(R.id.checkbox);
        c.setChecked(!c.isChecked());
    }
}
