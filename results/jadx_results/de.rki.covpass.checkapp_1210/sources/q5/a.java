package q5;

import android.graphics.Typeface;
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: a */
    private final Typeface f19646a;

    /* renamed from: b */
    private final AbstractC0317a f19647b;

    /* renamed from: c */
    private boolean f19648c;

    /* renamed from: q5.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC0317a {
        void a(Typeface typeface);
    }

    public a(AbstractC0317a abstractC0317a, Typeface typeface) {
        this.f19646a = typeface;
        this.f19647b = abstractC0317a;
    }

    private void d(Typeface typeface) {
        if (!this.f19648c) {
            this.f19647b.a(typeface);
        }
    }

    @Override // q5.f
    public void a(int i10) {
        d(this.f19646a);
    }

    @Override // q5.f
    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }

    public void c() {
        this.f19648c = true;
    }
}
