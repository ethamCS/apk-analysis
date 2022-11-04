package ob;

import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import pb.a;
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\"\b'\u0018\u00002\u00020\u0001:\u0001vB+\u0012\b\b\u0002\u0010#\u001a\u00020\u0016\u0012\b\b\u0002\u0010p\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00160U¢\u0006\u0004\bt\u0010uJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\u000b\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\tH\u0002J\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0002J$\u0010\u0011\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0019\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0082\u0010J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J \u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0002J\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0016H\u0082\u0010J\n\u0010\u001f\u001a\u0004\u0018\u00010\u0016H\u0002J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0016H\u0002J\u001b\u0010$\u001a\u0004\u0018\u00010\u00162\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u0016H\u0082\u0010J\u0010\u0010%\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\tH\u0002J\u0010\u0010&\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0016H\u0002J*\u0010+\u001a\u00020\t2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\tH$ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\b\u0010-\u001a\u00020\u0018H$J\u0017\u0010.\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b.\u0010/J8\u00101\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'2\u0006\u00100\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u0006\u00103\u001a\u00020\u0004J\u0006\u00104\u001a\u00020\u0018J\u0006\u00105\u001a\u00020\u0018J\u0011\u00106\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b6\u00107J\u0011\u00108\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b8\u00107J\u0017\u0010:\u001a\u00020\u00182\u0006\u00109\u001a\u00020\u0016H\u0000¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u0016H\u0000¢\u0006\u0004\b<\u0010=J\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tJ\u000e\u0010>\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\tJ\u000e\u0010?\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002J\u001a\u0010A\u001a\u00020@2\b\b\u0002\u0010\u0003\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tJ\u0012\u0010B\u001a\u0004\u0018\u00010\u00162\u0006\u0010\"\u001a\u00020\tH\u0007J\u0012\u0010C\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0007J\u0012\u0010D\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0001J\u0010\u0010E\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0007J\n\u0010F\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010G\u001a\u00020\u0018H\u0004J\u0012\u0010H\u001a\u0004\u0018\u00010\u00162\u0006\u0010\"\u001a\u00020\tH\u0001J\u0017\u0010I\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u0016H\u0000¢\u0006\u0004\bI\u0010JR$\u0010N\u001a\u00020\u00162\u0006\u0010K\u001a\u00020\u00168B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bL\u00107\"\u0004\bM\u0010;R$\u0010T\u001a\u00020\u00022\u0006\u0010O\u001a\u00020\u00028B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001d\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00160U8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR*\u0010#\u001a\u00020\u00162\u0006\u0010K\u001a\u00020\u00168@@AX\u0081\u000e¢\u0006\u0012\u0012\u0004\b\\\u0010]\u001a\u0004\bZ\u00107\"\u0004\b[\u0010;R0\u0010d\u001a\u00020'2\u0006\u0010^\u001a\u00020'8@@@X\u0081\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\u0012\u0004\bc\u0010]\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR*\u0010j\u001a\u00020\t2\u0006\u0010^\u001a\u00020\t8@@@X\u0081\u000e¢\u0006\u0012\u0012\u0004\bi\u0010]\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR*\u0010n\u001a\u00020\t2\u0006\u0010^\u001a\u00020\t8@@@X\u0081\u000e¢\u0006\u0012\u0012\u0004\bm\u0010]\u001a\u0004\bk\u0010f\"\u0004\bl\u0010hR\u0011\u0010p\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bo\u0010QR\u0011\u0010s\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bq\u0010r\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006w"}, d2 = {"Lob/a;", "Lob/z;", BuildConfig.FLAVOR, "min", BuildConfig.FLAVOR, "z", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "out", BuildConfig.FLAVOR, "max", "j1", BuildConfig.FLAVOR, "h", "R0", "copied", "e1", "m1", "n", "skipped", "r", "p", "Lpb/a;", "current", "Ltb/e0;", "f0", "size", "overrun", "h0", "empty", "G", "u", "chunk", "f", "minSize", "head", "i1", "V0", "b", "Llb/c;", "destination", "offset", "length", "W", "(Ljava/nio/ByteBuffer;II)I", "j", "c1", "(J)Z", "destinationOffset", "Z", "(Ljava/nio/ByteBuffer;JJJJ)J", "i", "n1", "close", "u1", "()Lpb/a;", "t1", "chain", "e", "(Lpb/a;)V", "v1", "(Lpb/a;)Z", "s", "y", BuildConfig.FLAVOR, "k1", "h1", "M", "B", "e0", "V", "O0", "f1", "o1", "(Lpb/a;)Lpb/a;", "newHead", "M0", "s1", "_head", "newValue", "K0", "()J", "r1", "(J)V", "tailRemaining", "Lrb/f;", "pool", "Lrb/f;", "z0", "()Lrb/f;", "j0", "setHead", "getHead$annotations", "()V", "value", "u0", "()Ljava/nio/ByteBuffer;", "setHeadMemory-3GNKZMM", "(Ljava/nio/ByteBuffer;)V", "getHeadMemory-SK3TCg8$annotations", "headMemory", "w0", "()I", "q1", "(I)V", "getHeadPosition$annotations", "headPosition", "s0", "p1", "getHeadEndExclusive$annotations", "headEndExclusive", "D0", "remaining", "a1", "()Z", "endOfInput", "<init>", "(Lpb/a;JLrb/f;)V", "a", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public abstract class a implements z {
    public static final C0273a Companion = new C0273a(null);

    /* renamed from: c */
    private final rb.f<pb.a> f17737c;

    /* renamed from: d */
    private final ob.b f17738d;

    /* renamed from: q */
    private boolean f17739q;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lob/a$a;", BuildConfig.FLAVOR, "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* renamed from: ob.a$a */
    /* loaded from: classes.dex */
    public static final class C0273a {
        private C0273a() {
        }

        public /* synthetic */ C0273a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"ob/a$b", "Lpb/f;", BuildConfig.FLAVOR, "a", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b extends pb.f {
        public Void a() {
            throw new IllegalStateException("It should be no tail remaining bytes if current tail is EmptyBuffer");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"ob/a$c", "Lpb/f;", BuildConfig.FLAVOR, "a", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class c extends pb.f {

        /* renamed from: a */
        final /* synthetic */ int f17740a;

        public c(int i10) {
            this.f17740a = i10;
        }

        public Void a() {
            throw new IllegalArgumentException(hc.t.l("Negative discard is not allowed: ", Integer.valueOf(this.f17740a)));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"ob/a$d", "Lpb/f;", BuildConfig.FLAVOR, "a", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class d extends pb.f {

        /* renamed from: a */
        final /* synthetic */ long f17741a;

        public d(long j10) {
            this.f17741a = j10;
        }

        public Void a() {
            throw new IllegalArgumentException(hc.t.l("tailRemaining shouldn't be negative: ", Long.valueOf(this.f17741a)));
        }
    }

    public a() {
        this(null, 0L, null, 7, null);
    }

    public a(pb.a aVar, long j10, rb.f<pb.a> fVar) {
        hc.t.e(aVar, "head");
        hc.t.e(fVar, "pool");
        this.f17737c = fVar;
        this.f17738d = new ob.b(aVar, j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ a(pb.a r1, long r2, rb.f<pb.a> r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r0 = this;
            r6 = r5 & 1
            if (r6 == 0) goto La
            pb.a$e r1 = pb.a.Companion
            pb.a r1 = r1.a()
        La:
            r6 = r5 & 2
            if (r6 == 0) goto L12
            long r2 = ob.o.e(r1)
        L12:
            r5 = r5 & 4
            if (r5 == 0) goto L1c
            pb.a$e r4 = pb.a.Companion
            rb.f r4 = r4.c()
        L1c:
            r0.<init>(r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.a.<init>(pb.a, long, rb.f, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private final pb.a G(pb.a aVar, pb.a aVar2) {
        while (aVar != aVar2) {
            pb.a K0 = aVar.K0();
            aVar.c1(this.f17737c);
            if (K0 == null) {
                s1(aVar2);
                r1(0L);
                aVar = aVar2;
            } else {
                if (K0.s() > K0.p()) {
                    s1(K0);
                    r1(K0() - (K0.s() - K0.p()));
                    return K0;
                }
                aVar = K0;
            }
        }
        return u();
    }

    private final long K0() {
        return this.f17738d.e();
    }

    private final pb.a M0() {
        return this.f17738d.a();
    }

    private final Void R0(int i10, int i11) {
        throw new IllegalArgumentException("min should be less or equal to max but min = " + i10 + ", max = " + i11);
    }

    private final Void V0(int i10) {
        throw new IllegalStateException("minSize of " + i10 + " is too big (should be less than 8)");
    }

    private final void b(pb.a aVar) {
        if (aVar.s() - aVar.p() == 0) {
            o1(aVar);
        }
    }

    private final Void e1(int i10, int i11) {
        throw new pb.d("Premature end of stream: expected at least " + i10 + " chars but had only " + i11);
    }

    private final void f(pb.a aVar) {
        pb.a a10 = o.a(M0());
        if (a10 != pb.a.Companion.a()) {
            a10.f1(aVar);
            r1(K0() + o.e(aVar));
            return;
        }
        s1(aVar);
        long j10 = 0;
        if (!(K0() == 0)) {
            new b().a();
            throw new tb.i();
        }
        pb.a M0 = aVar.M0();
        if (M0 != null) {
            j10 = o.e(M0);
        }
        r1(j10);
    }

    private final void f0(pb.a aVar) {
        if (this.f17739q && aVar.M0() == null) {
            q1(aVar.p());
            p1(aVar.s());
            r1(0L);
            return;
        }
        int s10 = aVar.s() - aVar.p();
        int min = Math.min(s10, 8 - (aVar.i() - aVar.j()));
        if (s10 > min) {
            h0(aVar, s10, min);
        } else {
            pb.a c02 = this.f17737c.c0();
            c02.G(8);
            c02.f1(aVar.K0());
            f.a(c02, aVar, s10);
            s1(c02);
        }
        aVar.c1(this.f17737c);
    }

    private final Void h(int i10) {
        throw new EOFException("at least " + i10 + " characters required but no bytes available");
    }

    private final void h0(pb.a aVar, int i10, int i11) {
        pb.a c02 = this.f17737c.c0();
        pb.a c03 = this.f17737c.c0();
        c02.G(8);
        c03.G(8);
        c02.f1(c03);
        c03.f1(aVar.K0());
        f.a(c02, aVar, i10 - i11);
        f.a(c03, aVar, i11);
        s1(c02);
        r1(o.e(c03));
    }

    private final pb.a i1(int i10, pb.a aVar) {
        while (true) {
            int s02 = s0() - w0();
            if (s02 >= i10) {
                return aVar;
            }
            pb.a M0 = aVar.M0();
            if (M0 == null && (M0 = u()) == null) {
                return null;
            }
            if (s02 == 0) {
                if (aVar != pb.a.Companion.a()) {
                    o1(aVar);
                }
                aVar = M0;
            } else {
                int a10 = f.a(aVar, M0, i10 - s02);
                p1(aVar.s());
                r1(K0() - a10);
                if (!(M0.s() > M0.p())) {
                    aVar.f1(null);
                    aVar.f1(M0.K0());
                    M0.c1(this.f17737c);
                } else {
                    M0.M(a10);
                }
                if (aVar.s() - aVar.p() >= i10) {
                    return aVar;
                }
                if (i10 > 8) {
                    V0(i10);
                    throw new tb.i();
                }
            }
        }
    }

    private final int j1(Appendable appendable, int i10, int i11) {
        boolean z10;
        Throwable th2;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = false;
        if (i11 == 0 && i10 == 0) {
            return 0;
        }
        if (a1()) {
            if (i10 == 0) {
                return 0;
            }
            h(i10);
            throw new tb.i();
        } else if (i11 < i10) {
            R0(i10, i11);
            throw new tb.i();
        } else {
            pb.a f10 = pb.h.f(this, 1);
            int i12 = 0;
            if (f10 != null) {
                boolean z16 = false;
                while (true) {
                    try {
                        ByteBuffer n10 = f10.n();
                        int p10 = f10.p();
                        int s10 = f10.s();
                        int i13 = p10;
                        while (i13 < s10) {
                            int i14 = i13 + 1;
                            int i15 = n10.get(i13) & 255;
                            if ((i15 & 128) != 128) {
                                char c10 = (char) i15;
                                if (i12 == i11) {
                                    z14 = false;
                                } else {
                                    appendable.append(c10);
                                    i12++;
                                    z14 = true;
                                }
                                if (z14) {
                                    i13 = i14;
                                }
                            }
                            f10.f(i13 - p10);
                            z11 = false;
                            break;
                        }
                        f10.f(s10 - p10);
                        z11 = true;
                        if (z11) {
                            z12 = true;
                        } else {
                            if (i12 != i11) {
                                z16 = true;
                            }
                            z12 = false;
                        }
                        if (!z12) {
                            z13 = true;
                            break;
                        }
                        try {
                            pb.a h10 = pb.h.h(this, f10);
                            if (h10 == null) {
                                z13 = false;
                                break;
                            }
                            f10 = h10;
                        } catch (Throwable th3) {
                            th2 = th3;
                            z10 = false;
                            if (z10) {
                                pb.h.c(this, f10);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        z10 = true;
                    }
                }
                if (z13) {
                    pb.h.c(this, f10);
                }
                z15 = z16;
            }
            if (z15) {
                return i12 + m1(appendable, i10 - i12, i11 - i12);
            }
            if (i12 >= i10) {
                return i12;
            }
            e1(i10, i12);
            throw new tb.i();
        }
    }

    public static /* synthetic */ String l1(a aVar, int i10, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = Integer.MAX_VALUE;
            }
            return aVar.k1(i10, i11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readText");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
        r15 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
        r5.f(((r11 - r9) - r14) + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x012d, code lost:
        if (r4 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x012f, code lost:
        pb.h.c(r18, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0132, code lost:
        r6 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int m1(java.lang.Appendable r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.a.m1(java.lang.Appendable, int, int):int");
    }

    private final int p(int i10, int i11) {
        while (i10 != 0) {
            pb.a f12 = f1(1);
            if (f12 == null) {
                return i11;
            }
            int min = Math.min(f12.s() - f12.p(), i10);
            f12.f(min);
            q1(w0() + min);
            b(f12);
            i10 -= min;
            i11 += min;
        }
        return i11;
    }

    private final long r(long j10, long j11) {
        pb.a f12;
        while (j10 != 0 && (f12 = f1(1)) != null) {
            int min = (int) Math.min(f12.s() - f12.p(), j10);
            f12.f(min);
            q1(w0() + min);
            b(f12);
            long j12 = min;
            j10 -= j12;
            j11 += j12;
        }
        return j11;
    }

    private final void r1(long j10) {
        if (j10 >= 0) {
            this.f17738d.j(j10);
        } else {
            new d(j10).a();
            throw new tb.i();
        }
    }

    private final void s1(pb.a aVar) {
        this.f17738d.f(aVar);
        this.f17738d.h(aVar.n());
        this.f17738d.i(aVar.p());
        this.f17738d.g(aVar.s());
    }

    private final pb.a u() {
        if (this.f17739q) {
            return null;
        }
        pb.a V = V();
        if (V == null) {
            this.f17739q = true;
            return null;
        }
        f(V);
        return V;
    }

    private final boolean z(long j10) {
        pb.a a10 = o.a(M0());
        long s02 = (s0() - w0()) + K0();
        do {
            pb.a V = V();
            if (V == null) {
                this.f17739q = true;
                return false;
            }
            int s10 = V.s() - V.p();
            if (a10 == pb.a.Companion.a()) {
                s1(V);
                a10 = V;
            } else {
                a10.f1(V);
                r1(K0() + s10);
            }
            s02 += s10;
        } while (s02 < j10);
        return true;
    }

    public final pb.a B(pb.a aVar) {
        hc.t.e(aVar, "current");
        return G(aVar, pb.a.Companion.a());
    }

    public final long D0() {
        return (s0() - w0()) + K0();
    }

    public final pb.a M(pb.a aVar) {
        hc.t.e(aVar, "current");
        return B(aVar);
    }

    public final void O0() {
        if (!this.f17739q) {
            this.f17739q = true;
        }
    }

    protected pb.a V() {
        pb.a c02 = this.f17737c.c0();
        try {
            c02.G(8);
            int W = W(c02.n(), c02.s(), c02.j() - c02.s());
            if (W == 0) {
                boolean z10 = true;
                this.f17739q = true;
                if (c02.s() <= c02.p()) {
                    z10 = false;
                }
                if (!z10) {
                    c02.c1(this.f17737c);
                    return null;
                }
            }
            c02.b(W);
            return c02;
        } catch (Throwable th2) {
            c02.c1(this.f17737c);
            throw th2;
        }
    }

    protected abstract int W(ByteBuffer byteBuffer, int i10, int i11);

    @Override // ob.z
    public final long Z(ByteBuffer byteBuffer, long j10, long j11, long j12, long j13) {
        hc.t.e(byteBuffer, "destination");
        c1(j12 + j11);
        pb.a j02 = j0();
        long min = Math.min(j13, byteBuffer.limit() - j10);
        long j14 = j10;
        pb.a aVar = j02;
        long j15 = 0;
        long j16 = j11;
        while (j15 < j12 && j15 < min) {
            long s10 = aVar.s() - aVar.p();
            if (s10 > j16) {
                long min2 = Math.min(s10 - j16, min - j15);
                lb.c.d(aVar.n(), byteBuffer, aVar.p() + j16, min2, j14);
                j15 += min2;
                j14 += min2;
                j16 = 0;
            } else {
                j16 -= s10;
            }
            aVar = aVar.M0();
            if (aVar == null) {
                break;
            }
        }
        return j15;
    }

    @Override // ob.z
    public final boolean a1() {
        return s0() - w0() == 0 && K0() == 0 && (this.f17739q || u() == null);
    }

    public final boolean c1(long j10) {
        if (j10 <= 0) {
            return true;
        }
        long s02 = s0() - w0();
        if (s02 < j10 && s02 + K0() < j10) {
            return z(j10);
        }
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        n1();
        if (!this.f17739q) {
            this.f17739q = true;
        }
        j();
    }

    public final void e(pb.a aVar) {
        hc.t.e(aVar, "chain");
        a.e eVar = pb.a.Companion;
        if (aVar == eVar.a()) {
            return;
        }
        long e10 = o.e(aVar);
        if (M0() == eVar.a()) {
            s1(aVar);
            r1(e10 - (s0() - w0()));
            return;
        }
        o.a(M0()).f1(aVar);
        r1(K0() + e10);
    }

    public final void e0(pb.a aVar) {
        hc.t.e(aVar, "current");
        pb.a M0 = aVar.M0();
        if (M0 == null) {
            f0(aVar);
            return;
        }
        int s10 = aVar.s() - aVar.p();
        int min = Math.min(s10, 8 - (aVar.i() - aVar.j()));
        if (M0.r() < min) {
            f0(aVar);
            return;
        }
        i.f(M0, min);
        if (s10 > min) {
            aVar.u();
            p1(aVar.s());
            r1(K0() + min);
            return;
        }
        s1(M0);
        r1(K0() - ((M0.s() - M0.p()) - min));
        aVar.K0();
        aVar.c1(this.f17737c);
    }

    public final pb.a f1(int i10) {
        pb.a j02 = j0();
        return s0() - w0() >= i10 ? j02 : i1(i10, j02);
    }

    public final pb.a h1(int i10) {
        return i1(i10, j0());
    }

    public final boolean i() {
        return (w0() == s0() && K0() == 0) ? false : true;
    }

    protected abstract void j();

    public final pb.a j0() {
        pb.a M0 = M0();
        M0.h(w0());
        return M0;
    }

    public final String k1(int i10, int i11) {
        int b10;
        int d10;
        if (i10 != 0 || (i11 != 0 && !a1())) {
            long D0 = D0();
            if (D0 > 0 && i11 >= D0) {
                return l0.g(this, (int) D0, null, 2, null);
            }
            b10 = nc.m.b(i10, 16);
            d10 = nc.m.d(b10, i11);
            StringBuilder sb2 = new StringBuilder(d10);
            j1(sb2, i10, i11);
            String sb3 = sb2.toString();
            hc.t.d(sb3, "StringBuilder(capacity).…builderAction).toString()");
            return sb3;
        }
        return BuildConfig.FLAVOR;
    }

    public final int n(int i10) {
        if (i10 >= 0) {
            return p(i10, 0);
        }
        new c(i10).a();
        throw new tb.i();
    }

    public final void n1() {
        pb.a j02 = j0();
        pb.a a10 = pb.a.Companion.a();
        if (j02 != a10) {
            s1(a10);
            r1(0L);
            o.c(j02, this.f17737c);
        }
    }

    public final pb.a o1(pb.a aVar) {
        hc.t.e(aVar, "head");
        pb.a K0 = aVar.K0();
        if (K0 == null) {
            K0 = pb.a.Companion.a();
        }
        s1(K0);
        r1(K0() - (K0.s() - K0.p()));
        aVar.c1(this.f17737c);
        return K0;
    }

    public final void p1(int i10) {
        this.f17738d.g(i10);
    }

    public final void q1(int i10) {
        this.f17738d.i(i10);
    }

    public final void s(int i10) {
        if (n(i10) == i10) {
            return;
        }
        throw new EOFException("Unable to discard " + i10 + " bytes due to end of packet");
    }

    public final int s0() {
        return this.f17738d.b();
    }

    public final pb.a t1() {
        pb.a j02 = j0();
        pb.a M0 = j02.M0();
        pb.a a10 = pb.a.Companion.a();
        if (j02 == a10) {
            return null;
        }
        if (M0 == null) {
            s1(a10);
            r1(0L);
        } else {
            s1(M0);
            r1(K0() - (M0.s() - M0.p()));
        }
        j02.f1(null);
        return j02;
    }

    public final ByteBuffer u0() {
        return this.f17738d.c();
    }

    public final pb.a u1() {
        pb.a j02 = j0();
        pb.a a10 = pb.a.Companion.a();
        if (j02 == a10) {
            return null;
        }
        s1(a10);
        r1(0L);
        return j02;
    }

    public final boolean v1(pb.a aVar) {
        hc.t.e(aVar, "chain");
        pb.a a10 = o.a(j0());
        int s10 = aVar.s() - aVar.p();
        if (s10 == 0 || a10.j() - a10.s() < s10) {
            return false;
        }
        f.a(a10, aVar, s10);
        if (j0() == a10) {
            p1(a10.s());
            return true;
        }
        r1(K0() + s10);
        return true;
    }

    public final int w0() {
        return this.f17738d.d();
    }

    @Override // ob.z
    public final long y(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        return r(j10, 0L);
    }

    public final rb.f<pb.a> z0() {
        return this.f17737c;
    }
}
