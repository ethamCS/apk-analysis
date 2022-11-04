package com.health.openworkout.gui.workout;

import android.os.Bundle;
import androidx.navigation.m;
import com.health.openworkout.R;
import com.health.openworkout.gui.datatypes.GenericSettingsFragment;
import java.util.HashMap;
/* loaded from: classes.dex */
public class c {

    /* loaded from: classes.dex */
    public static class b implements m {

        /* renamed from: a */
        private final HashMap f3534a;

        private b() {
            this.f3534a = new HashMap();
        }

        @Override // androidx.navigation.m
        public int a() {
            return R.id.action_WorkoutFragment_to_WorkoutDatabaseFragment;
        }

        @Override // androidx.navigation.m
        public Bundle b() {
            Bundle bundle = new Bundle();
            long j = -1;
            if (this.f3534a.containsKey("SessionWorkoutId")) {
                bundle.putLong("SessionWorkoutId", ((Long) this.f3534a.get("SessionWorkoutId")).longValue());
            } else {
                bundle.putLong("SessionWorkoutId", -1L);
            }
            if (this.f3534a.containsKey("WorkoutItemId")) {
                j = ((Long) this.f3534a.get("WorkoutItemId")).longValue();
            }
            bundle.putLong("WorkoutItemId", j);
            return bundle;
        }

        public long c() {
            return ((Long) this.f3534a.get("SessionWorkoutId")).longValue();
        }

        public long d() {
            return ((Long) this.f3534a.get("WorkoutItemId")).longValue();
        }

        public b e(long j) {
            this.f3534a.put("SessionWorkoutId", Long.valueOf(j));
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
            return this.f3534a.containsKey("SessionWorkoutId") == bVar.f3534a.containsKey("SessionWorkoutId") && c() == bVar.c() && this.f3534a.containsKey("WorkoutItemId") == bVar.f3534a.containsKey("WorkoutItemId") && d() == bVar.d() && a() == bVar.a();
        }

