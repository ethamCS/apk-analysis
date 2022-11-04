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
public class FileManagerTabs extends TabActivity {
    private static final String DATA_TAB = "data_tab";
    private static final String FORMS_TAB = "forms_tab";
    private TextView mTVDF;
    private TextView mTVFF;

    @Override // android.app.ActivityGroup, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getString(R.string.app_name) + " > " + getString(R.string.manage_files));
        TabHost tabHost = getTabHost();
        tabHost.setBackgroundColor(-1);
        tabHost.getTabWidget().setBackgroundColor(-16777216);
        Intent remote = new Intent(this, DataManagerList.class);
        tabHost.addTab(tabHost.newTabSpec(DATA_TAB).setIndicator(getString(R.string.data)).setContent(remote));
        Intent local = new Intent(this, FormManagerList.class);
        tabHost.addTab(tabHost.newTabSpec(FORMS_TAB).setIndicator(getString(R.string.forms)).setContent(local));
        LinearLayout ll = (LinearLayout) tabHost.getChildAt(0);
        TabWidget tw = (TabWidget) ll.getChildAt(0);
        int fontsize = Collect.getQuestionFontsize();
        RelativeLayout rllf = (RelativeLayout) tw.getChildAt(0);
        this.mTVFF = (TextView) rllf.getChildAt(1);
        this.mTVFF.setTextSize(fontsize);
        this.mTVFF.setPadding(0, 0, 0, 6);
        RelativeLayout rlrf = (RelativeLayout) tw.getChildAt(1);
        this.mTVDF = (TextView) rlrf.getChildAt(1);
        this.mTVDF.setTextSize(fontsize);
        this.mTVDF.setPadding(0, 0, 0, 6);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        Collect.getInstance().getActivityLogger().logOnStart(this);
    }

    @Override // android.app.ActivityGroup, android.app.Activity
    protected void onStop() {
        Collect.getInstance().getActivityLogger().logOnStop(this);
        super.onStop();
    }
}
