package com.health.openworkout.gui.workout;

import android.os.Bundle;
import android.os.Parcelable;
import com.health.openworkout.gui.datatypes.GenericSettingsFragment;
import java.io.Serializable;
import java.util.HashMap;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a */
    private final HashMap f3537a = new HashMap();

    private d() {
    }

    public static d a(Bundle bundle) {
        d dVar = new d();
        bundle.setClassLoader(d.class.getClassLoader());
        if (bundle.containsKey("SessionWorkoutId")) {
            dVar.f3537a.put("SessionWorkoutId", Long.valueOf(bundle.getLong("SessionWorkoutId")));
        } else {
            dVar.f3537a.put("SessionWorkoutId", -1L);
        }
        if (bundle.containsKey("WorkoutItemId")) {
            dVar.f3537a.put("WorkoutItemId", Long.valueOf(bundle.getLong("WorkoutItemId")));
        } else {
            dVar.f3537a.put("WorkoutItemId", -1L);
        }
        if (!bundle.containsKey("Mode")) {
            dVar.f3537a.put("Mode", GenericSettingsFragment.SETTING_MODE.EDIT);
        } else if (!Parcelable.class.isAssignableFrom(GenericSettingsFragment.SETTING_MODE.class) && !Serializable.class.isAssignableFrom(GenericSettingsFragment.SETTING_MODE.class)) {
            throw new UnsupportedOperationException(GenericSettingsFragment.SETTING_MODE.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        } else {
            GenericSettingsFragment.SETTING_MODE setting_mode = (GenericSettingsFragment.SETTING_MODE) bundle.get("Mode");
            if (setting_mode == null) {
                throw new IllegalArgumentException("Argument \"Mode\" is marked as non-null but was passed a null value.");
            }
            dVar.f3537a.put("Mode", setting_mode);
        }
        if (bundle.containsKey("title")) {
            String string = bundle.getString("title");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
            }
            dVar.f3537a.put("title", string);
        } else {
            dVar.f3537a.put("title", "Workout settings");
        }
        return dVar;
    }

    public GenericSettingsFragment.SETTING_MODE b() {
        return (GenericSettingsFragment.SETTING_MODE) this.f3537a.get("Mode");
    }

    public long c() {
        return ((Long) this.f3537a.get("SessionWorkoutId")).longValue();
    }

    public String d() {
        return (String) this.f3537a.get("title");
    }

    public long e() {
        return ((Long) this.f3537a.get("WorkoutItemId")).longValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f3537a.containsKey("SessionWorkoutId") != dVar.f3537a.containsKey("SessionWorkoutId") || c() != dVar.c() || this.f3537a.containsKey("WorkoutItemId") != dVar.f3537a.containsKey("WorkoutItemId") || e() != dVar.e() || this.f3537a.containsKey("Mode") != dVar.f3537a.containsKey("Mode")) {
            return false;
        }
        if (b() == null ? dVar.b() != null : !b().equals(dVar.b())) {
            return false;
        }
        if (this.f3537a.containsKey("title") != dVar.f3537a.containsKey("title")) {
            return false;
        }
        return d() == null ? dVar.d() == null : d().equals(dVar.d());
    }

    public int hashCode() {
        int i = 0;
        int c2 = (((((((int) (c() ^ (c() >>> 32))) + 31) * 31) + ((int) (e() ^ (e() >>> 32)))) * 31) + (b() != null ? b().hashCode() : 0)) * 31;
        if (d() != null) {
            i = d().hashCode();
        }
        return c2 + i;
    }

    public String toString() {
        return "WorkoutSettingsFragmentArgs{SessionWorkoutId=" + c() + ", WorkoutItemId=" + e() + ", Mode=" + b() + ", title=" + d() + "}";
    }
}
