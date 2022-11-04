package hf;

import bf.x;
import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.a0;
import tb.g0;
import tb.z;
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u001d\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u000bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0011\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0006\u0010\u0014\u001a\u00020\u0006J\u0006\u0010\u0015\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0006J\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u0019\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0018J\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u001cJ\u000e\u0010\u001f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u001eJ\u000e\u0010!\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020 \u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Lhf/f;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "data", BuildConfig.FLAVOR, "type", "Ltb/e0;", "e", BuildConfig.FLAVOR, "value", "b", "Ltb/a0;", "c", "(J)[B", BuildConfig.FLAVOR, "bytes", "tag", "l", "(JIB)[B", "a", "n", "o", "m", "i", BuildConfig.FLAVOR, "d", "j", "f", BuildConfig.FLAVOR, "k", BuildConfig.FLAVOR, "h", BuildConfig.FLAVOR, "g", "Lhf/b;", "output", "<init>", "(Lhf/b;)V", "kotlinx-serialization-cbor"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a */
    private final b f11894a;

    public f(b bVar) {
        t.e(bVar, "output");
        this.f11894a = bVar;
    }

    private final byte[] a(long j10) {
        byte[] c10 = c(a0.b(j10 == Long.MIN_VALUE ? Long.MAX_VALUE : (-1) - j10));
        c10[0] = (byte) (c10[0] | 32);
        return c10;
    }

    private final byte[] b(long j10) {
        return j10 >= 0 ? c(a0.b(j10)) : a(j10);
    }

    private final byte[] c(long j10) {
        byte b10;
        int i10;
        boolean z10 = true;
        if (g0.c(j10, a0.b(0L)) >= 0 && g0.c(j10, a0.b(((long) 23) & 4294967295L)) <= 0) {
            return new byte[]{(byte) j10};
        }
        if (g0.c(j10, a0.b(((long) 24) & 4294967295L)) >= 0 && g0.c(j10, a0.b(((long) z.b(255)) & 4294967295L)) <= 0) {
            return new byte[]{24, (byte) j10};
        }
        if (g0.c(j10, a0.b(((long) z.b(65535)) & 4294967295L)) <= 0 && g0.c(j10, a0.b(((long) z.b(z.b(255) + 1)) & 4294967295L)) >= 0) {
            return l(j10, 2, (byte) 25);
        }
        if (g0.c(j10, a0.b(z.b(z.b(65535) + 1) & 4294967295L)) < 0 || g0.c(j10, a0.b((-1) & 4294967295L)) > 0) {
            z10 = false;
        }
        if (z10) {
            i10 = 4;
            b10 = 26;
        } else {
            i10 = 8;
            b10 = 27;
        }
        return l(j10, i10, b10);
    }

    private final void e(byte[] bArr, byte b10) {
        byte[] b11 = b(bArr.length);
        b11[0] = (byte) (b11[0] | b10);
        b.e(this.f11894a, b11, 0, 0, 6, null);
        b.e(this.f11894a, bArr, 0, 0, 6, null);
    }

    private final byte[] l(long j10, int i10, byte b10) {
        byte[] bArr = new byte[i10 + 1];
        int i11 = (i10 * 8) - 8;
        int i12 = 0;
        bArr[0] = b10;
        while (i12 < i10) {
            int i13 = i12 + 1;
            bArr[i13] = (byte) a0.b(a0.b(j10 >>> (i11 - (i12 * 8))) & 255);
            i12 = i13;
        }
        return bArr;
    }

    public final void d(boolean z10) {
        this.f11894a.c(z10 ? 245 : 244);
    }

    public final void f(byte[] bArr) {
        t.e(bArr, "data");
        e(bArr, (byte) 64);
    }

    public final void g(double d10) {
        this.f11894a.c(251);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d10);
        for (int i10 = 0; i10 < 8; i10++) {
            this.f11894a.c((int) ((doubleToRawLongBits >> (56 - (i10 * 8))) & 255));
        }
    }

    public final void h(float f10) {
        this.f11894a.c(250);
        int floatToRawIntBits = Float.floatToRawIntBits(f10);
        for (int i10 = 0; i10 < 4; i10++) {
            this.f11894a.c((floatToRawIntBits >> (24 - (i10 * 8))) & 255);
        }
    }

    public final void i() {
        this.f11894a.c(246);
    }

    public final void j(long j10) {
        b.e(this.f11894a, b(j10), 0, 0, 6, null);
    }

    public final void k(String str) {
        byte[] s10;
        t.e(str, "value");
        s10 = x.s(str);
        e(s10, (byte) 96);
    }

    public final void m() {
        this.f11894a.c(255);
    }

    public final void n() {
        this.f11894a.c(159);
    }

    public final void o() {
        this.f11894a.c(191);
    }
}
