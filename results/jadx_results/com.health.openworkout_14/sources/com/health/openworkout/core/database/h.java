package com.health.openworkout.core.database;

import android.database.Cursor;
import androidx.room.j;
import androidx.room.m;
import androidx.room.p;
import com.health.openworkout.core.datatypes.WorkoutSession;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a */
    private final j f3412a;

    /* renamed from: b */
    private final androidx.room.c<WorkoutSession> f3413b;

    /* renamed from: c */
    private final androidx.room.b<WorkoutSession> f3414c;

    /* renamed from: d */
    private final androidx.room.b<WorkoutSession> f3415d;

    /* renamed from: e */
    private final p f3416e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends androidx.room.c<WorkoutSession> {
        a(h hVar, j jVar) {
            super(jVar);
        }

        @Override // androidx.room.p
        public String d() {
            return "INSERT OR ABORT INTO `WorkoutSession` (`workoutSessionId`,`trainingPlanId`,`orderNr`,`name`,`finished`) VALUES (nullif(?, 0),?,?,?,?)";
        }

        /* renamed from: j */
        public void g(b.o.a.f fVar, WorkoutSession workoutSession) {
            fVar.x(1, workoutSession.getWorkoutSessionId());
            fVar.x(2, workoutSession.getTrainingPlanId());
            fVar.x(3, workoutSession.getOrderNr());
            String str = workoutSession.name;
            if (str == null) {
                fVar.J(4);
            } else {
                fVar.v(4, str);
            }
            fVar.x(5, workoutSession.isFinished() ? 1L : 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends androidx.room.b<WorkoutSession> {
        b(h hVar, j jVar) {
            super(jVar);
        }

        @Override // androidx.room.p
        public String d() {
            return "DELETE FROM `WorkoutSession` WHERE `workoutSessionId` = ?";
        }

        /* renamed from: i */
        public void g(b.o.a.f fVar, WorkoutSession workoutSession) {
            fVar.x(1, workoutSession.getWorkoutSessionId());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends androidx.room.b<WorkoutSession> {
        c(h hVar, j jVar) {
            super(jVar);
        }

        @Override // androidx.room.p
        public String d() {
            return "UPDATE OR ABORT `WorkoutSession` SET `workoutSessionId` = ?,`trainingPlanId` = ?,`orderNr` = ?,`name` = ?,`finished` = ? WHERE `workoutSessionId` = ?";
        }

        /* renamed from: i */
        public void g(b.o.a.f fVar, WorkoutSession workoutSession) {
            fVar.x(1, workoutSession.getWorkoutSessionId());
            fVar.x(2, workoutSession.getTrainingPlanId());
            fVar.x(3, workoutSession.getOrderNr());
            String str = workoutSession.name;
            if (str == null) {
                fVar.J(4);
            } else {
                fVar.v(4, str);
            }
            fVar.x(5, workoutSession.isFinished() ? 1L : 0L);
            fVar.x(6, workoutSession.getWorkoutSessionId());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends p {
        d(h hVar, j jVar) {
            super(jVar);
        }

        @Override // androidx.room.p
        public String d() {
            return "DELETE FROM WorkoutSession WHERE trainingPlanId = ?";
        }
    }

    public h(j jVar) {
        this.f3412a = jVar;
        this.f3413b = new a(this, jVar);
        this.f3414c = new b(this, jVar);
        this.f3415d = new c(this, jVar);
        this.f3416e = new d(this, jVar);
    }

    @Override // com.health.openworkout.core.database.g
    public WorkoutSession a(long j) {
        boolean z = true;
        m k = m.k("SELECT * FROM WorkoutSession WHERE workoutSessionId=?", 1);
        k.x(1, j);
        this.f3412a.b();
        WorkoutSession workoutSession = null;
        Cursor b2 = androidx.room.s.c.b(this.f3412a, k, false, null);
        try {
            int b3 = androidx.room.s.b.b(b2, "workoutSessionId");
            int b4 = androidx.room.s.b.b(b2, "trainingPlanId");
            int b5 = androidx.room.s.b.b(b2, "orderNr");
            int b6 = androidx.room.s.b.b(b2, "name");
            int b7 = androidx.room.s.b.b(b2, "finished");
            if (b2.moveToFirst()) {
                workoutSession = new WorkoutSession();
                workoutSession.setWorkoutSessionId(b2.getLong(b3));
                workoutSession.setTrainingPlanId(b2.getLong(b4));
                workoutSession.setOrderNr(b2.getLong(b5));
                workoutSession.name = b2.getString(b6);
                if (b2.getInt(b7) == 0) {
                    z = false;
                }
                workoutSession.setFinished(z);
            }
            return workoutSession;
        } finally {
            b2.close();
            k.f0();
        }
    }

    @Override // com.health.openworkout.core.database.g
    public List<WorkoutSession> b(long j) {
        m k = m.k("SELECT * FROM WorkoutSession WHERE trainingPlanId = ? ORDER BY orderNr", 1);
        k.x(1, j);
        this.f3412a.b();
        Cursor b2 = androidx.room.s.c.b(this.f3412a, k, false, null);
        try {
            int b3 = androidx.room.s.b.b(b2, "workoutSessionId");
            int b4 = androidx.room.s.b.b(b2, "trainingPlanId");
            int b5 = androidx.room.s.b.b(b2, "orderNr");
            int b6 = androidx.room.s.b.b(b2, "name");
            int b7 = androidx.room.s.b.b(b2, "finished");
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                WorkoutSession workoutSession = new WorkoutSession();
                workoutSession.setWorkoutSessionId(b2.getLong(b3));
                workoutSession.setTrainingPlanId(b2.getLong(b4));
                workoutSession.setOrderNr(b2.getLong(b5));
                workoutSession.name = b2.getString(b6);
                workoutSession.setFinished(b2.getInt(b7) != 0);
                arrayList.add(workoutSession);
            }
            return arrayList;
        } finally {
            b2.close();
            k.f0();
        }
    }

    @Override // com.health.openworkout.core.database.g
    public void c(long j) {
        this.f3412a.b();
        b.o.a.f a2 = this.f3416e.a();
        a2.x(1, j);
        this.f3412a.c();
        try {
            a2.C();
            this.f3412a.r();
        } finally {
            this.f3412a.g();
            this.f3416e.f(a2);
        }
    }

    @Override // com.health.openworkout.core.database.g
    public long d(WorkoutSession workoutSession) {
        this.f3412a.b();
        this.f3412a.c();
        try {
            long i = this.f3413b.i(workoutSession);
            this.f3412a.r();
            return i;
        } finally {
            this.f3412a.g();
        }
    }

    @Override // com.health.openworkout.core.database.g
    public void e(WorkoutSession workoutSession) {
        this.f3412a.b();
        this.f3412a.c();
        try {
            this.f3415d.h(workoutSession);
            this.f3412a.r();
        } finally {
            this.f3412a.g();
        }
    }

    @Override // com.health.openworkout.core.database.g
    public void f(WorkoutSession workoutSession) {
        this.f3412a.b();
        this.f3412a.c();
        try {
            this.f3414c.h(workoutSession);
            this.f3412a.r();
        } finally {
            this.f3412a.g();
        }
    }
}
