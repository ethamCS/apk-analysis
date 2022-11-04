package q3;
/* loaded from: classes.dex */
public enum g {
    FIXED(false, true),
    GLOBAL_ENTROPY(true, true),
    GLOBAL_OTSU(true, true),
    GLOBAL_LI(true, true),
    GLOBAL_HUANG(true, true),
    LOCAL_GAUSSIAN(true, false),
    LOCAL_MEAN(true, false),
    LOCAL_OTSU(true, false),
    BLOCK_MIN_MAX(true, false),
    BLOCK_MEAN(true, false),
    BLOCK_OTSU(true, false),
    LOCAL_NIBLACK(true, false),
    LOCAL_SAVOLA(true, false),
    LOCAL_WOLF(true, false),
    LOCAL_NICK(true, false);
    

    /* renamed from: c */
    final boolean f19629c;

    /* renamed from: d */
    final boolean f19630d;

    g(boolean z10, boolean z11) {
        this.f19629c = z10;
        this.f19630d = z11;
    }

    public boolean g() {
        return this.f19629c;
    }

    public boolean h() {
        return this.f19630d;
    }
}
