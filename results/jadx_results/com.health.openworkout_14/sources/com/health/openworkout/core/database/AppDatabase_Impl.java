package com.health.openworkout.core.database;

import androidx.room.j;
import androidx.room.l;
import androidx.room.s.e;
import b.o.a.c;
import java.util.HashMap;
import java.util.HashSet;
/* loaded from: classes.dex */
public final class AppDatabase_Impl extends AppDatabase {
    private volatile c k;
    private volatile com.health.openworkout.core.database.a l;
    private volatile g m;
    private volatile e n;

    /* loaded from: classes.dex */
    class a extends l.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i) {
            super(i);
            AppDatabase_Impl.this = r1;
        }

        @Override // androidx.room.l.a
        public void a(b.o.a.b bVar) {
            bVar.t("CREATE TABLE IF NOT EXISTS `User` (`userId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `trainingsPlanId` INTEGER NOT NULL, `isMale` INTEGER NOT NULL)");
            bVar.t("CREATE TABLE IF NOT EXISTS `TrainingPlan` (`trainingPlanId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `orderNr` INTEGER NOT NULL, `name` TEXT, `imagePath` TEXT, `isImagePathExternal` INTEGER NOT NULL, `countFinishedTraining` INTEGER NOT NULL)");
            bVar.t("CREATE TABLE IF NOT EXISTS `WorkoutSession` (`workoutSessionId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `trainingPlanId` INTEGER NOT NULL, `orderNr` INTEGER NOT NULL, `name` TEXT, `finished` INTEGER NOT NULL)");
            bVar.t("CREATE TABLE IF NOT EXISTS `WorkoutItem` (`workoutItemId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `workoutSessionId` INTEGER NOT NULL, `orderNr` INTEGER NOT NULL, `name` TEXT, `description` TEXT, `elapsedTime` INTEGER NOT NULL, `imagePath` TEXT, `isImagePathExternal` INTEGER NOT NULL, `isVideoMode` INTEGER NOT NULL, `videoPath` TEXT, `isVideoPathExternal` INTEGER NOT NULL, `prepTime` INTEGER NOT NULL, `workoutTime` INTEGER NOT NULL, `breakTime` INTEGER NOT NULL, `repetitionCount` INTEGER NOT NULL, `isTimeMode` INTEGER NOT NULL, `finished` INTEGER NOT NULL)");
            bVar.t("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.t("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '007a41b5201e4b1e5a62195c5ba4415c')");
        }

        @Override // androidx.room.l.a
        public void b(b.o.a.b bVar) {
            bVar.t("DROP TABLE IF EXISTS `User`");
            bVar.t("DROP TABLE IF EXISTS `TrainingPlan`");
            bVar.t("DROP TABLE IF EXISTS `WorkoutSession`");
            bVar.t("DROP TABLE IF EXISTS `WorkoutItem`");
            if (((j) AppDatabase_Impl.this).f1885g != null) {
                int size = ((j) AppDatabase_Impl.this).f1885g.size();
                for (int i = 0; i < size; i++) {
                    ((j.b) ((j) AppDatabase_Impl.this).f1885g.get(i)).b(bVar);
                }
            }
        }

        @Override // androidx.room.l.a
        protected void c(b.o.a.b bVar) {
            if (((j) AppDatabase_Impl.this).f1885g != null) {
                int size = ((j) AppDatabase_Impl.this).f1885g.size();
                for (int i = 0; i < size; i++) {
                    ((j.b) ((j) AppDatabase_Impl.this).f1885g.get(i)).a(bVar);
                }
            }
        }

        @Override // androidx.room.l.a
        public void d(b.o.a.b bVar) {
            ((j) AppDatabase_Impl.this).f1879a = bVar;
            AppDatabase_Impl.this.m(bVar);
            if (((j) AppDatabase_Impl.this).f1885g != null) {
                int size = ((j) AppDatabase_Impl.this).f1885g.size();
                for (int i = 0; i < size; i++) {
                    ((j.b) ((j) AppDatabase_Impl.this).f1885g.get(i)).c(bVar);
                }
            }
        }

        @Override // androidx.room.l.a
        public void e(b.o.a.b bVar) {
        }

        @Override // androidx.room.l.a
        public void f(b.o.a.b bVar) {
            androidx.room.s.c.a(bVar);
        }

        @Override // androidx.room.l.a
        protected l.b g(b.o.a.b bVar) {
            HashMap hashMap = new HashMap(3);
            hashMap.put("userId", new e.a("userId", "INTEGER", true, 1, null, 1));
            hashMap.put("trainingsPlanId", new e.a("trainingsPlanId", "INTEGER", true, 0, null, 1));
            hashMap.put("isMale", new e.a("isMale", "INTEGER", true, 0, null, 1));
            androidx.room.s.e eVar = new androidx.room.s.e("User", hashMap, new HashSet(0), new HashSet(0));
            androidx.room.s.e a2 = androidx.room.s.e.a(bVar, "User");
            if (!eVar.equals(a2)) {
                return new l.b(false, "User(com.health.openworkout.core.datatypes.User).\n Expected:\n" + eVar + "\n Found:\n" + a2);
            }
            HashMap hashMap2 = new HashMap(6);
            hashMap2.put("trainingPlanId", new e.a("trainingPlanId", "INTEGER", true, 1, null, 1));
            hashMap2.put("orderNr", new e.a("orderNr", "INTEGER", true, 0, null, 1));
            hashMap2.put("name", new e.a("name", "TEXT", false, 0, null, 1));
            hashMap2.put("imagePath", new e.a("imagePath", "TEXT", false, 0, null, 1));
            hashMap2.put("isImagePathExternal", new e.a("isImagePathExternal", "INTEGER", true, 0, null, 1));
            hashMap2.put("countFinishedTraining", new e.a("countFinishedTraining", "INTEGER", true, 0, null, 1));
            androidx.room.s.e eVar2 = new androidx.room.s.e("TrainingPlan", hashMap2, new HashSet(0), new HashSet(0));
            androidx.room.s.e a3 = androidx.room.s.e.a(bVar, "TrainingPlan");
            if (!eVar2.equals(a3)) {
                return new l.b(false, "TrainingPlan(com.health.openworkout.core.datatypes.TrainingPlan).\n Expected:\n" + eVar2 + "\n Found:\n" + a3);
            }
            HashMap hashMap3 = new HashMap(5);
            hashMap3.put("workoutSessionId", new e.a("workoutSessionId", "INTEGER", true, 1, null, 1));
            hashMap3.put("trainingPlanId", new e.a("trainingPlanId", "INTEGER", true, 0, null, 1));
            hashMap3.put("orderNr", new e.a("orderNr", "INTEGER", true, 0, null, 1));
            hashMap3.put("name", new e.a("name", "TEXT", false, 0, null, 1));
            hashMap3.put("finished", new e.a("finished", "INTEGER", true, 0, null, 1));
            androidx.room.s.e eVar3 = new androidx.room.s.e("WorkoutSession", hashMap3, new HashSet(0), new HashSet(0));
            androidx.room.s.e a4 = androidx.room.s.e.a(bVar, "WorkoutSession");
            if (!eVar3.equals(a4)) {
                return new l.b(false, "WorkoutSession(com.health.openworkout.core.datatypes.WorkoutSession).\n Expected:\n" + eVar3 + "\n Found:\n" + a4);
            }
            HashMap hashMap4 = new HashMap(17);
            hashMap4.put("workoutItemId", new e.a("workoutItemId", "INTEGER", true, 1, null, 1));
            hashMap4.put("workoutSessionId", new e.a("workoutSessionId", "INTEGER", true, 0, null, 1));
            hashMap4.put("orderNr", new e.a("orderNr", "INTEGER", true, 0, null, 1));
            hashMap4.put("name", new e.a("name", "TEXT", false, 0, null, 1));
            hashMap4.put("description", new e.a("description", "TEXT", false, 0, null, 1));
            hashMap4.put("elapsedTime", new e.a("elapsedTime", "INTEGER", true, 0, null, 1));
            hashMap4.put("imagePath", new e.a("imagePath", "TEXT", false, 0, null, 1));
            hashMap4.put("isImagePathExternal", new e.a("isImagePathExternal", "INTEGER", true, 0, null, 1));
            hashMap4.put("isVideoMode", new e.a("isVideoMode", "INTEGER", true, 0, null, 1));
            hashMap4.put("videoPath", new e.a("videoPath", "TEXT", false, 0, null, 1));
            hashMap4.put("isVideoPathExternal", new e.a("isVideoPathExternal", "INTEGER", true, 0, null, 1));
            hashMap4.put("prepTime", new e.a("prepTime", "INTEGER", true, 0, null, 1));
            hashMap4.put("workoutTime", new e.a("workoutTime", "INTEGER", true, 0, null, 1));
            hashMap4.put("breakTime", new e.a("breakTime", "INTEGER", true, 0, null, 1));
            hashMap4.put("repetitionCount", new e.a("repetitionCount", "INTEGER", true, 0, null, 1));
            hashMap4.put("isTimeMode", new e.a("isTimeMode", "INTEGER", true, 0, null, 1));
            hashMap4.put("finished", new e.a("finished", "INTEGER", true, 0, null, 1));
            androidx.room.s.e eVar4 = new androidx.room.s.e("WorkoutItem", hashMap4, new HashSet(0), new HashSet(0));
            androidx.room.s.e a5 = androidx.room.s.e.a(bVar, "WorkoutItem");
            if (eVar4.equals(a5)) {
                return new l.b(true, null);
            }
            return new l.b(false, "WorkoutItem(com.health.openworkout.core.datatypes.WorkoutItem).\n Expected:\n" + eVar4 + "\n Found:\n" + a5);
        }
    }

    @Override // androidx.room.j
    protected androidx.room.g e() {
        return new androidx.room.g(this, new HashMap(0), new HashMap(0), "User", "TrainingPlan", "WorkoutSession", "WorkoutItem");
    }

    @Override // androidx.room.j
    protected b.o.a.c f(androidx.room.a aVar) {
        l lVar = new l(aVar, new a(2), "007a41b5201e4b1e5a62195c5ba4415c", "fa31df048c8c64052d834975718849b1");
        c.b.a a2 = c.b.a(aVar.f1836b);
        a2.c(aVar.f1837c);
        a2.b(lVar);
        return aVar.f1835a.a(a2.a());
    }

    @Override // com.health.openworkout.core.database.AppDatabase
    public com.health.openworkout.core.database.a s() {
        com.health.openworkout.core.database.a aVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new b(this);
            }
            aVar = this.l;
        }
        return aVar;
    }

    @Override // com.health.openworkout.core.database.AppDatabase
    public c t() {
        c cVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            if (this.k == null) {
                this.k = new d(this);
            }
            cVar = this.k;
        }
        return cVar;
    }

    @Override // com.health.openworkout.core.database.AppDatabase
    public e u() {
        e eVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new f(this);
            }
            eVar = this.n;
        }
        return eVar;
    }

    @Override // com.health.openworkout.core.database.AppDatabase
    public g v() {
        g gVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new h(this);
            }
            gVar = this.m;
        }
        return gVar;
    }
}
