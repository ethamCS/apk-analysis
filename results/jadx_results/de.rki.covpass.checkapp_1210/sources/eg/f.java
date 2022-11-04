package eg;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001>B\u0011\b\u0000\u0012\u0006\u0010.\u001a\u00020\u0017¢\u0006\u0004\b<\u0010=J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0006\u0010\u0006\u001a\u00020\u0000J\u0006\u0010\u0007\u001a\u00020\u0000J\u0006\u0010\b\u001a\u00020\u0000J\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0000H\u0016J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000eH\u0087\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u000f\u0010\u0019\u001a\u00020\u0017H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000eH\u0010¢\u0006\u0004\b \u0010!J(\u0010%\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000eH\u0016J(\u0010&\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000eH\u0016J\u000e\u0010(\u001a\u00020$2\u0006\u0010'\u001a\u00020\u0000J\u0013\u0010*\u001a\u00020$2\b\u0010\"\u001a\u0004\u0018\u00010)H\u0096\u0002J\b\u0010+\u001a\u00020\u000eH\u0016J\u0011\u0010,\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0000H\u0096\u0002J\b\u0010-\u001a\u00020\u0003H\u0016R\u001a\u0010.\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u001aR\"\u0010+\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u00101\u001a\u0004\b2\u0010\u0016\"\u0004\b1\u00103R$\u00104\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0011\u0010;\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b:\u0010\u0016¨\u0006?"}, d2 = {"Leg/f;", "Ljava/io/Serializable;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "e0", "b", "A", "N", "V", "algorithm", "h", "(Ljava/lang/String;)Leg/f;", "x", "c0", BuildConfig.FLAVOR, "pos", BuildConfig.FLAVOR, "z", "(I)B", "index", "p", "t", "()I", BuildConfig.FLAVOR, "d0", "y", "()[B", "Leg/c;", "buffer", "offset", "byteCount", "Ltb/e0;", "f0", "(Leg/c;II)V", "other", "otherOffset", BuildConfig.FLAVOR, "B", "G", "prefix", "b0", BuildConfig.FLAVOR, "equals", "hashCode", "g", "toString", "data", "[B", "r", "I", "s", "(I)V", "utf8", "Ljava/lang/String;", "v", "()Ljava/lang/String;", "M", "(Ljava/lang/String;)V", "W", "size", "<init>", "([B)V", "a", "okio"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public class f implements Serializable, Comparable<f> {
    public static final a Companion = new a(null);

    /* renamed from: x */
    public static final f f9610x = new f(new byte[0]);

    /* renamed from: c */
    private final byte[] f9611c;

    /* renamed from: d */
    private transient int f9612d;

    /* renamed from: q */
    private transient String f9613q;

    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\f\u0010\n\u001a\u00020\u0006*\u00020\tH\u0007J\u001d\u0010\r\u001a\u00020\u0006*\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u0006*\u00020\tH\u0007J\f\u0010\u0010\u001a\u00020\u0006*\u00020\tH\u0007R\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Leg/f$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "offset", "byteCount", "Leg/f;", "e", "([BII)Leg/f;", BuildConfig.FLAVOR, "d", "Ljava/nio/charset/Charset;", "charset", "c", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Leg/f;", "a", "b", "EMPTY", "Leg/f;", BuildConfig.FLAVOR, "serialVersionUID", "J", "<init>", "()V", "okio"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ f f(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = bArr.length;
            }
            return aVar.e(bArr, i10, i11);
        }

        @fc.c
        public final f a(String str) {
            hc.t.e(str, "<this>");
            byte[] a10 = d0.a(str);
            if (a10 != null) {
                return new f(a10);
            }
            return null;
        }

        @fc.c
        public final f b(String str) {
            int e10;
            int e11;
            hc.t.e(str, "<this>");
            int i10 = 0;
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                int i11 = length - 1;
                if (i11 >= 0) {
                    while (true) {
                        int i12 = i10 + 1;
                        int i13 = i10 * 2;
                        e10 = fg.b.e(str.charAt(i13));
                        e11 = fg.b.e(str.charAt(i13 + 1));
                        bArr[i10] = (byte) ((e10 << 4) + e11);
                        if (i12 > i11) {
                            break;
                        }
                        i10 = i12;
                    }
                }
                return new f(bArr);
            }
            throw new IllegalArgumentException(hc.t.l("Unexpected hex string: ", str).toString());
        }

        @fc.c
        public final f c(String str, Charset charset) {
            hc.t.e(str, "<this>");
            hc.t.e(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            hc.t.d(bytes, "(this as java.lang.String).getBytes(charset)");
            return new f(bytes);
        }

        @fc.c
        public final f d(String str) {
            hc.t.e(str, "<this>");
            f fVar = new f(e0.a(str));
            fVar.M(str);
            return fVar;
        }

        @fc.c
        public final f e(byte[] bArr, int i10, int i11) {
            byte[] i12;
            hc.t.e(bArr, "<this>");
            f0.b(bArr.length, i10, i11);
            i12 = ub.l.i(bArr, i10, i11 + i10);
            return new f(i12);
        }
    }

    public f(byte[] bArr) {
        hc.t.e(bArr, "data");
        this.f9611c = bArr;
    }

    @fc.c
    public static final f j(String str) {
        return Companion.d(str);
    }

    public final f A() {
        return h("MD5");
    }

    public boolean B(int i10, f fVar, int i11, int i12) {
        hc.t.e(fVar, "other");
        return fVar.G(i11, r(), i10, i12);
    }

    public boolean G(int i10, byte[] bArr, int i11, int i12) {
        hc.t.e(bArr, "other");
        return i10 >= 0 && i10 <= r().length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && f0.a(r(), i10, bArr, i11, i12);
    }

    public final void I(int i10) {
        this.f9612d = i10;
    }

    public final void M(String str) {
        this.f9613q = str;
    }

    public final f N() {
        return h("SHA-1");
    }

    public final f V() {
        return h("SHA-256");
    }

    public final int W() {
        return t();
    }

    public String b() {
        return d0.c(r(), null, 1, null);
    }

    public final boolean b0(f fVar) {
        hc.t.e(fVar, "prefix");
        return B(0, fVar, 0, fVar.W());
    }

    public f c0() {
        byte b10;
        for (int i10 = 0; i10 < r().length; i10++) {
            byte b11 = r()[i10];
            byte b12 = (byte) 65;
            if (b11 >= b12 && b11 <= (b10 = (byte) 90)) {
                byte[] r10 = r();
                byte[] copyOf = Arrays.copyOf(r10, r10.length);
                hc.t.d(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i10] = (byte) (b11 + 32);
                for (int i11 = i10 + 1; i11 < copyOf.length; i11++) {
                    byte b13 = copyOf[i11];
                    if (b13 >= b12 && b13 <= b10) {
                        copyOf[i11] = (byte) (b13 + 32);
                    }
                }
                return new f(copyOf);
            }
        }
        return this;
    }

    public byte[] d0() {
        byte[] r10 = r();
        byte[] copyOf = Arrays.copyOf(r10, r10.length);
        hc.t.d(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    public String e0() {
        String v10 = v();
        if (v10 == null) {
            String b10 = e0.b(y());
            M(b10);
            return b10;
        }
        return v10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.W() == r().length && fVar.G(0, r(), 0, r().length)) {
                return true;
            }
        }
        return false;
    }

    public void f0(c cVar, int i10, int i11) {
        hc.t.e(cVar, "buffer");
        fg.b.d(this, cVar, i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r0 < r1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r7 < r8) goto L11;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(eg.f r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            hc.t.e(r10, r0)
            int r0 = r9.W()
            int r1 = r10.W()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2b
            byte r7 = r9.p(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.p(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = r5
            goto L33
        L32:
            r3 = r6
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.f.compareTo(eg.f):int");
    }

    public f h(String str) {
        hc.t.e(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(r(), 0, W());
        byte[] digest = messageDigest.digest();
        hc.t.d(digest, "digestBytes");
        return new f(digest);
    }

    public int hashCode() {
        int s10 = s();
        if (s10 != 0) {
            return s10;
        }
        int hashCode = Arrays.hashCode(r());
        I(hashCode);
        return hashCode;
    }

    public final byte p(int i10) {
        return z(i10);
    }

    public final byte[] r() {
        return this.f9611c;
    }

    public final int s() {
        return this.f9612d;
    }

    public int t() {
        return r().length;
    }

    public String toString() {
        int c10;
        String E;
        String E2;
        String E3;
        StringBuilder sb2;
        f fVar;
        byte[] i10;
        String str;
        boolean z10 = true;
        if (!(r().length == 0)) {
            c10 = fg.b.c(r(), 64);
            if (c10 != -1) {
                String e02 = e0();
                Objects.requireNonNull(e02, "null cannot be cast to non-null type java.lang.String");
                String substring = e02.substring(0, c10);
                hc.t.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                E = bf.x.E(substring, "\\", "\\\\", false, 4, null);
                E2 = bf.x.E(E, "\n", "\\n", false, 4, null);
                E3 = bf.x.E(E2, "\r", "\\r", false, 4, null);
                if (c10 >= e02.length()) {
                    sb2 = new StringBuilder();
                    sb2.append("[text=");
                    sb2.append(E3);
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(r().length);
                sb2.append(" text=");
                sb2.append(E3);
            } else if (r().length <= 64) {
                str = "[hex=" + x() + ']';
            } else {
                sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(r().length);
                sb2.append(" hex=");
                int d10 = f0.d(this, 64);
                if (!(d10 <= r().length)) {
                    throw new IllegalArgumentException(("endIndex > length(" + r().length + ')').toString());
                }
                if (d10 + 0 < 0) {
                    z10 = false;
                }
                if (!z10) {
                    throw new IllegalArgumentException("endIndex < beginIndex".toString());
                }
                if (d10 == r().length) {
                    fVar = this;
                } else {
                    i10 = ub.l.i(r(), 0, d10);
                    fVar = new f(i10);
                }
                sb2.append(fVar.x());
            }
            sb2.append("…]");
            return sb2.toString();
        }
        str = "[size=0]";
        return str;
    }

    public final String v() {
        return this.f9613q;
    }

    public String x() {
        String p10;
        char[] cArr = new char[r().length * 2];
        byte[] r10 = r();
        int length = r10.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b10 = r10[i10];
            i10++;
            int i12 = i11 + 1;
            cArr[i11] = fg.b.f()[(b10 >> 4) & 15];
            i11 = i12 + 1;
            cArr[i12] = fg.b.f()[b10 & 15];
        }
        p10 = bf.x.p(cArr);
        return p10;
    }

    public byte[] y() {
        return r();
    }

    public byte z(int i10) {
        return r()[i10];
    }
}
