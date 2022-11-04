package od;

import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes.dex */
public final class e {
    public static final a Companion = new a(null);

    /* renamed from: e */
    private static final e f17833e = new e(null, null, false, false, 8, null);

    /* renamed from: a */
    private final h f17834a;

    /* renamed from: b */
    private final f f17835b;

    /* renamed from: c */
    private final boolean f17836c;

    /* renamed from: d */
    private final boolean f17837d;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            return e.f17833e;
        }
    }

    public e(h hVar, f fVar, boolean z10, boolean z11) {
        this.f17834a = hVar;
        this.f17835b = fVar;
        this.f17836c = z10;
        this.f17837d = z11;
    }

    public /* synthetic */ e(h hVar, f fVar, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, fVar, z10, (i10 & 8) != 0 ? false : z11);
    }

    public final boolean b() {
        return this.f17836c;
    }

    public final f c() {
        return this.f17835b;
    }

    public final h d() {
        return this.f17834a;
    }

    public final boolean e() {
        return this.f17837d;
    }
}
