package cb;

import hc.t;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.h1;
import ob.l0;
import ob.u;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0014\u0007\u0015\u0016BI\b\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0003\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcb/b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "data", "[B", "b", "()[B", BuildConfig.FLAVOR, "fin", "Lcb/d;", "frameType", "Lkotlinx/coroutines/h1;", "disposableHandle", "rsv1", "rsv2", "rsv3", "<init>", "(ZLcb/d;[BLkotlinx/coroutines/h1;ZZZ)V", "a", "c", "d", "Lcb/b$a;", "Lcb/b$d;", "Lcb/b$b;", "ktor-http-cio"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public abstract class b {
    public static final c Companion = new c(null);

    /* renamed from: i */
    private static final byte[] f6411i = new byte[0];

    /* renamed from: a */
    private final boolean f6412a;

    /* renamed from: b */
    private final cb.d f6413b;

    /* renamed from: c */
    private final byte[] f6414c;

    /* renamed from: d */
    private final h1 f6415d;

    /* renamed from: e */
    private final boolean f6416e;

    /* renamed from: f */
    private final boolean f6417f;

    /* renamed from: g */
    private final boolean f6418g;

    /* renamed from: h */
    private final ByteBuffer f6419h;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lcb/b$a;", "Lcb/b;", BuildConfig.FLAVOR, "fin", BuildConfig.FLAVOR, "data", "rsv1", "rsv2", "rsv3", "<init>", "(Z[BZZZ)V", "(Z[B)V", "ktor-http-cio"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends b {
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, byte[] bArr) {
            this(z10, bArr, false, false, false);
            t.e(bArr, "data");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, byte[] bArr, boolean z11, boolean z12, boolean z13) {
            super(z10, cb.d.BINARY, bArr, e.f6425c, z11, z12, z13, null);
            t.e(bArr, "data");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB\t\b\u0016¢\u0006\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lcb/b$b;", "Lcb/b;", BuildConfig.FLAVOR, "data", "<init>", "([B)V", "Lcb/a;", "reason", "(Lcb/a;)V", "Lob/u;", "packet", "(Lob/u;)V", "()V", "ktor-http-cio"}, k = 1, mv = {1, 6, 0})
    /* renamed from: cb.b$b */
    /* loaded from: classes.dex */
    public static final class C0088b extends b {
        public C0088b() {
            this(b.f6411i);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public C0088b(cb.a r9) {
            /*
                r8 = this;
                java.lang.String r0 = "reason"
                hc.t.e(r9, r0)
                r0 = 0
                ob.r r0 = ob.k0.a(r0)
                short r1 = r9.a()     // Catch: java.lang.Throwable -> L27
                ob.j0.a(r0, r1)     // Catch: java.lang.Throwable -> L27
                java.lang.String r2 = r9.c()     // Catch: java.lang.Throwable -> L27
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 14
                r7 = 0
                r1 = r0
                ob.l0.i(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L27
                ob.u r9 = r0.q1()     // Catch: java.lang.Throwable -> L27
                r8.<init>(r9)
                return
            L27:
                r9 = move-exception
                r0.z0()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: cb.b.C0088b.<init>(cb.a):void");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C0088b(u uVar) {
            this(l0.c(uVar, 0, 1, null));
            t.e(uVar, "packet");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0088b(byte[] bArr) {
            super(true, cb.d.CLOSE, bArr, e.f6425c, false, false, false, null);
            t.e(bArr, "data");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcb/b$c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Empty", "[B", "<init>", "()V", "ktor-http-cio"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lcb/b$d;", "Lcb/b;", BuildConfig.FLAVOR, "fin", BuildConfig.FLAVOR, "data", "rsv1", "rsv2", "rsv3", "<init>", "(Z[BZZZ)V", "(Z[B)V", "ktor-http-cio"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class d extends b {
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public d(boolean z10, byte[] bArr) {
            this(z10, bArr, false, false, false);
            t.e(bArr, "data");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10, byte[] bArr, boolean z11, boolean z12, boolean z13) {
            super(z10, cb.d.TEXT, bArr, e.f6425c, z11, z12, z13, null);
            t.e(bArr, "data");
        }
    }

    private b(boolean z10, cb.d dVar, byte[] bArr, h1 h1Var, boolean z11, boolean z12, boolean z13) {
        this.f6412a = z10;
        this.f6413b = dVar;
        this.f6414c = bArr;
        this.f6415d = h1Var;
        this.f6416e = z11;
        this.f6417f = z12;
        this.f6418g = z13;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        t.d(wrap, "wrap(data)");
        this.f6419h = wrap;
    }

    public /* synthetic */ b(boolean z10, cb.d dVar, byte[] bArr, h1 h1Var, boolean z11, boolean z12, boolean z13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, dVar, bArr, h1Var, z11, z12, z13);
    }

    public final byte[] b() {
        return this.f6414c;
    }

    public String toString() {
        return "Frame " + this.f6413b + " (fin=" + this.f6412a + ", buffer len = " + this.f6414c.length + ')';
    }
}
