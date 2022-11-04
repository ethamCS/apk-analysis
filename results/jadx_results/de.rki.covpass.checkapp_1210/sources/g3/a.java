package g3;

import e3.d;
import f3.i;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import ok.g;
/* loaded from: classes.dex */
public class a {

    /* renamed from: d */
    List<ka.c> f10357d;

    /* renamed from: j */
    int f10363j;

    /* renamed from: k */
    int f10364k;

    /* renamed from: a */
    int f10354a = 20;

    /* renamed from: b */
    int f10355b = 5;

    /* renamed from: c */
    int f10356c = 4;

    /* renamed from: e */
    ok.b<ja.b> f10358e = new ok.b<>(i.f9785a);

    /* renamed from: f */
    ok.b<ka.b> f10359f = new ok.b<>(d.f9364a);

    /* renamed from: g */
    private final ja.d f10360g = new ja.d();

    /* renamed from: h */
    private final ka.b f10361h = new ka.b();

    /* renamed from: i */
    private final g f10362i = new g();

    /* renamed from: l */
    boolean f10365l = false;

    /* renamed from: m */
    g f10366m = new g();

    int a(ka.b bVar) {
        double d10 = Double.MAX_VALUE;
        int i10 = -1;
        for (int i11 = 0; i11 < this.f10357d.size(); i11++) {
            ka.c cVar = this.f10357d.get(i11);
            double a10 = da.d.a(bVar.f10622c, bVar.f10623d, cVar.f14865c, cVar.f14866d);
            if (a10 < d10) {
                i10 = i11;
                d10 = a10;
            }
        }
        return i10;
    }

    public boolean b(int i10, int i11, g gVar, g gVar2) {
        this.f10363j = i10;
        this.f10364k = i11;
        int l10 = i10 == i11 ? gVar.l() : v3.b.b(i10, i11, gVar.f18610b);
        if (l10 >= 2) {
            this.f10358e.s(l10);
            if (this.f10365l) {
                System.out.println("ENTER FitLinesToContour");
            }
            this.f10362i.k(gVar);
            for (int i12 = 0; i12 < this.f10355b; i12++) {
                if (!d(l10, this.f10362i) || !e(l10, this.f10362i) || !f(l10, this.f10362i)) {
                    return false;
                }
            }
            if (this.f10365l) {
                System.out.println("EXIT FitLinesToContour. " + gVar.l() + "  " + this.f10362i.l());
            }
            gVar2.k(this.f10362i);
            return true;
        }
        throw new RuntimeException("The one line is anchored and can't be optimized");
    }

    boolean c(int i10, int i11, ja.b bVar) {
        ka.c cVar;
        ka.c cVar2;
        int i12 = i10;
        int b10 = v3.b.b(i12, i11, this.f10357d.size());
        if (b10 < this.f10356c) {
            return false;
        }
        double b11 = this.f10357d.get(i12).b(this.f10357d.get(i11));
        double d10 = (cVar2.f14865c + cVar.f14865c) / 2.0d;
        double d11 = (cVar2.f14866d + cVar.f14866d) / 2.0d;
        this.f10359f.r();
        int i13 = 0;
        for (int min = Math.min(this.f10354a, b10); i13 < min; min = min) {
            List<ka.c> list = this.f10357d;
            ka.c cVar3 = list.get(v3.b.a(i12, ((b10 - 1) * i13) / (min - 1), list.size()));
            ka.b i14 = this.f10359f.i();
            i14.f10622c = (cVar3.f14865c - d10) / b11;
            i14.f10623d = (cVar3.f14866d - d11) / b11;
            i13++;
            i12 = i10;
        }
        if (ca.a.a(this.f10359f.t(), this.f10360g) == null) {
            return false;
        }
        da.c.a(this.f10360g, bVar);
        bVar.f14235q = ((b11 * bVar.f14235q) - (d10 * bVar.f14233c)) - (d11 * bVar.f14234d);
        return true;
    }

