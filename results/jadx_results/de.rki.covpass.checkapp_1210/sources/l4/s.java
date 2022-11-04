package l4;

import g4.u;
/* loaded from: classes.dex */
public class s implements c {

    /* renamed from: a */
    private final String f15814a;

    /* renamed from: b */
    private final a f15815b;

    /* renamed from: c */
    private final k4.b f15816c;

    /* renamed from: d */
    private final k4.b f15817d;

    /* renamed from: e */
    private final k4.b f15818e;

    /* renamed from: f */
    private final boolean f15819f;

    /* loaded from: classes.dex */
    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a b(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return INDIVIDUALLY;
                }
                throw new IllegalArgumentException("Unknown trim path type " + i10);
            }
            return SIMULTANEOUSLY;
        }
    }

    public s(String str, a aVar, k4.b bVar, k4.b bVar2, k4.b bVar3, boolean z10) {
        this.f15814a = str;
        this.f15815b = aVar;
        this.f15816c = bVar;
        this.f15817d = bVar2;
        this.f15818e = bVar3;
        this.f15819f = z10;
    }

    @Override // l4.c
    public g4.c a(com.airbnb.lottie.n nVar, m4.b bVar) {
        return new u(bVar, this);
    }

    public k4.b b() {
        return this.f15817d;
    }

    public String c() {
        return this.f15814a;
    }

    public k4.b d() {
        return this.f15818e;
    }

    public k4.b e() {
        return this.f15816c;
    }

    public a f() {
        return this.f15815b;
    }

    public boolean g() {
        return this.f15819f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f15816c + ", end: " + this.f15817d + ", offset: " + this.f15818e + "}";
    }
}
