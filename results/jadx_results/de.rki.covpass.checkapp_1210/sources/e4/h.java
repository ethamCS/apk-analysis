package e4;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class h {

    /* renamed from: c */
    private Map<String, List<m4.e>> f9396c;

    /* renamed from: d */
    private Map<String, q> f9397d;

    /* renamed from: e */
    private Map<String, j4.c> f9398e;

    /* renamed from: f */
    private List<j4.h> f9399f;

    /* renamed from: g */
    private i0.h<j4.d> f9400g;

    /* renamed from: h */
    private i0.d<m4.e> f9401h;

    /* renamed from: i */
    private List<m4.e> f9402i;

    /* renamed from: j */
    private Rect f9403j;

    /* renamed from: k */
    private float f9404k;

    /* renamed from: l */
    private float f9405l;

    /* renamed from: m */
    private float f9406m;

    /* renamed from: n */
    private boolean f9407n;

    /* renamed from: a */
    private final x f9394a = new x();

    /* renamed from: b */
    private final HashSet<String> f9395b = new HashSet<>();

    /* renamed from: o */
    private int f9408o = 0;

    public void a(String str) {
        q4.d.c(str);
        this.f9395b.add(str);
    }

    public Rect b() {
        return this.f9403j;
    }

    public i0.h<j4.d> c() {
        return this.f9400g;
    }

    public float d() {
        return (e() / this.f9406m) * 1000.0f;
    }

    public float e() {
        return this.f9405l - this.f9404k;
    }

    public float f() {
        return this.f9405l;
    }

    public Map<String, j4.c> g() {
        return this.f9398e;
    }

    public float h(float f10) {
        return q4.g.i(this.f9404k, this.f9405l, f10);
    }

    public float i() {
        return this.f9406m;
    }

    public Map<String, q> j() {
        return this.f9397d;
    }

    public List<m4.e> k() {
        return this.f9402i;
    }

    public j4.h l(String str) {
        int size = this.f9399f.size();
        for (int i10 = 0; i10 < size; i10++) {
            j4.h hVar = this.f9399f.get(i10);
            if (hVar.a(str)) {
                return hVar;
            }
        }
        return null;
    }

    public int m() {
        return this.f9408o;
    }

    public x n() {
        return this.f9394a;
    }

    public List<m4.e> o(String str) {
        return this.f9396c.get(str);
    }

    public float p() {
        return this.f9404k;
    }

    public boolean q() {
        return this.f9407n;
    }

    public void r(int i10) {
        this.f9408o += i10;
    }

    public void s(Rect rect, float f10, float f11, float f12, List<m4.e> list, i0.d<m4.e> dVar, Map<String, List<m4.e>> map, Map<String, q> map2, i0.h<j4.d> hVar, Map<String, j4.c> map3, List<j4.h> list2) {
        this.f9403j = rect;
        this.f9404k = f10;
        this.f9405l = f11;
        this.f9406m = f12;
        this.f9402i = list;
        this.f9401h = dVar;
        this.f9396c = map;
        this.f9397d = map2;
        this.f9400g = hVar;
        this.f9398e = map3;
        this.f9399f = list2;
    }

    public m4.e t(long j10) {
        return this.f9401h.g(j10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        for (m4.e eVar : this.f9402i) {
            sb2.append(eVar.y("\t"));
        }
        return sb2.toString();
    }

    public void u(boolean z10) {
        this.f9407n = z10;
    }

    public void v(boolean z10) {
        this.f9394a.b(z10);
    }
}
