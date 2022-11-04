package com.health.openworkout.gui.workout;

import android.os.Bundle;
import java.util.HashMap;
/* loaded from: classes.dex */
public class e {

    /* renamed from: a */
    private final HashMap f3538a = new HashMap();

    private e() {
    }

    public static e a(Bundle bundle) {
        e eVar = new e();
        bundle.setClassLoader(e.class.getClassLoader());
        if (bundle.containsKey("SessionWorkoutId")) {
            eVar.f3538a.put("SessionWorkoutId", Long.valueOf(bundle.getLong("SessionWorkoutId")));
        } else {
            eVar.f3538a.put("SessionWorkoutId", -1L);
        }
        if (bundle.containsKey("WorkoutItemId")) {
            eVar.f3538a.put("WorkoutItemId", Long.valueOf(bundle.getLong("WorkoutItemId")));
        } else {
            eVar.f3538a.put("WorkoutItemId", -1L);
        }
        if (bundle.containsKey("title")) {
            String string = bundle.getString("title");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
            }
            eVar.f3538a.put("title", string);
        } else {
            eVar.f3538a.put("title", "workout slide");
        }
        return eVar;
    }

    public long b() {
        return ((Long) this.f3538a.get("SessionWorkoutId")).longValue();
    }

    public String c() {
        return (String) this.f3538a.get("title");
    }

    public long d() {
        return ((Long) this.f3538a.get("WorkoutItemId")).longValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f3538a.containsKey("SessionWorkoutId") != eVar.f3538a.containsKey("SessionWorkoutId") || b() != eVar.b() || this.f3538a.containsKey("WorkoutItemId") != eVar.f3538a.containsKey("WorkoutItemId") || d() != eVar.d() || this.f3538a.containsKey("title") != eVar.f3538a.containsKey("title")) {
            return false;
        }
        return c() == null ? eVar.c() == null : c().equals(eVar.c());
    }

    public int hashCode() {
        return ((((((int) (b() ^ (b() >>> 32))) + 31) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + (c() != null ? c().hashCode() : 0);
    }

    public String toString() {
        return "WorkoutSlideFragmentArgs{SessionWorkoutId=" + b() + ", WorkoutItemId=" + d() + ", title=" + c() + "}";
    }
}
