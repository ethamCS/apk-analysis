package nh;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.conscrypt.PSKKeyManager;
import qh.a1;
import zh.p1;
/* loaded from: classes3.dex */
public class f0 implements ak.i {

    /* renamed from: j */
    private static final Hashtable f17157j = new Hashtable();

    /* renamed from: a */
    final a1 f17158a;

    /* renamed from: b */
    private final int f17159b;

    /* renamed from: c */
    long[] f17160c;

    /* renamed from: d */
    private long[] f17161d;

    /* renamed from: e */
    private byte[] f17162e;

    /* renamed from: f */
    private b[] f17163f;

    /* renamed from: g */
    private b[] f17164g;

    /* renamed from: h */
    private final c f17165h;

    /* renamed from: i */
    private final byte[] f17166i;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private byte[] f17167a;

        public a(long j10) {
            byte[] bArr = new byte[32];
            this.f17167a = bArr;
            bArr[0] = 83;
            bArr[1] = 72;
            bArr[2] = 65;
            bArr[3] = 51;
            bArr[4] = 1;
            bArr[5] = 0;
            a1.m(j10, bArr, 8);
        }

        public byte[] a() {
            return this.f17167a;
        }
    }

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        private int f17168a;

        /* renamed from: b */
        private byte[] f17169b;

        public b(int i10, byte[] bArr) {
            this.f17168a = i10;
            this.f17169b = bArr;
        }

        public int a() {
            return this.f17168a;
        }

        public byte[] b() {
            return this.f17169b;
        }
    }

    /* loaded from: classes3.dex */
    public class c {

        /* renamed from: a */
        private final d f17170a = new d();

        /* renamed from: b */
        private byte[] f17171b;

        /* renamed from: c */
        private int f17172c;

        /* renamed from: d */
        private long[] f17173d;

        public c(int i10) {
            f0.this = r1;
            byte[] bArr = new byte[i10];
            this.f17171b = bArr;
            this.f17173d = new long[bArr.length / 8];
        }

        private void b(long[] jArr) {
            long[] jArr2;
            f0 f0Var = f0.this;
            f0Var.f17158a.h(true, f0Var.f17160c, this.f17170a.c());
            int i10 = 0;
            while (true) {
                jArr2 = this.f17173d;
                if (i10 >= jArr2.length) {
                    break;
                }
                jArr2[i10] = a1.g(this.f17171b, i10 * 8);
                i10++;
            }
            f0.this.f17158a.i(jArr2, jArr);
            for (int i11 = 0; i11 < jArr.length; i11++) {
                jArr[i11] = jArr[i11] ^ this.f17173d[i11];
            }
        }

        public void a(long[] jArr) {
            int i10 = this.f17172c;
            while (true) {
                byte[] bArr = this.f17171b;
                if (i10 >= bArr.length) {
                    this.f17170a.h(true);
                    b(jArr);
                    return;
                }
                bArr[i10] = 0;
                i10++;
            }
        }

        public void c(int i10) {
            this.f17170a.f();
            this.f17170a.j(i10);
            this.f17172c = 0;
        }

        public void d(c cVar) {
            this.f17171b = ak.a.i(cVar.f17171b, this.f17171b);
            this.f17172c = cVar.f17172c;
            this.f17173d = ak.a.m(cVar.f17173d, this.f17173d);
            this.f17170a.g(cVar.f17170a);
        }

        public void e(byte[] bArr, int i10, int i11, long[] jArr) {
            int i12 = 0;
            while (i11 > i12) {
                if (this.f17172c == this.f17171b.length) {
                    b(jArr);
                    this.f17170a.i(false);
                    this.f17172c = 0;
                }
                int min = Math.min(i11 - i12, this.f17171b.length - this.f17172c);
                System.arraycopy(bArr, i10 + i12, this.f17171b, this.f17172c, min);
                i12 += min;
                this.f17172c += min;
                this.f17170a.a(min);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class d {

        /* renamed from: a */
        private long[] f17175a = new long[2];

        /* renamed from: b */
        private boolean f17176b;

        public d() {
            f();
        }

        public void a(int i10) {
            if (!this.f17176b) {
                long[] jArr = this.f17175a;
                long j10 = jArr[0] + i10;
                jArr[0] = j10;
                if (j10 <= 9223372034707292160L) {
                    return;
                }
                this.f17176b = true;
                return;
            }
            long[] jArr2 = new long[3];
            long[] jArr3 = this.f17175a;
            jArr2[0] = jArr3[0] & 4294967295L;
            jArr2[1] = (jArr3[0] >>> 32) & 4294967295L;
            jArr2[2] = jArr3[1] & 4294967295L;
            long j11 = i10;
            for (int i11 = 0; i11 < 3; i11++) {
                long j12 = j11 + jArr2[i11];
                jArr2[i11] = j12;
                j11 = j12 >>> 32;
            }
            long[] jArr4 = this.f17175a;
            jArr4[0] = ((jArr2[1] & 4294967295L) << 32) | (jArr2[0] & 4294967295L);
            jArr4[1] = (jArr2[2] & 4294967295L) | (jArr4[1] & (-4294967296L));
        }

        public int b() {
            return (int) ((this.f17175a[1] >>> 56) & 63);
        }

        public long[] c() {
            return this.f17175a;
        }

        public boolean d() {
            return (this.f17175a[1] & Long.MIN_VALUE) != 0;
        }

        public boolean e() {
            return (this.f17175a[1] & 4611686018427387904L) != 0;
        }

        public void f() {
            long[] jArr = this.f17175a;
            jArr[0] = 0;
            jArr[1] = 0;
            this.f17176b = false;
            i(true);
        }

        public void g(d dVar) {
            this.f17175a = ak.a.m(dVar.f17175a, this.f17175a);
            this.f17176b = dVar.f17176b;
        }

        public void h(boolean z10) {
            if (z10) {
                long[] jArr = this.f17175a;
                jArr[1] = jArr[1] | Long.MIN_VALUE;
                return;
            }
            long[] jArr2 = this.f17175a;
            jArr2[1] = jArr2[1] & Long.MAX_VALUE;
        }

        public void i(boolean z10) {
            if (z10) {
                long[] jArr = this.f17175a;
                jArr[1] = jArr[1] | 4611686018427387904L;
                return;
            }
            long[] jArr2 = this.f17175a;
            jArr2[1] = jArr2[1] & (-4611686018427387905L);
        }

        public void j(int i10) {
            long[] jArr = this.f17175a;
            jArr[1] = (jArr[1] & (-274877906944L)) | ((i10 & 63) << 56);
        }

        public String toString() {
            return b() + " first: " + e() + ", final: " + d();
        }
    }

    static {
        l(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 128, new long[]{-2228972824489528736L, -8629553674646093540L, 1155188648486244218L, -3677226592081559102L});
        l(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 160, new long[]{1450197650740764312L, 3081844928540042640L, -3136097061834271170L, 3301952811952417661L});
        l(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 224, new long[]{-4176654842910610933L, -8688192972455077604L, -7364642305011795836L, 4056579644589979102L});
        l(PSKKeyManager.MAX_KEY_LENGTH_BYTES, PSKKeyManager.MAX_KEY_LENGTH_BYTES, new long[]{-243853671043386295L, 3443677322885453875L, -5531612722399640561L, 7662005193972177513L});
        l(512, 128, new long[]{-6288014694233956526L, 2204638249859346602L, 3502419045458743507L, -4829063503441264548L, 983504137758028059L, 1880512238245786339L, -6715892782214108542L, 7602827311880509485L});
        l(512, 160, new long[]{2934123928682216849L, -4399710721982728305L, 1684584802963255058L, 5744138295201861711L, 2444857010922934358L, -2807833639722848072L, -5121587834665610502L, 118355523173251694L});
        l(512, 224, new long[]{-3688341020067007964L, -3772225436291745297L, -8300862168937575580L, 4146387520469897396L, 1106145742801415120L, 7455425944880474941L, -7351063101234211863L, -7048981346965512457L});
        l(512, 384, new long[]{-6631894876634615969L, -5692838220127733084L, -7099962856338682626L, -2911352911530754598L, 2000907093792408677L, 9140007292425499655L, 6093301768906360022L, 2769176472213098488L});
        l(512, 512, new long[]{5261240102383538638L, 978932832955457283L, -8083517948103779378L, -7339365279355032399L, 6752626034097301424L, -1531723821829733388L, -7417126464950782685L, -5901786942805128141L});
    }

    public f0(int i10, int i11) {
        this.f17166i = new byte[1];
        if (i11 % 8 != 0) {
            throw new IllegalArgumentException("Output size must be a multiple of 8 bits. :" + i11);
        }
        this.f17159b = i11 / 8;
        a1 a1Var = new a1(i10);
        this.f17158a = a1Var;
        this.f17165h = new c(a1Var.b());
    }

    public f0(f0 f0Var) {
        this(f0Var.h() * 8, f0Var.i() * 8);
        e(f0Var);
    }

    private void c() {
        if (this.f17165h != null) {
            return;
        }
        throw new IllegalArgumentException("Skein engine is not initialised.");
    }

    private static b[] d(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null) {
            return null;
        }
        if (bVarArr2 == null || bVarArr2.length != bVarArr.length) {
            bVarArr2 = new b[bVarArr.length];
        }
        System.arraycopy(bVarArr, 0, bVarArr2, 0, bVarArr2.length);
        return bVarArr2;
    }

    private void e(f0 f0Var) {
        this.f17165h.d(f0Var.f17165h);
        this.f17160c = ak.a.m(f0Var.f17160c, this.f17160c);
        this.f17161d = ak.a.m(f0Var.f17161d, this.f17161d);
        this.f17162e = ak.a.i(f0Var.f17162e, this.f17162e);
        this.f17163f = d(f0Var.f17163f, this.f17163f);
        this.f17164g = d(f0Var.f17164g, this.f17164g);
    }

    private void f() {
        long[] jArr = (long[]) f17157j.get(u(h(), i()));
        int i10 = 0;
        if (this.f17162e != null || jArr == null) {
            this.f17160c = new long[h() / 8];
            byte[] bArr = this.f17162e;
            if (bArr != null) {
                p(0, bArr);
            }
            p(4, new a(this.f17159b * 8).a());
        } else {
            this.f17160c = ak.a.l(jArr);
        }
        if (this.f17163f != null) {
            while (true) {
                b[] bVarArr = this.f17163f;
                if (i10 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i10];
                p(bVar.a(), bVar.b());
                i10++;
            }
        }
        this.f17161d = ak.a.l(this.f17160c);
    }

    private void k(Hashtable hashtable) {
        Enumeration keys = hashtable.keys();
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        while (keys.hasMoreElements()) {
            Integer num = (Integer) keys.nextElement();
            byte[] bArr = (byte[]) hashtable.get(num);
            if (num.intValue() == 0) {
                this.f17162e = bArr;
            } else if (num.intValue() < 48) {
                vector.addElement(new b(num.intValue(), bArr));
            } else {
                vector2.addElement(new b(num.intValue(), bArr));
            }
        }
        b[] bVarArr = new b[vector.size()];
        this.f17163f = bVarArr;
        vector.copyInto(bVarArr);
        o(this.f17163f);
        b[] bVarArr2 = new b[vector2.size()];
        this.f17164g = bVarArr2;
        vector2.copyInto(bVarArr2);
        o(this.f17164g);
    }

    private static void l(int i10, int i11, long[] jArr) {
        f17157j.put(u(i10 / 8, i11 / 8), jArr);
    }

    private void m(long j10, byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        a1.m(j10, bArr2, 0);
        long[] jArr = new long[this.f17160c.length];
        r(63);
        this.f17165h.e(bArr2, 0, 8, jArr);
        this.f17165h.a(jArr);
        int i12 = ((i11 + 8) - 1) / 8;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i13 * 8;
            int min = Math.min(8, i11 - i14);
            if (min == 8) {
                a1.m(jArr[i13], bArr, i14 + i10);
            } else {
                a1.m(jArr[i13], bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i14 + i10, min);
            }
        }
    }

    private static void o(b[] bVarArr) {
        if (bVarArr == null) {
            return;
        }
        for (int i10 = 1; i10 < bVarArr.length; i10++) {
            b bVar = bVarArr[i10];
            int i11 = i10;
            while (i11 > 0) {
                int i12 = i11 - 1;
                if (bVar.a() < bVarArr[i12].a()) {
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
            }
            bVarArr[i11] = bVar;
        }
    }

    private void p(int i10, byte[] bArr) {
        r(i10);
        this.f17165h.e(bArr, 0, bArr.length, this.f17160c);
        q();
    }

    private void q() {
        this.f17165h.a(this.f17160c);
    }

    private void r(int i10) {
        this.f17165h.c(i10);
    }

    private static Integer u(int i10, int i11) {
        return ak.g.e(i10 | (i11 << 16));
    }

    @Override // ak.i
    public ak.i a() {
        return new f0(this);
    }

    @Override // ak.i
    public void b(ak.i iVar) {
        f0 f0Var = (f0) iVar;
        if (h() == f0Var.h() && this.f17159b == f0Var.f17159b) {
            e(f0Var);
            return;
        }
        throw new IllegalArgumentException("Incompatible parameters in provided SkeinEngine.");
    }

    public int g(byte[] bArr, int i10) {
        c();
        if (bArr.length >= this.f17159b + i10) {
            q();
            if (this.f17164g != null) {
                int i11 = 0;
                while (true) {
                    b[] bVarArr = this.f17164g;
                    if (i11 >= bVarArr.length) {
                        break;
                    }
                    b bVar = bVarArr[i11];
                    p(bVar.a(), bVar.b());
                    i11++;
                }
            }
            int h10 = h();
            int i12 = ((this.f17159b + h10) - 1) / h10;
            for (int i13 = 0; i13 < i12; i13++) {
                int i14 = i13 * h10;
                m(i13, bArr, i10 + i14, Math.min(h10, this.f17159b - i14));
            }
            n();
            return this.f17159b;
        }
        throw new org.bouncycastle.crypto.a0("Output buffer is too short to hold output");
    }

    public int h() {
        return this.f17158a.b();
    }

    public int i() {
        return this.f17159b;
    }

    public void j(p1 p1Var) {
        this.f17160c = null;
        this.f17162e = null;
        this.f17163f = null;
        this.f17164g = null;
        if (p1Var != null) {
            if (p1Var.a().length < 16) {
                throw new IllegalArgumentException("Skein key must be at least 128 bits.");
            }
            k(p1Var.b());
        }
        f();
        r(48);
    }

    public void n() {
        long[] jArr = this.f17161d;
        long[] jArr2 = this.f17160c;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        r(48);
    }

    public void s(byte b10) {
        byte[] bArr = this.f17166i;
        bArr[0] = b10;
        t(bArr, 0, 1);
    }

    public void t(byte[] bArr, int i10, int i11) {
        c();
        this.f17165h.e(bArr, i10, i11, this.f17160c);
    }
}
