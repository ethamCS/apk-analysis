package zd;

import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes3.dex */
public enum a {
    NO_ARGUMENTS(false, false, 3, null),
    UNLESS_EMPTY(true, false, 2, null),
    ALWAYS_PARENTHESIZED(true, true);
    

    /* renamed from: c */
    private final boolean f26610c;

    /* renamed from: d */
    private final boolean f26611d;

    a(boolean z10, boolean z11) {
        this.f26610c = z10;
        this.f26611d = z11;
    }

    /* synthetic */ a(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11);
    }

    public final boolean g() {
        return this.f26610c;
    }

    public final boolean h() {
        return this.f26611d;
    }
}
