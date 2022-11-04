package s9;

import android.database.Cursor;
import androidx.room.i0;
import androidx.room.j0;
import h1.g;
import h1.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import m1.k;
import tb.e0;
/* loaded from: classes.dex */
public final class e extends s9.c {

    /* renamed from: a */
    private final i0 f21550a;

    /* renamed from: b */
    private final g<s9.a> f21551b;

    /* renamed from: c */
    private final o9.a f21552c = new o9.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends g<s9.a> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i0 i0Var) {
            super(i0Var);
            e.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "INSERT OR ABORT INTO `covpass_valuesets` (`id`,`valueSetId`,`valueSetDate`,`valueSetValues`,`hash`) VALUES (nullif(?, 0),?,?,?,?)";
        }

        /* renamed from: k */
        public void g(k kVar, s9.a aVar) {
            kVar.A0(1, aVar.b());
            if (aVar.d() == null) {
                kVar.a0(2);
            } else {
                kVar.K(2, aVar.d());
            }
            kVar.A0(3, e.this.f21552c.d(aVar.c()));
            if (aVar.e() == null) {
                kVar.a0(4);
            } else {
                kVar.K(4, aVar.e());
            }
            if (aVar.a() == null) {
                kVar.a0(5);
            } else {
                kVar.K(5, aVar.a());
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Callable<e0> {

        /* renamed from: a */
        final /* synthetic */ s9.a[] f21554a;

        b(s9.a[] aVarArr) {
            e.this = r1;
            this.f21554a = aVarArr;
        }

        /* renamed from: a */
        public e0 call() {
            e.this.f21550a.e();
            try {
                e.this.f21551b.i(this.f21554a);
                e.this.f21550a.D();
                return e0.f22152a;
            } finally {
                e.this.f21550a.i();
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Callable<List<s9.a>> {

        /* renamed from: a */
        final /* synthetic */ l f21556a;

        c(l lVar) {
            e.this = r1;
            this.f21556a = lVar;
        }

        /* renamed from: a */
        public List<s9.a> call() {
            Cursor c10 = j1.c.c(e.this.f21550a, this.f21556a, false, null);
            try {
                int e10 = j1.b.e(c10, "id");
                int e11 = j1.b.e(c10, "valueSetId");
                int e12 = j1.b.e(c10, "valueSetDate");
                int e13 = j1.b.e(c10, "valueSetValues");
                int e14 = j1.b.e(c10, "hash");
                ArrayList arrayList = new ArrayList(c10.getCount());
                while (c10.moveToNext()) {
                    arrayList.add(new s9.a(c10.getInt(e10), c10.isNull(e11) ? null : c10.getString(e11), e.this.f21552c.e(Long.valueOf(c10.getLong(e12))), c10.isNull(e13) ? null : c10.getString(e13), c10.isNull(e14) ? null : c10.getString(e14)));
                }
                return arrayList;
            } finally {
                c10.close();
                this.f21556a.j();
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements Callable<e0> {

        /* renamed from: a */
        final /* synthetic */ Collection f21558a;

        d(Collection collection) {
            e.this = r1;
            this.f21558a = collection;
        }

        /* renamed from: a */
        public e0 call() {
            StringBuilder b10 = j1.f.b();
            b10.append("DELETE FROM covpass_valuesets WHERE valueSetId NOT IN (");
            j1.f.a(b10, this.f21558a.size());
            b10.append(")");
            k f10 = e.this.f21550a.f(b10.toString());
            int i10 = 1;
            for (String str : this.f21558a) {
                if (str == null) {
                    f10.a0(i10);
                } else {
                    f10.K(i10, str);
                }
                i10++;
            }
            e.this.f21550a.e();
            try {
                f10.S();
                e.this.f21550a.D();
                return e0.f22152a;
            } finally {
                e.this.f21550a.i();
            }
        }
    }

    public e(i0 i0Var) {
        this.f21550a = i0Var;
        this.f21551b = new a(i0Var);
    }

    public static List<Class<?>> l() {
        return Collections.emptyList();
    }

    public /* synthetic */ Object m(Collection collection, Collection collection2, xb.d dVar) {
        return super.e(collection, collection2, dVar);
    }

    @Override // s9.c
    public Object a(Collection<String> collection, xb.d<? super e0> dVar) {
        return h1.f.b(this.f21550a, true, new d(collection), dVar);
    }

    @Override // s9.c
    public Object c(xb.d<? super List<s9.a>> dVar) {
        l f10 = l.f("SELECT * from covpass_valuesets", 0);
        return h1.f.a(this.f21550a, false, j1.c.a(), new c(f10), dVar);
    }

    @Override // s9.c
    public Object d(s9.a[] aVarArr, xb.d<? super e0> dVar) {
        return h1.f.b(this.f21550a, true, new b(aVarArr), dVar);
    }

    @Override // s9.c
    public Object e(final Collection<String> collection, final Collection<s9.a> collection2, xb.d<? super e0> dVar) {
        return j0.d(this.f21550a, new gc.l() { // from class: s9.d
            @Override // gc.l
            public final Object invoke(Object obj) {
                Object m10;
                m10 = e.this.m(collection, collection2, (xb.d) obj);
                return m10;
            }
        }, dVar);
    }
}
