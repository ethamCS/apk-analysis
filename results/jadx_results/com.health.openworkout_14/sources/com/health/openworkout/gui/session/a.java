package com.health.openworkout.gui.session;

import android.os.Bundle;
import java.util.HashMap;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private final HashMap f3463a = new HashMap();

    private a() {
    }

    public static a a(Bundle bundle) {
        a aVar = new a();
        bundle.setClassLoader(a.class.getClassLoader());
        if (bundle.containsKey("TrainingPlanId")) {
            aVar.f3463a.put("TrainingPlanId", Long.valueOf(bundle.getLong("TrainingPlanId")));
        } else {
            aVar.f3463a.put("TrainingPlanId", -1L);
        }
        if (bundle.containsKey("title")) {
            String string = bundle.getString("title");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
            }
            aVar.f3463a.put("title", string);
        } else {
            aVar.f3463a.put("title", "sessions");
        }
        return aVar;
    }

    public String b() {
        return (String) this.f3463a.get("title");
    }

    public long c() {
        return ((Long) this.f3463a.get("TrainingPlanId")).longValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f3463a.containsKey("TrainingPlanId") != aVar.f3463a.containsKey("TrainingPlanId") || c() != aVar.c() || this.f3463a.containsKey("title") != aVar.f3463a.containsKey("title")) {
            return false;
        }
        return b() == null ? aVar.b() == null : b().equals(aVar.b());
    }

    public int hashCode() {
        return ((((int) (c() ^ (c() >>> 32))) + 31) * 31) + (b() != null ? b().hashCode() : 0);
    }

    public String toString() {
        return "SessionFragmentArgs{TrainingPlanId=" + c() + ", title=" + b() + "}";
    }
}
