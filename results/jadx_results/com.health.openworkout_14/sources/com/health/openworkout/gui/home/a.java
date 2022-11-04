package com.health.openworkout.gui.home;

import android.os.Bundle;
import androidx.navigation.m;
import com.health.openworkout.R;
import java.util.HashMap;
/* loaded from: classes.dex */
public class a {

    /* loaded from: classes.dex */
    public static class b implements m {

        /* renamed from: a */
        private final HashMap f3449a;

        private b() {
            this.f3449a = new HashMap();
        }

        @Override // androidx.navigation.m
        public int a() {
            return R.id.action_HomeFragment_to_WorkoutFragmentSlide;
        }

        @Override // androidx.navigation.m
        public Bundle b() {
            Bundle bundle = new Bundle();
            long j = -1;
            if (this.f3449a.containsKey("SessionWorkoutId")) {
                bundle.putLong("SessionWorkoutId", ((Long) this.f3449a.get("SessionWorkoutId")).longValue());
            } else {
                bundle.putLong("SessionWorkoutId", -1L);
            }
            if (this.f3449a.containsKey("WorkoutItemId")) {
                j = ((Long) this.f3449a.get("WorkoutItemId")).longValue();
            }
            bundle.putLong("WorkoutItemId", j);
            bundle.putString("title", this.f3449a.containsKey("title") ? (String) this.f3449a.get("title") : "workout slide");
            return bundle;
        }

        public long c() {
            return ((Long) this.f3449a.get("SessionWorkoutId")).longValue();
        }

        public String d() {
            return (String) this.f3449a.get("title");
        }

        public long e() {
            return ((Long) this.f3449a.get("WorkoutItemId")).longValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f3449a.containsKey("SessionWorkoutId") != bVar.f3449a.containsKey("SessionWorkoutId") || c() != bVar.c() || this.f3449a.containsKey("WorkoutItemId") != bVar.f3449a.containsKey("WorkoutItemId") || e() != bVar.e() || this.f3449a.containsKey("title") != bVar.f3449a.containsKey("title")) {
                return false;
            }
            if (d() == null ? bVar.d() != null : !d().equals(bVar.d())) {
                return false;
            }
            return a() == bVar.a();
        }

        public b f(long j) {
            this.f3449a.put("SessionWorkoutId", Long.valueOf(j));
            return this;
        }

        public b g(String str) {
            if (str != null) {
                this.f3449a.put("title", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        }

        public int hashCode() {
            return ((((((((int) (c() ^ (c() >>> 32))) + 31) * 31) + ((int) (e() ^ (e() >>> 32)))) * 31) + (d() != null ? d().hashCode() : 0)) * 31) + a();
        }

        public String toString() {
            return "ActionHomeFragmentToWorkoutFragmentSlide(actionId=" + a() + "){SessionWorkoutId=" + c() + ", WorkoutItemId=" + e() + ", title=" + d() + "}";
        }
    }

    public static m a() {
        return new androidx.navigation.a(R.id.action_HomeFragment_to_TrainingFragment);
    }

    public static b b() {
        return new b();
    }
}
