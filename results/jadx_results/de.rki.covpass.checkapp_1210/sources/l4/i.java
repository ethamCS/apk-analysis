package l4;
/* loaded from: classes.dex */
public class i implements c {

    /* renamed from: a */
    private final String f15743a;

    /* renamed from: b */
    private final a f15744b;

    /* renamed from: c */
    private final boolean f15745c;

    /* loaded from: classes.dex */
    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a b(int i10) {
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public i(String str, a aVar, boolean z10) {
        this.f15743a = str;
        this.f15744b = aVar;
        this.f15745c = z10;
    }

    @Override // l4.c
    public g4.c a(com.airbnb.lottie.n nVar, m4.b bVar) {
        if (!nVar.y()) {
            q4.d.c("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new g4.l(this);
    }

    public a b() {
        return this.f15744b;
    }

    public String c() {
        return this.f15743a;
    }

    public boolean d() {
        return this.f15745c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f15744b + '}';
    }
}
