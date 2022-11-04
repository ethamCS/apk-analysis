package i9;

import android.database.Cursor;
import androidx.room.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import tb.e0;
/* loaded from: classes.dex */
public final class i extends i9.h {

    /* renamed from: a */
    private final i0 f12422a;

    /* renamed from: b */
    private final h1.g<i9.j> f12423b;

    /* renamed from: c */
    private final i9.g f12424c = new i9.g();

    /* renamed from: d */
    private final h1.m f12425d;

    /* renamed from: e */
    private final h1.m f12426e;

    /* renamed from: f */
    private final h1.m f12427f;

    /* loaded from: classes.dex */
    class a implements Callable<i9.j> {

        /* renamed from: a */
        final /* synthetic */ h1.l f12428a;

        a(h1.l lVar) {
            i.this = r1;
            this.f12428a = lVar;
        }

        /* renamed from: a */
        public i9.j call() {
            i9.j jVar = null;
            String str = null;
            Cursor c10 = j1.c.c(i.this.f12422a, this.f12428a, false, null);
            try {
                int e10 = j1.b.e(c10, "kid");
                int e11 = j1.b.e(c10, "hashVariant");
                int e12 = j1.b.e(c10, "index");
                if (c10.moveToFirst()) {
                    byte[] blob = c10.isNull(e10) ? null : c10.getBlob(e10);
                    byte b10 = (byte) c10.getShort(e11);
                    if (!c10.isNull(e12)) {
                        str = c10.getString(e12);
                    }
                    jVar = new i9.j(blob, b10, i.this.f12424c.f(str));
                }
                return jVar;
            } finally {
                c10.close();
                this.f12428a.j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends h1.g<i9.j> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i0 i0Var) {
            super(i0Var);
            i.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "INSERT OR REPLACE INTO `revocation_index_list` (`kid`,`hashVariant`,`index`) VALUES (?,?,?)";
        }

        /* renamed from: k */
        public void g(m1.k kVar, i9.j jVar) {
            if (jVar.c() == null) {
                kVar.a0(1);
            } else {
                kVar.L0(1, jVar.c());
            }
            kVar.A0(2, jVar.a());
            String c10 = i.this.f12424c.c(jVar.b());
            if (c10 == null) {
                kVar.a0(3);
            } else {
                kVar.K(3, c10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends h1.m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(i0 i0Var) {
            super(i0Var);
            i.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "DELETE FROM revocation_index_list";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends h1.m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(i0 i0Var) {
            super(i0Var);
            i.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "DELETE FROM revocation_index_list WHERE ? = kid";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e extends h1.m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(i0 i0Var) {
            super(i0Var);
            i.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "DELETE FROM revocation_index_list WHERE ? = kid AND ? = hashVariant";
        }
    }

    /* loaded from: classes.dex */
    class f implements Callable<Long> {

        /* renamed from: a */
        final /* synthetic */ i9.j f12434a;

        f(i9.j jVar) {
            i.this = r1;
            this.f12434a = jVar;
        }

        /* renamed from: a */
        public Long call() {
            i.this.f12422a.e();
            try {
                long j10 = i.this.f12423b.j(this.f12434a);
                i.this.f12422a.D();
                return Long.valueOf(j10);
            } finally {
                i.this.f12422a.i();
            }
        }
    }

    /* loaded from: classes.dex */
    class g implements Callable<e0> {
        g() {
            i.this = r1;
        }

        /* renamed from: a */
        public e0 call() {
            m1.k a10 = i.this.f12425d.a();
            i.this.f12422a.e();
            try {
                a10.S();
                i.this.f12422a.D();
                return e0.f22152a;
            } finally {
                i.this.f12422a.i();
                i.this.f12425d.f(a10);
            }
        }
    }

    /* loaded from: classes.dex */
    class h implements Callable<e0> {

        /* renamed from: a */
        final /* synthetic */ byte[] f12437a;

        h(byte[] bArr) {
            i.this = r1;
            this.f12437a = bArr;
        }

        /* renamed from: a */
        public e0 call() {
            m1.k a10 = i.this.f12426e.a();
            byte[] bArr = this.f12437a;
            if (bArr == null) {
                a10.a0(1);
            } else {
                a10.L0(1, bArr);
            }
            i.this.f12422a.e();
            try {
                a10.S();
                i.this.f12422a.D();
                return e0.f22152a;
            } finally {
                i.this.f12422a.i();
                i.this.f12426e.f(a10);
            }
        }
    }

    /* renamed from: i9.i$i */
    /* loaded from: classes.dex */
    class CallableC0186i implements Callable<e0> {

        /* renamed from: a */
        final /* synthetic */ byte[] f12439a;

        /* renamed from: b */
        final /* synthetic */ byte f12440b;

        CallableC0186i(byte[] bArr, byte b10) {
            i.this = r1;
            this.f12439a = bArr;
            this.f12440b = b10;
        }

        /* renamed from: a */
        public e0 call() {
            m1.k a10 = i.this.f12427f.a();
            byte[] bArr = this.f12439a;
            if (bArr == null) {
                a10.a0(1);
            } else {
                a10.L0(1, bArr);
            }
            a10.A0(2, this.f12440b);
            i.this.f12422a.e();
            try {
                a10.S();
                i.this.f12422a.D();
                return e0.f22152a;
            } finally {
                i.this.f12422a.i();
                i.this.f12427f.f(a10);
            }
        }
    }

    /* loaded from: classes.dex */
    class j implements Callable<List<i9.j>> {

        /* renamed from: a */
        final /* synthetic */ h1.l f12442a;

        j(h1.l lVar) {
            i.this = r1;
            this.f12442a = lVar;
        }

        /* renamed from: a */
        public List<i9.j> call() {
            Cursor c10 = j1.c.c(i.this.f12422a, this.f12442a, false, null);
            try {
                int e10 = j1.b.e(c10, "kid");
                int e11 = j1.b.e(c10, "hashVariant");
                int e12 = j1.b.e(c10, "index");
                ArrayList arrayList = new ArrayList(c10.getCount());
                while (c10.moveToNext()) {
                    arrayList.add(new i9.j(c10.isNull(e10) ? null : c10.getBlob(e10), (byte) c10.getShort(e11), i.this.f12424c.f(c10.isNull(e12) ? null : c10.getString(e12))));
                }
                return arrayList;
            } finally {
                c10.close();
                this.f12442a.j();
            }
        }
    }

    public i(i0 i0Var) {
        this.f12422a = i0Var;
        this.f12423b = new b(i0Var);
        this.f12425d = new c(i0Var);
        this.f12426e = new d(i0Var);
        this.f12427f = new e(i0Var);
    }

    public static List<Class<?>> m() {
        return Collections.emptyList();
    }

    @Override // i9.h
    public Object a(xb.d<? super e0> dVar) {
        return h1.f.b(this.f12422a, true, new g(), dVar);
    }

    @Override // i9.h
    public Object b(byte[] bArr, xb.d<? super e0> dVar) {
        return h1.f.b(this.f12422a, true, new h(bArr), dVar);
    }

    @Override // i9.h
    public Object c(byte[] bArr, byte b10, xb.d<? super e0> dVar) {
        return h1.f.b(this.f12422a, true, new CallableC0186i(bArr, b10), dVar);
    }

    @Override // i9.h
    public Object d(xb.d<? super List<i9.j>> dVar) {
        h1.l f10 = h1.l.f("SELECT * FROM revocation_index_list", 0);
        return h1.f.a(this.f12422a, false, j1.c.a(), new j(f10), dVar);
    }

    @Override // i9.h
    public Object e(byte[] bArr, byte b10, xb.d<? super i9.j> dVar) {
        h1.l f10 = h1.l.f("SELECT * FROM revocation_index_list WHERE ? = kid AND ? = hashVariant", 2);
        if (bArr == null) {
            f10.a0(1);
        } else {
            f10.L0(1, bArr);
        }
        f10.A0(2, b10);
        return h1.f.a(this.f12422a, false, j1.c.a(), new a(f10), dVar);
    }

    @Override // i9.h
    public Object f(i9.j jVar, xb.d<? super Long> dVar) {
        return h1.f.b(this.f12422a, true, new f(jVar), dVar);
    }
}
