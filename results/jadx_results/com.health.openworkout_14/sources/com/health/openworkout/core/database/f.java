package com.health.openworkout.core.database;

import android.database.Cursor;
import androidx.room.j;
import androidx.room.m;
import androidx.room.p;
import com.health.openworkout.core.datatypes.WorkoutItem;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class f implements com.health.openworkout.core.database.e {

    /* renamed from: a */
    private final j f3406a;

    /* renamed from: b */
    private final androidx.room.c<WorkoutItem> f3407b;

    /* renamed from: c */
    private final androidx.room.b<WorkoutItem> f3408c;

    /* renamed from: d */
    private final androidx.room.b<WorkoutItem> f3409d;

    /* renamed from: e */
    private final p f3410e;

    /* renamed from: f */
    private final p f3411f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends androidx.room.c<WorkoutItem> {
        a(f fVar, j jVar) {
            super(jVar);
        }

        @Override // androidx.room.p
        public String d() {
            return "INSERT OR ABORT INTO `WorkoutItem` (`workoutItemId`,`workoutSessionId`,`orderNr`,`name`,`description`,`elapsedTime`,`imagePath`,`isImagePathExternal`,`isVideoMode`,`videoPath`,`isVideoPathExternal`,`prepTime`,`workoutTime`,`breakTime`,`repetitionCount`,`isTimeMode`,`finished`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: j */
        public void g(b.o.a.f fVar, WorkoutItem workoutItem) {
            fVar.x(1, workoutItem.getWorkoutItemId());
            fVar.x(2, workoutItem.getWorkoutSessionId());
            fVar.x(3, workoutItem.getOrderNr());
            if (workoutItem.getName() == null) {
                fVar.J(4);
            } else {
                fVar.v(4, workoutItem.getName());
            }
            if (workoutItem.getDescription() == null) {
                fVar.J(5);
            } else {
                fVar.v(5, workoutItem.getDescription());
            }
            fVar.x(6, workoutItem.getElapsedTime());
            if (workoutItem.getImagePath() == null) {
                fVar.J(7);
            } else {
                fVar.v(7, workoutItem.getImagePath());
            }
            fVar.x(8, workoutItem.isImagePathExternal() ? 1L : 0L);
            fVar.x(9, workoutItem.isVideoMode() ? 1L : 0L);
            if (workoutItem.getVideoPath() == null) {
                fVar.J(10);
            } else {
                fVar.v(10, workoutItem.getVideoPath());
            }
            fVar.x(11, workoutItem.isVideoPathExternal() ? 1L : 0L);
            fVar.x(12, workoutItem.getPrepTime());
            fVar.x(13, workoutItem.getWorkoutTime());
            fVar.x(14, workoutItem.getBreakTime());
            fVar.x(15, workoutItem.getRepetitionCount());
            fVar.x(16, workoutItem.isTimeMode() ? 1L : 0L);
            fVar.x(17, workoutItem.isFinished() ? 1L : 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends androidx.room.b<WorkoutItem> {
        b(f fVar, j jVar) {
            super(jVar);
        }

        @Override // androidx.room.p
        public String d() {
            return "DELETE FROM `WorkoutItem` WHERE `workoutItemId` = ?";
        }

        /* renamed from: i */
        public void g(b.o.a.f fVar, WorkoutItem workoutItem) {
            fVar.x(1, workoutItem.getWorkoutItemId());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends androidx.room.b<WorkoutItem> {
        c(f fVar, j jVar) {
            super(jVar);
        }

        @Override // androidx.room.p
        public String d() {
            return "UPDATE OR ABORT `WorkoutItem` SET `workoutItemId` = ?,`workoutSessionId` = ?,`orderNr` = ?,`name` = ?,`description` = ?,`elapsedTime` = ?,`imagePath` = ?,`isImagePathExternal` = ?,`isVideoMode` = ?,`videoPath` = ?,`isVideoPathExternal` = ?,`prepTime` = ?,`workoutTime` = ?,`breakTime` = ?,`repetitionCount` = ?,`isTimeMode` = ?,`finished` = ? WHERE `workoutItemId` = ?";
        }

        /* renamed from: i */
        public void g(b.o.a.f fVar, WorkoutItem workoutItem) {
            fVar.x(1, workoutItem.getWorkoutItemId());
            fVar.x(2, workoutItem.getWorkoutSessionId());
            fVar.x(3, workoutItem.getOrderNr());
            if (workoutItem.getName() == null) {
                fVar.J(4);
            } else {
                fVar.v(4, workoutItem.getName());
            }
            if (workoutItem.getDescription() == null) {
                fVar.J(5);
            } else {
                fVar.v(5, workoutItem.getDescription());
            }
            fVar.x(6, workoutItem.getElapsedTime());
            if (workoutItem.getImagePath() == null) {
                fVar.J(7);
            } else {
                fVar.v(7, workoutItem.getImagePath());
            }
            fVar.x(8, workoutItem.isImagePathExternal() ? 1L : 0L);
            fVar.x(9, workoutItem.isVideoMode() ? 1L : 0L);
            if (workoutItem.getVideoPath() == null) {
                fVar.J(10);
            } else {
                fVar.v(10, workoutItem.getVideoPath());
            }
            fVar.x(11, workoutItem.isVideoPathExternal() ? 1L : 0L);
            fVar.x(12, workoutItem.getPrepTime());
            fVar.x(13, workoutItem.getWorkoutTime());
            fVar.x(14, workoutItem.getBreakTime());
            fVar.x(15, workoutItem.getRepetitionCount());
            fVar.x(16, workoutItem.isTimeMode() ? 1L : 0L);
            fVar.x(17, workoutItem.isFinished() ? 1L : 0L);
            fVar.x(18, workoutItem.getWorkoutItemId());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends p {
        d(f fVar, j jVar) {
            super(jVar);
        }

        @Override // androidx.room.p
        public String d() {
            return "DELETE FROM WorkoutItem";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e extends p {
        e(f fVar, j jVar) {
            super(jVar);
        }

        @Override // androidx.room.p
        public String d() {
            return "DELETE FROM WorkoutItem WHERE workoutSessionId = ?";
        }
    }

    public f(j jVar) {
        this.f3406a = jVar;
        this.f3407b = new a(this, jVar);
        this.f3408c = new b(this, jVar);
        this.f3409d = new c(this, jVar);
        this.f3410e = new d(this, jVar);
        this.f3411f = new e(this, jVar);
    }

    @Override // com.health.openworkout.core.database.e
    public WorkoutItem a(long j) {
        m mVar;
        Throwable th;
        WorkoutItem workoutItem;
        m k = m.k("SELECT * FROM WorkoutItem WHERE workoutItemId=?", 1);
        k.x(1, j);
        this.f3406a.b();
        Cursor b2 = androidx.room.s.c.b(this.f3406a, k, false, null);
        try {
            int b3 = androidx.room.s.b.b(b2, "workoutItemId");
            int b4 = androidx.room.s.b.b(b2, "workoutSessionId");
            int b5 = androidx.room.s.b.b(b2, "orderNr");
            int b6 = androidx.room.s.b.b(b2, "name");
            int b7 = androidx.room.s.b.b(b2, "description");
            int b8 = androidx.room.s.b.b(b2, "elapsedTime");
            int b9 = androidx.room.s.b.b(b2, "imagePath");
            int b10 = androidx.room.s.b.b(b2, "isImagePathExternal");
            int b11 = androidx.room.s.b.b(b2, "isVideoMode");
            int b12 = androidx.room.s.b.b(b2, "videoPath");
            int b13 = androidx.room.s.b.b(b2, "isVideoPathExternal");
            int b14 = androidx.room.s.b.b(b2, "prepTime");
            int b15 = androidx.room.s.b.b(b2, "workoutTime");
            int b16 = androidx.room.s.b.b(b2, "breakTime");
            mVar = k;
            try {
                int b17 = androidx.room.s.b.b(b2, "repetitionCount");
                int b18 = androidx.room.s.b.b(b2, "isTimeMode");
                int b19 = androidx.room.s.b.b(b2, "finished");
                if (b2.moveToFirst()) {
                    WorkoutItem workoutItem2 = new WorkoutItem();
                    workoutItem2.setWorkoutItemId(b2.getLong(b3));
                    workoutItem2.setWorkoutSessionId(b2.getLong(b4));
                    workoutItem2.setOrderNr(b2.getLong(b5));
                    workoutItem2.setName(b2.getString(b6));
                    workoutItem2.setDescription(b2.getString(b7));
                    workoutItem2.setElapsedTime(b2.getLong(b8));
                    workoutItem2.setImagePath(b2.getString(b9));
                    workoutItem2.setImagePathExternal(b2.getInt(b10) != 0);
                    workoutItem2.setVideoMode(b2.getInt(b11) != 0);
                    workoutItem2.setVideoPath(b2.getString(b12));
                    workoutItem2.setVideoPathExternal(b2.getInt(b13) != 0);
                    workoutItem2.setPrepTime(b2.getInt(b14));
                    workoutItem2.setWorkoutTime(b2.getInt(b15));
                    workoutItem2.setBreakTime(b2.getInt(b16));
                    workoutItem2.setRepetitionCount(b2.getInt(b17));
                    workoutItem2.setTimeMode(b2.getInt(b18) != 0);
                    workoutItem2.setFinished(b2.getInt(b19) != 0);
                    workoutItem = workoutItem2;
                } else {
                    workoutItem = null;
                }
                b2.close();
                mVar.f0();
                return workoutItem;
            } catch (Throwable th2) {
                th = th2;
                b2.close();
                mVar.f0();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            mVar = k;
        }
    }

    @Override // com.health.openworkout.core.database.e
    public List<WorkoutItem> b(long j) {
        m mVar;
        Throwable th;
        int i;
        boolean z;
        boolean z2;
        m k = m.k("SELECT * FROM WorkoutItem WHERE workoutSessionId = ? ORDER BY orderNr", 1);
        k.x(1, j);
        this.f3406a.b();
        Cursor b2 = androidx.room.s.c.b(this.f3406a, k, false, null);
        try {
            int b3 = androidx.room.s.b.b(b2, "workoutItemId");
            int b4 = androidx.room.s.b.b(b2, "workoutSessionId");
            int b5 = androidx.room.s.b.b(b2, "orderNr");
            int b6 = androidx.room.s.b.b(b2, "name");
            int b7 = androidx.room.s.b.b(b2, "description");
            int b8 = androidx.room.s.b.b(b2, "elapsedTime");
            int b9 = androidx.room.s.b.b(b2, "imagePath");
            int b10 = androidx.room.s.b.b(b2, "isImagePathExternal");
            int b11 = androidx.room.s.b.b(b2, "isVideoMode");
            int b12 = androidx.room.s.b.b(b2, "videoPath");
            int b13 = androidx.room.s.b.b(b2, "isVideoPathExternal");
            int b14 = androidx.room.s.b.b(b2, "prepTime");
            int b15 = androidx.room.s.b.b(b2, "workoutTime");
            int b16 = androidx.room.s.b.b(b2, "breakTime");
            mVar = k;
            try {
                int b17 = androidx.room.s.b.b(b2, "repetitionCount");
                int b18 = androidx.room.s.b.b(b2, "isTimeMode");
                int b19 = androidx.room.s.b.b(b2, "finished");
                int i2 = b16;
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    WorkoutItem workoutItem = new WorkoutItem();
                    ArrayList arrayList2 = arrayList;
                    int i3 = b15;
                    workoutItem.setWorkoutItemId(b2.getLong(b3));
                    workoutItem.setWorkoutSessionId(b2.getLong(b4));
                    workoutItem.setOrderNr(b2.getLong(b5));
                    workoutItem.setName(b2.getString(b6));
                    workoutItem.setDescription(b2.getString(b7));
                    workoutItem.setElapsedTime(b2.getLong(b8));
                    workoutItem.setImagePath(b2.getString(b9));
                    workoutItem.setImagePathExternal(b2.getInt(b10) != 0);
                    workoutItem.setVideoMode(b2.getInt(b11) != 0);
                    workoutItem.setVideoPath(b2.getString(b12));
                    workoutItem.setVideoPathExternal(b2.getInt(b13) != 0);
                    workoutItem.setPrepTime(b2.getInt(b14));
                    workoutItem.setWorkoutTime(b2.getInt(i3));
                    int i4 = i2;
                    int i5 = b3;
                    workoutItem.setBreakTime(b2.getInt(i4));
                    int i6 = b17;
                    int i7 = b14;
                    workoutItem.setRepetitionCount(b2.getInt(i6));
                    int i8 = b18;
                    if (b2.getInt(i8) != 0) {
                        i = i6;
                        z = true;
                    } else {
                        i = i6;
                        z = false;
                    }
                    workoutItem.setTimeMode(z);
                    int i9 = b19;
                    if (b2.getInt(i9) != 0) {
                        b19 = i9;
                        z2 = true;
                    } else {
                        b19 = i9;
                        z2 = false;
                    }
                    workoutItem.setFinished(z2);
                    arrayList2.add(workoutItem);
                    b14 = i7;
                    b17 = i;
                    b18 = i8;
                    arrayList = arrayList2;
                    b3 = i5;
                    i2 = i4;
                    b15 = i3;
                }
                ArrayList arrayList3 = arrayList;
                b2.close();
                mVar.f0();
                return arrayList3;
            } catch (Throwable th2) {
                th = th2;
                b2.close();
                mVar.f0();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            mVar = k;
        }
    }

    @Override // com.health.openworkout.core.database.e
    public void c(long j) {
        this.f3406a.b();
        b.o.a.f a2 = this.f3411f.a();
        a2.x(1, j);
        this.f3406a.c();
        try {
            a2.C();
            this.f3406a.r();
        } finally {
            this.f3406a.g();
            this.f3411f.f(a2);
        }
    }

    @Override // com.health.openworkout.core.database.e
    public void clear() {
        this.f3406a.b();
        b.o.a.f a2 = this.f3410e.a();
        this.f3406a.c();
        try {
            a2.C();
            this.f3406a.r();
        } finally {
            this.f3406a.g();
            this.f3410e.f(a2);
        }
    }

    @Override // com.health.openworkout.core.database.e
    public void d(List<WorkoutItem> list) {
        this.f3406a.b();
        this.f3406a.c();
        try {
            this.f3407b.h(list);
            this.f3406a.r();
        } finally {
            this.f3406a.g();
        }
    }

    @Override // com.health.openworkout.core.database.e
    public void e(WorkoutItem workoutItem) {
        this.f3406a.b();
        this.f3406a.c();
        try {
            this.f3409d.h(workoutItem);
            this.f3406a.r();
        } finally {
            this.f3406a.g();
        }
    }

    @Override // com.health.openworkout.core.database.e
    public long f(WorkoutItem workoutItem) {
        this.f3406a.b();
        this.f3406a.c();
        try {
            long i = this.f3407b.i(workoutItem);
            this.f3406a.r();
            return i;
        } finally {
            this.f3406a.g();
        }
    }

    @Override // com.health.openworkout.core.database.e
    public List<WorkoutItem> g() {
        m mVar;
        Throwable th;
        int i;
        boolean z;
        boolean z2;
        m k = m.k("SELECT * FROM WorkoutItem GROUP BY name", 0);
        this.f3406a.b();
        Cursor b2 = androidx.room.s.c.b(this.f3406a, k, false, null);
        try {
            int b3 = androidx.room.s.b.b(b2, "workoutItemId");
            int b4 = androidx.room.s.b.b(b2, "workoutSessionId");
            int b5 = androidx.room.s.b.b(b2, "orderNr");
            int b6 = androidx.room.s.b.b(b2, "name");
            int b7 = androidx.room.s.b.b(b2, "description");
            int b8 = androidx.room.s.b.b(b2, "elapsedTime");
            int b9 = androidx.room.s.b.b(b2, "imagePath");
            int b10 = androidx.room.s.b.b(b2, "isImagePathExternal");
            int b11 = androidx.room.s.b.b(b2, "isVideoMode");
            int b12 = androidx.room.s.b.b(b2, "videoPath");
            int b13 = androidx.room.s.b.b(b2, "isVideoPathExternal");
            int b14 = androidx.room.s.b.b(b2, "prepTime");
            int b15 = androidx.room.s.b.b(b2, "workoutTime");
            int b16 = androidx.room.s.b.b(b2, "breakTime");
            mVar = k;
            try {
                int b17 = androidx.room.s.b.b(b2, "repetitionCount");
                int b18 = androidx.room.s.b.b(b2, "isTimeMode");
                int b19 = androidx.room.s.b.b(b2, "finished");
                int i2 = b16;
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    WorkoutItem workoutItem = new WorkoutItem();
                    int i3 = b15;
                    ArrayList arrayList2 = arrayList;
                    workoutItem.setWorkoutItemId(b2.getLong(b3));
                    workoutItem.setWorkoutSessionId(b2.getLong(b4));
                    workoutItem.setOrderNr(b2.getLong(b5));
                    workoutItem.setName(b2.getString(b6));
                    workoutItem.setDescription(b2.getString(b7));
                    workoutItem.setElapsedTime(b2.getLong(b8));
                    workoutItem.setImagePath(b2.getString(b9));
                    workoutItem.setImagePathExternal(b2.getInt(b10) != 0);
                    workoutItem.setVideoMode(b2.getInt(b11) != 0);
                    workoutItem.setVideoPath(b2.getString(b12));
                    workoutItem.setVideoPathExternal(b2.getInt(b13) != 0);
                    workoutItem.setPrepTime(b2.getInt(b14));
                    workoutItem.setWorkoutTime(b2.getInt(i3));
                    int i4 = i2;
                    int i5 = b3;
                    workoutItem.setBreakTime(b2.getInt(i4));
                    int i6 = b17;
                    workoutItem.setRepetitionCount(b2.getInt(i6));
                    int i7 = b18;
                    if (b2.getInt(i7) != 0) {
                        i = i6;
                        z = true;
                    } else {
                        i = i6;
                        z = false;
                    }
                    workoutItem.setTimeMode(z);
                    int i8 = b19;
                    if (b2.getInt(i8) != 0) {
                        b19 = i8;
                        z2 = true;
                    } else {
                        b19 = i8;
                        z2 = false;
                    }
                    workoutItem.setFinished(z2);
                    arrayList2.add(workoutItem);
                    arrayList = arrayList2;
                    b3 = i5;
                    i2 = i4;
                    int i9 = i;
                    b18 = i7;
                    b15 = i3;
                    b17 = i9;
                }
                ArrayList arrayList3 = arrayList;
                b2.close();
                mVar.f0();
                return arrayList3;
            } catch (Throwable th2) {
                th = th2;
                b2.close();
                mVar.f0();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            mVar = k;
        }
    }

    @Override // com.health.openworkout.core.database.e
    public void h(WorkoutItem workoutItem) {
        this.f3406a.b();
        this.f3406a.c();
        try {
            this.f3408c.h(workoutItem);
            this.f3406a.r();
        } finally {
            this.f3406a.g();
        }
    }
}
