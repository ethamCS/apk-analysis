package com.health.openworkout.core.database;

import androidx.room.j;
/* loaded from: classes.dex */
public abstract class AppDatabase extends j {
    public static final androidx.room.r.a j = new a(1, 2);

    /* loaded from: classes.dex */
    static class a extends androidx.room.r.a {
        a(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.room.r.a
        public void a(b.o.a.b bVar) {
            bVar.h();
            try {
                bVar.t("ALTER TABLE workoutItem ADD isVideoMode INTEGER NOT NULL default 1");
                bVar.B();
            } finally {
                bVar.g();
            }
        }
    }

    public abstract com.health.openworkout.core.database.a s();

    public abstract c t();

    public abstract e u();

    public abstract g v();
}
