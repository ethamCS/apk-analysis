package e.m0.k;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: d */
    public static final f.f f4200d = f.f.j(":");

    /* renamed from: e */
    public static final f.f f4201e = f.f.j(":status");

    /* renamed from: f */
    public static final f.f f4202f = f.f.j(":method");

    /* renamed from: g */
    public static final f.f f4203g = f.f.j(":path");

    /* renamed from: h */
    public static final f.f f4204h = f.f.j(":scheme");
    public static final f.f i = f.f.j(":authority");

    /* renamed from: a */
    public final f.f f4205a;

    /* renamed from: b */
    public final f.f f4206b;

    /* renamed from: c */
    final int f4207c;

    public c(f.f fVar, f.f fVar2) {
        this.f4205a = fVar;
        this.f4206b = fVar2;
        this.f4207c = fVar.r() + 32 + fVar2.r();
    }

    public c(f.f fVar, String str) {
        this(fVar, f.f.j(str));
    }

    public c(String str, String str2) {
        this(f.f.j(str), f.f.j(str2));
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f4205a.equals(cVar.f4205a) && this.f4206b.equals(cVar.f4206b);
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f4205a.hashCode()) * 31) + this.f4206b.hashCode();
    }

    public String toString() {
        return e.m0.e.o("%s: %s", this.f4205a.w(), this.f4206b.w());
    }
}
