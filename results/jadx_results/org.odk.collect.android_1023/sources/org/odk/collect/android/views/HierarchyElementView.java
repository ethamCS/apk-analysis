package org.odk.collect.android.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.odk.collect.android.logic.HierarchyElement;
/* loaded from: classes.dex */
public class HierarchyElementView extends RelativeLayout {
    private ImageView mIcon;
    private TextView mPrimaryTextView;
    private TextView mSecondaryTextView;

    public HierarchyElementView(Context context, HierarchyElement it) {
        super(context);
        setColor(it.getColor());
        this.mIcon = new ImageView(context);
        this.mIcon.setImageDrawable(it.getIcon());
        this.mIcon.setId(1);
        this.mIcon.setPadding(0, 0, dipToPx(4), 0);
        addView(this.mIcon, new RelativeLayout.LayoutParams(-2, -2));
        this.mPrimaryTextView = new TextView(context);
        this.mPrimaryTextView.setTextAppearance(context, 16973890);
        this.mPrimaryTextView.setText(it.getPrimaryText());
        this.mPrimaryTextView.setId(2);
        this.mPrimaryTextView.setGravity(16);
        RelativeLayout.LayoutParams l = new RelativeLayout.LayoutParams(-2, -2);
        l.addRule(1, this.mIcon.getId());
        addView(this.mPrimaryTextView, l);
        this.mSecondaryTextView = new TextView(context);
        this.mSecondaryTextView.setText(it.getSecondaryText());
        this.mSecondaryTextView.setTextAppearance(context, 16973894);
        this.mSecondaryTextView.setGravity(16);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(-2, -2);
        lp.addRule(3, this.mPrimaryTextView.getId());
        lp.addRule(1, this.mIcon.getId());
        addView(this.mSecondaryTextView, lp);
        setPadding(dipToPx(8), dipToPx(4), dipToPx(8), dipToPx(8));
    }

    public void setPrimaryText(String text) {
        this.mPrimaryTextView.setText(text);
    }

    public void setSecondaryText(String text) {
        this.mSecondaryTextView.setText(text);
    }

    public void setIcon(Drawable icon) {
        this.mIcon.setImageDrawable(icon);
    }

    public void setColor(int color) {
        setBackgroundColor(color);
    }

    public void showSecondary(boolean bool) {
        if (bool) {
            this.mSecondaryTextView.setVisibility(0);
            setMinimumHeight(dipToPx(64));
            return;
        }
        this.mSecondaryTextView.setVisibility(8);
        setMinimumHeight(dipToPx(32));
    }

    public int dipToPx(int dip) {
        return (int) ((dip * getResources().getDisplayMetrics().density) + 0.5f);
    }
}
