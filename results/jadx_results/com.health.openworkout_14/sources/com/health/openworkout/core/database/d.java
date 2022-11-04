package com.health.openworkout.core.database;

import android.database.Cursor;
import androidx.room.j;
import androidx.room.m;
import com.health.openworkout.core.datatypes.User;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class d implements com.health.openworkout.core.database.c {

    /* renamed from: a */
    private final j f3403a;

    /* renamed from: b */
    private final androidx.room.c<User> f3404b;

    /* renamed from: c */
    private final androidx.room.b<User> f3405c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends androidx.room.c<User> {
        a(d dVar, j jVar) {
            super(jVar);
        }

        @Override // androidx.room.p
        public String d() {
            return "INSERT OR ABORT INTO `User` (`userId`,`trainingsPlanId`,`isMale`) VALUES (nullif(?, 0),?,?)";
        }

        /* renamed from: j */
        public void g(b.o.a.f fVar, User user) {
            fVar.x(1, user.getUserId());
            fVar.x(2, user.getTrainingsPlanId());
            fVar.x(3, user.isMale() ? 1L : 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends androidx.room.b<User> {
        b(d dVar, j jVar) {
            super(jVar);
        }

        @Override // androidx.room.p
        public String d() {
            return "DELETE FROM `User` WHERE `userId` = ?";
        }

        /* renamed from: i */
        public void g(b.o.a.f fVar, User user) {
            fVar.x(1, user.getUserId());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends androidx.room.b<User> {
        c(d dVar, j jVar) {
            super(jVar);
        }

        @Override // androidx.room.p
        public String d() {
            return "UPDATE OR ABORT `User` SET `userId` = ?,`trainingsPlanId` = ?,`isMale` = ? WHERE `userId` = ?";
        }

        /* renamed from: i */
        public void g(b.o.a.f fVar, User user) {
            fVar.x(1, user.getUserId());
            fVar.x(2, user.getTrainingsPlanId());
            fVar.x(3, user.isMale() ? 1L : 0L);
            fVar.x(4, user.getUserId());
        }
    }

    public d(j jVar) {
        this.f3403a = jVar;
        this.f3404b = new a(this, jVar);
        new b(this, jVar);
        this.f3405c = new c(this, jVar);
    }

    @Override // com.health.openworkout.core.database.c
    public void a(User user) {
        this.f3403a.b();
        this.f3403a.c();
        try {
            this.f3405c.h(user);
            this.f3403a.r();
        } finally {
            this.f3403a.g();
        }
    }

    @Override // com.health.openworkout.core.database.c
    public List<User> b() {
        m k = m.k("SELECT * FROM User", 0);
        this.f3403a.b();
        Cursor b2 = androidx.room.s.c.b(this.f3403a, k, false, null);
        try {
            int b3 = androidx.room.s.b.b(b2, "userId");
            int b4 = androidx.room.s.b.b(b2, "trainingsPlanId");
            int b5 = androidx.room.s.b.b(b2, "isMale");
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                User user = new User();
                user.setUserId(b2.getLong(b3));
                user.setTrainingsPlanId(b2.getLong(b4));
                user.setMale(b2.getInt(b5) != 0);
                arrayList.add(user);
            }
            return arrayList;
        } finally {
            b2.close();
            k.f0();
        }
    }

    @Override // com.health.openworkout.core.database.c
    public long c(User user) {
        this.f3403a.b();
        this.f3403a.c();
        try {
            long i = this.f3404b.i(user);
            this.f3403a.r();
            return i;
        } finally {
            this.f3403a.g();
        }
    }
}
