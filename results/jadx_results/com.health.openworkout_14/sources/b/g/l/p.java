package b.g.l;

import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class p {

    /* renamed from: a */
    private int f2561a;

    /* renamed from: b */
    private int f2562b;

    public p(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f2561a | this.f2562b;
    }

    public void b(View view, View view2, int i) {
        c(view, view2, i, 0);
    }

    public void c(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f2562b = i;
        } else {
            this.f2561a = i;
        }
    }

    public void d(View view, int i) {
        if (i == 1) {
            this.f2562b = 0;
        } else {
            this.f2561a = 0;
        }
    }
}
