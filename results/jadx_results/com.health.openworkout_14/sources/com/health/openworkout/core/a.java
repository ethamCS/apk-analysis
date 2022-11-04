package com.health.openworkout.core;

import android.content.Context;
import androidx.room.i;
import androidx.room.j;
import com.health.openworkout.core.c.c;
import com.health.openworkout.core.database.AppDatabase;
import com.health.openworkout.core.datatypes.TrainingPlan;
import com.health.openworkout.core.datatypes.User;
import com.health.openworkout.core.datatypes.WorkoutItem;
import com.health.openworkout.core.datatypes.WorkoutSession;
import com.health.openworkout.core.e.a0;
import com.health.openworkout.gui.utils.b;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class a {

    /* renamed from: e */
    public static boolean f3372e = false;

    /* renamed from: f */
    private static a f3373f;

    /* renamed from: a */
    private final Context f3374a;

    /* renamed from: b */
    private AppDatabase f3375b;

    /* renamed from: c */
    private User f3376c;

    /* renamed from: d */
    private b f3377d;

    /* renamed from: com.health.openworkout.core.a$a */
    /* loaded from: classes.dex */
    public class C0081a extends j.b {
        C0081a(a aVar) {
        }

        @Override // androidx.room.j.b
        public void c(b.o.a.b bVar) {
            super.c(bVar);
            bVar.r(true);
        }
    }

    private a(Context context) {
        this.f3374a = context;
        this.f3377d = new b(context);
        r();
    }

    public static void a(Context context) {
        if (f3373f != null) {
            return;
        }
        f3373f = new a(context);
    }

    public static a h() {
        a aVar = f3373f;
        if (aVar != null) {
            return aVar;
        }
        throw new RuntimeException("No openWorkout instance created");
    }

    private void r() {
        j.a a2 = i.a(this.f3374a, AppDatabase.class, "openWorkout.db");
        a2.c();
        a2.a(new C0081a(this));
        a2.b(AppDatabase.j);
        this.f3375b = (AppDatabase) a2.d();
    }

    public void b(TrainingPlan trainingPlan) {
        for (WorkoutSession workoutSession : trainingPlan.getWorkoutSessions()) {
            this.f3375b.u().c(workoutSession.getWorkoutSessionId());
        }
        this.f3375b.v().c(trainingPlan.getTrainingPlanId());
        this.f3375b.s().d(trainingPlan);
    }

    public void c(WorkoutItem workoutItem) {
        this.f3375b.u().h(workoutItem);
    }

    public void d(WorkoutSession workoutSession) {
        this.f3375b.u().c(workoutSession.getWorkoutSessionId());
        this.f3375b.v().f(workoutSession);
    }

    public List<WorkoutItem> e() {
        return this.f3375b.u().g();
    }

    public final Context f() {
        return this.f3374a;
    }

    public User g() {
        return this.f3376c;
    }

    public b i() {
        return this.f3377d;
    }

    public TrainingPlan j(long j) {
        TrainingPlan a2 = this.f3375b.s().a(j);
        if (a2 != null) {
            List<WorkoutSession> b2 = this.f3375b.v().b(a2.getTrainingPlanId());
            a2.setWorkoutSessions(b2);
            for (WorkoutSession workoutSession : b2) {
                workoutSession.setWorkoutItems(this.f3375b.u().b(workoutSession.getWorkoutSessionId()));
            }
        }
        return a2;
    }

    public List<TrainingPlan> k() {
        ArrayList arrayList = new ArrayList();
        for (TrainingPlan trainingPlan : this.f3375b.s().b()) {
            arrayList.add(j(trainingPlan.getTrainingPlanId()));
        }
        return arrayList;
    }

    public WorkoutItem l(long j) {
        return this.f3375b.u().a(j);
    }

    public WorkoutSession m(long j) {
        WorkoutSession a2 = this.f3375b.v().a(j);
        a2.setWorkoutItems(this.f3375b.u().b(a2.getWorkoutSessionId()));
        return a2;
    }

    public void n() {
        if (this.f3375b.s().b().isEmpty()) {
            this.f3375b.u().clear();
            long o = o(new c());
            o(new com.health.openworkout.core.c.b());
            o(new com.health.openworkout.core.c.a());
            this.f3375b.u().d(new a0().a());
            User user = new User();
            this.f3376c = user;
            user.setTrainingsPlanId(o);
            this.f3375b.t().c(this.f3376c);
        }
        this.f3376c = this.f3375b.t().b().get(0);
    }

    public long o(TrainingPlan trainingPlan) {
        long c2 = this.f3375b.s().c(trainingPlan);
        for (WorkoutSession workoutSession : trainingPlan.getWorkoutSessions()) {
            workoutSession.setTrainingPlanId(c2);
            long d2 = this.f3375b.v().d(workoutSession);
            for (WorkoutItem workoutItem : workoutSession.getWorkoutItems()) {
                workoutItem.setWorkoutSessionId(d2);
                this.f3375b.u().f(workoutItem);
            }
        }
        return c2;
    }

    public long p(WorkoutItem workoutItem) {
        return this.f3375b.u().f(workoutItem);
    }

    public long q(WorkoutSession workoutSession) {
        long d2 = this.f3375b.v().d(workoutSession);
        for (WorkoutItem workoutItem : workoutSession.getWorkoutItems()) {
            workoutItem.setWorkoutSessionId(d2);
            this.f3375b.u().f(workoutItem);
        }
        return d2;
    }

    public void s(TrainingPlan trainingPlan) {
        this.f3375b.s().e(trainingPlan);
    }

    public void t(User user) {
        this.f3375b.t().a(user);
    }

    public void u(WorkoutItem workoutItem) {
        this.f3375b.u().e(workoutItem);
    }

    public void v(WorkoutSession workoutSession) {
        this.f3375b.v().e(workoutSession);
    }
}
