package q2;
/* loaded from: classes.dex */
public class s implements h2.h<c4.a> {

    /* renamed from: a */
    float f19566a;

    /* renamed from: b */
    x3.b f19567b;

    /* renamed from: c */
    boolean f19568c;

    /* renamed from: d */
    e f19569d;

    /* renamed from: e */
    c4.a f19570e = new c4.a(1, 1);

    /* renamed from: f */
    c4.a f19571f = new c4.a(1, 1);

    /* renamed from: g */
    c4.a f19572g = new c4.a(1, 1);

    /* renamed from: h */
    c4.a f19573h = new c4.a(1, 1);

    /* renamed from: i */
    c4.a f19574i = new c4.a(1, 1);

    /* renamed from: j */
    c4.a f19575j = new c4.a(1, 1);

    /* renamed from: k */
    ll.d<ok.e> f19576k = new ll.d<>(m3.e.f16263a);

    /* renamed from: l */
    float f19577l;

    /* renamed from: m */
    float f19578m;

    /* renamed from: n */
    d f19579n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f19580a;

        static {
            int[] iArr = new int[e.values().length];
            f19580a = iArr;
            try {
                iArr[e.SAUVOLA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19580a[e.NIBLACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19580a[e.WOLF_JOLION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements d {
        b() {
            s.this = r1;
        }

        @Override // q2.s.d
        public final float a(float f10, float f11) {
            return f10 + (s.this.f19566a * f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements d {
        c() {
            s.this = r1;
        }

        @Override // q2.s.d
        public final float a(float f10, float f11) {
            s sVar = s.this;
            return f10 * ((sVar.f19566a * ((f11 / sVar.f19577l) - 1.0f)) + 1.0f);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        float a(float f10, float f11);
    }

    /* loaded from: classes.dex */
    public enum e {
        NIBLACK,
        SAUVOLA,
        WOLF_JOLION
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements d {
        f() {
            s.this = r1;
        }

        @Override // q2.s.d
        public final float a(float f10, float f11) {
            s sVar = s.this;
            return f10 + (sVar.f19566a * ((f11 / sVar.f19577l) - 1.0f) * (f10 - sVar.f19578m));
        }
    }

    public s(x3.b bVar, float f10, boolean z10, e eVar) {
        d dVar;
        this.f19566a = f10;
        this.f19567b = bVar;
        this.f19568c = z10;
        this.f19569d = eVar;
        int i10 = a.f19580a[eVar.ordinal()];
        if (i10 == 1) {
            dVar = new c();
        } else if (i10 == 2) {
            dVar = new b();
        } else if (i10 != 3) {
            throw new IncompatibleClassChangeError();
        } else {
            dVar = new f();
        }
        this.f19579n = dVar;
    }

    protected void b(c4.a aVar, c4.l lVar) {
        if (this.f19568c) {
            for (int i10 = 0; i10 < aVar.f6221x; i10++) {
                int i11 = this.f19574i.f6220q * i10;
                int i12 = aVar.f6218c + (aVar.f6219d * i10);
                int i13 = lVar.f6218c + (lVar.f6219d * i10);
                int i14 = 0;
                while (i14 < aVar.f6220q) {
                    int i15 = i13 + 1;
                    int i16 = i12 + 1;
                    lVar.V3[i13] = (byte) (aVar.V3[i12] <= this.f19579n.a(this.f19571f.V3[i11], this.f19574i.V3[i11]) ? 1 : 0);
                    i14++;
                    i11++;
                    i13 = i15;
                    i12 = i16;
                }
            }
            return;
        }
        for (int i17 = 0; i17 < aVar.f6221x; i17++) {
            int i18 = this.f19574i.f6220q * i17;
            int i19 = aVar.f6218c + (aVar.f6219d * i17);
            int i20 = lVar.f6218c + (lVar.f6219d * i17);
            int i21 = 0;
            while (i21 < aVar.f6220q) {
                int i22 = i20 + 1;
                int i23 = i19 + 1;
                lVar.V3[i20] = (byte) (aVar.V3[i19] >= this.f19579n.a(this.f19571f.V3[i18], this.f19574i.V3[i18]) ? 1 : 0);
                i21++;
                i18++;
                i20 = i22;
                i19 = i23;
            }
        }
    }

    /* renamed from: c */
    public void a(c4.a aVar, c4.l lVar) {
        this.f19570e.U(aVar.f6220q, aVar.f6221x);
        this.f19571f.U(aVar.f6220q, aVar.f6221x);
        this.f19572g.U(aVar.f6220q, aVar.f6221x);
        this.f19573h.U(aVar.f6220q, aVar.f6221x);
        this.f19574i.U(aVar.f6220q, aVar.f6221x);
        this.f19575j.U(aVar.f6220q, aVar.f6221x);
        this.f19570e.U(aVar.f6220q, aVar.f6221x);
        int e10 = this.f19567b.e(Math.min(aVar.f6220q, aVar.f6221x)) / 2;
        s2.b.h(aVar, this.f19571f, e10, this.f19575j, this.f19576k);
        c3.f.a(aVar, this.f19570e);
        s2.b.h(this.f19570e, this.f19573h, e10, this.f19575j, this.f19576k);
        c3.f.a(this.f19571f, this.f19572g);
        c3.f.c(this.f19573h, this.f19572g, this.f19574i);
        c4.a aVar2 = this.f19574i;
        c3.f.b(aVar2, aVar2);
        e eVar = this.f19569d;
        if (eVar == e.SAUVOLA || eVar == e.WOLF_JOLION) {
            this.f19577l = c3.e.i(this.f19574i);
        }
        if (this.f19569d == e.WOLF_JOLION) {
            this.f19578m = c3.e.j(aVar);
        }
        b(aVar, lVar);
    }

    @Override // h2.h
    public c4.t<c4.a> getInputType() {
        return c4.t.Y3;
    }
}
