package a;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class q extends e {

    /* renamed from: f */
    protected boolean f118f = true;

    /* renamed from: g */
    protected boolean f119g = true;

    /* renamed from: h */
    protected r f120h = r.Unknown;

    /* renamed from: i */
    protected byte[] f121i = null;

    /* renamed from: j */
    List<h> f122j = new ArrayList();

    /* renamed from: k */
    g f123k;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f124a;

        static {
            int[] iArr = new int[r.values().length];
            f124a = iArr;
            try {
                iArr[r.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124a[r.Encrypt.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f124a[r.Encrypt0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f124a[r.MAC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f124a[r.MAC0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f124a[r.Sign1.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f124a[r.Sign.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static q i(byte[] bArr) {
        return j(bArr, r.Unknown);
    }

    public static q j(byte[] bArr, r rVar) {
        q qVar;
        t7.o F = t7.o.F(bArr);
        t7.q s12 = F.s1();
        t7.q qVar2 = t7.q.Array;
        if (s12 == qVar2) {
            if (F.x1()) {
                if (F.i0().length != 1) {
                    throw new f("Malformed message - too many tags");
                }
                if (rVar == r.Unknown) {
                    rVar = r.b(F.o1().t1());
                } else if (rVar != r.b(F.o1().t1())) {
                    throw new f("Passed in tag does not match actual tag");
                }
            }
            switch (a.f124a[rVar.ordinal()]) {
                case 1:
                    throw new f("Message was not tagged and no default tagging option given");
                case 2:
                    qVar = new k();
                    break;
                case 3:
                    qVar = new i();
                    break;
                case 4:
                    qVar = new o();
                    break;
                case 5:
                    qVar = new n();
                    break;
                case 6:
                    qVar = new u();
                    break;
                case 7:
                    qVar = new w();
                    break;
                default:
                    throw new f("Message is not recognized as a COSE security Object");
            }
            qVar.k(F);
            t7.o d10 = qVar.d(l.CounterSignature, 2);
            if (d10 != null) {
                if (d10.s1() != qVar2 || d10.t1().isEmpty()) {
                    throw new f("Invalid countersignature attribute");
                }
                if (d10.j1(0).s1() == qVar2) {
                    for (t7.o oVar : d10.t1()) {
                        if (oVar.s1() != t7.q.Array) {
                            throw new f("Invalid countersignature attribute");
                        }
                        h hVar = new h(oVar);
                        hVar.n(qVar);
                        qVar.p(hVar);
                    }
                } else {
                    h hVar2 = new h(d10);
                    hVar2.n(qVar);
                    qVar.p(hVar2);
                }
            }
            t7.o d11 = qVar.d(l.CounterSignature0, 2);
            if (d11 != null) {
                if (d11.s1() != t7.q.ByteString) {
                    throw new f("Invalid Countersignature0 attribute");
                }
                g gVar = new g(d11.j0());
                gVar.n(qVar);
                qVar.f123k = gVar;
            }
            return qVar;
        }
        throw new f("Message is not a COSE security Message");
    }

    protected abstract void k(t7.o oVar);

    protected abstract t7.o l();

    public t7.o m() {
        t7.o l10 = l();
        return this.f118f ? t7.o.c0(l10, this.f120h.f129c) : l10;
    }

    public byte[] n() {
        return this.f121i;
    }

    public void o() {
        if (!this.f122j.isEmpty()) {
            if (this.f122j.size() == 1) {
                this.f122j.get(0).m(this.f51d, this.f121i);
                a(l.CounterSignature, this.f122j.get(0).j(), 2);
            } else {
                t7.o D0 = t7.o.D0();
                for (h hVar : this.f122j) {
                    hVar.m(this.f51d, this.f121i);
                    D0.d(hVar.j());
                }
                a(l.CounterSignature, D0, 2);
            }
        }
        g gVar = this.f123k;
        if (gVar != null) {
            gVar.m(this.f51d, this.f121i);
            a(l.CounterSignature0, this.f123k.j(), 2);
        }
    }

    public void p(h hVar) {
        this.f122j.add(hVar);
    }
}
