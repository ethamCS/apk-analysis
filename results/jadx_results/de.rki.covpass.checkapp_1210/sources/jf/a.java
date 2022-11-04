package jf;

import hc.k0;
import hc.t;
import jf.c;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.i;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b6\u00107J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J/\u0010#\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u001aH\u0016J\u0010\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020\u001aH\u0016J\u0016\u0010*\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u000eJ\u0016\u0010+\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u000eJ\u0016\u0010,\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u000eJ\u0016\u0010-\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u000eJ\u0016\u0010.\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u000eJ\u0016\u0010/\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u000eJ\u0016\u00100\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u000eJ\u0016\u00101\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u000eJ\u0016\u00102\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u000eJ=\u00103\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001f2\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u000e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\b\u0010\"\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b3\u00104JC\u00105\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001f*\u00020\u00032\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u000e2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000 2\b\u0010\"\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b5\u00104¨\u00068"}, d2 = {"Ljf/a;", "Lkotlinx/serialization/encoding/Decoder;", "Ljf/c;", BuildConfig.FLAVOR, "I", BuildConfig.FLAVOR, "l", BuildConfig.FLAVOR, "A", "j", BuildConfig.FLAVOR, "z", BuildConfig.FLAVOR, "B", BuildConfig.FLAVOR, "w", BuildConfig.FLAVOR, "h", BuildConfig.FLAVOR, "E", BuildConfig.FLAVOR, "G", BuildConfig.FLAVOR, "n", BuildConfig.FLAVOR, "D", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "enumDescriptor", "p", "inlineDescriptor", "t", "T", "Lkotlinx/serialization/b;", "deserializer", "previousValue", "H", "(Lkotlinx/serialization/b;Ljava/lang/Object;)Ljava/lang/Object;", "descriptor", "b", "Ltb/e0;", "c", "index", "i", "g", "o", "x", "s", "F", "u", "f", "k", "C", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/b;Ljava/lang/Object;)Ljava/lang/Object;", "m", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class a implements Decoder, c {
    @Override // kotlinx.serialization.encoding.Decoder
    public Void A() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract short B();

    @Override // jf.c
    public <T> T C(SerialDescriptor serialDescriptor, int i10, kotlinx.serialization.b<T> bVar, T t10) {
        t.e(serialDescriptor, "descriptor");
        t.e(bVar, "deserializer");
        return (T) H(bVar, t10);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public String D() {
        return (String) I();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public float E() {
        return ((Float) I()).floatValue();
    }

    @Override // jf.c
    public final float F(SerialDescriptor serialDescriptor, int i10) {
        t.e(serialDescriptor, "descriptor");
        return E();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public double G() {
        return ((Double) I()).doubleValue();
    }

    public <T> T H(kotlinx.serialization.b<T> bVar, T t10) {
        t.e(bVar, "deserializer");
        return (T) y(bVar);
    }

    public Object I() {
        throw new i(k0.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public c b(SerialDescriptor serialDescriptor) {
        t.e(serialDescriptor, "descriptor");
        return this;
    }

    public void c(SerialDescriptor serialDescriptor) {
        t.e(serialDescriptor, "descriptor");
    }

    @Override // jf.c
    public int e(SerialDescriptor serialDescriptor) {
        return c.b.a(this, serialDescriptor);
    }

    @Override // jf.c
    public final char f(SerialDescriptor serialDescriptor, int i10) {
        t.e(serialDescriptor, "descriptor");
        return n();
    }

    @Override // jf.c
    public final byte g(SerialDescriptor serialDescriptor, int i10) {
        t.e(serialDescriptor, "descriptor");
        return z();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract long h();

    @Override // jf.c
    public final boolean i(SerialDescriptor serialDescriptor, int i10) {
        t.e(serialDescriptor, "descriptor");
        return j();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean j() {
        return ((Boolean) I()).booleanValue();
    }

    @Override // jf.c
    public final String k(SerialDescriptor serialDescriptor, int i10) {
        t.e(serialDescriptor, "descriptor");
        return D();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean l() {
        return true;
    }

    @Override // jf.c
    public final <T> T m(SerialDescriptor serialDescriptor, int i10, kotlinx.serialization.b<T> bVar, T t10) {
        t.e(serialDescriptor, "descriptor");
        t.e(bVar, "deserializer");
        return (bVar.getDescriptor().o() || l()) ? (T) H(bVar, t10) : (T) A();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char n() {
        return ((Character) I()).charValue();
    }

    @Override // jf.c
    public final short o(SerialDescriptor serialDescriptor, int i10) {
        t.e(serialDescriptor, "descriptor");
        return B();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int p(SerialDescriptor serialDescriptor) {
        t.e(serialDescriptor, "enumDescriptor");
        return ((Integer) I()).intValue();
    }

    @Override // jf.c
    public boolean r() {
        return c.b.b(this);
    }

    @Override // jf.c
    public final long s(SerialDescriptor serialDescriptor, int i10) {
        t.e(serialDescriptor, "descriptor");
        return h();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder t(SerialDescriptor serialDescriptor) {
        t.e(serialDescriptor, "inlineDescriptor");
        return this;
    }

    @Override // jf.c
    public final double u(SerialDescriptor serialDescriptor, int i10) {
        t.e(serialDescriptor, "descriptor");
        return G();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract int w();

    @Override // jf.c
    public final int x(SerialDescriptor serialDescriptor, int i10) {
        t.e(serialDescriptor, "descriptor");
        return w();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public <T> T y(kotlinx.serialization.b<T> bVar) {
        return (T) Decoder.a.a(this, bVar);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract byte z();
}
