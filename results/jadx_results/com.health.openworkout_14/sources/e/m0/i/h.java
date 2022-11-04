package e.m0.i;

import e.b0;
import e.j0;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class h extends j0 {
    @Nullable

    /* renamed from: c */
    private final String f4163c;

    /* renamed from: d */
    private final long f4164d;

    /* renamed from: e */
    private final f.e f4165e;

    public h(@Nullable String str, long j, f.e eVar) {
        this.f4163c = str;
        this.f4164d = j;
        this.f4165e = eVar;
    }

    @Override // e.j0
    public long I() {
        return this.f4164d;
    }

    @Override // e.j0
    public b0 N() {
        String str = this.f4163c;
        if (str != null) {
            return b0.c(str);
        }
        return null;
    }

    @Override // e.j0
    public f.e h0() {
        return this.f4165e;
    }
}
