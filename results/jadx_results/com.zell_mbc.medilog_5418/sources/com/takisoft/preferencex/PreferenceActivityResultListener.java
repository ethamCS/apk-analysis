package com.takisoft.preferencex;

import android.content.Intent;
import androidx.preference.Preference;
/* loaded from: classes2.dex */
public interface PreferenceActivityResultListener {
    void onActivityResult(int i, int i2, Intent intent);

    void onPreferenceClick(PreferenceFragmentCompat preferenceFragmentCompat, Preference preference);
}
