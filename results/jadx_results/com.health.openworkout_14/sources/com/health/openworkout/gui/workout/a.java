package com.health.openworkout.gui.workout;

import androidx.navigation.m;
import com.health.openworkout.R;
import com.health.openworkout.gui.datatypes.GenericSettingsFragment;
import java.util.HashMap;
/* loaded from: classes.dex */
public class a {

    /* loaded from: classes.dex */
    public static class b implements m {

        /* renamed from: a */
        private final HashMap f3532a;

        private b() {
            this.f3532a = new HashMap();
        }

        @Override // androidx.navigation.m
        public int a() {
            return R.id.action_WorkoutDatabaseFragment_to_WorkoutSettingsFragment;
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
                java.util.HashMap r2 = r8.f3532a
                java.lang.String r3 = "SessionWorkoutId"
                boolean r2 = r2.containsKey(r3)
                r4 = -1
                if (r2 == 0) goto L23
                java.util.HashMap r2 = r8.f3532a
                java.lang.Object r2 = r2.get(r3)
                java.lang.Long r2 = (java.lang.Long) r2
                long r6 = r2.longValue()
                r1.putLong(r3, r6)
                goto L26
            L23:
                r1.putLong(r3, r4)
            L26:
                java.util.HashMap r2 = r8.f3532a
                java.lang.String r3 = "WorkoutItemId"
                boolean r2 = r2.containsKey(r3)
                if (r2 == 0) goto L3c
                java.util.HashMap r2 = r8.f3532a
                java.lang.Object r2 = r2.get(r3)
                java.lang.Long r2 = (java.lang.Long) r2
                long r4 = r2.longValue()
            L3c:
                r1.putLong(r3, r4)
                java.util.HashMap r2 = r8.f3532a
                java.lang.String r3 = "Mode"
                boolean r2 = r2.containsKey(r3)
                if (r2 == 0) goto L94
                java.util.HashMap r2 = r8.f3532a
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
                java.util.HashMap r0 = r8.f3532a
                java.lang.String r2 = "title"
                boolean r0 = r0.containsKey(r2)
                if (r0 == 0) goto Lac
                java.util.HashMap r0 = r8.f3532a
                java.lang.Object r0 = r0.get(r2)
                java.lang.String r0 = (java.lang.String) r0
                goto Lae
            Lac:
                java.lang.String r0 = "Workout settings"
            Lae:
                r1.putString(r2, r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.health.openworkout.gui.workout.a.b.b():android.os.Bundle");
        }

        public GenericSettingsFragment.SETTING_MODE c() {
            return (GenericSettingsFragment.SETTING_MODE) this.f3532a.get("Mode");
        }

        public long d() {
            return ((Long) this.f3532a.get("SessionWorkoutId")).longValue();
        }

        public String e() {
            return (String) this.f3532a.get("title");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f3532a.containsKey("SessionWorkoutId") != bVar.f3532a.containsKey("SessionWorkoutId") || d() != bVar.d() || this.f3532a.containsKey("WorkoutItemId") != bVar.f3532a.containsKey("WorkoutItemId") || f() != bVar.f() || this.f3532a.containsKey("Mode") != bVar.f3532a.containsKey("Mode")) {
                return false;
            }
            if (c() == null ? bVar.c() != null : !c().equals(bVar.c())) {
                return false;
            }
            if (this.f3532a.containsKey("title") != bVar.f3532a.containsKey("title")) {
                return false;
            }
            if (e() == null ? bVar.e() != null : !e().equals(bVar.e())) {
                return false;
            }
            return a() == bVar.a();
        }

        public long f() {
            return ((Long) this.f3532a.get("WorkoutItemId")).longValue();
        }

        public b g(GenericSettingsFragment.SETTING_MODE setting_mode) {
            if (setting_mode != null) {
                this.f3532a.put("Mode", setting_mode);
                return this;
            }
            throw new IllegalArgumentException("Argument \"Mode\" is marked as non-null but was passed a null value.");
        }

        public b h(long j) {
            this.f3532a.put("SessionWorkoutId", Long.valueOf(j));
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

        public b i(String str) {
            if (str != null) {
                this.f3532a.put("title", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        }

        public b j(long j) {
            this.f3532a.put("WorkoutItemId", Long.valueOf(j));
            return this;
        }

        public String toString() {
            return "ActionWorkoutDatabaseFragmentToWorkoutSettingsFragment(actionId=" + a() + "){SessionWorkoutId=" + d() + ", WorkoutItemId=" + f() + ", Mode=" + c() + ", title=" + e() + "}";
        }
    }

    public static b a() {
        return new b();
    }
}
