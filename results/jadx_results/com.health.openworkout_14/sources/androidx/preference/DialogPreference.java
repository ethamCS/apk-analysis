package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    private CharSequence Q;
    private CharSequence R;
    private Drawable S;
    private CharSequence T;
    private CharSequence U;
    private int V;

    /* loaded from: classes.dex */
    public interface a {
        <T extends Preference> T g(CharSequence charSequence);
    }

    public DialogPreference(Context context) {
        this(context, null);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.g.d.c.g.a(context, m.c_res_0x7f04010f, 16842897));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.j, i, i2);
        String o = b.g.d.c.g.o(obtainStyledAttributes, t.t, t.k);
        this.Q = o;
        if (o == null) {
            this.Q = D();
        }
        this.R = b.g.d.c.g.o(obtainStyledAttributes, t.s, t.l);
        this.S = b.g.d.c.g.c(obtainStyledAttributes, t.q, t.m);
        this.T = b.g.d.c.g.o(obtainStyledAttributes, t.v, t.n);
        this.U = b.g.d.c.g.o(obtainStyledAttributes, t.u, t.o);
        this.V = b.g.d.c.g.n(obtainStyledAttributes, t.r, t.p, 0);
        obtainStyledAttributes.recycle();
    }

    public Drawable G0() {
        return this.S;
    }

    public int H0() {
        return this.V;
    }

    public CharSequence I0() {
        return this.R;
    }

    public CharSequence J0() {
        return this.Q;
    }

    public CharSequence K0() {
        return this.U;
    }

    public CharSequence L0() {
        return this.T;
    }

    @Override // androidx.preference.Preference
    public void S() {
        z().u(this);
    }
}
