package vd;

import hc.t;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes.dex */
public final class e extends td.a {
    public static final a Companion = new a(null);

    /* renamed from: g */
    public static final e f24007g = new e(1, 7, 1);

    /* renamed from: h */
    public static final e f24008h = new e(new int[0]);

    /* renamed from: f */
    private final boolean f24009f;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(int... iArr) {
        this(iArr, false);
        t.e(iArr, "numbers");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int[] iArr, boolean z10) {
        super(Arrays.copyOf(iArr, iArr.length));
        t.e(iArr, "versionArray");
        this.f24009f = z10;
    }

    public boolean h() {
        boolean z10;
        if (a() == 1 && b() == 0) {
            return false;
        }
        if (this.f24009f) {
            z10 = f(f24007g);
        } else {
            int a10 = a();
            e eVar = f24007g;
            z10 = a10 == eVar.a() && b() <= eVar.b() + 1;
        }
        return z10;
    }
}
