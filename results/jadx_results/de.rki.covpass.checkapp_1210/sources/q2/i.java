package q2;

import c4.q;
import c4.r;
import q2.g;
/* loaded from: classes.dex */
public abstract class i<T extends c4.q<T>, I extends c4.r<I>> implements g.a<T, I> {

    /* renamed from: a */
    protected int f19527a;

    /* renamed from: b */
    protected int f19528b;

    /* renamed from: c */
    protected boolean f19529c;

    /* renamed from: d */
    protected double f19530d;

    /* renamed from: e */
    protected boolean f19531e;

    public i(double d10, boolean z10) {
        this.f19530d = d10;
        this.f19531e = z10;
    }

    @Override // q2.g.a
    public void b(int i10, int i11, boolean z10) {
        this.f19527a = i10;
        this.f19528b = i11;
        this.f19529c = z10;
    }
}
