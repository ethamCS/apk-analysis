package com.health.openworkout.gui.session;

import android.os.Bundle;
import androidx.navigation.m;
import com.health.openworkout.R;
import com.health.openworkout.gui.datatypes.GenericSettingsFragment;
import java.util.HashMap;
/* loaded from: classes.dex */
public class b {

    /* renamed from: com.health.openworkout.gui.session.b$b */
    /* loaded from: classes.dex */
    public static class C0090b implements m {

        /* renamed from: a */
        private final HashMap f3464a;

        private C0090b() {
            this.f3464a = new HashMap();
        }

        @Override // androidx.navigation.m
        public int a() {
            return R.id.action_SessionFragment_to_WorkoutFragment;
        }

        @Override // androidx.navigation.m
        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putLong("SessionWorkoutId", this.f3464a.containsKey("SessionWorkoutId") ? ((Long) this.f3464a.get("SessionWorkoutId")).longValue() : -1L);
            bundle.putString("title", this.f3464a.containsKey("title") ? (String) this.f3464a.get("title") : "workout");
            return bundle;
        }

        public long c() {
            return ((Long) this.f3464a.get("SessionWorkoutId")).longValue();
        }

        public String d() {
            return (String) this.f3464a.get("title");
        }

        public C0090b e(long j) {
            this.f3464a.put("SessionWorkoutId", Long.valueOf(j));
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0090b.class != obj.getClass()) {
                return false;
            }
            C0090b c0090b = (C0090b) obj;
            if (this.f3464a.containsKey("SessionWorkoutId") != c0090b.f3464a.containsKey("SessionWorkoutId") || c() != c0090b.c() || this.f3464a.containsKey("title") != c0090b.f3464a.containsKey("title")) {
                return false;
            }
            if (d() == null ? c0090b.d() != null : !d().equals(c0090b.d())) {
                return false;
            }
            return a() == c0090b.a();
        }

        public C0090b f(String str) {
            if (str != null) {
                this.f3464a.put("title", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        }

        public int hashCode() {
            return ((((((int) (c() ^ (c() >>> 32))) + 31) * 31) + (d() != null ? d().hashCode() : 0)) * 31) + a();
        }

        public String toString() {
            return "ActionSessionFragmentToWorkoutFragment(actionId=" + a() + "){SessionWorkoutId=" + c() + ", title=" + d() + "}";
        }
    }

    /* loaded from: classes.dex */
    public static class c implements m {

        /* renamed from: a */
        private final HashMap f3465a;

        private c() {
            this.f3465a = new HashMap();
        }

        @Override // androidx.navigation.m
        public int a() {
            return R.id.action_SessionsFragment_to_SessionSettingsFragment;
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
                java.util.HashMap r2 = r8.f3465a
                java.lang.String r3 = "TrainingPlanId"
                boolean r2 = r2.containsKey(r3)
                r4 = -1
                if (r2 == 0) goto L23
                java.util.HashMap r2 = r8.f3465a
                java.lang.Object r2 = r2.get(r3)
                java.lang.Long r2 = (java.lang.Long) r2
                long r6 = r2.longValue()
                r1.putLong(r3, r6)
                goto L26
            L23:
                r1.putLong(r3, r4)
            L26:
                java.util.HashMap r2 = r8.f3465a
                java.lang.String r3 = "WorkoutSessionId"
                boolean r2 = r2.containsKey(r3)
                if (r2 == 0) goto L3c
                java.util.HashMap r2 = r8.f3465a
                java.lang.Object r2 = r2.get(r3)
                java.lang.Long r2 = (java.lang.Long) r2
                long r4 = r2.longValue()
            L3c:
                r1.putLong(r3, r4)
                java.util.HashMap r2 = r8.f3465a
                java.lang.String r3 = "Mode"
                boolean r2 = r2.containsKey(r3)
                if (r2 == 0) goto L94
                java.util.HashMap r2 = r8.f3465a
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
                java.util.HashMap r0 = r8.f3465a
                java.lang.String r2 = "title"
                boolean r0 = r0.containsKey(r2)
                if (r0 == 0) goto Lac
                java.util.HashMap r0 = r8.f3465a
                java.lang.Object r0 = r0.get(r2)
                java.lang.String r0 = (java.lang.String) r0
                goto Lae
            Lac:
                java.lang.String r0 = "session settings"
            Lae:
                r1.putString(r2, r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.health.openworkout.gui.session.b.c.b():android.os.Bundle");
        }

        public GenericSettingsFragment.SETTING_MODE c() {
            return (GenericSettingsFragment.SETTING_MODE) this.f3465a.get("Mode");
        }

        public String d() {
            return (String) this.f3465a.get("title");
        }

        public long e() {
            return ((Long) this.f3465a.get("TrainingPlanId")).longValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f3465a.containsKey("TrainingPlanId") != cVar.f3465a.containsKey("TrainingPlanId") || e() != cVar.e() || this.f3465a.containsKey("WorkoutSessionId") != cVar.f3465a.containsKey("WorkoutSessionId") || f() != cVar.f() || this.f3465a.containsKey("Mode") != cVar.f3465a.containsKey("Mode")) {
                return false;
            }
            if (c() == null ? cVar.c() != null : !c().equals(cVar.c())) {
                return false;
            }
            if (this.f3465a.containsKey("title") != cVar.f3465a.containsKey("title")) {
                return false;
            }
            if (d() == null ? cVar.d() != null : !d().equals(cVar.d())) {
                return false;
            }
            return a() == cVar.a();
        }

        public long f() {
            return ((Long) this.f3465a.get("WorkoutSessionId")).longValue();
        }

        public c g(GenericSettingsFragment.SETTING_MODE setting_mode) {
            if (setting_mode != null) {
                this.f3465a.put("Mode", setting_mode);
                return this;
            }
            throw new IllegalArgumentException("Argument \"Mode\" is marked as non-null but was passed a null value.");
        }

        public c h(String str) {
            if (str != null) {
                this.f3465a.put("title", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        }

        public int hashCode() {
            int i = 0;
            int e2 = (((((((int) (e() ^ (e() >>> 32))) + 31) * 31) + ((int) (f() ^ (f() >>> 32)))) * 31) + (c() != null ? c().hashCode() : 0)) * 31;
            if (d() != null) {
                i = d().hashCode();
            }
            return ((e2 + i) * 31) + a();
        }

        public c i(long j) {
            this.f3465a.put("WorkoutSessionId", Long.valueOf(j));
            return this;
        }

        public String toString() {
            return "ActionSessionsFragmentToSessionSettingsFragment(actionId=" + a() + "){TrainingPlanId=" + e() + ", WorkoutSessionId=" + f() + ", Mode=" + c() + ", title=" + d() + "}";
        }
    }

    public static C0090b a() {
        return new C0090b();
    }

    public static c b() {
        return new c();
    }
}
