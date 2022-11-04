package i9;

import android.database.Cursor;
import androidx.room.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import tb.e0;
/* loaded from: classes.dex */
public final class b extends i9.a {

    /* renamed from: a */
    private final i0 f12348a;

    /* renamed from: b */
    private final h1.g<i9.c> f12349b;

    /* renamed from: c */
    private final i9.g f12350c = new i9.g();

    /* renamed from: d */
    private final h1.m f12351d;

    /* renamed from: e */
    private final h1.m f12352e;

    /* renamed from: f */
    private final h1.m f12353f;

    /* renamed from: g */
    private final h1.m f12354g;

    /* loaded from: classes.dex */
    class a implements Callable<e0> {

        /* renamed from: a */
        final /* synthetic */ byte[] f12355a;

        /* renamed from: b */
        final /* synthetic */ byte f12356b;

        /* renamed from: c */
        final /* synthetic */ byte f12357c;

        a(byte[] bArr, byte b10, byte b11) {
            b.this = r1;
            this.f12355a = bArr;
            this.f12356b = b10;
            this.f12357c = b11;
        }

        /* renamed from: a */
        public e0 call() {
            m1.k a10 = b.this.f12354g.a();
            byte[] bArr = this.f12355a;
            if (bArr == null) {
                a10.a0(1);
            } else {
                a10.L0(1, bArr);
            }
            a10.A0(2, this.f12356b);
            a10.A0(3, this.f12357c);
            b.this.f12348a.e();
            try {
                a10.S();
                b.this.f12348a.D();
                return e0.f22152a;
            } finally {
                b.this.f12348a.i();
                b.this.f12354g.f(a10);
            }
        }
    }

    /* renamed from: i9.b$b */
    /* loaded from: classes.dex */
    class CallableC0184b implements Callable<List<i9.c>> {

        /* renamed from: a */
        final /* synthetic */ h1.l f12359a;

        CallableC0184b(h1.l lVar) {
            b.this = r1;
            this.f12359a = lVar;
        }

