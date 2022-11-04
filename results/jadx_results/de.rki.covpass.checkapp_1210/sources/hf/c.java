package hf;

import bf.x;
import hc.n;
import hc.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.u;
import ub.z;
@Metadata(bv = {}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00102\u001a\u00020\u0011¢\u0006\u0004\b3\u00104J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\u0005H\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0014\u0010\u0013\u001a\u00020\u000f*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0002J\u0014\u0010\u0015\u001a\u00020\f*\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0002H\u0002J\b\u0010\u0016\u001a\u00020\u000fH\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0002H\u0002J\u0016\u0010\u001c\u001a\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u0002H\u0002J\b\u0010 \u001a\u00020\fH\u0002J\u0006\u0010!\u001a\u00020\u001dJ\u0006\u0010\"\u001a\u00020\u001dJ\b\u0010$\u001a\u0004\u0018\u00010#J\u0006\u0010%\u001a\u00020\u001dJ\u0006\u0010&\u001a\u00020\u0002J\u0006\u0010'\u001a\u00020\u0002J\u0006\u0010(\u001a\u00020\u001dJ\u0006\u0010)\u001a\u00020\u0005J\u0006\u0010*\u001a\u00020\fJ\u0006\u0010+\u001a\u00020\tJ\u0006\u0010,\u001a\u00020\u000fJ\u0006\u0010.\u001a\u00020-J\u0006\u00100\u001a\u00020/J\u0006\u00101\u001a\u00020\u0005¨\u00065"}, d2 = {"Lhf/c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "o", "expected", "Ltb/e0;", "x", "unboundedHeader", "boundedHeaderMask", BuildConfig.FLAVOR, "collectionType", "C", BuildConfig.FLAVOR, "p", "z", BuildConfig.FLAVOR, "v", "Lhf/a;", "bytes", "q", "bytesCount", "r", "u", BuildConfig.FLAVOR, "w", "t", BuildConfig.FLAVOR, "lengthStack", "n", BuildConfig.FLAVOR, "e", "a", "s", "d", "f", BuildConfig.FLAVOR, "k", "g", "A", "B", "c", "b", "h", "m", "l", BuildConfig.FLAVOR, "j", BuildConfig.FLAVOR, "i", "y", "input", "<init>", "(Lhf/a;)V", "kotlinx-serialization-cbor"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a */
    private final a f11892a;

    /* renamed from: b */
    private int f11893b = -1;

    public c(a aVar) {
        t.e(aVar, "input");
        this.f11892a = aVar;
        o();
    }

    private final int C(int i10, int i11, String str) {
        z();
        int i12 = this.f11893b;
        if (i12 == i10) {
            x(i10);
            return -1;
        } else if ((i12 & 224) == i11) {
            int v10 = (int) v();
            o();
            return v10;
        } else {
            throw e.a("start of " + str, this.f11893b);
        }
    }

    private final int a() {
        int i10 = this.f11893b;
        int i11 = i10 & 224;
        int i12 = i10 & 31;
        if (i11 == 64 || i11 == 96 || i11 == 128) {
            return (int) v();
        }
        if (i11 == 160) {
            return 2 * ((int) v());
        }
        switch (i12) {
            case 24:
                return 1;
            case 25:
                return 2;
            case 26:
                return 4;
            case 27:
                return 8;
            default:
                return 0;
        }
    }

    private final boolean e() {
        int i10 = this.f11893b;
        int i11 = i10 & 224;
        return (i10 & 31) == 31 && (i11 == 128 || i11 == 160 || i11 == 64 || i11 == 96);
    }

    private final void n(List<Integer> list) {
        int j10;
        int intValue;
        for (j10 = u.j(list); -1 < j10 && (intValue = list.get(j10).intValue()) != -1; j10--) {
            if (intValue != 1) {
                list.set(j10, Integer.valueOf(list.get(j10).intValue() - 1));
                return;
            }
            list.remove(j10);
        }
    }

    private final int o() {
        int b10 = this.f11892a.b();
        this.f11893b = b10;
        return b10;
    }

    private final byte[] p() {
        if ((this.f11893b & 31) == 31) {
            o();
            return s();
        }
        return r(this.f11892a, (int) v());
    }

    private final long q(a aVar, int i10) {
        byte[] r10 = r(aVar, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (r10[i11] & 255);
        }
        return j10;
    }

    private final byte[] r(a aVar, int i10) {
        if (i10 <= aVar.a()) {
            byte[] bArr = new byte[i10];
            aVar.c(bArr, 0, i10);
            return bArr;
        }
        throw new IllegalStateException(("Unexpected EOF, available " + aVar.a() + " bytes, requested: " + i10).toString());
    }

    private final byte[] s() {
        byte[] e10;
        ArrayList arrayList = new ArrayList();
        do {
            arrayList.add(p());
            o();
        } while (!c());
        e10 = m.e(arrayList);
        return e10;
    }

    private final int t() {
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 = (i10 << 8) | this.f11892a.b();
        }
        return i10;
    }

    private final long u() {
        long j10 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            j10 = (j10 << 8) | this.f11892a.b();
        }
        return j10;
    }

    private final long v() {
        int i10 = this.f11893b;
        int i11 = i10 & 31;
        int i12 = 0;
        boolean z10 = (i10 & 224) == 32;
        switch (i11) {
            case 24:
                i12 = 1;
                break;
            case 25:
                i12 = 2;
                break;
            case 26:
                i12 = 4;
                break;
            case 27:
                i12 = 8;
                break;
        }
        if (i12 == 0) {
            return z10 ? -(i11 + 1) : i11;
        }
        long q10 = q(this.f11892a, i12);
        return z10 ? -(q10 + 1) : q10;
    }

    private final short w() {
        return (short) ((this.f11892a.b() << 8) | this.f11892a.b());
    }

    private final void x(int i10) {
        if (this.f11893b == i10) {
            o();
            return;
        }
        throw e.a("byte " + e.b(i10), this.f11893b);
    }

    private final void z() {
        while ((this.f11893b & 224) == 192) {
            v();
            o();
        }
    }

    public final int A() {
        return C(159, 128, "array");
    }

    public final int B() {
        return C(191, 160, "map");
    }

    public final void b() {
        x(255);
    }

    public final boolean c() {
        return this.f11893b == 255;
    }

    public final boolean d() {
        return this.f11893b == -1;
    }

    public final boolean f() {
        return this.f11893b == 246;
    }

    public final boolean g() {
        boolean z10;
        z();
        int i10 = this.f11893b;
        if (i10 == 244) {
            z10 = false;
        } else if (i10 != 245) {
            throw e.a("boolean value", i10);
        } else {
            z10 = true;
        }
        o();
        return z10;
    }

    public final byte[] h() {
        z();
        int i10 = this.f11893b;
        if ((i10 & 224) == 64) {
            byte[] p10 = p();
            o();
            return p10;
        }
        throw e.a("start of byte string", i10);
    }

    public final double i() {
        double d10;
        float f10;
        z();
        int i10 = this.f11893b;
        switch (i10) {
            case 249:
                f10 = m.f(w());
                d10 = f10;
                break;
            case 250:
                n nVar = n.f11774a;
                f10 = Float.intBitsToFloat(t());
                d10 = f10;
                break;
            case 251:
                hc.m mVar = hc.m.f11773a;
                d10 = Double.longBitsToDouble(u());
                break;
            default:
                throw e.a("double header", i10);
        }
        o();
        return d10;
    }

    public final float j() {
        float f10;
        z();
        int i10 = this.f11893b;
        if (i10 == 249) {
            f10 = m.f(w());
        } else if (i10 != 250) {
            throw e.a("float header", i10);
        } else {
            n nVar = n.f11774a;
            f10 = Float.intBitsToFloat(t());
        }
        o();
        return f10;
    }

    public final Void k() {
        z();
        x(246);
        return null;
    }

    public final long l() {
        z();
        long v10 = v();
        o();
        return v10;
    }

    public final String m() {
        String r10;
        z();
        int i10 = this.f11893b;
        if ((i10 & 224) == 96) {
            r10 = x.r(p());
            o();
            return r10;
        }
        throw e.a("start of string", i10);
    }

    public final void y() {
        Object C;
        ArrayList arrayList = new ArrayList();
        z();
        while (!d()) {
            if (e()) {
                arrayList.add(-1);
            } else {
                if (c()) {
                    C = z.C(arrayList);
                    Integer num = (Integer) C;
                    if (num == null || num.intValue() != -1) {
                        throw e.a("next data item", this.f11893b);
                    }
                } else {
                    int i10 = this.f11893b & 224;
                    int a10 = a();
                    if (i10 == 128 || i10 == 160) {
                        if (a10 > 0) {
                            arrayList.add(Integer.valueOf(a10));
                        }
                        z();
                    } else {
                        this.f11892a.d(a10);
                    }
                }
                n(arrayList);
            }
            o();
            if (!(!arrayList.isEmpty())) {
                return;
            }
        }
        throw new d("Unexpected EOF while skipping element");
    }
}
