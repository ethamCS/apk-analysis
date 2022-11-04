package uc;

import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes.dex */
public final class e extends h {
    public static final a Companion = new a(null);

    /* renamed from: h */
    private static final e f23402h = new e(false, 1, null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            return e.f23402h;
        }
    }

    public e(boolean z10) {
        super(new ne.f("DefaultBuiltIns"));
        if (z10) {
            f(false);
        }
    }

    public /* synthetic */ e(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
