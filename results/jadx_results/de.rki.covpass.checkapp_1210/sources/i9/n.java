package i9;

import android.database.Cursor;
import androidx.room.i0;
import androidx.room.j0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import tb.e0;
/* loaded from: classes.dex */
public final class n extends k {

    /* renamed from: a */
    private final i0 f12455a;

    /* renamed from: b */
    private final h1.g<o> f12456b;

    /* renamed from: c */
    private final g f12457c = new g();

    /* renamed from: d */
    private final h1.m f12458d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h1.g<o> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i0 i0Var) {
            super(i0Var);
            n.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "INSERT OR REPLACE INTO `revocation_kid_list` (`kid`,`hashVariants`) VALUES (?,?)";
        }

        /* renamed from: k */
        public void g(m1.k kVar, o oVar) {
            if (oVar.b() == null) {
                kVar.a0(1);
            } else {
                kVar.L0(1, oVar.b());
            }
            String b10 = n.this.f12457c.b(oVar.a());
            if (b10 == null) {
                kVar.a0(2);
            } else {
                kVar.K(2, b10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends h1.m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i0 i0Var) {
            super(i0Var);
            n.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "DELETE FROM revocation_kid_list";
        }
    }

    /* loaded from: classes.dex */
    class c implements Callable<Long> {

        /* renamed from: a */
        final /* synthetic */ o f12461a;

        c(o oVar) {
            n.this = r1;
            this.f12461a = oVar;
        }

        /* renamed from: a */
        public Long call() {
            n.this.f12455a.e();
            try {
                long j10 = n.this.f12456b.j(this.f12461a);
                n.this.f12455a.D();
                return Long.valueOf(j10);
            } finally {
                n.this.f12455a.i();
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements Callable<e0> {
        d() {
            n.this = r1;
        }

        /* renamed from: a */
        public e0 call() {
            m1.k a10 = n.this.f12458d.a();
            n.this.f12455a.e();
            try {
                a10.S();
                n.this.f12455a.D();
                return e0.f22152a;
            } finally {
                n.this.f12455a.i();
                n.this.f12458d.f(a10);
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements Callable<List<o>> {

        /* renamed from: a */
        final /* synthetic */ h1.l f12464a;

        e(h1.l lVar) {
            n.this = r1;
            this.f12464a = lVar;
        }

        /* renamed from: a */
        public List<o> call() {
            Cursor c10 = j1.c.c(n.this.f12455a, this.f12464a, false, null);
            try {
                int e10 = j1.b.e(c10, "kid");
                int e11 = j1.b.e(c10, "hashVariants");
                ArrayList arrayList = new ArrayList(c10.getCount());
                while (c10.moveToNext()) {
                    arrayList.add(new o(c10.isNull(e10) ? null : c10.getBlob(e10), n.this.f12457c.e(c10.isNull(e11) ? null : c10.getString(e11))));
                }
                return arrayList;
            } finally {
                c10.close();
                this.f12464a.j();
            }
        }
    }

    public n(i0 i0Var) {
        this.f12455a = i0Var;
        this.f12456b = new a(i0Var);
        this.f12458d = new b(i0Var);
    }

    public static List<Class<?>> p() {
        return Collections.emptyList();
    }

    public /* synthetic */ Object q(List list, xb.d dVar) {
        return super.c(list, dVar);
    }

    public /* synthetic */ Object r(List list, xb.d dVar) {
        return super.f(list, dVar);
    }

    @Override // i9.k
    public Object a(xb.d<? super e0> dVar) {
        return h1.f.b(this.f12455a, true, new d(), dVar);
    }

    @Override // i9.k
    public Object b(xb.d<? super List<o>> dVar) {
        h1.l f10 = h1.l.f("SELECT * FROM revocation_kid_list", 0);
        return h1.f.a(this.f12455a, false, j1.c.a(), new e(f10), dVar);
    }

    @Override // i9.k
    public Object c(final List<o> list, xb.d<? super e0> dVar) {
        return j0.d(this.f12455a, new gc.l() { // from class: i9.l
            @Override // gc.l
            public final Object invoke(Object obj) {
                Object q10;
                q10 = n.this.q(list, (xb.d) obj);
                return q10;
            }
        }, dVar);
    }

    @Override // i9.k
    public Object e(o oVar, xb.d<? super Long> dVar) {
        return h1.f.b(this.f12455a, true, new c(oVar), dVar);
    }

    @Override // i9.k
    public Object f(final List<o> list, xb.d<? super e0> dVar) {
        return j0.d(this.f12455a, new gc.l() { // from class: i9.m
            @Override // gc.l
            public final Object invoke(Object obj) {
                Object r10;
                r10 = n.this.r(list, (xb.d) obj);
                return r10;
            }
        }, dVar);
    }
}
