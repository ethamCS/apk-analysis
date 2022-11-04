package l4;

import android.graphics.Path;
/* loaded from: classes.dex */
public class e implements c {

    /* renamed from: a */
    private final g f15708a;

    /* renamed from: b */
    private final Path.FillType f15709b;

    /* renamed from: c */
    private final k4.c f15710c;

    /* renamed from: d */
    private final k4.d f15711d;

    /* renamed from: e */
    private final k4.f f15712e;

    /* renamed from: f */
    private final k4.f f15713f;

    /* renamed from: g */
    private final String f15714g;

    /* renamed from: h */
    private final k4.b f15715h;

    /* renamed from: i */
    private final k4.b f15716i;

    /* renamed from: j */
    private final boolean f15717j;

    public e(String str, g gVar, Path.FillType fillType, k4.c cVar, k4.d dVar, k4.f fVar, k4.f fVar2, k4.b bVar, k4.b bVar2, boolean z10) {
        this.f15708a = gVar;
        this.f15709b = fillType;
        this.f15710c = cVar;
        this.f15711d = dVar;
        this.f15712e = fVar;
        this.f15713f = fVar2;
        this.f15714g = str;
        this.f15715h = bVar;
        this.f15716i = bVar2;
        this.f15717j = z10;
    }

    @Override // l4.c
    public g4.c a(com.airbnb.lottie.n nVar, m4.b bVar) {
        return new g4.h(nVar, bVar, this);
    }

    public k4.f b() {
        return this.f15713f;
    }

    public Path.FillType c() {
        return this.f15709b;
    }

    public k4.c d() {
        return this.f15710c;
    }

    public g e() {
        return this.f15708a;
    }

    public String f() {
        return this.f15714g;
    }

    public k4.d g() {
        return this.f15711d;
    }

    public k4.f h() {
        return this.f15712e;
    }

    public boolean i() {
        return this.f15717j;
    }
}
