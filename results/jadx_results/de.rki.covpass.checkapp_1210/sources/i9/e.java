package i9;

import android.database.Cursor;
import androidx.room.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import tb.e0;
/* loaded from: classes.dex */
public final class e extends i9.d {

    /* renamed from: a */
    private final i0 f12381a;

    /* renamed from: b */
    private final h1.g<i9.f> f12382b;

    /* renamed from: c */
    private final i9.g f12383c = new i9.g();

    /* renamed from: d */
    private final h1.m f12384d;

    /* renamed from: e */
    private final h1.m f12385e;

    /* renamed from: f */
    private final h1.m f12386f;

    /* renamed from: g */
    private final h1.m f12387g;

    /* renamed from: h */
    private final h1.m f12388h;

    /* loaded from: classes.dex */
    class a implements Callable<e0> {
        a() {
            e.this = r1;
        }

        /* renamed from: a */
        public e0 call() {
            m1.k a10 = e.this.f12386f.a();
            e.this.f12381a.e();
            try {
                a10.S();
                e.this.f12381a.D();
                return e0.f22152a;
            } finally {
                e.this.f12381a.i();
                e.this.f12386f.f(a10);
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Callable<e0> {

        /* renamed from: a */
        final /* synthetic */ byte[] f12390a;

        /* renamed from: b */
        final /* synthetic */ byte f12391b;

        b(byte[] bArr, byte b10) {
            e.this = r1;
            this.f12390a = bArr;
            this.f12391b = b10;
        }

        /* renamed from: a */
        public e0 call() {
            m1.k a10 = e.this.f12387g.a();
            byte[] bArr = this.f12390a;
            if (bArr == null) {
                a10.a0(1);
            } else {
                a10.L0(1, bArr);
            }
            a10.A0(2, this.f12391b);
            e.this.f12381a.e();
            try {
                a10.S();
                e.this.f12381a.D();
                return e0.f22152a;
            } finally {
                e.this.f12381a.i();
                e.this.f12387g.f(a10);
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Callable<e0> {

        /* renamed from: a */
        final /* synthetic */ byte[] f12393a;

        c(byte[] bArr) {
            e.this = r1;
            this.f12393a = bArr;
        }

        /* renamed from: a */
        public e0 call() {
            m1.k a10 = e.this.f12388h.a();
            byte[] bArr = this.f12393a;
            if (bArr == null) {
                a10.a0(1);
            } else {
                a10.L0(1, bArr);
            }
            e.this.f12381a.e();
            try {
                a10.S();
                e.this.f12381a.D();
                return e0.f22152a;
            } finally {
                e.this.f12381a.i();
                e.this.f12388h.f(a10);
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements Callable<List<i9.f>> {

        /* renamed from: a */
        final /* synthetic */ h1.l f12395a;

        d(h1.l lVar) {
            e.this = r1;
            this.f12395a = lVar;
        }

        /* renamed from: a */
        public List<i9.f> call() {
            Cursor c10 = j1.c.c(e.this.f12381a, this.f12395a, false, null);
            try {
                int e10 = j1.b.e(c10, "kid");
                int e11 = j1.b.e(c10, "hashVariant");
                int e12 = j1.b.e(c10, "byteOne");
                int e13 = j1.b.e(c10, "byteTwo");
                int e14 = j1.b.e(c10, "chunks");
                int e15 = j1.b.e(c10, "timestamp");
                ArrayList arrayList = new ArrayList(c10.getCount());
                while (c10.moveToNext()) {
                    arrayList.add(new i9.f(c10.isNull(e10) ? null : c10.getBlob(e10), (byte) c10.getShort(e11), (byte) c10.getShort(e12), (byte) c10.getShort(e13), e.this.f12383c.d(c10.isNull(e14) ? null : c10.getString(e14)), c10.getLong(e15)));
                }
                return arrayList;
            } finally {
                c10.close();
                this.f12395a.j();
            }
        }
    }

    /* renamed from: i9.e$e */
    /* loaded from: classes.dex */
    class CallableC0185e implements Callable<i9.f> {

        /* renamed from: a */
        final /* synthetic */ h1.l f12397a;

        CallableC0185e(h1.l lVar) {
            e.this = r1;
            this.f12397a = lVar;
        }

        /* renamed from: a */
        public i9.f call() {
            i9.f fVar = null;
            String str = null;
            Cursor c10 = j1.c.c(e.this.f12381a, this.f12397a, false, null);
            try {
                int e10 = j1.b.e(c10, "kid");
                int e11 = j1.b.e(c10, "hashVariant");
                int e12 = j1.b.e(c10, "byteOne");
                int e13 = j1.b.e(c10, "byteTwo");
                int e14 = j1.b.e(c10, "chunks");
                int e15 = j1.b.e(c10, "timestamp");
                if (c10.moveToFirst()) {
                    byte[] blob = c10.isNull(e10) ? null : c10.getBlob(e10);
                    byte b10 = (byte) c10.getShort(e11);
                    byte b11 = (byte) c10.getShort(e12);
                    byte b12 = (byte) c10.getShort(e13);
                    if (!c10.isNull(e14)) {
                        str = c10.getString(e14);
                    }
                    fVar = new i9.f(blob, b10, b11, b12, e.this.f12383c.d(str), c10.getLong(e15));
                }
                return fVar;
            } finally {
                c10.close();
                this.f12397a.j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f extends h1.g<i9.f> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(i0 i0Var) {
            super(i0Var);
            e.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "INSERT OR REPLACE INTO `revocation_byte_two_list` (`kid`,`hashVariant`,`byteOne`,`byteTwo`,`chunks`,`timestamp`) VALUES (?,?,?,?,?,?)";
        }

        /* renamed from: k */
        public void g(m1.k kVar, i9.f fVar) {
            if (fVar.e() == null) {
                kVar.a0(1);
            } else {
                kVar.L0(1, fVar.e());
            }
            kVar.A0(2, fVar.d());
            kVar.A0(3, fVar.a());
            kVar.A0(4, fVar.b());
            String a10 = e.this.f12383c.a(fVar.c());
            if (a10 == null) {
                kVar.a0(5);
            } else {
                kVar.K(5, a10);
            }
            kVar.A0(6, fVar.f());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g extends h1.m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(i0 i0Var) {
            super(i0Var);
            e.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "DELETE FROM revocation_byte_two_list WHERE ? = kid AND ? = hashVariant AND ? = byteOne";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h extends h1.m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(i0 i0Var) {
            super(i0Var);
            e.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "DELETE FROM revocation_byte_two_list WHERE ? = kid AND ? = hashVariant AND ? = byteOne AND ? = byteTwo";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i extends h1.m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(i0 i0Var) {
            super(i0Var);
            e.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "DELETE FROM revocation_byte_two_list";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j extends h1.m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(i0 i0Var) {
            super(i0Var);
            e.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "DELETE FROM revocation_byte_two_list WHERE ? = kid AND ? = hashVariant ";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class k extends h1.m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(i0 i0Var) {
            super(i0Var);
            e.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "DELETE FROM revocation_byte_two_list WHERE ? = kid ";
        }
    }

    /* loaded from: classes.dex */
    class l implements Callable<Long> {

        /* renamed from: a */
        final /* synthetic */ i9.f f12405a;

        l(i9.f fVar) {
            e.this = r1;
            this.f12405a = fVar;
        }

        /* renamed from: a */
        public Long call() {
            e.this.f12381a.e();
            try {
                long j10 = e.this.f12382b.j(this.f12405a);
                e.this.f12381a.D();
                return Long.valueOf(j10);
            } finally {
                e.this.f12381a.i();
            }
        }
    }

    /* loaded from: classes.dex */
    class m implements Callable<e0> {

        /* renamed from: a */
        final /* synthetic */ byte[] f12407a;

        /* renamed from: b */
        final /* synthetic */ byte f12408b;

        /* renamed from: c */
        final /* synthetic */ byte f12409c;

        m(byte[] bArr, byte b10, byte b11) {
            e.this = r1;
            this.f12407a = bArr;
            this.f12408b = b10;
            this.f12409c = b11;
        }

        /* renamed from: a */
        public e0 call() {
            m1.k a10 = e.this.f12384d.a();
            byte[] bArr = this.f12407a;
            if (bArr == null) {
                a10.a0(1);
            } else {
                a10.L0(1, bArr);
            }
            a10.A0(2, this.f12408b);
            a10.A0(3, this.f12409c);
            e.this.f12381a.e();
            try {
                a10.S();
                e.this.f12381a.D();
                return e0.f22152a;
            } finally {
                e.this.f12381a.i();
                e.this.f12384d.f(a10);
            }
        }
    }

    /* loaded from: classes.dex */
    class n implements Callable<e0> {

        /* renamed from: a */
        final /* synthetic */ byte[] f12411a;

        /* renamed from: b */
        final /* synthetic */ byte f12412b;

        /* renamed from: c */
        final /* synthetic */ byte f12413c;

        /* renamed from: d */
        final /* synthetic */ byte f12414d;

        n(byte[] bArr, byte b10, byte b11, byte b12) {
            e.this = r1;
            this.f12411a = bArr;
            this.f12412b = b10;
            this.f12413c = b11;
            this.f12414d = b12;
        }

        /* renamed from: a */
        public e0 call() {
            m1.k a10 = e.this.f12385e.a();
            byte[] bArr = this.f12411a;
            if (bArr == null) {
                a10.a0(1);
            } else {
                a10.L0(1, bArr);
            }
            a10.A0(2, this.f12412b);
            a10.A0(3, this.f12413c);
            a10.A0(4, this.f12414d);
            e.this.f12381a.e();
            try {
                a10.S();
                e.this.f12381a.D();
                return e0.f22152a;
            } finally {
                e.this.f12381a.i();
                e.this.f12385e.f(a10);
            }
        }
    }

    public e(i0 i0Var) {
        this.f12381a = i0Var;
        this.f12382b = new f(i0Var);
        this.f12384d = new g(i0Var);
        this.f12385e = new h(i0Var);
        this.f12386f = new i(i0Var);
        this.f12387g = new j(i0Var);
        this.f12388h = new k(i0Var);
    }

    public static List<Class<?>> q() {
        return Collections.emptyList();
    }

    @Override // i9.d
    public Object a(xb.d<? super e0> dVar) {
        return h1.f.b(this.f12381a, true, new a(), dVar);
    }

    @Override // i9.d
    public Object b(byte[] bArr, xb.d<? super e0> dVar) {
        return h1.f.b(this.f12381a, true, new c(bArr), dVar);
    }

    @Override // i9.d
    public Object c(byte[] bArr, byte b10, xb.d<? super e0> dVar) {
        return h1.f.b(this.f12381a, true, new b(bArr, b10), dVar);
    }

    @Override // i9.d
    public Object d(byte[] bArr, byte b10, byte b11, xb.d<? super e0> dVar) {
        return h1.f.b(this.f12381a, true, new m(bArr, b10, b11), dVar);
    }

    @Override // i9.d
    public Object e(byte[] bArr, byte b10, byte b11, byte b12, xb.d<? super e0> dVar) {
        return h1.f.b(this.f12381a, true, new n(bArr, b10, b11, b12), dVar);
    }

    @Override // i9.d
    public Object f(xb.d<? super List<i9.f>> dVar) {
        h1.l f10 = h1.l.f("SELECT * FROM revocation_byte_two_list", 0);
        return h1.f.a(this.f12381a, false, j1.c.a(), new d(f10), dVar);
    }

    @Override // i9.d
    public Object g(byte[] bArr, byte b10, byte b11, byte b12, xb.d<? super i9.f> dVar) {
        h1.l f10 = h1.l.f("SELECT * FROM revocation_byte_two_list WHERE ? = kid AND ? = hashVariant AND ? = byteOne AND ? = byteTwo", 4);
        if (bArr == null) {
            f10.a0(1);
        } else {
            f10.L0(1, bArr);
        }
        f10.A0(2, b10);
        f10.A0(3, b11);
        f10.A0(4, b12);
        return h1.f.a(this.f12381a, false, j1.c.a(), new CallableC0185e(f10), dVar);
    }

    @Override // i9.d
    public Object h(i9.f fVar, xb.d<? super Long> dVar) {
        return h1.f.b(this.f12381a, true, new l(fVar), dVar);
    }
}
