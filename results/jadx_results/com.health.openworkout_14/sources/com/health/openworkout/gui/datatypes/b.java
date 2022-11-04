package com.health.openworkout.gui.datatypes;

import android.os.Bundle;
import java.util.HashMap;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    private final HashMap f3442a = new HashMap();

    private b() {
    }

    public static b a(Bundle bundle) {
        HashMap hashMap;
        long j;
        b bVar = new b();
        bundle.setClassLoader(b.class.getClassLoader());
        if (bundle.containsKey("SessionWorkoutId")) {
            j = bundle.getLong("SessionWorkoutId");
            hashMap = bVar.f3442a;
        } else {
            hashMap = bVar.f3442a;
            j = -1;
        }
        hashMap.put("SessionWorkoutId", Long.valueOf(j));
        return bVar;
    }

    public long b() {
        return ((Long) this.f3442a.get("SessionWorkoutId")).longValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3442a.containsKey("SessionWorkoutId") == bVar.f3442a.containsKey("SessionWorkoutId") && b() == bVar.b();
    }

    public int hashCode() {
        return 31 + ((int) (b() ^ (b() >>> 32)));
    }

    public String toString() {
        return "TrophyFragmentArgs{SessionWorkoutId=" + b() + "}";
    }
}
