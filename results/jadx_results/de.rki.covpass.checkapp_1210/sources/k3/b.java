package k3;

import c4.e0;
import c4.f0;
import c4.l;
import c4.n;
import c4.p;
import c4.t;
import c4.u;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class b {

    /* loaded from: classes.dex */
    public class a extends i {

        /* renamed from: a */
        int f14589a = 0;

        /* renamed from: b */
        final /* synthetic */ byte[] f14590b;

        /* renamed from: c */
        final /* synthetic */ byte[] f14591c;

        /* renamed from: d */
        final /* synthetic */ byte[] f14592d;

        a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            this.f14590b = bArr;
            this.f14591c = bArr2;
            this.f14592d = bArr3;
        }

        @Override // k3.b.i
        public void b(int i10, int i11, int i12) {
            byte[] bArr = this.f14590b;
            int i13 = this.f14589a;
            bArr[i13] = (byte) i10;
            this.f14591c[i13] = (byte) i11;
            byte[] bArr2 = this.f14592d;
            this.f14589a = i13 + 1;
            bArr2[i13] = (byte) i12;
        }
    }

    /* renamed from: k3.b$b */
    /* loaded from: classes.dex */
    public class C0211b extends i {

        /* renamed from: a */
        int f14593a = 0;

        /* renamed from: b */
        final /* synthetic */ float[] f14594b;

        /* renamed from: c */
        final /* synthetic */ float[] f14595c;

        /* renamed from: d */
        final /* synthetic */ float[] f14596d;

        C0211b(float[] fArr, float[] fArr2, float[] fArr3) {
            this.f14594b = fArr;
            this.f14595c = fArr2;
            this.f14596d = fArr3;
        }

        @Override // k3.b.i
        public void b(int i10, int i11, int i12) {
            float[] fArr = this.f14594b;
            int i13 = this.f14593a;
            fArr[i13] = i10;
            this.f14595c[i13] = i11;
            float[] fArr2 = this.f14596d;
            this.f14593a = i13 + 1;
            fArr2[i13] = i12;
        }
    }

    /* loaded from: classes.dex */
    public class c extends i {

        /* renamed from: a */
        int f14597a = 0;

        /* renamed from: b */
        final /* synthetic */ e0 f14598b;

        c(e0 e0Var) {
            this.f14598b = e0Var;
        }

        @Override // k3.b.i
        public void b(int i10, int i11, int i12) {
            byte[] bArr = this.f14598b.W3;
            int i13 = this.f14597a;
            int i14 = i13 + 1;
            this.f14597a = i14;
            bArr[i13] = (byte) i10;
            int i15 = i14 + 1;
            this.f14597a = i15;
            bArr[i14] = (byte) i11;
            this.f14597a = i15 + 1;
            bArr[i15] = (byte) i12;
        }
    }

    /* loaded from: classes.dex */
    public class d extends i {

        /* renamed from: a */
        int f14599a = 0;

        /* renamed from: b */
        final /* synthetic */ u f14600b;

        d(u uVar) {
            this.f14600b = uVar;
        }

        @Override // k3.b.i
        public void b(int i10, int i11, int i12) {
            float[] fArr = this.f14600b.W3;
            int i13 = this.f14599a;
            int i14 = i13 + 1;
            this.f14599a = i14;
            fArr[i13] = i10;
            int i15 = i14 + 1;
            this.f14599a = i15;
            fArr[i14] = i11;
            this.f14599a = i15 + 1;
            fArr[i15] = i12;
        }
    }

    /* loaded from: classes.dex */
    public class e implements h {

        /* renamed from: a */
        int f14601a = 0;

        /* renamed from: b */
        final /* synthetic */ byte[] f14602b;

        /* renamed from: c */
        final /* synthetic */ byte[] f14603c;

        /* renamed from: d */
        final /* synthetic */ byte[] f14604d;

        e(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            this.f14602b = bArr;
            this.f14603c = bArr2;
            this.f14604d = bArr3;
        }

        @Override // k3.b.h
        public void a(int i10, int i11, int i12) {
            byte[] bArr = this.f14602b;
            int i13 = this.f14601a;
            bArr[i13] = (byte) i10;
            this.f14603c[i13] = (byte) i11;
            byte[] bArr2 = this.f14604d;
            this.f14601a = i13 + 1;
            bArr2[i13] = (byte) i12;
        }
    }

    /* loaded from: classes.dex */
    public class f implements h {

        /* renamed from: a */
        int f14605a = 0;

        /* renamed from: b */
        final /* synthetic */ byte[] f14606b;

        f(byte[] bArr) {
            this.f14606b = bArr;
        }

        @Override // k3.b.h
        public final void a(int i10, int i11, int i12) {
            byte[] bArr = this.f14606b;
            int i13 = this.f14605a;
            int i14 = i13 + 1;
            this.f14605a = i14;
            bArr[i13] = (byte) i10;
            int i15 = i14 + 1;
            this.f14605a = i15;
            bArr[i14] = (byte) i11;
            this.f14605a = i15 + 1;
            bArr[i15] = (byte) i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class g {

        /* renamed from: a */
        static final /* synthetic */ int[] f14607a;

        /* renamed from: b */
        static final /* synthetic */ int[] f14608b;

        static {
            int[] iArr = new int[m2.a.values().length];
            f14608b = iArr;
            try {
                iArr[m2.a.RGB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14608b[m2.a.YUV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[p.values().length];
            f14607a = iArr2;
            try {
                iArr2[p.U8.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14607a[p.F32.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface h {
        void a(int i10, int i11, int i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class i implements h {
        i() {
        }

        @Override // k3.b.h
        public final void a(int i10, int i11, int i12) {
            int i13 = (i10 - 16) * 1191;
            int i14 = i11 - 128;
            int i15 = i12 - 128;
            int i16 = ((i13 >>> 31) ^ 1) * i13;
            int i17 = ((i14 * 1836) + i16) >> 10;
            int i18 = ((i16 - (i14 * 547)) - (i15 * 218)) >> 10;
            int i19 = (i16 + (i15 * 2165)) >> 10;
            int i20 = i17 * ((i17 >>> 31) ^ 1);
            int i21 = i18 * ((i18 >>> 31) ^ 1);
            int i22 = i19 * ((i19 >>> 31) ^ 1);
            if (i20 > 255) {
                i20 = 255;
            }
            if (i21 > 255) {
                i21 = 255;
            }
            if (i22 > 255) {
                i22 = 255;
            }
            b(i20, i21, i22);
        }

        public abstract void b(int i10, int i11, int i12);
    }

    public static void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10, int i11, int i12, int i13, int i14, m2.a aVar, n nVar, ll.d<ok.i> dVar) {
        if (nVar instanceof l) {
            c(byteBuffer, i10, i11, i12, (l) nVar);
        } else if (nVar instanceof c4.a) {
            b(byteBuffer, i10, i11, i12, (c4.a) nVar, dVar);
        } else {
            if (nVar.h().e() == t.b.PLANAR) {
                int i15 = g.f14608b[aVar.ordinal()];
                if (i15 == 1) {
                    int i16 = g.f14607a[nVar.h().c().ordinal()];
                    if (i16 == 1) {
                        h(byteBuffer, byteBuffer2, byteBuffer3, i10, i11, i12, i13, i14, (f0) nVar, dVar);
                        return;
                    } else if (i16 == 2) {
                        g(byteBuffer, byteBuffer2, byteBuffer3, i10, i11, i12, i13, i14, (f0) nVar, dVar);
                        return;
                    }
                } else if (i15 == 2 && g.f14607a[nVar.h().c().ordinal()] == 1) {
                    i(byteBuffer, byteBuffer2, byteBuffer3, i10, i11, i12, i13, i14, (f0) nVar, dVar);
                    return;
                }
            } else if (nVar.h().e() == t.b.INTERLEAVED) {
                int i17 = g.f14608b[aVar.ordinal()];
                if (i17 == 1) {
                    int i18 = g.f14607a[nVar.h().c().ordinal()];
                    if (i18 == 1) {
                        e(byteBuffer, byteBuffer2, byteBuffer3, i10, i11, i12, i13, i14, (e0) nVar, dVar);
                        return;
                    } else if (i18 == 2) {
                        d(byteBuffer, byteBuffer2, byteBuffer3, i10, i11, i12, i13, i14, (u) nVar, dVar);
                        return;
                    }
                } else if (i17 == 2 && g.f14607a[nVar.h().c().ordinal()] == 1) {
                    f(byteBuffer, byteBuffer2, byteBuffer3, i10, i11, i12, i13, i14, (e0) nVar, dVar);
                    return;
                }
            }
            t h10 = nVar.h();
            throw new RuntimeException("Not yet supported. format=" + aVar + " out=" + h10);
        }
    }

    public static c4.a b(ByteBuffer byteBuffer, int i10, int i11, int i12, c4.a aVar, ll.d<ok.i> dVar) {
        c4.a aVar2 = (c4.a) l2.a.c(aVar, i10, i11, c4.a.class);
        byte[] b10 = v3.a.b((ok.i) v3.a.a(dVar, k3.a.f14588a).d(), i10, false);
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < i11) {
            ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(i14);
            byteBuffer.get(b10, 0, i10);
            int i16 = 0;
            while (i16 < i10) {
                aVar2.V3[i15] = b10[i16] & 255;
                i16++;
                i15++;
            }
            i13++;
            i14 += i12;
        }
        return aVar2;
    }

    public static l c(ByteBuffer byteBuffer, int i10, int i11, int i12, l lVar) {
        l lVar2 = (l) l2.a.c(lVar, i10, i11, l.class);
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < i11) {
            ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(i14);
            byteBuffer.get(lVar2.V3, i15, i10);
            i13++;
            i14 += i12;
            i15 += i10;
        }
        return lVar2;
    }

    public static u d(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10, int i11, int i12, int i13, int i14, u uVar, ll.d<ok.i> dVar) {
        u uVar2 = (u) l2.a.e(uVar, i10, i11, 3, u.class);
        l3.a.a(byteBuffer, byteBuffer2, byteBuffer3, i10, i11, i12, i13, i14, v3.a.a(dVar, k3.a.f14588a), new d(uVar2));
        return uVar2;
    }

    public static e0 e(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10, int i11, int i12, int i13, int i14, e0 e0Var, ll.d<ok.i> dVar) {
        e0 e0Var2 = (e0) l2.a.e(e0Var, i10, i11, 3, e0.class);
        l3.a.a(byteBuffer, byteBuffer2, byteBuffer3, i10, i11, i12, i13, i14, v3.a.a(dVar, k3.a.f14588a), new c(e0Var2));
        return e0Var2;
    }

    public static e0 f(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10, int i11, int i12, int i13, int i14, e0 e0Var, ll.d<ok.i> dVar) {
        e0 e0Var2 = (e0) l2.a.e(e0Var, i10, i11, 3, e0.class);
        l3.a.a(byteBuffer, byteBuffer2, byteBuffer3, i10, i11, i12, i13, i14, v3.a.a(dVar, k3.a.f14588a), new f(e0Var2.W3));
        return e0Var2;
    }

    public static f0<c4.a> g(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10, int i11, int i12, int i13, int i14, f0<c4.a> f0Var, ll.d<ok.i> dVar) {
        f0<c4.a> f10 = l2.a.f(f0Var, i10, i11, 3, c4.a.class);
        l3.a.a(byteBuffer, byteBuffer2, byteBuffer3, i10, i11, i12, i13, i14, v3.a.a(dVar, k3.a.f14588a), new C0211b(f10.B(0).V3, f10.B(1).V3, f10.B(2).V3));
        return f10;
    }

    public static f0<l> h(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10, int i11, int i12, int i13, int i14, f0<l> f0Var, ll.d<ok.i> dVar) {
        f0<l> f10 = l2.a.f(f0Var, i10, i11, 3, l.class);
        l3.a.a(byteBuffer, byteBuffer2, byteBuffer3, i10, i11, i12, i13, i14, v3.a.a(dVar, k3.a.f14588a), new a(f10.B(0).V3, f10.B(1).V3, f10.B(2).V3));
        return f10;
    }

    public static f0<l> i(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10, int i11, int i12, int i13, int i14, f0<l> f0Var, ll.d<ok.i> dVar) {
        f0<l> f10 = l2.a.f(f0Var, i10, i11, 3, l.class);
        l3.a.a(byteBuffer, byteBuffer2, byteBuffer3, i10, i11, i12, i13, i14, v3.a.a(dVar, k3.a.f14588a), new e(f10.B(0).V3, f10.B(1).V3, f10.B(2).V3));
        return f10;
    }
}
