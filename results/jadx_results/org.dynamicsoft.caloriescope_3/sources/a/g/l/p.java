package a.g.l;

import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class p {

    /* renamed from: a */
    private int f276a;

    /* renamed from: b */
    private int f277b;

    public p(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f276a | this.f277b;
    }

    public void a(View view, int i) {
        if (i == 1) {
            this.f277b = 0;
        } else {
            this.f276a = 0;
        }
    }

    public void a(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    public void a(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f277b = i;
        } else {
            this.f276a = i;
        }
    }
}
