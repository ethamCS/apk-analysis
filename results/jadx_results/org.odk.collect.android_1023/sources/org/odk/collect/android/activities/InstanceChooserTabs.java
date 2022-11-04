package org.odk.collect.android.activities;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;
import org.odk.collect.android.R;
import org.odk.collect.android.application.Collect;
/* loaded from: classes.dex */
public class InstanceChooserTabs extends TabActivity {
    private static final String COMPLETED_TAB = "completed_tab";
    private static final String SAVED_TAB = "saved_tab";
    private int mCompletedCount;
    private int mSavedCount;

    @Override // android.app.ActivityGroup, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getString(R.string.app_name) + " > " + getString(R.string.review_data));
        TabHost tabHost = getTabHost();
        tabHost.setBackgroundColor(-1);
        tabHost.getTabWidget().setBackgroundColor(-16777216);
        Intent saved = new Intent(this, InstanceChooserList.class);
        tabHost.addTab(tabHost.newTabSpec(SAVED_TAB).setIndicator(getString(R.string.saved_data, new Object[]{Integer.valueOf(this.mSavedCount)})).setContent(saved));
        Intent completed = new Intent(this, InstanceChooserList.class);
        tabHost.addTab(tabHost.newTabSpec(COMPLETED_TAB).setIndicator(getString(R.string.completed_data, new Object[]{Integer.valueOf(this.mCompletedCount)})).setContent(completed));
        LinearLayout ll = (LinearLayout) tabHost.getChildAt(0);
        TabWidget tw = (TabWidget) ll.getChildAt(0);
        int fontsize = Collect.getQuestionFontsize();
        RelativeLayout rls = (RelativeLayout) tw.getChildAt(0);
        TextView tvs = (TextView) rls.getChildAt(1);
        tvs.setTextSize(fontsize);
        tvs.setPadding(0, 0, 0, 6);
        RelativeLayout rlc = (RelativeLayout) tw.getChildAt(1);
        TextView tvc = (TextView) rlc.getChildAt(1);
        tvc.setTextSize(fontsize);
        tvc.setPadding(0, 0, 0, 6);
        if (this.mSavedCount >= this.mCompletedCount) {
            getTabHost().setCurrentTabByTag(SAVED_TAB);
        } else {
            getTabHost().setCurrentTabByTag(COMPLETED_TAB);
        }
    }
}
