package gj;

import gg.v;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public class k {

    /* renamed from: e */
    public static final k f11045e;

    /* renamed from: f */
    public static final k f11046f;

    /* renamed from: g */
    public static final k f11047g;

    /* renamed from: h */
    public static final k f11048h;

    /* renamed from: i */
    public static final k f11049i;

    /* renamed from: j */
    private static Map<Object, k> f11050j = new a();

    /* renamed from: a */
    private final int f11051a;

    /* renamed from: b */
    private final int f11052b;

    /* renamed from: c */
    private final int f11053c;

    /* renamed from: d */
    private final v f11054d;

    /* loaded from: classes3.dex */
    static class a extends HashMap<Object, k> {
        a() {
            k kVar = k.f11045e;
            put(Integer.valueOf(kVar.f11051a), kVar);
            k kVar2 = k.f11046f;
            put(Integer.valueOf(kVar2.f11051a), kVar2);
            k kVar3 = k.f11047g;
            put(Integer.valueOf(kVar3.f11051a), kVar3);
            k kVar4 = k.f11048h;
            put(Integer.valueOf(kVar4.f11051a), kVar4);
            k kVar5 = k.f11049i;
            put(Integer.valueOf(kVar5.f11051a), kVar5);
        }
    }

    static {
        v vVar = ug.b.f23635c;
        f11045e = new k(5, 32, 5, vVar);
        f11046f = new k(6, 32, 10, vVar);
        f11047g = new k(7, 32, 15, vVar);
        f11048h = new k(8, 32, 20, vVar);
        f11049i = new k(9, 32, 25, vVar);
    }

    protected k(int i10, int i11, int i12, v vVar) {
        this.f11051a = i10;
        this.f11052b = i11;
        this.f11053c = i12;
        this.f11054d = vVar;
    }

    public static k e(int i10) {
        return f11050j.get(Integer.valueOf(i10));
    }

    public v b() {
        return this.f11054d;
    }

    public int c() {
        return this.f11053c;
    }

    public int d() {
        return this.f11052b;
    }

    public int f() {
        return this.f11051a;
    }
}
