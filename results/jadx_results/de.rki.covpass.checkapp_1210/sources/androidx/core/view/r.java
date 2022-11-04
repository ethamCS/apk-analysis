package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class r {

    /* renamed from: a */
    private int f3726a;

    /* renamed from: b */
    private int f3727b;

    public r(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f3726a | this.f3727b;
    }

    public void b(View view, View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f3727b = i10;
        } else {
            this.f3726a = i10;
        }
    }

    public void d(View view, int i10) {
        if (i10 == 1) {
            this.f3727b = 0;
        } else {
            this.f3726a = 0;
        }
    }
}
