package ve;

import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a */
    private final boolean f24027a;

    /* loaded from: classes3.dex */
    public static final class a extends g {

        /* renamed from: b */
        public static final a f24028b = new a();

        private a() {
            super(false, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends g {

        /* renamed from: b */
        private final String f24029b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(false, null);
            hc.t.e(str, "error");
            this.f24029b = str;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends g {

        /* renamed from: b */
        public static final c f24030b = new c();

        private c() {
            super(true, null);
        }
    }

    private g(boolean z10) {
        this.f24027a = z10;
    }

    public /* synthetic */ g(boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10);
    }

    public final boolean a() {
        return this.f24027a;
    }
}