        public int hashCode() {
            return ((((((int) (c() ^ (c() >>> 32))) + 31) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + a();
        }

        public String toString() {
            return "ActionWorkoutFragmentToWorkoutDatabaseFragment(actionId=" + a() + "){SessionWorkoutId=" + c() + ", WorkoutItemId=" + d() + "}";
        }
    }

    /* renamed from: com.health.openworkout.gui.workout.c$c */
    /* loaded from: classes.dex */
    public static class C0097c implements m {

        /* renamed from: a */
        private final HashMap f3535a;

        private C0097c() {
            this.f3535a = new HashMap();
        }

        @Override // androidx.navigation.m
        public int a() {
            return R.id.action_WorkoutFragment_to_WorkoutSlideFragment;
        }

        @Override // androidx.navigation.m
        public Bundle b() {
            Bundle bundle = new Bundle();
            long j = -1;
            if (this.f3535a.containsKey("SessionWorkoutId")) {
                bundle.putLong("SessionWorkoutId", ((Long) this.f3535a.get("SessionWorkoutId")).longValue());
            } else {
                bundle.putLong("SessionWorkoutId", -1L);
            }
            if (this.f3535a.containsKey("WorkoutItemId")) {
                j = ((Long) this.f3535a.get("WorkoutItemId")).longValue();
            }
            bundle.putLong("WorkoutItemId", j);
            bundle.putString("title", this.f3535a.containsKey("title") ? (String) this.f3535a.get("title") : "workout slide");
            return bundle;
        }

        public long c() {
            return ((Long) this.f3535a.get("SessionWorkoutId")).longValue();
        }

        public String d() {
            return (String) this.f3535a.get("title");
        }

        public long e() {
            return ((Long) this.f3535a.get("WorkoutItemId")).longValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0097c.class != obj.getClass()) {
                return false;
            }
            C0097c c0097c = (C0097c) obj;
            if (this.f3535a.containsKey("SessionWorkoutId") != c0097c.f3535a.containsKey("SessionWorkoutId") || c() != c0097c.c() || this.f3535a.containsKey("WorkoutItemId") != c0097c.f3535a.containsKey("WorkoutItemId") || e() != c0097c.e() || this.f3535a.containsKey("title") != c0097c.f3535a.containsKey("title")) {
                return false;
            }
            if (d() == null ? c0097c.d() != null : !d().equals(c0097c.d())) {
                return false;
            }
            return a() == c0097c.a();
        }

        public C0097c f(long j) {
            this.f3535a.put("SessionWorkoutId", Long.valueOf(j));
            return this;
        }

        public C0097c g(String str) {
            if (str != null) {
                this.f3535a.put("title", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        }

        public C0097c h(long j) {
            this.f3535a.put("WorkoutItemId", Long.valueOf(j));
            return this;
        }

        public int hashCode() {
            return ((((((((int) (c() ^ (c() >>> 32))) + 31) * 31) + ((int) (e() ^ (e() >>> 32)))) * 31) + (d() != null ? d().hashCode() : 0)) * 31) + a();
        }

        public String toString() {
            return "ActionWorkoutFragmentToWorkoutSlideFragment(actionId=" + a() + "){SessionWorkoutId=" + c() + ", WorkoutItemId=" + e() + ", title=" + d() + "}";
        }
    }

    /* loaded from: classes.dex */
    public static class d implements m {

        /* renamed from: a */
        private final HashMap f3536a;

        private d() {
            this.f3536a = new HashMap();
        }

        @Override // androidx.navigation.m
        public int a() {
            return R.id.action_WorkoutFramgent_to_WorkoutSettingsFragment;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
        @Override // androidx.navigation.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.os.Bundle b() {
            /*
                r8 = this;
                java.lang.Class<com.health.openworkout.gui.datatypes.GenericSettingsFragment$SETTING_MODE> r0 = com.health.openworkout.gui.datatypes.GenericSettingsFragment.SETTING_MODE.class
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                java.util.HashMap r2 = r8.f3536a
                java.lang.String r3 = "SessionWorkoutId"
                boolean r2 = r2.containsKey(r3)
                r4 = -1
                if (r2 == 0) goto L23
                java.util.HashMap r2 = r8.f3536a
                java.lang.Object r2 = r2.get(r3)
                java.lang.Long r2 = (java.lang.Long) r2
                long r6 = r2.longValue()
                r1.putLong(r3, r6)
                goto L26
            L23:
                r1.putLong(r3, r4)
            L26:
                java.util.HashMap r2 = r8.f3536a
                java.lang.String r3 = "WorkoutItemId"
                boolean r2 = r2.containsKey(r3)
                if (r2 == 0) goto L3c
                java.util.HashMap r2 = r8.f3536a
                java.lang.Object r2 = r2.get(r3)
                java.lang.Long r2 = (java.lang.Long) r2
                long r4 = r2.longValue()
            L3c:
                r1.putLong(r3, r4)
                java.util.HashMap r2 = r8.f3536a
                java.lang.String r3 = "Mode"
                boolean r2 = r2.containsKey(r3)
                if (r2 == 0) goto L94
                java.util.HashMap r2 = r8.f3536a
                java.lang.Object r2 = r2.get(r3)
                com.health.openworkout.gui.datatypes.GenericSettingsFragment$SETTING_MODE r2 = (com.health.openworkout.gui.datatypes.GenericSettingsFragment.SETTING_MODE) r2
                java.lang.Class<android.os.Parcelable> r4 = android.os.Parcelable.class
                boolean r4 = r4.isAssignableFrom(r0)
                if (r4 != 0) goto L88
                if (r2 != 0) goto L5c
                goto L88
            L5c:
                java.lang.Class<java.io.Serializable> r4 = java.io.Serializable.class
                boolean r4 = r4.isAssignableFrom(r0)
                if (r4 == 0) goto L6d
                java.lang.Class<java.io.Serializable> r0 = java.io.Serializable.class
                java.lang.Object r0 = r0.cast(r2)
                java.io.Serializable r0 = (java.io.Serializable) r0
                goto L96
            L6d:
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r0 = r0.getName()
                r2.append(r0)
                java.lang.String r0 = " must implement Parcelable or Serializable or must be an Enum."
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L88:
                java.lang.Class<android.os.Parcelable> r0 = android.os.Parcelable.class
                java.lang.Object r0 = r0.cast(r2)
                android.os.Parcelable r0 = (android.os.Parcelable) r0
                r1.putParcelable(r3, r0)
                goto L99
            L94:
                com.health.openworkout.gui.datatypes.GenericSettingsFragment$SETTING_MODE r0 = com.health.openworkout.gui.datatypes.GenericSettingsFragment.SETTING_MODE.EDIT
            L96:
                r1.putSerializable(r3, r0)
            L99:
                java.util.HashMap r0 = r8.f3536a
                java.lang.String r2 = "title"
                boolean r0 = r0.containsKey(r2)
                if (r0 == 0) goto Lac
                java.util.HashMap r0 = r8.f3536a
                java.lang.Object r0 = r0.get(r2)
                java.lang.String r0 = (java.lang.String) r0
                goto Lae
            Lac:
                java.lang.String r0 = "Workout settings"
            Lae:
                r1.putString(r2, r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.health.openworkout.gui.workout.c.d.b():android.os.Bundle");
        }

        public GenericSettingsFragment.SETTING_MODE c() {
            return (GenericSettingsFragment.SETTING_MODE) this.f3536a.get("Mode");
        }

        public long d() {
            return ((Long) this.f3536a.get("SessionWorkoutId")).longValue();
        }

        public String e() {
            return (String) this.f3536a.get("title");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f3536a.containsKey("SessionWorkoutId") != dVar.f3536a.containsKey("SessionWorkoutId") || d() != dVar.d() || this.f3536a.containsKey("WorkoutItemId") != dVar.f3536a.containsKey("WorkoutItemId") || f() != dVar.f() || this.f3536a.containsKey("Mode") != dVar.f3536a.containsKey("Mode")) {
                return false;
            }
            if (c() == null ? dVar.c() != null : !c().equals(dVar.c())) {
                return false;
            }
            if (this.f3536a.containsKey("title") != dVar.f3536a.containsKey("title")) {
                return false;
            }
            if (e() == null ? dVar.e() != null : !e().equals(dVar.e())) {
                return false;
            }
            return a() == dVar.a();
        }

        public long f() {
            return ((Long) this.f3536a.get("WorkoutItemId")).longValue();
        }

        public d g(GenericSettingsFragment.SETTING_MODE setting_mode) {
            if (setting_mode != null) {
                this.f3536a.put("Mode", setting_mode);
                return this;
            }
            throw new IllegalArgumentException("Argument \"Mode\" is marked as non-null but was passed a null value.");
        }

        public d h(long j) {
            this.f3536a.put("SessionWorkoutId", Long.valueOf(j));
            return this;
        }

        public int hashCode() {
            int i = 0;
            int d2 = (((((((int) (d() ^ (d() >>> 32))) + 31) * 31) + ((int) (f() ^ (f() >>> 32)))) * 31) + (c() != null ? c().hashCode() : 0)) * 31;
            if (e() != null) {
                i = e().hashCode();
            }
            return ((d2 + i) * 31) + a();
        }

        public d i(String str) {
            if (str != null) {
                this.f3536a.put("title", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        }

        public d j(long j) {
            this.f3536a.put("WorkoutItemId", Long.valueOf(j));
            return this;
        }

        public String toString() {
            return "ActionWorkoutFramgentToWorkoutSettingsFragment(actionId=" + a() + "){SessionWorkoutId=" + d() + ", WorkoutItemId=" + f() + ", Mode=" + c() + ", title=" + e() + "}";
        }
    }

    public static b a() {
        return new b();
    }

    public static C0097c b() {
        return new C0097c();
    }

    public static d c() {
        return new d();
    }
}
