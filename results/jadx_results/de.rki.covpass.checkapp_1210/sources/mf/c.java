package mf;

import hc.k0;
import kf.q0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.conscrypt.BuildConfig;
import p000if.i;
import p000if.j;
@Metadata(bv = {}, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u0010;\u001a\u00020\u0003¢\u0006\u0004\bC\u0010DJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0014\u0010\f\u001a\u00020\u000b*\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\r\u001a\u00020\u0003H\u0016J#\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0014J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0005H\u0004J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0005H$J\u0018\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0016H\u0014J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u0010&\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u0010(\u001a\u00020'2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u0010)\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u0010+\u001a\u00020*2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u0010-\u001a\u00020,2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u0010/\u001a\u00020.2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u00101\u001a\u0002002\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u00102\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0018\u00105\u001a\u0002042\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u0016H\u0014R\u001a\u00107\u001a\u0002068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010;\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A\u0082\u0001\u0002EF¨\u0006G"}, d2 = {"Lmf/c;", "Lkf/q0;", "Llf/f;", "Lkotlinx/serialization/json/JsonElement;", "e0", BuildConfig.FLAVOR, "primitive", BuildConfig.FLAVOR, "s0", "Lkotlinx/serialization/json/JsonPrimitive;", "type", "Llf/m;", "c0", "v", "T", "Lkotlinx/serialization/b;", "deserializer", "y", "(Lkotlinx/serialization/b;)Ljava/lang/Object;", "parentName", "childName", "Y", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Ljf/c;", "b", "Ltb/e0;", "c", BuildConfig.FLAVOR, "l", "tag", "q0", "d0", "enumDescriptor", BuildConfig.FLAVOR, "j0", "f0", BuildConfig.FLAVOR, "g0", BuildConfig.FLAVOR, "o0", "m0", BuildConfig.FLAVOR, "n0", BuildConfig.FLAVOR, "k0", BuildConfig.FLAVOR, "i0", BuildConfig.FLAVOR, "h0", "p0", "inlineDescriptor", "Lkotlinx/serialization/encoding/Decoder;", "l0", "Llf/a;", "json", "Llf/a;", "d", "()Llf/a;", "value", "Lkotlinx/serialization/json/JsonElement;", "r0", "()Lkotlinx/serialization/json/JsonElement;", "Lnf/d;", "a", "()Lnf/d;", "serializersModule", "<init>", "(Llf/a;Lkotlinx/serialization/json/JsonElement;)V", "Lmf/u;", "Lmf/v;", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class c extends q0 implements lf.f {

    /* renamed from: c */
    private final lf.a f16608c;

    /* renamed from: d */
    private final JsonElement f16609d;

    /* renamed from: e */
    protected final lf.e f16610e;

    private c(lf.a aVar, JsonElement jsonElement) {
        this.f16608c = aVar;
        this.f16609d = jsonElement;
        this.f16610e = d().f();
    }

    public /* synthetic */ c(lf.a aVar, JsonElement jsonElement, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, jsonElement);
    }

    private final lf.m c0(JsonPrimitive jsonPrimitive, String str) {
        lf.m mVar = jsonPrimitive instanceof lf.m ? (lf.m) jsonPrimitive : null;
        if (mVar != null) {
            return mVar;
        }
        throw q.d(-1, "Unexpected 'null' when " + str + " was expected");
    }

    private final JsonElement e0() {
        JsonElement d02;
        String T = T();
        return (T == null || (d02 = d0(T)) == null) ? r0() : d02;
    }

    private final Void s0(String str) {
        throw q.e(-1, "Failed to parse '" + str + '\'', e0().toString());
    }

    @Override // kf.q0
    protected String Y(String str, String str2) {
        hc.t.e(str, "parentName");
        hc.t.e(str2, "childName");
        return str2;
    }

    @Override // kotlinx.serialization.encoding.Decoder, jf.c
    public nf.d a() {
        return d().a();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public jf.c b(SerialDescriptor serialDescriptor) {
        hc.t.e(serialDescriptor, "descriptor");
        JsonElement e02 = e0();
        p000if.i h10 = serialDescriptor.h();
        if (hc.t.a(h10, j.b.f12554a) ? true : h10 instanceof p000if.d) {
            lf.a d10 = d();
            if (e02 instanceof JsonArray) {
                return new v(d10, (JsonArray) e02);
            }
            throw q.d(-1, "Expected " + k0.b(JsonArray.class) + " as the serialized body of " + serialDescriptor.l() + ", but had " + k0.b(e02.getClass()));
        } else if (!hc.t.a(h10, j.c.f12555a)) {
            lf.a d11 = d();
            if (e02 instanceof JsonObject) {
                return new u(d11, (JsonObject) e02, null, null, 12, null);
            }
            throw q.d(-1, "Expected " + k0.b(JsonObject.class) + " as the serialized body of " + serialDescriptor.l() + ", but had " + k0.b(e02.getClass()));
        } else {
            lf.a d12 = d();
            SerialDescriptor a10 = h0.a(serialDescriptor.q(0), d12.a());
            p000if.i h11 = a10.h();
            if ((h11 instanceof p000if.e) || hc.t.a(h11, i.b.f12552a)) {
                lf.a d13 = d();
                if (e02 instanceof JsonObject) {
                    return new w(d13, (JsonObject) e02);
                }
                throw q.d(-1, "Expected " + k0.b(JsonObject.class) + " as the serialized body of " + serialDescriptor.l() + ", but had " + k0.b(e02.getClass()));
            } else if (!d12.f().b()) {
                throw q.c(a10);
            } else {
                lf.a d14 = d();
                if (e02 instanceof JsonArray) {
                    return new v(d14, (JsonArray) e02);
                }
                throw q.d(-1, "Expected " + k0.b(JsonArray.class) + " as the serialized body of " + serialDescriptor.l() + ", but had " + k0.b(e02.getClass()));
            }
        }
    }

    @Override // jf.c
    public void c(SerialDescriptor serialDescriptor) {
        hc.t.e(serialDescriptor, "descriptor");
    }

    @Override // lf.f
    public lf.a d() {
        return this.f16608c;
    }

    protected abstract JsonElement d0(String str);

    /* renamed from: f0 */
    public boolean I(String str) {
        hc.t.e(str, "tag");
        JsonPrimitive q02 = q0(str);
        if (!d().f().l() && c0(q02, "boolean").b()) {
            throw q.e(-1, "Boolean literal for key '" + str + "' should be unquoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", e0().toString());
        }
        try {
            Boolean c10 = lf.g.c(q02);
            if (c10 == null) {
                throw new IllegalArgumentException();
            }
            return c10.booleanValue();
        } catch (IllegalArgumentException unused) {
            s0("boolean");
            throw new tb.i();
        }
    }

    /* renamed from: g0 */
    public byte J(String str) {
        hc.t.e(str, "tag");
        try {
            int h10 = lf.g.h(q0(str));
            boolean z10 = false;
            if (-128 <= h10 && h10 <= 127) {
                z10 = true;
            }
            Byte valueOf = z10 ? Byte.valueOf((byte) h10) : null;
            if (valueOf != null) {
                return valueOf.byteValue();
            }
            s0("byte");
            throw new tb.i();
        } catch (IllegalArgumentException unused) {
            s0("byte");
            throw new tb.i();
        }
    }

    /* renamed from: h0 */
    public char K(String str) {
        char X0;
        hc.t.e(str, "tag");
        try {
            X0 = bf.a0.X0(q0(str).a());
            return X0;
        } catch (IllegalArgumentException unused) {
            s0("char");
            throw new tb.i();
        }
    }

    /* renamed from: i0 */
    public double L(String str) {
        hc.t.e(str, "tag");
        try {
            double e10 = lf.g.e(q0(str));
            if (!d().f().a()) {
                if (!(!Double.isInfinite(e10) && !Double.isNaN(e10))) {
                    throw q.a(Double.valueOf(e10), str, e0().toString());
                }
            }
            return e10;
        } catch (IllegalArgumentException unused) {
            s0("double");
            throw new tb.i();
        }
    }

    /* renamed from: j0 */
    public int M(String str, SerialDescriptor serialDescriptor) {
        hc.t.e(str, "tag");
        hc.t.e(serialDescriptor, "enumDescriptor");
        return r.f(serialDescriptor, d(), q0(str).a(), null, 4, null);
    }

    /* renamed from: k0 */
    public float N(String str) {
        hc.t.e(str, "tag");
        try {
            float g10 = lf.g.g(q0(str));
            if (!d().f().a()) {
                if (!(!Float.isInfinite(g10) && !Float.isNaN(g10))) {
                    throw q.a(Float.valueOf(g10), str, e0().toString());
                }
            }
            return g10;
        } catch (IllegalArgumentException unused) {
            s0("float");
            throw new tb.i();
        }
    }

    @Override // kf.l1, kotlinx.serialization.encoding.Decoder
    public boolean l() {
        return !(e0() instanceof JsonNull);
    }

    /* renamed from: l0 */
    public Decoder O(String str, SerialDescriptor serialDescriptor) {
        hc.t.e(str, "tag");
        hc.t.e(serialDescriptor, "inlineDescriptor");
        return c0.a(serialDescriptor) ? new l(new d0(q0(str).a()), d()) : super.O(str, serialDescriptor);
    }

    /* renamed from: m0 */
    public int P(String str) {
        hc.t.e(str, "tag");
        try {
            return lf.g.h(q0(str));
        } catch (IllegalArgumentException unused) {
            s0("int");
            throw new tb.i();
        }
    }

    /* renamed from: n0 */
    public long Q(String str) {
        hc.t.e(str, "tag");
        try {
            return lf.g.j(q0(str));
        } catch (IllegalArgumentException unused) {
            s0("long");
            throw new tb.i();
        }
    }

    /* renamed from: o0 */
    public short R(String str) {
        hc.t.e(str, "tag");
        try {
            int h10 = lf.g.h(q0(str));
            boolean z10 = false;
            if (-32768 <= h10 && h10 <= 32767) {
                z10 = true;
            }
            Short valueOf = z10 ? Short.valueOf((short) h10) : null;
            if (valueOf != null) {
                return valueOf.shortValue();
            }
            s0("short");
            throw new tb.i();
        } catch (IllegalArgumentException unused) {
            s0("short");
            throw new tb.i();
        }
    }

    /* renamed from: p0 */
    public String S(String str) {
        hc.t.e(str, "tag");
        JsonPrimitive q02 = q0(str);
        if (d().f().l() || c0(q02, "string").b()) {
            if (q02 instanceof JsonNull) {
                throw q.e(-1, "Unexpected 'null' value instead of string literal", e0().toString());
            }
            return q02.a();
        }
        throw q.e(-1, "String literal for key '" + str + "' should be quoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", e0().toString());
    }

    protected final JsonPrimitive q0(String str) {
        hc.t.e(str, "tag");
        JsonElement d02 = d0(str);
        JsonPrimitive jsonPrimitive = d02 instanceof JsonPrimitive ? (JsonPrimitive) d02 : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        throw q.e(-1, "Expected JsonPrimitive at " + str + ", found " + d02, e0().toString());
    }

    public abstract JsonElement r0();

    @Override // lf.f
    public JsonElement v() {
        return e0();
    }

    @Override // kf.l1, kotlinx.serialization.encoding.Decoder
    public <T> T y(kotlinx.serialization.b<T> bVar) {
        hc.t.e(bVar, "deserializer");
        return (T) y.d(this, bVar);
    }
}
