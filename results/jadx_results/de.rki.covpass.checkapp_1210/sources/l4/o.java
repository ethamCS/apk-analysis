package l4;

import android.graphics.Path;
/* loaded from: classes.dex */
public class o implements c {

    /* renamed from: a */
    private final boolean f15781a;

    /* renamed from: b */
    private final Path.FillType f15782b;

    /* renamed from: c */
    private final String f15783c;

    /* renamed from: d */
    private final k4.a f15784d;

    /* renamed from: e */
    private final k4.d f15785e;

    /* renamed from: f */
    private final boolean f15786f;

    public o(String str, boolean z10, Path.FillType fillType, k4.a aVar, k4.d dVar, boolean z11) {
        this.f15783c = str;
        this.f15781a = z10;
        this.f15782b = fillType;
        this.f15784d = aVar;
        this.f15785e = dVar;
        this.f15786f = z11;
    }

    @Override // l4.c
    public g4.c a(com.airbnb.lottie.n nVar, m4.b bVar) {
        return new g4.g(nVar, bVar, this);
    }

    public k4.a b() {
        return this.f15784d;
    }

    public Path.FillType c() {
        return this.f15782b;
    }

    public String d() {
        return this.f15783c;
    }

    public k4.d e() {
        return this.f15785e;
    }

    public boolean f() {
        return this.f15786f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f15781a + '}';
    }
}
