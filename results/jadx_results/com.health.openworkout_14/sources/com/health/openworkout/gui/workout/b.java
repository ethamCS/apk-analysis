package com.health.openworkout.gui.workout;

import android.os.Bundle;
import java.util.HashMap;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    private final HashMap f3533a = new HashMap();

    private b() {
    }

    public static b a(Bundle bundle) {
        b bVar = new b();
        bundle.setClassLoader(b.class.getClassLoader());
        if (bundle.containsKey("SessionWorkoutId")) {
            bVar.f3533a.put("SessionWorkoutId", Long.valueOf(bundle.getLong("SessionWorkoutId")));
        } else {
            bVar.f3533a.put("SessionWorkoutId", -1L);
        }
        if (bundle.containsKey("title")) {
            String string = bundle.getString("title");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
            }
            bVar.f3533a.put("title", string);
        } else {
            bVar.f3533a.put("title", "workout");
        }
        return bVar;
    }

    public long b() {
        return ((Long) this.f3533a.get("SessionWorkoutId")).longValue();
    }

    public String c() {
        return (String) this.f3533a.get("title");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f3533a.containsKey("SessionWorkoutId") != bVar.f3533a.containsKey("SessionWorkoutId") || b() != bVar.b() || this.f3533a.containsKey("title") != bVar.f3533a.containsKey("title")) {
            return false;
        }
        return c() == null ? bVar.c() == null : c().equals(bVar.c());
    }

    public int hashCode() {
        return ((((int) (b() ^ (b() >>> 32))) + 31) * 31) + (c() != null ? c().hashCode() : 0);
    }

    public String toString() {
        return "WorkoutFragmentArgs{SessionWorkoutId=" + b() + ", title=" + c() + "}";
    }
}
