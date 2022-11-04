package e;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class c0 extends h0 {

    /* renamed from: e */
    public static final b0 f3921e = b0.b("multipart/mixed");

    /* renamed from: f */
    public static final b0 f3922f = b0.b("multipart/form-data");

    /* renamed from: g */
    private static final byte[] f3923g = {58, 32};

    /* renamed from: h */
    private static final byte[] f3924h = {13, 10};
    private static final byte[] i = {45, 45};

    /* renamed from: a */
    private final f.f f3925a;

    /* renamed from: b */
    private final b0 f3926b;

    /* renamed from: c */
    private final List<b> f3927c;

    /* renamed from: d */
    private long f3928d = -1;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final f.f f3929a;

        /* renamed from: b */
        private b0 f3930b;

        /* renamed from: c */
        private final List<b> f3931c;

        public a() {
            this(UUID.randomUUID().toString());
        }

        public a(String str) {
            this.f3930b = c0.f3921e;
            this.f3931c = new ArrayList();
            this.f3929a = f.f.j(str);
        }

        public a a(@Nullable y yVar, h0 h0Var) {
            b(b.a(yVar, h0Var));
            return this;
        }

        public a b(b bVar) {
            Objects.requireNonNull(bVar, "part == null");
            this.f3931c.add(bVar);
            return this;
        }

        public c0 c() {
            if (!this.f3931c.isEmpty()) {
                return new c0(this.f3929a, this.f3930b, this.f3931c);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }

        public a d(b0 b0Var) {
            Objects.requireNonNull(b0Var, "type == null");
            if (b0Var.d().equals("multipart")) {
                this.f3930b = b0Var;
                return this;
            }
            throw new IllegalArgumentException("multipart != " + b0Var);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        @Nullable

        /* renamed from: a */
        final y f3932a;

        /* renamed from: b */
        final h0 f3933b;

        private b(@Nullable y yVar, h0 h0Var) {
            this.f3932a = yVar;
            this.f3933b = h0Var;
        }

        public static b a(@Nullable y yVar, h0 h0Var) {
            Objects.requireNonNull(h0Var, "body == null");
            if (yVar == null || yVar.c("Content-Type") == null) {
                if (yVar != null && yVar.c("Content-Length") != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Length");
                }
                return new b(yVar, h0Var);
            }
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
    }

    static {
        b0.b("multipart/alternative");
        b0.b("multipart/digest");
        b0.b("multipart/parallel");
    }

    c0(f.f fVar, b0 b0Var, List<b> list) {
        this.f3925a = fVar;
        this.f3926b = b0.b(b0Var + "; boundary=" + fVar.w());
        this.f3927c = e.m0.e.r(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private long i(@Nullable f.d dVar, boolean z) {
        f.c cVar;
        if (z) {
            dVar = new f.c();
            cVar = dVar;
        } else {
            cVar = 0;
        }
        int size = this.f3927c.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f3927c.get(i2);
            y yVar = bVar.f3932a;
            h0 h0Var = bVar.f3933b;
            dVar.e(i);
            dVar.j(this.f3925a);
            dVar.e(f3924h);
            if (yVar != null) {
                int h2 = yVar.h();
                for (int i3 = 0; i3 < h2; i3++) {
                    dVar.O(yVar.e(i3)).e(f3923g).O(yVar.i(i3)).e(f3924h);
                }
            }
            b0 b2 = h0Var.b();
            if (b2 != null) {
                dVar.O("Content-Type: ").O(b2.toString()).e(f3924h);
            }
            long a2 = h0Var.a();
            if (a2 != -1) {
                dVar.O("Content-Length: ").Q(a2).e(f3924h);
            } else if (z) {
                cVar.f0();
                return -1L;
            }
            byte[] bArr = f3924h;
            dVar.e(bArr);
            if (z) {
                j += a2;
            } else {
                h0Var.h(dVar);
            }
            dVar.e(bArr);
        }
        byte[] bArr2 = i;
        dVar.e(bArr2);
        dVar.j(this.f3925a);
        dVar.e(bArr2);
        dVar.e(f3924h);
        if (z) {
            long v0 = j + cVar.v0();
            cVar.f0();
            return v0;
        }
        return j;
    }

    @Override // e.h0
    public long a() {
        long j = this.f3928d;
        if (j != -1) {
            return j;
        }
        long i2 = i(null, true);
        this.f3928d = i2;
        return i2;
    }

    @Override // e.h0
    public b0 b() {
        return this.f3926b;
    }

    @Override // e.h0
    public void h(f.d dVar) {
        i(dVar, false);
    }
}
