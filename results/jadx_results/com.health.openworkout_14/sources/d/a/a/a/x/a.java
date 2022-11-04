package d.a.a.a.x;

import android.graphics.Typeface;
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: a */
    private final Typeface f3692a;

    /* renamed from: b */
    private final AbstractC0103a f3693b;

    /* renamed from: c */
    private boolean f3694c;

    /* renamed from: d.a.a.a.x.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC0103a {
        void a(Typeface typeface);
    }

    public a(AbstractC0103a abstractC0103a, Typeface typeface) {
        this.f3692a = typeface;
        this.f3693b = abstractC0103a;
    }

    private void d(Typeface typeface) {
        if (!this.f3694c) {
            this.f3693b.a(typeface);
        }
    }

    @Override // d.a.a.a.x.f
    public void a(int i) {
        d(this.f3692a);
    }

    @Override // d.a.a.a.x.f
    public void b(Typeface typeface, boolean z) {
        d(typeface);
    }

    public void c() {
        this.f3694c = true;
    }
}
