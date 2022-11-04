package com.health.openworkout.gui.training;

import android.os.Bundle;
import androidx.navigation.m;
import com.health.openworkout.R;
import com.health.openworkout.gui.datatypes.GenericSettingsFragment;
import java.util.HashMap;
/* loaded from: classes.dex */
public class b {

    /* renamed from: com.health.openworkout.gui.training.b$b */
    /* loaded from: classes.dex */
    public static class C0094b implements m {

        /* renamed from: a */
        private final HashMap f3484a;

        private C0094b() {
            this.f3484a = new HashMap();
        }

        @Override // androidx.navigation.m
        public int a() {
            return R.id.action_TrainingFragment_to_SessionFragment;
        }

        @Override // androidx.navigation.m
        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putLong("TrainingPlanId", this.f3484a.containsKey("TrainingPlanId") ? ((Long) this.f3484a.get("TrainingPlanId")).longValue() : -1L);
            bundle.putString("title", this.f3484a.containsKey("title") ? (String) this.f3484a.get("title") : "sessions");
            return bundle;
        }

        public String c() {
            return (String) this.f3484a.get("title");
        }

        public long d() {
            return ((Long) this.f3484a.get("TrainingPlanId")).longValue();
        }

        public C0094b e(String str) {
            if (str != null) {
                this.f3484a.put("title", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0094b.class != obj.getClass()) {
                return false;
            }
            C0094b c0094b = (C0094b) obj;
            if (this.f3484a.containsKey("TrainingPlanId") != c0094b.f3484a.containsKey("TrainingPlanId") || d() != c0094b.d() || this.f3484a.containsKey("title") != c0094b.f3484a.containsKey("title")) {
                return false;
            }
            if (c() == null ? c0094b.c() != null : !c().equals(c0094b.c())) {
                return false;
            }
            return a() == c0094b.a();
        }

        public C0094b f(long j) {
            this.f3484a.put("TrainingPlanId", Long.valueOf(j));
            return this;
        }

        public int hashCode() {
            return ((((((int) (d() ^ (d() >>> 32))) + 31) * 31) + (c() != null ? c().hashCode() : 0)) * 31) + a();
        }

        public String toString() {
            return "ActionTrainingFragmentToSessionFragment(actionId=" + a() + "){TrainingPlanId=" + d() + ", title=" + c() + "}";
        }
    }

    /* loaded from: classes.dex */
    public static class c implements m {

        /* renamed from: a */
        private final HashMap f3485a;

        private c() {
            this.f3485a = new HashMap();
        }

