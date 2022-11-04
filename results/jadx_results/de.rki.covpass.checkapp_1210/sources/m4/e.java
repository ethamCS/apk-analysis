package m4;

import java.util.List;
import java.util.Locale;
import k4.j;
import k4.k;
import k4.l;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public class e {

    /* renamed from: a */
    private final List<l4.c> f16300a;

    /* renamed from: b */
    private final e4.h f16301b;

    /* renamed from: c */
    private final String f16302c;

    /* renamed from: d */
    private final long f16303d;

    /* renamed from: e */
    private final a f16304e;

    /* renamed from: f */
    private final long f16305f;

    /* renamed from: g */
    private final String f16306g;

    /* renamed from: h */
    private final List<l4.h> f16307h;

    /* renamed from: i */
    private final l f16308i;

    /* renamed from: j */
    private final int f16309j;

    /* renamed from: k */
    private final int f16310k;

    /* renamed from: l */
    private final int f16311l;

    /* renamed from: m */
    private final float f16312m;

    /* renamed from: n */
    private final float f16313n;

    /* renamed from: o */
    private final int f16314o;

    /* renamed from: p */
    private final int f16315p;

    /* renamed from: q */
    private final j f16316q;

    /* renamed from: r */
    private final k f16317r;

    /* renamed from: s */
    private final k4.b f16318s;

    /* renamed from: t */
    private final List<r4.a<Float>> f16319t;

    /* renamed from: u */
    private final b f16320u;

    /* renamed from: v */
    private final boolean f16321v;

    /* renamed from: w */
    private final l4.a f16322w;

    /* renamed from: x */
    private final o4.j f16323x;

    /* loaded from: classes.dex */
    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* loaded from: classes.dex */
    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public e(List<l4.c> list, e4.h hVar, String str, long j10, a aVar, long j11, String str2, List<l4.h> list2, l lVar, int i10, int i11, int i12, float f10, float f11, int i13, int i14, j jVar, k kVar, List<r4.a<Float>> list3, b bVar, k4.b bVar2, boolean z10, l4.a aVar2, o4.j jVar2) {
        this.f16300a = list;
        this.f16301b = hVar;
        this.f16302c = str;
        this.f16303d = j10;
        this.f16304e = aVar;
        this.f16305f = j11;
        this.f16306g = str2;
        this.f16307h = list2;
        this.f16308i = lVar;
        this.f16309j = i10;
        this.f16310k = i11;
        this.f16311l = i12;
        this.f16312m = f10;
        this.f16313n = f11;
        this.f16314o = i13;
        this.f16315p = i14;
        this.f16316q = jVar;
        this.f16317r = kVar;
        this.f16319t = list3;
        this.f16320u = bVar;
        this.f16318s = bVar2;
        this.f16321v = z10;
        this.f16322w = aVar2;
        this.f16323x = jVar2;
    }

    public l4.a a() {
        return this.f16322w;
    }

    public e4.h b() {
        return this.f16301b;
    }

    public o4.j c() {
        return this.f16323x;
    }

    public long d() {
        return this.f16303d;
    }

    public List<r4.a<Float>> e() {
        return this.f16319t;
    }

    public a f() {
        return this.f16304e;
    }

    public List<l4.h> g() {
        return this.f16307h;
    }

    public b h() {
        return this.f16320u;
    }

    public String i() {
        return this.f16302c;
    }

    public long j() {
        return this.f16305f;
    }

    public int k() {
        return this.f16315p;
    }

    public int l() {
        return this.f16314o;
    }

    public String m() {
        return this.f16306g;
    }

    public List<l4.c> n() {
        return this.f16300a;
    }

    public int o() {
        return this.f16311l;
    }

    public int p() {
        return this.f16310k;
    }

    public int q() {
        return this.f16309j;
    }

    public float r() {
        return this.f16313n / this.f16301b.e();
    }

    public j s() {
        return this.f16316q;
    }

    public k t() {
        return this.f16317r;
    }

    public String toString() {
        return y(BuildConfig.FLAVOR);
    }

    public k4.b u() {
        return this.f16318s;
    }

    public float v() {
        return this.f16312m;
    }

    public l w() {
        return this.f16308i;
    }

    public boolean x() {
        return this.f16321v;
    }

    public String y(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(i());
        sb2.append("\n");
        e t10 = this.f16301b.t(j());
        if (t10 != null) {
            String str2 = "\t\tParents: ";
            while (true) {
                sb2.append(str2);
                sb2.append(t10.i());
                t10 = this.f16301b.t(t10.j());
                if (t10 == null) {
                    break;
                }
                str2 = "->";
            }
            sb2.append(str);
            sb2.append("\n");
        }
        if (!g().isEmpty()) {
            sb2.append(str);
            sb2.append("\tMasks: ");
            sb2.append(g().size());
            sb2.append("\n");
        }
        if (q() != 0 && p() != 0) {
            sb2.append(str);
            sb2.append("\tBackground: ");
            sb2.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(q()), Integer.valueOf(p()), Integer.valueOf(o())));
        }
        if (!this.f16300a.isEmpty()) {
            sb2.append(str);
            sb2.append("\tShapes:\n");
            for (l4.c cVar : this.f16300a) {
                sb2.append(str);
                sb2.append("\t\t");
                sb2.append(cVar);
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }
}