        /* renamed from: a */
        public List<i9.c> call() {
            Cursor c10 = j1.c.c(b.this.f12348a, this.f12359a, false, null);
            try {
                int e10 = j1.b.e(c10, "kid");
                int e11 = j1.b.e(c10, "hashVariant");
                int e12 = j1.b.e(c10, "byteOne");
                int e13 = j1.b.e(c10, "chunks");
                int e14 = j1.b.e(c10, "timestamp");
                ArrayList arrayList = new ArrayList(c10.getCount());
                while (c10.moveToNext()) {
                    arrayList.add(new i9.c(c10.isNull(e10) ? null : c10.getBlob(e10), (byte) c10.getShort(e11), (byte) c10.getShort(e12), b.this.f12350c.d(c10.isNull(e13) ? null : c10.getString(e13)), c10.getLong(e14)));
                }
                return arrayList;
            } finally {
                c10.close();
                this.f12359a.j();
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Callable<i9.c> {

        /* renamed from: a */
        final /* synthetic */ h1.l f12361a;

        c(h1.l lVar) {
            b.this = r1;
            this.f12361a = lVar;
        }

        /* renamed from: a */
        public i9.c call() {
            i9.c cVar = null;
            String str = null;
            Cursor c10 = j1.c.c(b.this.f12348a, this.f12361a, false, null);
            try {
                int e10 = j1.b.e(c10, "kid");
                int e11 = j1.b.e(c10, "hashVariant");
                int e12 = j1.b.e(c10, "byteOne");
                int e13 = j1.b.e(c10, "chunks");
                int e14 = j1.b.e(c10, "timestamp");
                if (c10.moveToFirst()) {
                    byte[] blob = c10.isNull(e10) ? null : c10.getBlob(e10);
                    byte b10 = (byte) c10.getShort(e11);
                    byte b11 = (byte) c10.getShort(e12);
                    if (!c10.isNull(e13)) {
                        str = c10.getString(e13);
                    }
                    cVar = new i9.c(blob, b10, b11, b.this.f12350c.d(str), c10.getLong(e14));
                }
                return cVar;
            } finally {
                c10.close();
                this.f12361a.j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends h1.g<i9.c> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(i0 i0Var) {
            super(i0Var);
            b.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "INSERT OR REPLACE INTO `revocation_byte_one_list` (`kid`,`hashVariant`,`byteOne`,`chunks`,`timestamp`) VALUES (?,?,?,?,?)";
        }

        /* renamed from: k */
        public void g(m1.k kVar, i9.c cVar) {
            if (cVar.d() == null) {
                kVar.a0(1);
            } else {
                kVar.L0(1, cVar.d());
            }
            kVar.A0(2, cVar.c());
            kVar.A0(3, cVar.a());
            String a10 = b.this.f12350c.a(cVar.b());
            if (a10 == null) {
                kVar.a0(4);
            } else {
                kVar.K(4, a10);
            }
            kVar.A0(5, cVar.e());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e extends h1.m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(i0 i0Var) {
            super(i0Var);
            b.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "DELETE FROM revocation_byte_one_list";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f extends h1.m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(i0 i0Var) {
            super(i0Var);
            b.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "DELETE FROM revocation_byte_one_list WHERE ? = kid AND ? = hashVariant";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g extends h1.m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(i0 i0Var) {
            super(i0Var);
            b.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "DELETE FROM revocation_byte_one_list WHERE ? = kid";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h extends h1.m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(i0 i0Var) {
            super(i0Var);
            b.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "DELETE FROM revocation_byte_one_list WHERE ? = kid AND ? = hashVariant AND byteOne == ?";
        }
    }

    /* loaded from: classes.dex */
    class i implements Callable<Long> {

        /* renamed from: a */
        final /* synthetic */ i9.c f12368a;

        i(i9.c cVar) {
            b.this = r1;
            this.f12368a = cVar;
        }

        /* renamed from: a */
        public Long call() {
            b.this.f12348a.e();
            try {
                long j10 = b.this.f12349b.j(this.f12368a);
                b.this.f12348a.D();
                return Long.valueOf(j10);
            } finally {
                b.this.f12348a.i();
            }
        }
    }

    /* loaded from: classes.dex */
    class j implements Callable<e0> {
        j() {
            b.this = r1;
        }

        /* renamed from: a */
        public e0 call() {
            m1.k a10 = b.this.f12351d.a();
            b.this.f12348a.e();
            try {
                a10.S();
                b.this.f12348a.D();
                return e0.f22152a;
            } finally {
                b.this.f12348a.i();
                b.this.f12351d.f(a10);
            }
        }
    }

    /* loaded from: classes.dex */
    class k implements Callable<e0> {

        /* renamed from: a */
        final /* synthetic */ byte[] f12371a;

        /* renamed from: b */
        final /* synthetic */ byte f12372b;

        k(byte[] bArr, byte b10) {
            b.this = r1;
            this.f12371a = bArr;
            this.f12372b = b10;
        }

        /* renamed from: a */
        public e0 call() {
            m1.k a10 = b.this.f12352e.a();
            byte[] bArr = this.f12371a;
            if (bArr == null) {
                a10.a0(1);
            } else {
                a10.L0(1, bArr);
            }
            a10.A0(2, this.f12372b);
            b.this.f12348a.e();
            try {
                a10.S();
                b.this.f12348a.D();
                return e0.f22152a;
            } finally {
                b.this.f12348a.i();
                b.this.f12352e.f(a10);
            }
        }
    }

    /* loaded from: classes.dex */
    class l implements Callable<e0> {

        /* renamed from: a */
        final /* synthetic */ byte[] f12374a;

        l(byte[] bArr) {
            b.this = r1;
            this.f12374a = bArr;
        }

        /* renamed from: a */
        public e0 call() {
            m1.k a10 = b.this.f12353f.a();
            byte[] bArr = this.f12374a;
            if (bArr == null) {
                a10.a0(1);
            } else {
                a10.L0(1, bArr);
            }
            b.this.f12348a.e();
            try {
                a10.S();
                b.this.f12348a.D();
                return e0.f22152a;
            } finally {
                b.this.f12348a.i();
                b.this.f12353f.f(a10);
            }
        }
    }

    public b(i0 i0Var) {
        this.f12348a = i0Var;
        this.f12349b = new d(i0Var);
        this.f12351d = new e(i0Var);
        this.f12352e = new f(i0Var);
        this.f12353f = new g(i0Var);
        this.f12354g = new h(i0Var);
    }

    public static List<Class<?>> o() {
        return Collections.emptyList();
    }

    @Override // i9.a
    public Object a(xb.d<? super e0> dVar) {
        return h1.f.b(this.f12348a, true, new j(), dVar);
    }

    @Override // i9.a
    public Object b(byte[] bArr, xb.d<? super e0> dVar) {
        return h1.f.b(this.f12348a, true, new l(bArr), dVar);
    }

    @Override // i9.a
    public Object c(byte[] bArr, byte b10, xb.d<? super e0> dVar) {
        return h1.f.b(this.f12348a, true, new k(bArr, b10), dVar);
    }

    @Override // i9.a
    public Object d(byte[] bArr, byte b10, byte b11, xb.d<? super e0> dVar) {
        return h1.f.b(this.f12348a, true, new a(bArr, b10, b11), dVar);
    }

    @Override // i9.a
    public Object e(xb.d<? super List<i9.c>> dVar) {
        h1.l f10 = h1.l.f("SELECT * FROM revocation_byte_one_list", 0);
        return h1.f.a(this.f12348a, false, j1.c.a(), new CallableC0184b(f10), dVar);
    }

    @Override // i9.a
    public Object f(byte[] bArr, byte b10, byte b11, xb.d<? super i9.c> dVar) {
        h1.l f10 = h1.l.f("SELECT * FROM revocation_byte_one_list WHERE ? = kid AND ? = hashVariant AND ? = byteOne", 3);
        if (bArr == null) {
            f10.a0(1);
        } else {
            f10.L0(1, bArr);
        }
        f10.A0(2, b10);
        f10.A0(3, b11);
        return h1.f.a(this.f12348a, false, j1.c.a(), new c(f10), dVar);
    }

    @Override // i9.a
    public Object g(i9.c cVar, xb.d<? super Long> dVar) {
        return h1.f.b(this.f12348a, true, new i(cVar), dVar);
    }
}
