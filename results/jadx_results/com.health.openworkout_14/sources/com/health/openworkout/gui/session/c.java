package com.health.openworkout.gui.session;

import android.os.Bundle;
import android.os.Parcelable;
import com.health.openworkout.gui.datatypes.GenericSettingsFragment;
import java.io.Serializable;
import java.util.HashMap;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a */
    private final HashMap f3466a = new HashMap();

    private c() {
    }

    public static c a(Bundle bundle) {
        c cVar = new c();
        bundle.setClassLoader(c.class.getClassLoader());
        if (bundle.containsKey("TrainingPlanId")) {
            cVar.f3466a.put("TrainingPlanId", Long.valueOf(bundle.getLong("TrainingPlanId")));
        } else {
            cVar.f3466a.put("TrainingPlanId", -1L);
        }
        if (bundle.containsKey("WorkoutSessionId")) {
            cVar.f3466a.put("WorkoutSessionId", Long.valueOf(bundle.getLong("WorkoutSessionId")));
        } else {
            cVar.f3466a.put("WorkoutSessionId", -1L);
        }
        if (!bundle.containsKey("Mode")) {
            cVar.f3466a.put("Mode", GenericSettingsFragment.SETTING_MODE.EDIT);
        } else if (!Parcelable.class.isAssignableFrom(GenericSettingsFragment.SETTING_MODE.class) && !Serializable.class.isAssignableFrom(GenericSettingsFragment.SETTING_MODE.class)) {
            throw new UnsupportedOperationException(GenericSettingsFragment.SETTING_MODE.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        } else {
            GenericSettingsFragment.SETTING_MODE setting_mode = (GenericSettingsFragment.SETTING_MODE) bundle.get("Mode");
            if (setting_mode == null) {
                throw new IllegalArgumentException("Argument \"Mode\" is marked as non-null but was passed a null value.");
            }
            cVar.f3466a.put("Mode", setting_mode);
        }
        if (bundle.containsKey("title")) {
            String string = bundle.getString("title");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
            }
            cVar.f3466a.put("title", string);
        } else {
            cVar.f3466a.put("title", "session settings");
        }
        return cVar;
    }

    public GenericSettingsFragment.SETTING_MODE b() {
        return (GenericSettingsFragment.SETTING_MODE) this.f3466a.get("Mode");
    }

    public String c() {
        return (String) this.f3466a.get("title");
    }

    public long d() {
        return ((Long) this.f3466a.get("TrainingPlanId")).longValue();
    }

    public long e() {
        return ((Long) this.f3466a.get("WorkoutSessionId")).longValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3466a.containsKey("TrainingPlanId") != cVar.f3466a.containsKey("TrainingPlanId") || d() != cVar.d() || this.f3466a.containsKey("WorkoutSessionId") != cVar.f3466a.containsKey("WorkoutSessionId") || e() != cVar.e() || this.f3466a.containsKey("Mode") != cVar.f3466a.containsKey("Mode")) {
            return false;
        }
        if (b() == null ? cVar.b() != null : !b().equals(cVar.b())) {
            return false;
        }
        if (this.f3466a.containsKey("title") != cVar.f3466a.containsKey("title")) {
            return false;
        }
        return c() == null ? cVar.c() == null : c().equals(cVar.c());
    }

    public int hashCode() {
        int i = 0;
        int d2 = (((((((int) (d() ^ (d() >>> 32))) + 31) * 31) + ((int) (e() ^ (e() >>> 32)))) * 31) + (b() != null ? b().hashCode() : 0)) * 31;
        if (c() != null) {
            i = c().hashCode();
        }
        return d2 + i;
    }

    public String toString() {
        return "SessionSettingsFragmentArgs{TrainingPlanId=" + d() + ", WorkoutSessionId=" + e() + ", Mode=" + b() + ", title=" + c() + "}";
    }
}
