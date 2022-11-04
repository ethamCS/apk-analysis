package c2;

import android.database.Cursor;
import androidx.room.i0;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a */
    private final i0 f6133a;

    /* renamed from: b */
    private final h1.g<c2.a> f6134b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h1.g<c2.a> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i0 i0Var) {
            super(i0Var);
            c.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        /* renamed from: k */
        public void g(m1.k kVar, c2.a aVar) {
            String str = aVar.f6131a;
            if (str == null) {
                kVar.a0(1);
            } else {
                kVar.K(1, str);
            }
            String str2 = aVar.f6132b;
            if (str2 == null) {
                kVar.a0(2);
            } else {
                kVar.K(2, str2);
            }
        }
    }

    public c(i0 i0Var) {
        this.f6133a = i0Var;
        this.f6134b = new a(i0Var);
    }

    @Override // c2.b
    public boolean a(String str) {
        boolean z10 = true;
        h1.l f10 = h1.l.f("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            f10.a0(1);
        } else {
            f10.K(1, str);
        }
        this.f6133a.d();
        boolean z11 = false;
        Cursor c10 = j1.c.c(this.f6133a, f10, false, null);
        try {
            if (c10.moveToFirst()) {
                if (c10.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            return z11;
        } finally {
            c10.close();
            f10.j();
        }
    }

    @Override // c2.b
    public void b(c2.a aVar) {
        this.f6133a.d();
        this.f6133a.e();
        try {
            this.f6134b.h(aVar);
            this.f6133a.D();
        } finally {
            this.f6133a.i();
        }
    }

    @Override // c2.b
    public boolean c(String str) {
        boolean z10 = true;
        h1.l f10 = h1.l.f("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            f10.a0(1);
        } else {
            f10.K(1, str);
        }
        this.f6133a.d();
        boolean z11 = false;
        Cursor c10 = j1.c.c(this.f6133a, f10, false, null);
        try {
            if (c10.moveToFirst()) {
                if (c10.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            return z11;
        } finally {
            c10.close();
            f10.j();
        }
    }

    @Override // c2.b
    public List<String> d(String str) {
        h1.l f10 = h1.l.f("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            f10.a0(1);
        } else {
            f10.K(1, str);
        }
        this.f6133a.d();
        Cursor c10 = j1.c.c(this.f6133a, f10, false, null);
        try {
            ArrayList arrayList = new ArrayList(c10.getCount());
            while (c10.moveToNext()) {
                arrayList.add(c10.getString(0));
            }
            return arrayList;
        } finally {
            c10.close();
            f10.j();
        }
    }
}
