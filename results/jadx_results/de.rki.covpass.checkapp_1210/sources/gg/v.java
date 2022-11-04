package gg;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes3.dex */
public class v extends a0 {

    /* renamed from: q */
    static final o0 f10898q = new a(v.class, 6);

    /* renamed from: x */
    private static final ConcurrentMap<b, v> f10899x = new ConcurrentHashMap();

    /* renamed from: c */
    private final String f10900c;

    /* renamed from: d */
    private byte[] f10901d;

    /* loaded from: classes3.dex */
    static class a extends o0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // gg.o0
        public a0 d(t1 t1Var) {
            return v.D(t1Var.F(), false);
        }
    }

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        private final int f10902a;

        /* renamed from: b */
        private final byte[] f10903b;

        b(byte[] bArr) {
            this.f10902a = ak.a.F(bArr);
            this.f10903b = bArr;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return ak.a.c(this.f10903b, ((b) obj).f10903b);
            }
            return false;
        }

        public int hashCode() {
            return this.f10902a;
        }
    }

    v(v vVar, String str) {
        if (!c0.G(str, 0)) {
            throw new IllegalArgumentException("string " + str + " not a valid OID branch");
        }
        this.f10900c = vVar.H() + "." + str;
    }

    public v(String str) {
        Objects.requireNonNull(str, "'identifier' cannot be null");
        if (M(str)) {
            this.f10900c = str;
            return;
        }
        throw new IllegalArgumentException("string " + str + " not an OID");
    }

    v(byte[] bArr, boolean z10) {
        byte[] bArr2 = bArr;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z11 = true;
        long j10 = 0;
        BigInteger bigInteger = null;
        for (int i10 = 0; i10 != bArr2.length; i10++) {
            int i11 = bArr2[i10] & 255;
            if (j10 <= 72057594037927808L) {
                long j11 = j10 + (i11 & 127);
                if ((i11 & 128) == 0) {
                    if (z11) {
                        if (j11 < 40) {
                            stringBuffer.append('0');
                        } else if (j11 < 80) {
                            stringBuffer.append('1');
                            j11 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j11 -= 80;
                        }
                        z11 = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j11);
                    j10 = 0;
                } else {
                    j10 = j11 << 7;
                }
            } else {
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j10) : bigInteger).or(BigInteger.valueOf(i11 & 127));
                if ((i11 & 128) == 0) {
                    if (z11) {
                        stringBuffer.append('2');
                        or = or.subtract(BigInteger.valueOf(80L));
                        z11 = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(or);
                    j10 = 0;
                    bigInteger = null;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        this.f10900c = stringBuffer.toString();
        this.f10901d = z10 ? ak.a.h(bArr) : bArr2;
    }

    public static v D(byte[] bArr, boolean z10) {
        v vVar = f10899x.get(new b(bArr));
        return vVar == null ? new v(bArr, z10) : vVar;
    }

    private void E(ByteArrayOutputStream byteArrayOutputStream) {
        y2 y2Var = new y2(this.f10900c);
        int parseInt = Integer.parseInt(y2Var.b()) * 40;
        String b10 = y2Var.b();
        if (b10.length() <= 18) {
            c0.H(byteArrayOutputStream, parseInt + Long.parseLong(b10));
        } else {
            c0.J(byteArrayOutputStream, new BigInteger(b10).add(BigInteger.valueOf(parseInt)));
        }
        while (y2Var.a()) {
            String b11 = y2Var.b();
            if (b11.length() <= 18) {
                c0.H(byteArrayOutputStream, Long.parseLong(b11));
            } else {
                c0.J(byteArrayOutputStream, new BigInteger(b11));
            }
        }
    }

    public static v F(byte[] bArr) {
        return D(bArr, true);
    }

    private synchronized byte[] G() {
        if (this.f10901d == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            E(byteArrayOutputStream);
            this.f10901d = byteArrayOutputStream.toByteArray();
        }
        return this.f10901d;
    }

    public static v J(j0 j0Var, boolean z10) {
        if (!z10 && !j0Var.T()) {
            a0 O = j0Var.O();
            if (!(O instanceof v)) {
                return F(w.E(O).F());
            }
        }
        return (v) f10898q.e(j0Var, z10);
    }

    public static v K(Object obj) {
        if (obj == null || (obj instanceof v)) {
            return (v) obj;
        }
        if (obj instanceof g) {
            a0 b10 = ((g) obj).b();
            if (b10 instanceof v) {
                return (v) b10;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (v) f10898q.b((byte[]) obj);
            } catch (IOException e10) {
                throw new IllegalArgumentException("failed to construct object identifier from byte[]: " + e10.getMessage());
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    private static boolean M(String str) {
        char charAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (charAt = str.charAt(0)) < '0' || charAt > '2') {
            return false;
        }
        return c0.G(str, 2);
    }

    public v C(String str) {
        return new v(this, str);
    }

    public String H() {
        return this.f10900c;
    }

    public v L() {
        b bVar = new b(G());
        ConcurrentMap<b, v> concurrentMap = f10899x;
        v vVar = concurrentMap.get(bVar);
        if (vVar == null) {
            v putIfAbsent = concurrentMap.putIfAbsent(bVar, this);
            return putIfAbsent == null ? this : putIfAbsent;
        }
        return vVar;
    }

    public boolean N(v vVar) {
        String H = H();
        String H2 = vVar.H();
        return H.length() > H2.length() && H.charAt(H2.length()) == '.' && H.startsWith(H2);
    }

    @Override // gg.a0, gg.t
    public int hashCode() {
        return this.f10900c.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // gg.a0
    public boolean l(a0 a0Var) {
        if (a0Var == this) {
            return true;
        }
        if (a0Var instanceof v) {
            return this.f10900c.equals(((v) a0Var).f10900c);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // gg.a0
    public void m(y yVar, boolean z10) {
        yVar.o(z10, 6, G());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // gg.a0
    public boolean n() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // gg.a0
    public int q(boolean z10) {
        return y.g(z10, G().length);
    }

    public String toString() {
        return H();
    }
}
