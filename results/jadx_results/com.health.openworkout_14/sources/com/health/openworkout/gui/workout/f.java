package com.health.openworkout.gui.workout;

import android.os.Bundle;
import androidx.navigation.m;
import com.health.openworkout.R;
import java.util.HashMap;
/* loaded from: classes.dex */
public class f {

    /* loaded from: classes.dex */
    public static class b implements m {

        /* renamed from: a */
        private final HashMap f3539a;

        private b() {
            this.f3539a = new HashMap();
        }

        @Override // androidx.navigation.m
        public int a() {
            return R.id.action_nav_WorkoutSlideFragment_to_TrophyFragment;
        }

        @Override // androidx.navigation.m
        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putLong("SessionWorkoutId", this.f3539a.containsKey("SessionWorkoutId") ? ((Long) this.f3539a.get("SessionWorkoutId")).longValue() : -1L);
            return bundle;
        }

        public long c() {
            return ((Long) this.f3539a.get("SessionWorkoutId")).longValue();
        }

        public b d(long j) {
            this.f3539a.put("SessionWorkoutId", Long.valueOf(j));
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f3539a.containsKey("SessionWorkoutId") == bVar.f3539a.containsKey("SessionWorkoutId") && c() == bVar.c() && a() == bVar.a();
        }

        public int hashCode() {
            return ((((int) (c() ^ (c() >>> 32))) + 31) * 31) + a();
        }

        public String toString() {
            return "ActionNavWorkoutSlideFragmentToTrophyFragment(actionId=" + a() + "){SessionWorkoutId=" + c() + "}";
        }
    }

    public static b a() {
        return new b();
    }
}
