package com.health.openworkout.core.database;

import android.database.Cursor;
import androidx.room.j;
import androidx.room.m;
import com.health.openworkout.core.datatypes.TrainingPlan;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class b implements com.health.openworkout.core.database.a {

    /* renamed from: a */
    private final j f3399a;

    /* renamed from: b */
    private final androidx.room.c<TrainingPlan> f3400b;

    /* renamed from: c */
    private final androidx.room.b<TrainingPlan> f3401c;

    /* renamed from: d */
    private final androidx.room.b<TrainingPlan> f3402d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends androidx.room.c<TrainingPlan> {
        a(b bVar, j jVar) {
            super(jVar);
        }

        @Override // androidx.room.p
        public String d() {
            return "INSERT OR ABORT INTO `TrainingPlan` (`trainingPlanId`,`orderNr`,`name`,`imagePath`,`isImagePathExternal`,`countFinishedTraining`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }

        /* renamed from: j */
        public void g(b.o.a.f fVar, TrainingPlan trainingPlan) {
            fVar.x(1, trainingPlan.getTrainingPlanId());
            fVar.x(2, trainingPlan.getOrderNr());
            if (trainingPlan.getName() == null) {
                fVar.J(3);
            } else {
                fVar.v(3, trainingPlan.getName());
            }
            if (trainingPlan.getImagePath() == null) {
                fVar.J(4);
            } else {
                fVar.v(4, trainingPlan.getImagePath());
            }
            fVar.x(5, trainingPlan.isImagePathExternal() ? 1L : 0L);
            fVar.x(6, trainingPlan.getCountFinishedTraining());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.health.openworkout.core.database.b$b */
    /* loaded from: classes.dex */
    public class C0084b extends androidx.room.b<TrainingPlan> {
        C0084b(b bVar, j jVar) {
            super(jVar);
        }

        @Override // androidx.room.p
        public String d() {
            return "DELETE FROM `TrainingPlan` WHERE `trainingPlanId` = ?";
        }

        /* renamed from: i */
        public void g(b.o.a.f fVar, TrainingPlan trainingPlan) {
            fVar.x(1, trainingPlan.getTrainingPlanId());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends androidx.room.b<TrainingPlan> {
        c(b bVar, j jVar) {
            super(jVar);
        }

        @Override // androidx.room.p
        public String d() {
            return "UPDATE OR ABORT `TrainingPlan` SET `trainingPlanId` = ?,`orderNr` = ?,`name` = ?,`imagePath` = ?,`isImagePathExternal` = ?,`countFinishedTraining` = ? WHERE `trainingPlanId` = ?";
        }

        /* renamed from: i */
        public void g(b.o.a.f fVar, TrainingPlan trainingPlan) {
            fVar.x(1, trainingPlan.getTrainingPlanId());
            fVar.x(2, trainingPlan.getOrderNr());
            if (trainingPlan.getName() == null) {
                fVar.J(3);
            } else {
                fVar.v(3, trainingPlan.getName());
            }
            if (trainingPlan.getImagePath() == null) {
                fVar.J(4);
            } else {
                fVar.v(4, trainingPlan.getImagePath());
            }
            fVar.x(5, trainingPlan.isImagePathExternal() ? 1L : 0L);
            fVar.x(6, trainingPlan.getCountFinishedTraining());
            fVar.x(7, trainingPlan.getTrainingPlanId());
        }
    }

    public b(j jVar) {
        this.f3399a = jVar;
        this.f3400b = new a(this, jVar);
        this.f3401c = new C0084b(this, jVar);
        this.f3402d = new c(this, jVar);
    }

    @Override // com.health.openworkout.core.database.a
    public TrainingPlan a(long j) {
        boolean z = true;
        m k = m.k("SELECT * FROM TrainingPlan WHERE trainingPlanId=?", 1);
        k.x(1, j);
        this.f3399a.b();
        TrainingPlan trainingPlan = null;
        Cursor b2 = androidx.room.s.c.b(this.f3399a, k, false, null);
        try {
            int b3 = androidx.room.s.b.b(b2, "trainingPlanId");
            int b4 = androidx.room.s.b.b(b2, "orderNr");
            int b5 = androidx.room.s.b.b(b2, "name");
            int b6 = androidx.room.s.b.b(b2, "imagePath");
            int b7 = androidx.room.s.b.b(b2, "isImagePathExternal");
            int b8 = androidx.room.s.b.b(b2, "countFinishedTraining");
            if (b2.moveToFirst()) {
                trainingPlan = new TrainingPlan();
                trainingPlan.setTrainingPlanId(b2.getLong(b3));
                trainingPlan.setOrderNr(b2.getLong(b4));
                trainingPlan.setName(b2.getString(b5));
                trainingPlan.setImagePath(b2.getString(b6));
                if (b2.getInt(b7) == 0) {
                    z = false;
                }
                trainingPlan.setImagePathExternal(z);
                trainingPlan.setCountFinishedTraining(b2.getInt(b8));
            }
            return trainingPlan;
        } finally {
            b2.close();
            k.f0();
        }
    }

    @Override // com.health.openworkout.core.database.a
    public List<TrainingPlan> b() {
        m k = m.k("SELECT * FROM TrainingPlan ORDER BY orderNr", 0);
        this.f3399a.b();
        Cursor b2 = androidx.room.s.c.b(this.f3399a, k, false, null);
        try {
            int b3 = androidx.room.s.b.b(b2, "trainingPlanId");
            int b4 = androidx.room.s.b.b(b2, "orderNr");
            int b5 = androidx.room.s.b.b(b2, "name");
            int b6 = androidx.room.s.b.b(b2, "imagePath");
            int b7 = androidx.room.s.b.b(b2, "isImagePathExternal");
            int b8 = androidx.room.s.b.b(b2, "countFinishedTraining");
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                TrainingPlan trainingPlan = new TrainingPlan();
                trainingPlan.setTrainingPlanId(b2.getLong(b3));
                trainingPlan.setOrderNr(b2.getLong(b4));
                trainingPlan.setName(b2.getString(b5));
                trainingPlan.setImagePath(b2.getString(b6));
                trainingPlan.setImagePathExternal(b2.getInt(b7) != 0);
                trainingPlan.setCountFinishedTraining(b2.getInt(b8));
                arrayList.add(trainingPlan);
            }
            return arrayList;
        } finally {
            b2.close();
            k.f0();
        }
    }

    @Override // com.health.openworkout.core.database.a
    public long c(TrainingPlan trainingPlan) {
        this.f3399a.b();
        this.f3399a.c();
        try {
            long i = this.f3400b.i(trainingPlan);
            this.f3399a.r();
            return i;
        } finally {
            this.f3399a.g();
        }
    }

    @Override // com.health.openworkout.core.database.a
    public void d(TrainingPlan trainingPlan) {
        this.f3399a.b();
        this.f3399a.c();
        try {
            this.f3401c.h(trainingPlan);
            this.f3399a.r();
        } finally {
            this.f3399a.g();
        }
    }

    @Override // com.health.openworkout.core.database.a
    public void e(TrainingPlan trainingPlan) {
        this.f3399a.b();
        this.f3399a.c();
        try {
            this.f3402d.h(trainingPlan);
            this.f3399a.r();
        } finally {
            this.f3399a.g();
        }
    }
}
