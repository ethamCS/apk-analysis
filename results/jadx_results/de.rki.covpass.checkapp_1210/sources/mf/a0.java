package mf;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonElement;
import org.conscrypt.BuildConfig;
import p000if.i;
@Metadata(bv = {}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\bH\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0016J#\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u001d\u001a\u00020\u000bH\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016J=\u0010!\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00152\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\b\u0010 \u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010$\u001a\u00020\u000bH\u0016J\b\u0010&\u001a\u00020%H\u0016J\b\u0010(\u001a\u00020'H\u0016J\b\u0010)\u001a\u00020\bH\u0016J\b\u0010+\u001a\u00020*H\u0016J\b\u0010-\u001a\u00020,H\u0016J\b\u0010/\u001a\u00020.H\u0016J\b\u00101\u001a\u000200H\u0016J\b\u00102\u001a\u00020\u000eH\u0016J\u0010\u00105\u001a\u0002042\u0006\u00103\u001a\u00020\u0003H\u0016J\u0010\u00107\u001a\u00020\b2\u0006\u00106\u001a\u00020\u0003H\u0016R\u0017\u00109\u001a\u0002088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010>\u001a\u00020=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A¨\u0006H"}, d2 = {"Lmf/a0;", "Llf/f;", "Ljf/a;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Ltb/e0;", "Q", "J", BuildConfig.FLAVOR, "M", "index", BuildConfig.FLAVOR, "K", "N", BuildConfig.FLAVOR, "key", "P", "L", "O", "Lkotlinx/serialization/json/JsonElement;", "v", "T", "Lkotlinx/serialization/b;", "deserializer", "y", "(Lkotlinx/serialization/b;)Ljava/lang/Object;", "Ljf/c;", "b", "c", "l", BuildConfig.FLAVOR, "A", "previousValue", "C", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/b;Ljava/lang/Object;)Ljava/lang/Object;", "q", "j", BuildConfig.FLAVOR, "z", BuildConfig.FLAVOR, "B", "w", BuildConfig.FLAVOR, "h", BuildConfig.FLAVOR, "E", BuildConfig.FLAVOR, "G", BuildConfig.FLAVOR, "n", "D", "inlineDescriptor", "Lkotlinx/serialization/encoding/Decoder;", "t", "enumDescriptor", "p", "Llf/a;", "json", "Llf/a;", "d", "()Llf/a;", "Lnf/d;", "serializersModule", "Lnf/d;", "a", "()Lnf/d;", "Lmf/g0;", "mode", "Lmf/a;", "lexer", "<init>", "(Llf/a;Lmf/g0;Lmf/a;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class a0 extends jf.a implements lf.f {

    /* renamed from: a */
    private final lf.a f16591a;

    /* renamed from: b */
    private final g0 f16592b;

    /* renamed from: c */
    public final mf.a f16593c;

    /* renamed from: d */
    private final nf.d f16594d;

    /* renamed from: e */
    private int f16595e = -1;

    /* renamed from: f */
    private final lf.e f16596f;

    /* renamed from: g */
    private final n f16597g;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16598a;

        static {
            int[] iArr = new int[g0.values().length];
            iArr[g0.LIST.ordinal()] = 1;
            iArr[g0.MAP.ordinal()] = 2;
            iArr[g0.POLY_OBJ.ordinal()] = 3;
            iArr[g0.OBJ.ordinal()] = 4;
            f16598a = iArr;
        }
    }

    public a0(lf.a aVar, g0 g0Var, mf.a aVar2, SerialDescriptor serialDescriptor) {
        hc.t.e(aVar, "json");
        hc.t.e(g0Var, "mode");
        hc.t.e(aVar2, "lexer");
        hc.t.e(serialDescriptor, "descriptor");
        this.f16591a = aVar;
        this.f16592b = g0Var;
        this.f16593c = aVar2;
        this.f16594d = aVar.a();
        lf.e f10 = aVar.f();
        this.f16596f = f10;
        this.f16597g = f10.f() ? null : new n(serialDescriptor);
    }

    private final void J() {
        if (this.f16593c.D() != 4) {
            return;
        }
        mf.a.x(this.f16593c, "Unexpected leading comma", 0, null, 6, null);
        throw new tb.i();
    }

    private final boolean K(SerialDescriptor serialDescriptor, int i10) {
        String E;
        lf.a aVar = this.f16591a;
        SerialDescriptor q10 = serialDescriptor.q(i10);
        if (q10.o() || !(!this.f16593c.L())) {
            if (!hc.t.a(q10.h(), i.b.f12552a) || (E = this.f16593c.E(this.f16596f.l())) == null || r.d(q10, aVar, E) != -3) {
                return false;
            }
            this.f16593c.p();
        }
        return true;
    }

    private final int L() {
        boolean K = this.f16593c.K();
        if (!this.f16593c.f()) {
            if (!K) {
                return -1;
            }
            mf.a.x(this.f16593c, "Unexpected trailing comma", 0, null, 6, null);
            throw new tb.i();
        }
        int i10 = this.f16595e;
        if (i10 != -1 && !K) {
            mf.a.x(this.f16593c, "Expected end of the array or comma", 0, null, 6, null);
            throw new tb.i();
        }
        int i11 = i10 + 1;
        this.f16595e = i11;
        return i11;
    }

    private final int M() {
        int i10;
        int i11;
        int i12 = this.f16595e;
        boolean z10 = false;
        boolean z11 = i12 % 2 != 0;
        if (!z11) {
            this.f16593c.n(':');
        } else if (i12 != -1) {
            z10 = this.f16593c.K();
        }
        if (!this.f16593c.f()) {
            if (!z10) {
                return -1;
            }
            mf.a.x(this.f16593c, "Expected '}', but had ',' instead", 0, null, 6, null);
            throw new tb.i();
        }
        if (z11) {
            if (this.f16595e == -1) {
                mf.a aVar = this.f16593c;
                boolean z12 = !z10;
                i11 = aVar.f16587a;
                if (!z12) {
                    mf.a.x(aVar, "Unexpected trailing comma", i11, null, 4, null);
                    throw new tb.i();
                }
            } else {
                mf.a aVar2 = this.f16593c;
                i10 = aVar2.f16587a;
                if (!z10) {
                    mf.a.x(aVar2, "Expected comma after the key-value pair", i10, null, 4, null);
                    throw new tb.i();
                }
            }
        }
        int i13 = this.f16595e + 1;
        this.f16595e = i13;
        return i13;
    }

    private final int N(SerialDescriptor serialDescriptor) {
        boolean z10;
        boolean K = this.f16593c.K();
        while (this.f16593c.f()) {
            String O = O();
            this.f16593c.n(':');
            int d10 = r.d(serialDescriptor, this.f16591a, O);
            boolean z11 = false;
            if (d10 == -3) {
                z11 = true;
                z10 = false;
            } else if (!this.f16596f.d() || !K(serialDescriptor, d10)) {
                n nVar = this.f16597g;
                if (nVar != null) {
                    nVar.c(d10);
                }
                return d10;
            } else {
                z10 = this.f16593c.K();
            }
            K = z11 ? P(O) : z10;
        }
        if (K) {
            mf.a.x(this.f16593c, "Unexpected trailing comma", 0, null, 6, null);
            throw new tb.i();
        }
        n nVar2 = this.f16597g;
        if (nVar2 == null) {
            return -1;
        }
        return nVar2.d();
    }

    private final String O() {
        return this.f16596f.l() ? this.f16593c.s() : this.f16593c.k();
    }

    private final boolean P(String str) {
        if (this.f16596f.g()) {
            this.f16593c.G(this.f16596f.l());
        } else {
            this.f16593c.z(str);
        }
        return this.f16593c.K();
    }

    private final void Q(SerialDescriptor serialDescriptor) {
        do {
        } while (q(serialDescriptor) != -1);
    }

    @Override // jf.a, kotlinx.serialization.encoding.Decoder
    public Void A() {
        return null;
    }

    @Override // jf.a, kotlinx.serialization.encoding.Decoder
    public short B() {
        long o10 = this.f16593c.o();
        short s10 = (short) o10;
        if (o10 == s10) {
            return s10;
        }
        mf.a aVar = this.f16593c;
        mf.a.x(aVar, "Failed to parse short for input '" + o10 + '\'', 0, null, 6, null);
        throw new tb.i();
    }

    @Override // jf.a, jf.c
    public <T> T C(SerialDescriptor serialDescriptor, int i10, kotlinx.serialization.b<T> bVar, T t10) {
        hc.t.e(serialDescriptor, "descriptor");
        hc.t.e(bVar, "deserializer");
        boolean z10 = this.f16592b == g0.MAP && (i10 & 1) == 0;
        if (z10) {
            this.f16593c.f16588b.d();
        }
        T t11 = (T) super.C(serialDescriptor, i10, bVar, t10);
        if (z10) {
            this.f16593c.f16588b.f(t11);
        }
        return t11;
    }

    @Override // jf.a, kotlinx.serialization.encoding.Decoder
    public String D() {
        return this.f16596f.l() ? this.f16593c.s() : this.f16593c.p();
    }

    @Override // jf.a, kotlinx.serialization.encoding.Decoder
    public float E() {
        mf.a aVar = this.f16593c;
        String r10 = aVar.r();
        try {
            float parseFloat = Float.parseFloat(r10);
            if (!this.f16591a.f().a()) {
                if (!(!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat))) {
                    q.i(this.f16593c, Float.valueOf(parseFloat));
                    throw new tb.i();
                }
            }
            return parseFloat;
        } catch (IllegalArgumentException unused) {
            mf.a.x(aVar, "Failed to parse type 'float' for input '" + r10 + '\'', 0, null, 6, null);
            throw new tb.i();
        }
    }

    @Override // jf.a, kotlinx.serialization.encoding.Decoder
    public double G() {
        mf.a aVar = this.f16593c;
        String r10 = aVar.r();
        try {
            double parseDouble = Double.parseDouble(r10);
            if (!this.f16591a.f().a()) {
                if (!(!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble))) {
                    q.i(this.f16593c, Double.valueOf(parseDouble));
                    throw new tb.i();
                }
            }
            return parseDouble;
        } catch (IllegalArgumentException unused) {
            mf.a.x(aVar, "Failed to parse type 'double' for input '" + r10 + '\'', 0, null, 6, null);
            throw new tb.i();
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder, jf.c
    public nf.d a() {
        return this.f16594d;
    }

    @Override // jf.a, kotlinx.serialization.encoding.Decoder
    public jf.c b(SerialDescriptor serialDescriptor) {
        hc.t.e(serialDescriptor, "descriptor");
        g0 b10 = h0.b(this.f16591a, serialDescriptor);
        this.f16593c.f16588b.c(serialDescriptor);
        this.f16593c.n(b10.f16627c);
        J();
        int i10 = a.f16598a[b10.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3) ? new a0(this.f16591a, b10, this.f16593c, serialDescriptor) : (this.f16592b != b10 || !this.f16591a.f().f()) ? new a0(this.f16591a, b10, this.f16593c, serialDescriptor) : this;
    }

    @Override // jf.a, jf.c
    public void c(SerialDescriptor serialDescriptor) {
        hc.t.e(serialDescriptor, "descriptor");
        if (this.f16591a.f().g() && serialDescriptor.m() == 0) {
            Q(serialDescriptor);
        }
        this.f16593c.n(this.f16592b.f16628d);
        this.f16593c.f16588b.b();
    }

    @Override // lf.f
    public final lf.a d() {
        return this.f16591a;
    }

    @Override // jf.a, kotlinx.serialization.encoding.Decoder
    public long h() {
        return this.f16593c.o();
    }

    @Override // jf.a, kotlinx.serialization.encoding.Decoder
    public boolean j() {
        return this.f16596f.l() ? this.f16593c.i() : this.f16593c.g();
    }

    @Override // jf.a, kotlinx.serialization.encoding.Decoder
    public boolean l() {
        n nVar = this.f16597g;
        return !(nVar != null ? nVar.b() : false) && this.f16593c.L();
    }

    @Override // jf.a, kotlinx.serialization.encoding.Decoder
    public char n() {
        String r10 = this.f16593c.r();
        if (r10.length() == 1) {
            return r10.charAt(0);
        }
        mf.a aVar = this.f16593c;
        mf.a.x(aVar, "Expected single char, but got '" + r10 + '\'', 0, null, 6, null);
        throw new tb.i();
    }

    @Override // jf.a, kotlinx.serialization.encoding.Decoder
    public int p(SerialDescriptor serialDescriptor) {
        hc.t.e(serialDescriptor, "enumDescriptor");
        lf.a aVar = this.f16591a;
        String D = D();
        return r.e(serialDescriptor, aVar, D, " at path " + this.f16593c.f16588b.a());
    }

    @Override // jf.c
    public int q(SerialDescriptor serialDescriptor) {
        hc.t.e(serialDescriptor, "descriptor");
        int i10 = a.f16598a[this.f16592b.ordinal()];
        int L = i10 != 2 ? i10 != 4 ? L() : N(serialDescriptor) : M();
        if (this.f16592b != g0.MAP) {
            this.f16593c.f16588b.g(L);
        }
        return L;
    }

    @Override // jf.a, kotlinx.serialization.encoding.Decoder
    public Decoder t(SerialDescriptor serialDescriptor) {
        hc.t.e(serialDescriptor, "inlineDescriptor");
        return c0.a(serialDescriptor) ? new l(this.f16593c, this.f16591a) : super.t(serialDescriptor);
    }

    @Override // lf.f
    public JsonElement v() {
        return new x(this.f16591a.f(), this.f16593c).e();
    }

    @Override // jf.a, kotlinx.serialization.encoding.Decoder
    public int w() {
        long o10 = this.f16593c.o();
        int i10 = (int) o10;
        if (o10 == i10) {
            return i10;
        }
        mf.a aVar = this.f16593c;
        mf.a.x(aVar, "Failed to parse int for input '" + o10 + '\'', 0, null, 6, null);
        throw new tb.i();
    }

    @Override // jf.a, kotlinx.serialization.encoding.Decoder
    public <T> T y(kotlinx.serialization.b<T> bVar) {
        hc.t.e(bVar, "deserializer");
        try {
            return (T) y.d(this, bVar);
        } catch (kotlinx.serialization.c e10) {
            throw new kotlinx.serialization.c(e10.getMessage() + " at path: " + this.f16593c.f16588b.a(), e10);
        }
    }

    @Override // jf.a, kotlinx.serialization.encoding.Decoder
    public byte z() {
        long o10 = this.f16593c.o();
        byte b10 = (byte) o10;
        if (o10 == b10) {
            return b10;
        }
        mf.a aVar = this.f16593c;
        mf.a.x(aVar, "Failed to parse byte for input '" + o10 + '\'', 0, null, 6, null);
        throw new tb.i();
    }
}