        @Override // androidx.navigation.m
        public int a() {
            return R.id.action_TrainingFragment_to_TrainingSettingsFragment;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
        @Override // androidx.navigation.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.os.Bundle b() {
            /*
                r6 = this;
                java.lang.Class<com.health.openworkout.gui.datatypes.GenericSettingsFragment$SETTING_MODE> r0 = com.health.openworkout.gui.datatypes.GenericSettingsFragment.SETTING_MODE.class
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                java.util.HashMap r2 = r6.f3485a
                java.lang.String r3 = "TrainingPlanId"
                boolean r2 = r2.containsKey(r3)
                if (r2 == 0) goto L1e
                java.util.HashMap r2 = r6.f3485a
                java.lang.Object r2 = r2.get(r3)
                java.lang.Long r2 = (java.lang.Long) r2
                long r4 = r2.longValue()
                goto L20
            L1e:
                r4 = -1
            L20:
                r1.putLong(r3, r4)
                java.util.HashMap r2 = r6.f3485a
                java.lang.String r3 = "Mode"
                boolean r2 = r2.containsKey(r3)
                if (r2 == 0) goto L78
                java.util.HashMap r2 = r6.f3485a
                java.lang.Object r2 = r2.get(r3)
                com.health.openworkout.gui.datatypes.GenericSettingsFragment$SETTING_MODE r2 = (com.health.openworkout.gui.datatypes.GenericSettingsFragment.SETTING_MODE) r2
                java.lang.Class<android.os.Parcelable> r4 = android.os.Parcelable.class
                boolean r4 = r4.isAssignableFrom(r0)
                if (r4 != 0) goto L6c
                if (r2 != 0) goto L40
                goto L6c
            L40:
                java.lang.Class<java.io.Serializable> r4 = java.io.Serializable.class
                boolean r4 = r4.isAssignableFrom(r0)
                if (r4 == 0) goto L51
                java.lang.Class<java.io.Serializable> r0 = java.io.Serializable.class
                java.lang.Object r0 = r0.cast(r2)
                java.io.Serializable r0 = (java.io.Serializable) r0
                goto L7a
            L51:
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
            L6c:
                java.lang.Class<android.os.Parcelable> r0 = android.os.Parcelable.class
                java.lang.Object r0 = r0.cast(r2)
                android.os.Parcelable r0 = (android.os.Parcelable) r0
                r1.putParcelable(r3, r0)
                goto L7d
            L78:
                com.health.openworkout.gui.datatypes.GenericSettingsFragment$SETTING_MODE r0 = com.health.openworkout.gui.datatypes.GenericSettingsFragment.SETTING_MODE.EDIT
            L7a:
                r1.putSerializable(r3, r0)
            L7d:
                java.util.HashMap r0 = r6.f3485a
                java.lang.String r2 = "title"
                boolean r0 = r0.containsKey(r2)
                if (r0 == 0) goto L90
                java.util.HashMap r0 = r6.f3485a
                java.lang.Object r0 = r0.get(r2)
                java.lang.String r0 = (java.lang.String) r0
                goto L92
            L90:
                java.lang.String r0 = "training settings"
            L92:
                r1.putString(r2, r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.health.openworkout.gui.training.b.c.b():android.os.Bundle");
        }

        public GenericSettingsFragment.SETTING_MODE c() {
            return (GenericSettingsFragment.SETTING_MODE) this.f3485a.get("Mode");
        }

        public String d() {
            return (String) this.f3485a.get("title");
        }

        public long e() {
            return ((Long) this.f3485a.get("TrainingPlanId")).longValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f3485a.containsKey("TrainingPlanId") != cVar.f3485a.containsKey("TrainingPlanId") || e() != cVar.e() || this.f3485a.containsKey("Mode") != cVar.f3485a.containsKey("Mode")) {
                return false;
            }
            if (c() == null ? cVar.c() != null : !c().equals(cVar.c())) {
                return false;
            }
            if (this.f3485a.containsKey("title") != cVar.f3485a.containsKey("title")) {
                return false;
            }
            if (d() == null ? cVar.d() != null : !d().equals(cVar.d())) {
                return false;
            }
            return a() == cVar.a();
        }

        public c f(GenericSettingsFragment.SETTING_MODE setting_mode) {
            if (setting_mode != null) {
                this.f3485a.put("Mode", setting_mode);
                return this;
            }
            throw new IllegalArgumentException("Argument \"Mode\" is marked as non-null but was passed a null value.");
        }

        public c g(String str) {
            if (str != null) {
                this.f3485a.put("title", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        }

        public c h(long j) {
            this.f3485a.put("TrainingPlanId", Long.valueOf(j));
            return this;
        }

        public int hashCode() {
            int i = 0;
            int e2 = (((((int) (e() ^ (e() >>> 32))) + 31) * 31) + (c() != null ? c().hashCode() : 0)) * 31;
            if (d() != null) {
                i = d().hashCode();
            }
            return ((e2 + i) * 31) + a();
        }

        public String toString() {
            return "ActionTrainingFragmentToTrainingSettingsFragment(actionId=" + a() + "){TrainingPlanId=" + e() + ", Mode=" + c() + ", title=" + d() + "}";
        }
    }

    public static m a() {
        return new androidx.navigation.a(R.id.action_navTrainingsFragment_to_navTrainingsDatabaseFragment);
    }

    public static C0094b b() {
        return new C0094b();
    }

    public static c c() {
        return new c();
    }
}
