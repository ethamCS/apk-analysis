package q2;

import c4.q;
import q2.g;
/* loaded from: classes.dex */
public abstract class h<T extends c4.q<T>> implements g.a<T, T> {

    /* renamed from: a */
    protected int f19522a;

    /* renamed from: b */
    protected int f19523b;

    /* renamed from: c */
    protected boolean f19524c;

    /* renamed from: d */
    protected byte f19525d;

    /* renamed from: e */
    protected byte f19526e;

    public h(boolean z10) {
        if (z10) {
            this.f19525d = (byte) 1;
            this.f19526e = (byte) 0;
            return;
        }
        this.f19525d = (byte) 0;
        this.f19526e = (byte) 1;
    }

    @Override // q2.g.a
    public void b(int i10, int i11, boolean z10) {
        this.f19522a = i10;
        this.f19523b = i11;
        this.f19524c = z10;
    }

    public boolean f() {
        return this.f19525d == 1;
    }
}