    boolean d(int i10, g gVar) {
        for (int i11 = 1; i11 <= i10; i11++) {
            int i12 = i11 - 1;
            int d10 = gVar.d(v3.b.a(this.f10363j, i12, gVar.f18610b));
            int d11 = gVar.d(v3.b.a(this.f10363j, i11, gVar.f18610b));
            if (d10 == d11 || !c(d10, d11, this.f10358e.c(i12))) {
                return false;
            }
            ja.b c10 = this.f10358e.c(i12);
            if (Double.isNaN(c10.f14233c) || Double.isNaN(c10.f14234d) || Double.isNaN(c10.f14235q)) {
                throw new RuntimeException("This should be impossible");
            }
        }
        return true;
    }

    boolean e(int i10, g gVar) {
        PrintStream printStream;
        String str;
        this.f10366m.h();
        int d10 = gVar.d(this.f10363j);
        int i11 = 1;
        while (true) {
            boolean z10 = false;
            if (i11 >= i10) {
                break;
            }
            int a10 = v3.b.a(this.f10363j, i11, gVar.f18610b);
            if (ea.d.a(this.f10358e.c(i11 - 1), this.f10358e.c(i11), this.f10361h) == null) {
                if (this.f10365l) {
                    printStream = System.out;
                    str = "  SKIPPING no intersection";
                    printStream.println(str);
                }
                z10 = true;
            } else {
                int a11 = a(this.f10361h);
                if (a11 != d10) {
                    ka.c cVar = this.f10357d.get(d10);
                    ka.c cVar2 = this.f10357d.get(a11);
                    if (cVar.f14865c == cVar2.f14865c && cVar.f14866d == cVar2.f14866d) {
                        if (this.f10365l) {
                            printStream = System.out;
                            str = "  SKIPPING duplicate coordinate";
                            printStream.println(str);
                        }
                        z10 = true;
                    } else {
                        gVar.j(a10, a11);
                        d10 = a11;
                    }
                } else {
                    if (this.f10365l) {
                        printStream = System.out;
                        str = "  SKIPPING duplicate corner index";
                        printStream.println(str);
                    }
                    z10 = true;
                }
            }
            if (z10) {
                this.f10366m.a(a10);
            }
            i11++;
        }
        int a12 = v3.b.a(this.f10363j, i10, gVar.f18610b);
        ka.c cVar3 = this.f10357d.get(d10);
        ka.c cVar4 = this.f10357d.get(gVar.d(a12));
        if (cVar3.f14865c == cVar4.f14865c && cVar3.f14866d == cVar4.f14866d) {
            this.f10366m.a(a12);
        }
        g gVar2 = this.f10366m;
        Arrays.sort(gVar2.f18609a, 0, gVar2.f18610b);
        for (int i12 = this.f10366m.f18610b - 1; i12 >= 0; i12--) {
            int d11 = this.f10366m.d(i12);
            gVar.f(d11);
            int i13 = this.f10363j;
            if (i13 >= d11) {
                this.f10363j = i13 - 1;
            }
            int i14 = this.f10364k;
            if (i14 >= d11) {
                this.f10364k = i14 - 1;
            }
        }
        int i15 = i10 - this.f10366m.f18610b;
        int i16 = 0;
        while (i16 < i15) {
            int a13 = v3.b.a(this.f10363j, i16, gVar.f18610b);
            i16++;
            int a14 = v3.b.a(this.f10363j, i16, gVar.f18610b);
            ka.c cVar5 = this.f10357d.get(gVar.d(a13));
            ka.c cVar6 = this.f10357d.get(gVar.d(a14));
            if (cVar5.f14865c == cVar6.f14865c && cVar5.f14866d == cVar6.f14866d) {
                throw new RuntimeException("Well I screwed up");
            }
        }
        return gVar.l() >= 3;
    }

    boolean f(int i10, g gVar) {
        int d10 = gVar.d(this.f10363j);
        int i11 = 0;
        int i12 = 1;
        while (i12 < i10) {
            int b10 = v3.b.b(d10, gVar.d(v3.b.a(this.f10363j, i12, gVar.l())), this.f10357d.size());
            if (b10 < i11) {
                return false;
            }
            i12++;
            i11 = b10;
        }
        return true;
    }

    public void g(List<ka.c> list) {
        this.f10357d = list;
    }
}
