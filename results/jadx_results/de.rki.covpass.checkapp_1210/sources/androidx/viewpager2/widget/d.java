package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d extends ViewPager2.i {

    /* renamed from: a */
    private final LinearLayoutManager f5260a;

    /* renamed from: b */
    private ViewPager2.k f5261b;

    public d(LinearLayoutManager linearLayoutManager) {
        this.f5260a = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void a(int i10) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void b(int i10, float f10, int i11) {
        if (this.f5261b == null) {
            return;
        }
        float f11 = -f10;
        for (int i12 = 0; i12 < this.f5260a.J(); i12++) {
            View I = this.f5260a.I(i12);
            if (I == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i12), Integer.valueOf(this.f5260a.J())));
            }
            this.f5261b.a(I, (this.f5260a.h0(I) - i10) + f11);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void c(int i10) {
    }

    public ViewPager2.k d() {
        return this.f5261b;
    }

    public void e(ViewPager2.k kVar) {
        this.f5261b = kVar;
    }
}
