package jf;

import hc.t;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.j;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b-\u0010.J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0019H\u0016J\u0010\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u0003H\u0016J\u001e\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007J\u001e\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\fJ\u001e\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u000eJ\u001e\u0010 \u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005J\u001e\u0010!\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0011J\u001e\u0010\"\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0013J\u001e\u0010#\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0015J\u001e\u0010$\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0017J\u001e\u0010%\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0019J;\u0010)\u001a\u00020\n\"\u0004\b\u0000\u0010&2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010*JA\u0010,\u001a\u00020\n\"\b\b\u0000\u0010&*\u00020+2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'2\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b,\u0010*¨\u0006/"}, d2 = {"Ljf/b;", "Lkotlinx/serialization/encoding/Encoder;", "Ljf/d;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", BuildConfig.FLAVOR, "index", BuildConfig.FLAVOR, "F", "value", "Ltb/e0;", "l", BuildConfig.FLAVOR, "k", BuildConfig.FLAVOR, "i", "q", BuildConfig.FLAVOR, "w", BuildConfig.FLAVOR, "s", BuildConfig.FLAVOR, "h", BuildConfig.FLAVOR, "x", BuildConfig.FLAVOR, "D", "inlineDescriptor", "r", "B", "g", "u", "z", "A", "n", "v", "C", "E", "T", "Lkotlinx/serialization/j;", "serializer", "t", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/j;Ljava/lang/Object;)V", BuildConfig.FLAVOR, "m", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class b implements Encoder, d {
    @Override // jf.d
    public final void A(SerialDescriptor serialDescriptor, int i10, long j10) {
        t.e(serialDescriptor, "descriptor");
        if (F(serialDescriptor, i10)) {
            w(j10);
        }
    }

    @Override // jf.d
    public final void B(SerialDescriptor serialDescriptor, int i10, boolean z10) {
        t.e(serialDescriptor, "descriptor");
        if (F(serialDescriptor, i10)) {
            l(z10);
        }
    }

    @Override // jf.d
    public final void C(SerialDescriptor serialDescriptor, int i10, char c10) {
        t.e(serialDescriptor, "descriptor");
        if (F(serialDescriptor, i10)) {
            x(c10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public abstract void D(String str);

    @Override // jf.d
    public final void E(SerialDescriptor serialDescriptor, int i10, String str) {
        t.e(serialDescriptor, "descriptor");
        t.e(str, "value");
        if (F(serialDescriptor, i10)) {
            D(str);
        }
    }

    public abstract boolean F(SerialDescriptor serialDescriptor, int i10);

    public <T> void G(j<? super T> jVar, T t10) {
        Encoder.a.c(this, jVar, t10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public <T> void e(j<? super T> jVar, T t10) {
        Encoder.a.d(this, jVar, t10);
    }

    @Override // jf.d
    public final void g(SerialDescriptor serialDescriptor, int i10, byte b10) {
        t.e(serialDescriptor, "descriptor");
        if (F(serialDescriptor, i10)) {
            k(b10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public abstract void h(double d10);

    @Override // kotlinx.serialization.encoding.Encoder
    public abstract void i(short s10);

    @Override // kotlinx.serialization.encoding.Encoder
    public d j(SerialDescriptor serialDescriptor, int i10) {
        return Encoder.a.a(this, serialDescriptor, i10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public abstract void k(byte b10);

    @Override // kotlinx.serialization.encoding.Encoder
    public abstract void l(boolean z10);

    @Override // jf.d
    public <T> void m(SerialDescriptor serialDescriptor, int i10, j<? super T> jVar, T t10) {
        t.e(serialDescriptor, "descriptor");
        t.e(jVar, "serializer");
        if (F(serialDescriptor, i10)) {
            G(jVar, t10);
        }
    }

    @Override // jf.d
    public final void n(SerialDescriptor serialDescriptor, int i10, float f10) {
        t.e(serialDescriptor, "descriptor");
        if (F(serialDescriptor, i10)) {
            s(f10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public abstract void q(int i10);

    @Override // kotlinx.serialization.encoding.Encoder
    public Encoder r(SerialDescriptor serialDescriptor) {
        t.e(serialDescriptor, "inlineDescriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public abstract void s(float f10);

    @Override // jf.d
    public <T> void t(SerialDescriptor serialDescriptor, int i10, j<? super T> jVar, T t10) {
        t.e(serialDescriptor, "descriptor");
        t.e(jVar, "serializer");
        if (F(serialDescriptor, i10)) {
            e(jVar, t10);
        }
    }

    @Override // jf.d
    public final void u(SerialDescriptor serialDescriptor, int i10, short s10) {
        t.e(serialDescriptor, "descriptor");
        if (F(serialDescriptor, i10)) {
            i(s10);
        }
    }

    @Override // jf.d
    public final void v(SerialDescriptor serialDescriptor, int i10, double d10) {
        t.e(serialDescriptor, "descriptor");
        if (F(serialDescriptor, i10)) {
            h(d10);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public abstract void w(long j10);

    @Override // kotlinx.serialization.encoding.Encoder
    public abstract void x(char c10);

    @Override // kotlinx.serialization.encoding.Encoder
    public void y() {
        Encoder.a.b(this);
    }

    @Override // jf.d
    public final void z(SerialDescriptor serialDescriptor, int i10, int i11) {
        t.e(serialDescriptor, "descriptor");
        if (F(serialDescriptor, i10)) {
            q(i11);
        }
    }
}
