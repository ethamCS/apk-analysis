package p9;

import android.database.Cursor;
import androidx.room.i0;
import androidx.room.j0;
import h1.f;
import h1.g;
import h1.l;
import h1.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import m1.k;
import tb.e0;
/* loaded from: classes.dex */
public final class c extends p9.a {

    /* renamed from: a */
    private final i0 f19005a;

    /* renamed from: b */
    private final g<p9.d> f19006b;

    /* renamed from: c */
    private final m f19007c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends g<p9.d> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i0 i0Var) {
            super(i0Var);
            c.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "INSERT OR ABORT INTO `countries` (`countryId`,`countryCode`) VALUES (nullif(?, 0),?)";
        }

        /* renamed from: k */
        public void g(k kVar, p9.d dVar) {
            kVar.A0(1, dVar.b());
            if (dVar.a() == null) {
                kVar.a0(2);
            } else {
                kVar.K(2, dVar.a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i0 i0Var) {
            super(i0Var);
            c.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "DELETE FROM countries";
        }
    }

    /* renamed from: p9.c$c */
    /* loaded from: classes.dex */
    class CallableC0298c implements Callable<e0> {

        /* renamed from: a */
        final /* synthetic */ p9.d f19010a;

        CallableC0298c(p9.d dVar) {
            c.this = r1;
            this.f19010a = dVar;
        }

        /* renamed from: a */
        public e0 call() {
            c.this.f19005a.e();
            try {
                c.this.f19006b.h(this.f19010a);
                c.this.f19005a.D();
                return e0.f22152a;
            } finally {
                c.this.f19005a.i();
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements Callable<e0> {
        d() {
            c.this = r1;
        }

        /* renamed from: a */
        public e0 call() {
            k a10 = c.this.f19007c.a();
            c.this.f19005a.e();
            try {
                a10.S();
                c.this.f19005a.D();
                return e0.f22152a;
            } finally {
                c.this.f19005a.i();
                c.this.f19007c.f(a10);
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements Callable<List<p9.d>> {

        /* renamed from: a */
        final /* synthetic */ l f19013a;

        e(l lVar) {
            c.this = r1;
            this.f19013a = lVar;
        }

        /* renamed from: a */
        public List<p9.d> call() {
            Cursor c10 = j1.c.c(c.this.f19005a, this.f19013a, false, null);
            try {
                int e10 = j1.b.e(c10, "countryId");
                int e11 = j1.b.e(c10, "countryCode");
                ArrayList arrayList = new ArrayList(c10.getCount());
                while (c10.moveToNext()) {
                    arrayList.add(new p9.d(c10.getLong(e10), c10.isNull(e11) ? null : c10.getString(e11)));
                }
                return arrayList;
            } finally {
                c10.close();
                this.f19013a.j();
            }
        }
    }

    public c(i0 i0Var) {
        this.f19005a = i0Var;
        this.f19006b = new a(i0Var);
        this.f19007c = new b(i0Var);
    }

    public static List<Class<?>> k() {
        return Collections.emptyList();
    }

    public /* synthetic */ Object l(Collection collection, xb.d dVar) {
        return super.d(collection, dVar);
    }

    @Override // p9.a
    public Object a(xb.d<? super e0> dVar) {
        return f.b(this.f19005a, true, new d(), dVar);
    }

    @Override // p9.a
    public Object b(xb.d<? super List<p9.d>> dVar) {
        l f10 = l.f("SELECT * from countries", 0);
        return f.a(this.f19005a, false, j1.c.a(), new e(f10), dVar);
    }

    @Override // p9.a
    public Object c(p9.d dVar, xb.d<? super e0> dVar2) {
        return f.b(this.f19005a, true, new CallableC0298c(dVar), dVar2);
    }

    @Override // p9.a
    public Object d(final Collection<String> collection, xb.d<? super e0> dVar) {
        return j0.d(this.f19005a, new gc.l() { // from class: p9.b
            @Override // gc.l
            public final Object invoke(Object obj) {
                Object l10;
                l10 = c.this.l(collection, (xb.d) obj);
                return l10;
            }
        }, dVar);
    }
}
