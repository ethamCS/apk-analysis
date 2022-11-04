package c2;

import android.database.Cursor;
import androidx.room.i0;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a */
    private final i0 f6143a;

    /* renamed from: b */
    private final h1.g<g> f6144b;

    /* renamed from: c */
    private final h1.m f6145c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h1.g<g> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i0 i0Var) {
            super(i0Var);
            i.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        /* renamed from: k */
        public void g(m1.k kVar, g gVar) {
            String str = gVar.f6141a;
            if (str == null) {
                kVar.a0(1);
            } else {
                kVar.K(1, str);
            }
            kVar.A0(2, gVar.f6142b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends h1.m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i0 i0Var) {
            super(i0Var);
            i.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(i0 i0Var) {
        this.f6143a = i0Var;
        this.f6144b = new a(i0Var);
        this.f6145c = new b(i0Var);
    }

    @Override // c2.h
    public List<String> a() {
        h1.l f10 = h1.l.f("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f6143a.d();
        Cursor c10 = j1.c.c(this.f6143a, f10, false, null);
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

    @Override // c2.h
    public void b(g gVar) {
        this.f6143a.d();
        this.f6143a.e();
        try {
            this.f6144b.h(gVar);
            this.f6143a.D();
        } finally {
            this.f6143a.i();
        }
    }

    @Override // c2.h
    public g c(String str) {
        h1.l f10 = h1.l.f("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            f10.a0(1);
        } else {
            f10.K(1, str);
        }
        this.f6143a.d();
        g gVar = null;
        Cursor c10 = j1.c.c(this.f6143a, f10, false, null);
        try {
            int e10 = j1.b.e(c10, "work_spec_id");
            int e11 = j1.b.e(c10, "system_id");
            if (c10.moveToFirst()) {
                gVar = new g(c10.getString(e10), c10.getInt(e11));
            }
            return gVar;
        } finally {
            c10.close();
            f10.j();
        }
    }

    @Override // c2.h
    public void d(String str) {
        this.f6143a.d();
        m1.k a10 = this.f6145c.a();
        if (str == null) {
            a10.a0(1);
        } else {
            a10.K(1, str);
        }
        this.f6143a.e();
        try {
            a10.S();
            this.f6143a.D();
        } finally {
            this.f6143a.i();
            this.f6145c.f(a10);
        }
    }
}
