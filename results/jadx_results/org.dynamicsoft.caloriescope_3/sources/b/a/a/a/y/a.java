package b.a.a.a.y;

import android.graphics.Typeface;
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: a */
    private final Typeface f1245a;

    /* renamed from: b */
    private final AbstractC0054a f1246b;

    /* renamed from: c */
    private boolean f1247c;

    /* renamed from: b.a.a.a.y.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC0054a {
        void a(Typeface typeface);
    }

    public a(AbstractC0054a abstractC0054a, Typeface typeface) {
        this.f1245a = typeface;
        this.f1246b = abstractC0054a;
    }

    private void a(Typeface typeface) {
        if (!this.f1247c) {
            this.f1246b.a(typeface);
        }
    }

    public void a() {
        this.f1247c = true;
    }

    @Override // b.a.a.a.y.f
    public void a(int i) {
        a(this.f1245a);
    }

    @Override // b.a.a.a.y.f
    public void a(Typeface typeface, boolean z) {
        a(typeface);
    }
}
