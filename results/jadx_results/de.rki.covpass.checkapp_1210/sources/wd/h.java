package wd;

import hc.t;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a */
    public static final h f24811a = new h();

    /* renamed from: b */
    public static final f f24812b;

    /* renamed from: c */
    public static final f f24813c;

    /* renamed from: d */
    public static final f f24814d;

    /* renamed from: e */
    public static final f f24815e;

    /* renamed from: f */
    public static final f f24816f;

    /* renamed from: g */
    public static final f f24817g;

    /* renamed from: h */
    public static final f f24818h;

    /* renamed from: i */
    public static final f f24819i;

    /* renamed from: j */
    public static final f f24820j;

    /* renamed from: k */
    public static final f f24821k;

    /* renamed from: l */
    public static final f f24822l;

    /* renamed from: m */
    public static final f f24823m;

    /* renamed from: n */
    public static final f f24824n;

    static {
        f o10 = f.o("<no name provided>");
        t.d(o10, "special(\"<no name provided>\")");
        f24812b = o10;
        f o11 = f.o("<root package>");
        t.d(o11, "special(\"<root package>\")");
        f24813c = o11;
        f j10 = f.j("Companion");
        t.d(j10, "identifier(\"Companion\")");
        f24814d = j10;
        f j11 = f.j("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");
        t.d(j11, "identifier(\"no_name_in_P…_4cd0_b7f5_b46aa3cd5d40\")");
        f24815e = j11;
        f o12 = f.o("<anonymous>");
        t.d(o12, "special(ANONYMOUS_STRING)");
        f24816f = o12;
        f o13 = f.o("<unary>");
        t.d(o13, "special(\"<unary>\")");
        f24817g = o13;
        f o14 = f.o("<this>");
        t.d(o14, "special(\"<this>\")");
        f24818h = o14;
        f o15 = f.o("<init>");
        t.d(o15, "special(\"<init>\")");
        f24819i = o15;
        f o16 = f.o("<iterator>");
        t.d(o16, "special(\"<iterator>\")");
        f24820j = o16;
        f o17 = f.o("<destruct>");
        t.d(o17, "special(\"<destruct>\")");
        f24821k = o17;
        f o18 = f.o("<local>");
        t.d(o18, "special(\"<local>\")");
        f24822l = o18;
        f o19 = f.o("<unused var>");
        t.d(o19, "special(\"<unused var>\")");
        f24823m = o19;
        f o20 = f.o("<set-?>");
        t.d(o20, "special(\"<set-?>\")");
        f24824n = o20;
    }

    private h() {
    }

    @fc.c
    public static final f b(f fVar) {
        return (fVar == null || fVar.l()) ? f24815e : fVar;
    }

    public final boolean a(f fVar) {
        t.e(fVar, "name");
        String b10 = fVar.b();
        t.d(b10, "name.asString()");
        return (b10.length() > 0) && !fVar.l();
    }
}
