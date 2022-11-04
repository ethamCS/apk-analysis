package ce;
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a */
    private final wd.b f6447a;

    /* renamed from: b */
    private final int f6448b;

    public f(wd.b bVar, int i10) {
        hc.t.e(bVar, "classId");
        this.f6447a = bVar;
        this.f6448b = i10;
    }

    public final wd.b a() {
        return this.f6447a;
    }

    public final int b() {
        return this.f6448b;
    }

    public final int c() {
        return this.f6448b;
    }

    public final wd.b d() {
        return this.f6447a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return hc.t.a(this.f6447a, fVar.f6447a) && this.f6448b == fVar.f6448b;
    }

    public int hashCode() {
        return (this.f6447a.hashCode() * 31) + this.f6448b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f6448b;
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("kotlin/Array<");
        }
        sb2.append(this.f6447a);
        int i12 = this.f6448b;
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append(">");
        }
        String sb3 = sb2.toString();
        hc.t.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
