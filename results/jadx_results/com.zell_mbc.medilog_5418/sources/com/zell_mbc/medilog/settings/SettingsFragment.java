package com.zell_mbc.medilog.settings;

import android.os.Bundle;
import com.takisoft.preferencex.PreferenceFragmentCompat;
import com.zell_mbc.medilog.R;
import kotlin.Metadata;
/* compiled from: SettingsFragment.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/zell_mbc/medilog/settings/SettingsFragment;", "Lcom/takisoft/preferencex/PreferenceFragmentCompat;", "()V", "onCreatePreferencesFix", "", "savedInstanceState", "Landroid/os/Bundle;", "rootKey", "", "app_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SettingsFragment extends PreferenceFragmentCompat {
    public static final int $stable = 0;

    @Override // com.takisoft.preferencex.PreferenceFragmentCompat
    public void onCreatePreferencesFix(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.preferences, str);
    }
}
