package com.health.openworkout.core.alarm;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.health.openworkout.R;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    private Set<a> f3380a;

    /* renamed from: b */
    private String f3381b;

    private b(Set<a> set, String str) {
        this.f3380a = set;
        this.f3381b = str;
    }

    public static b a(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Set<String> stringSet = defaultSharedPreferences.getStringSet("reminderDays", new HashSet());
        Long valueOf = Long.valueOf(defaultSharedPreferences.getLong("reminderTime", System.currentTimeMillis()));
        String string = defaultSharedPreferences.getString("reminderNotifyText", context.getResources().getString(R.string.preference_reminder_default_text));
        TreeSet treeSet = new TreeSet();
        for (String str : stringSet) {
            treeSet.add(b(str, valueOf));
        }
        return new b(treeSet, string);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static a b(String str, Long l) {
        char c2;
        switch (str.hashCode()) {
            case -2049557543:
                if (str.equals("Saturday")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1984635600:
                if (str.equals("Monday")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1807319568:
                if (str.equals("Sunday")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -897468618:
                if (str.equals("Wednesday")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 687309357:
                if (str.equals("Tuesday")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1636699642:
                if (str.equals("Thursday")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 2112549247:
                if (str.equals("Friday")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        return c2 != 0 ? c2 != 1 ? c2 != 2 ? c2 != 3 ? c2 != 4 ? c2 != 5 ? new a(1, l.longValue()) : new a(7, l.longValue()) : new a(6, l.longValue()) : new a(5, l.longValue()) : new a(4, l.longValue()) : new a(3, l.longValue()) : new a(2, l.longValue());
    }

    public Set<a> c() {
        return this.f3380a;
    }

    public String d() {
        return this.f3381b;
    }
}
