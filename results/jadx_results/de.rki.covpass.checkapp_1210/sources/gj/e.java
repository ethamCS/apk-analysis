package gj;

import gg.v;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public class e {

    /* renamed from: h */
    public static final e f11015h;

    /* renamed from: i */
    public static final e f11016i;

    /* renamed from: j */
    public static final e f11017j;

    /* renamed from: k */
    public static final e f11018k;

    /* renamed from: l */
    private static final Map<Object, e> f11019l = new a();

    /* renamed from: a */
    private final int f11020a;

    /* renamed from: b */
    private final int f11021b;

    /* renamed from: c */
    private final int f11022c;

    /* renamed from: d */
    private final int f11023d;

    /* renamed from: e */
    private final int f11024e;

    /* renamed from: f */
    private final int f11025f;

    /* renamed from: g */
    private final v f11026g;

    /* loaded from: classes3.dex */
    static class a extends HashMap<Object, e> {
        a() {
            e eVar = e.f11015h;
            put(Integer.valueOf(eVar.f11020a), eVar);
            e eVar2 = e.f11016i;
            put(Integer.valueOf(eVar2.f11020a), eVar2);
            e eVar3 = e.f11017j;
            put(Integer.valueOf(eVar3.f11020a), eVar3);
            e eVar4 = e.f11018k;
            put(Integer.valueOf(eVar4.f11020a), eVar4);
        }
    }

    static {
        v vVar = ug.b.f23635c;
        f11015h = new e(1, 32, 1, 265, 7, 8516, vVar);
        f11016i = new e(2, 32, 2, 133, 6, 4292, vVar);
        f11017j = new e(3, 32, 4, 67, 4, 2180, vVar);
        f11018k = new e(4, 32, 8, 34, 0, 1124, vVar);
    }

    protected e(int i10, int i11, int i12, int i13, int i14, int i15, v vVar) {
        this.f11020a = i10;
        this.f11021b = i11;
        this.f11022c = i12;
        this.f11023d = i13;
        this.f11024e = i14;
        this.f11025f = i15;
        this.f11026g = vVar;
    }

    public static e e(int i10) {
        return f11019l.get(Integer.valueOf(i10));
    }

    public v b() {
        return this.f11026g;
    }

    public int c() {
        return this.f11021b;
    }

    public int d() {
        return this.f11023d;
    }

    public int f() {
        return this.f11020a;
    }

    public int g() {
        return this.f11022c;
    }
}
