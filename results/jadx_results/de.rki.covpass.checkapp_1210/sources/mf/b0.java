package mf;

import java.util.Objects;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u0010;\u001a\u00020:\u0012\u0010\u0010=\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010<¢\u0006\u0004\b>\u0010?B1\b\u0010\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u0010;\u001a\u00020:\u0012\u000e\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010<¢\u0006\u0004\b>\u0010BJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016J+\u0010\u000f\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016JA\u0010\u0016\u001a\u00020\u0005\"\b\b\u0000\u0010\u000b*\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u001dH\u0016J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u001fH\u0016J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\"H\u0016J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020$H\u0016J\u0010\u0010'\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020&H\u0016J\u0010\u0010)\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020(H\u0016J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020*H\u0016J\u0018\u0010-\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010/\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00104\u001a\u0002038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u0006C"}, d2 = {"Lmf/b0;", "Llf/j;", "Ljf/b;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Ltb/e0;", "H", BuildConfig.FLAVOR, "index", BuildConfig.FLAVOR, "p", "T", "Lkotlinx/serialization/j;", "serializer", "value", "e", "(Lkotlinx/serialization/j;Ljava/lang/Object;)V", "Ljf/d;", "b", "c", "F", BuildConfig.FLAVOR, "m", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/j;Ljava/lang/Object;)V", "inlineDescriptor", "Lkotlinx/serialization/encoding/Encoder;", "r", "f", "l", BuildConfig.FLAVOR, "k", BuildConfig.FLAVOR, "i", "q", BuildConfig.FLAVOR, "w", BuildConfig.FLAVOR, "s", BuildConfig.FLAVOR, "h", BuildConfig.FLAVOR, "x", BuildConfig.FLAVOR, "D", "enumDescriptor", "o", "Llf/a;", "json", "Llf/a;", "d", "()Llf/a;", "Lnf/d;", "serializersModule", "Lnf/d;", "a", "()Lnf/d;", "Lmf/f;", "composer", "Lmf/g0;", "mode", BuildConfig.FLAVOR, "modeReuseCache", "<init>", "(Lmf/f;Llf/a;Lmf/g0;[Llf/j;)V", "Lmf/t;", "output", "(Lmf/t;Llf/a;Lmf/g0;[Llf/j;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class b0 extends jf.b implements lf.j {

    /* renamed from: a */
    private final f f16599a;

    /* renamed from: b */
    private final lf.a f16600b;

    /* renamed from: c */
    private final g0 f16601c;

    /* renamed from: d */
    private final lf.j[] f16602d;

    /* renamed from: e */
    private final nf.d f16603e;

    /* renamed from: f */
    private final lf.e f16604f;

    /* renamed from: g */
    private boolean f16605g;

    /* renamed from: h */
    private String f16606h;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16607a;

        static {
            int[] iArr = new int[g0.values().length];
            iArr[g0.LIST.ordinal()] = 1;
            iArr[g0.MAP.ordinal()] = 2;
            iArr[g0.POLY_OBJ.ordinal()] = 3;
            f16607a = iArr;
        }
    }

    public b0(f fVar, lf.a aVar, g0 g0Var, lf.j[] jVarArr) {
        hc.t.e(fVar, "composer");
        hc.t.e(aVar, "json");
        hc.t.e(g0Var, "mode");
        this.f16599a = fVar;
        this.f16600b = aVar;
        this.f16601c = g0Var;
        this.f16602d = jVarArr;
        this.f16603e = d().a();
        this.f16604f = d().f();
        int ordinal = g0Var.ordinal();
        if (jVarArr != null) {
            if (jVarArr[ordinal] == null && jVarArr[ordinal] == this) {
                return;
            }
            jVarArr[ordinal] = this;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(t tVar, lf.a aVar, g0 g0Var, lf.j[] jVarArr) {
        this(i.a(tVar, aVar), aVar, g0Var, jVarArr);
        hc.t.e(tVar, "output");
        hc.t.e(aVar, "json");
        hc.t.e(g0Var, "mode");
        hc.t.e(jVarArr, "modeReuseCache");
    }

    private final void H(SerialDescriptor serialDescriptor) {
        this.f16599a.c();
        String str = this.f16606h;
        hc.t.b(str);
        D(str);
        this.f16599a.e(':');
        this.f16599a.o();
        D(serialDescriptor.l());
    }

    @Override // jf.b, kotlinx.serialization.encoding.Encoder
    public void D(String str) {
        hc.t.e(str, "value");
        this.f16599a.m(str);
    }

    @Override // jf.b
    public boolean F(SerialDescriptor serialDescriptor, int i10) {
        hc.t.e(serialDescriptor, "descriptor");
        int i11 = a.f16607a[this.f16601c.ordinal()];
        if (i11 != 1) {
            boolean z10 = false;
            if (i11 != 2) {
                if (i11 != 3) {
                    if (!this.f16599a.a()) {
                        this.f16599a.e(',');
                    }
                    this.f16599a.c();
                    D(serialDescriptor.n(i10));
                    this.f16599a.e(':');
                    this.f16599a.o();
                } else {
                    if (i10 == 0) {
                        this.f16605g = true;
                    }
                    if (i10 == 1) {
                        this.f16599a.e(',');
                    }
                }
                return true;
            } else if (!this.f16599a.a()) {
                int i12 = i10 % 2;
                f fVar = this.f16599a;
                if (i12 == 0) {
                    fVar.e(',');
                    this.f16599a.c();
                    z10 = true;
                    this.f16605g = z10;
                    return true;
                }
                fVar.e(':');
            } else {
                this.f16605g = true;
            }
            this.f16599a.o();
            this.f16605g = z10;
            return true;
        } else if (!this.f16599a.a()) {
            this.f16599a.e(',');
        }
        this.f16599a.c();
        return true;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public nf.d a() {
        return this.f16603e;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public jf.d b(SerialDescriptor serialDescriptor) {
        lf.j jVar;
        hc.t.e(serialDescriptor, "descriptor");
        g0 b10 = h0.b(d(), serialDescriptor);
        char c10 = b10.f16627c;
        if (c10 != 0) {
            this.f16599a.e(c10);
            this.f16599a.b();
        }
        if (this.f16606h != null) {
            H(serialDescriptor);
            this.f16606h = null;
        }
        if (this.f16601c == b10) {
            return this;
        }
        lf.j[] jVarArr = this.f16602d;
        return (jVarArr == null || (jVar = jVarArr[b10.ordinal()]) == null) ? new b0(this.f16599a, d(), b10, this.f16602d) : jVar;
    }

    @Override // jf.d
    public void c(SerialDescriptor serialDescriptor) {
        hc.t.e(serialDescriptor, "descriptor");
        if (this.f16601c.f16628d != 0) {
            this.f16599a.p();
            this.f16599a.c();
            this.f16599a.e(this.f16601c.f16628d);
        }
    }

    @Override // lf.j
    public lf.a d() {
        return this.f16600b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jf.b, kotlinx.serialization.encoding.Encoder
    public <T> void e(kotlinx.serialization.j<? super T> jVar, T t10) {
        hc.t.e(jVar, "serializer");
        if (!(jVar instanceof kf.b) || d().f().k()) {
            jVar.serialize(this, t10);
            return;
        }
        kf.b bVar = (kf.b) jVar;
        String c10 = y.c(jVar.getDescriptor(), d());
        Objects.requireNonNull(t10, "null cannot be cast to non-null type kotlin.Any");
        kotlinx.serialization.j b10 = kotlinx.serialization.f.b(bVar, this, t10);
        y.f(bVar, b10, c10);
        y.b(b10.getDescriptor().h());
        this.f16606h = c10;
        b10.serialize(this, t10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void f() {
        this.f16599a.j("null");
    }

    @Override // jf.b, kotlinx.serialization.encoding.Encoder
    public void h(double d10) {
        if (this.f16605g) {
            D(String.valueOf(d10));
        } else {
            this.f16599a.f(d10);
        }
        if (!this.f16604f.a()) {
            if (!(!Double.isInfinite(d10) && !Double.isNaN(d10))) {
                throw q.b(Double.valueOf(d10), this.f16599a.f16622a.toString());
            }
        }
    }

    @Override // jf.b, kotlinx.serialization.encoding.Encoder
    public void i(short s10) {
        if (this.f16605g) {
            D(String.valueOf((int) s10));
        } else {
            this.f16599a.k(s10);
        }
    }

    @Override // jf.b, kotlinx.serialization.encoding.Encoder
    public void k(byte b10) {
        if (this.f16605g) {
            D(String.valueOf((int) b10));
        } else {
            this.f16599a.d(b10);
        }
    }

    @Override // jf.b, kotlinx.serialization.encoding.Encoder
    public void l(boolean z10) {
        if (this.f16605g) {
            D(String.valueOf(z10));
        } else {
            this.f16599a.l(z10);
        }
    }

    @Override // jf.b, jf.d
    public <T> void m(SerialDescriptor serialDescriptor, int i10, kotlinx.serialization.j<? super T> jVar, T t10) {
        hc.t.e(serialDescriptor, "descriptor");
        hc.t.e(jVar, "serializer");
        if (t10 != null || this.f16604f.f()) {
            super.m(serialDescriptor, i10, jVar, t10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void o(SerialDescriptor serialDescriptor, int i10) {
        hc.t.e(serialDescriptor, "enumDescriptor");
        D(serialDescriptor.n(i10));
    }

    @Override // jf.d
    public boolean p(SerialDescriptor serialDescriptor, int i10) {
        hc.t.e(serialDescriptor, "descriptor");
        return this.f16604f.e();
    }

    @Override // jf.b, kotlinx.serialization.encoding.Encoder
    public void q(int i10) {
        if (this.f16605g) {
            D(String.valueOf(i10));
        } else {
            this.f16599a.h(i10);
        }
    }

    @Override // jf.b, kotlinx.serialization.encoding.Encoder
    public Encoder r(SerialDescriptor serialDescriptor) {
        hc.t.e(serialDescriptor, "inlineDescriptor");
        return c0.a(serialDescriptor) ? new b0(new g(this.f16599a.f16622a), d(), this.f16601c, (lf.j[]) null) : super.r(serialDescriptor);
    }

    @Override // jf.b, kotlinx.serialization.encoding.Encoder
    public void s(float f10) {
        if (this.f16605g) {
            D(String.valueOf(f10));
        } else {
            this.f16599a.g(f10);
        }
        if (!this.f16604f.a()) {
            if (!(!Float.isInfinite(f10) && !Float.isNaN(f10))) {
                throw q.b(Float.valueOf(f10), this.f16599a.f16622a.toString());
            }
        }
    }

    @Override // jf.b, kotlinx.serialization.encoding.Encoder
    public void w(long j10) {
        if (this.f16605g) {
            D(String.valueOf(j10));
        } else {
            this.f16599a.i(j10);
        }
    }

    @Override // jf.b, kotlinx.serialization.encoding.Encoder
    public void x(char c10) {
        D(String.valueOf(c10));
    }
}
