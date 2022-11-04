package eg;

import java.security.MessageDigest;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110%\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b/\u00100J\b\u0010\u0002\u001a\u00020\u0001H\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0001H\u0016J\u0017\u0010\b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0012\u001a\u00020\u0011H\u0016J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0010¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0016J(\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u000f\u0010\u001f\u001a\u00020\u0011H\u0010¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\u00020\u001c2\b\u0010\u001a\u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010#\u001a\u00020\nH\u0016J\b\u0010$\u001a\u00020\u0003H\u0016R \u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010+\u001a\u00020*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Leg/x;", "Leg/f;", "i0", BuildConfig.FLAVOR, "b", "x", "c0", "algorithm", "h", "(Ljava/lang/String;)Leg/f;", BuildConfig.FLAVOR, "pos", BuildConfig.FLAVOR, "z", "(I)B", "t", "()I", BuildConfig.FLAVOR, "d0", "Leg/c;", "buffer", "offset", "byteCount", "Ltb/e0;", "f0", "(Leg/c;II)V", "other", "otherOffset", BuildConfig.FLAVOR, "B", "G", "y", "()[B", BuildConfig.FLAVOR, "equals", "hashCode", "toString", BuildConfig.FLAVOR, "segments", "[[B", "h0", "()[[B", BuildConfig.FLAVOR, "directory", "[I", "g0", "()[I", "<init>", "([[B[I)V", "okio"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class x extends f {
    private final transient int[] U3;

    /* renamed from: y */
    private final transient byte[][] f9662y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(byte[][] bArr, int[] iArr) {
        super(f.f9610x.r());
        hc.t.e(bArr, "segments");
        hc.t.e(iArr, "directory");
        this.f9662y = bArr;
        this.U3 = iArr;
    }

    private final f i0() {
        return new f(d0());
    }

    @Override // eg.f
    public boolean B(int i10, f fVar, int i11, int i12) {
        hc.t.e(fVar, "other");
        if (i10 < 0 || i10 > W() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int b10 = fg.c.b(this, i10);
        while (i10 < i13) {
            int i14 = b10 == 0 ? 0 : g0()[b10 - 1];
            int i15 = g0()[h0().length + b10];
            int min = Math.min(i13, (g0()[b10] - i14) + i14) - i10;
            if (!fVar.G(i11, h0()[b10], i15 + (i10 - i14), min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            b10++;
        }
        return true;
    }

    @Override // eg.f
    public boolean G(int i10, byte[] bArr, int i11, int i12) {
        hc.t.e(bArr, "other");
        if (i10 < 0 || i10 > W() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int b10 = fg.c.b(this, i10);
        while (i10 < i13) {
            int i14 = b10 == 0 ? 0 : g0()[b10 - 1];
            int i15 = g0()[h0().length + b10];
            int min = Math.min(i13, (g0()[b10] - i14) + i14) - i10;
            if (!f0.a(h0()[b10], i15 + (i10 - i14), bArr, i11, min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            b10++;
        }
        return true;
    }

    @Override // eg.f
    public String b() {
        return i0().b();
    }

    @Override // eg.f
    public f c0() {
        return i0().c0();
    }

    @Override // eg.f
    public byte[] d0() {
        byte[] bArr = new byte[W()];
        int length = h0().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = g0()[length + i10];
            int i14 = g0()[i10];
            int i15 = i14 - i11;
            ub.l.e(h0()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // eg.f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.W() == W() && B(0, fVar, 0, W())) {
                return true;
            }
        }
        return false;
    }

    @Override // eg.f
    public void f0(c cVar, int i10, int i11) {
        hc.t.e(cVar, "buffer");
        int i12 = i10 + i11;
        int b10 = fg.c.b(this, i10);
        while (i10 < i12) {
            int i13 = b10 == 0 ? 0 : g0()[b10 - 1];
            int i14 = g0()[h0().length + b10];
            int min = Math.min(i12, (g0()[b10] - i13) + i13) - i10;
            int i15 = i14 + (i10 - i13);
            v vVar = new v(h0()[b10], i15, i15 + min, true, false);
            v vVar2 = cVar.f9600c;
            if (vVar2 == null) {
                vVar.f9656g = vVar;
                vVar.f9655f = vVar;
                cVar.f9600c = vVar;
            } else {
                hc.t.b(vVar2);
                v vVar3 = vVar2.f9656g;
                hc.t.b(vVar3);
                vVar3.c(vVar);
            }
            i10 += min;
            b10++;
        }
        cVar.c1(cVar.e1() + i11);
    }

    public final int[] g0() {
        return this.U3;
    }

    @Override // eg.f
    public f h(String str) {
        hc.t.e(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = h0().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = g0()[length + i10];
            int i13 = g0()[i10];
            messageDigest.update(h0()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] digest = messageDigest.digest();
        hc.t.d(digest, "digestBytes");
        return new f(digest);
    }

    public final byte[][] h0() {
        return this.f9662y;
    }

    @Override // eg.f
    public int hashCode() {
        int s10 = s();
        if (s10 != 0) {
            return s10;
        }
        int length = h0().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = g0()[length + i10];
            int i14 = g0()[i10];
            byte[] bArr = h0()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        I(i11);
        return i11;
    }

    @Override // eg.f
    public int t() {
        return g0()[h0().length - 1];
    }

    @Override // eg.f
    public String toString() {
        return i0().toString();
    }

    @Override // eg.f
    public String x() {
        return i0().x();
    }

    @Override // eg.f
    public byte[] y() {
        return d0();
    }

    @Override // eg.f
    public byte z(int i10) {
        f0.b(g0()[h0().length - 1], i10, 1L);
        int b10 = fg.c.b(this, i10);
        return h0()[b10][(i10 - (b10 == 0 ? 0 : g0()[b10 - 1])) + g0()[h0().length + b10]];
    }
}
