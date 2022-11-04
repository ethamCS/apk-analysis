package hh;

import java.io.IOException;
/* loaded from: classes3.dex */
public class w0 {

    /* renamed from: a */
    boolean f12106a;

    /* renamed from: b */
    gg.w f12107b;

    /* renamed from: c */
    public static final gg.v f12082c = new gg.v("2.5.29.9");

    /* renamed from: d */
    public static final gg.v f12083d = new gg.v("2.5.29.14");

    /* renamed from: e */
    public static final gg.v f12084e = new gg.v("2.5.29.15");

    /* renamed from: f */
    public static final gg.v f12085f = new gg.v("2.5.29.16");

    /* renamed from: g */
    public static final gg.v f12086g = new gg.v("2.5.29.17");

    /* renamed from: h */
    public static final gg.v f12087h = new gg.v("2.5.29.18");

    /* renamed from: i */
    public static final gg.v f12088i = new gg.v("2.5.29.19");

    /* renamed from: j */
    public static final gg.v f12089j = new gg.v("2.5.29.20");

    /* renamed from: k */
    public static final gg.v f12090k = new gg.v("2.5.29.21");

    /* renamed from: l */
    public static final gg.v f12091l = new gg.v("2.5.29.23");

    /* renamed from: m */
    public static final gg.v f12092m = new gg.v("2.5.29.24");

    /* renamed from: n */
    public static final gg.v f12093n = new gg.v("2.5.29.27");

    /* renamed from: o */
    public static final gg.v f12094o = new gg.v("2.5.29.28");

    /* renamed from: p */
    public static final gg.v f12095p = new gg.v("2.5.29.29");

    /* renamed from: q */
    public static final gg.v f12096q = new gg.v("2.5.29.30");

    /* renamed from: r */
    public static final gg.v f12097r = new gg.v("2.5.29.31");

    /* renamed from: s */
    public static final gg.v f12098s = new gg.v("2.5.29.32");

    /* renamed from: t */
    public static final gg.v f12099t = new gg.v("2.5.29.33");

    /* renamed from: u */
    public static final gg.v f12100u = new gg.v("2.5.29.35");

    /* renamed from: v */
    public static final gg.v f12101v = new gg.v("2.5.29.36");

    /* renamed from: w */
    public static final gg.v f12102w = new gg.v("2.5.29.37");

    /* renamed from: x */
    public static final gg.v f12103x = new gg.v("2.5.29.46");

    /* renamed from: y */
    public static final gg.v f12104y = new gg.v("2.5.29.54");

    /* renamed from: z */
    public static final gg.v f12105z = new gg.v("1.3.6.1.5.5.7.1.1");
    public static final gg.v A = new gg.v("1.3.6.1.5.5.7.1.11");
    public static final gg.v B = new gg.v("1.3.6.1.5.5.7.1.12");
    public static final gg.v C = new gg.v("1.3.6.1.5.5.7.1.2");
    public static final gg.v D = new gg.v("1.3.6.1.5.5.7.1.3");
    public static final gg.v E = new gg.v("1.3.6.1.5.5.7.1.4");
    public static final gg.v F = new gg.v("2.5.29.56");
    public static final gg.v G = new gg.v("2.5.29.55");

    public w0(gg.e eVar, gg.w wVar) {
        this.f12106a = eVar.G();
        this.f12107b = wVar;
    }

    public w0(boolean z10, gg.w wVar) {
        this.f12106a = z10;
        this.f12107b = wVar;
    }

    public static gg.a0 a(w0 w0Var) {
        try {
            return gg.a0.u(w0Var.b().F());
        } catch (IOException e10) {
            throw new IllegalArgumentException("can't convert extension: " + e10);
        }
    }

    public gg.w b() {
        return this.f12107b;
    }

    public boolean c() {
        return this.f12106a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return w0Var.b().s(b()) && w0Var.c() == c();
    }

    public int hashCode() {
        return c() ? b().hashCode() : ~b().hashCode();
    }
}
