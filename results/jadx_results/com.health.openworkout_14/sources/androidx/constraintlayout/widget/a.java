package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
/* loaded from: classes.dex */
public class a extends c {
    private int j;
    private int k;
    private b.e.b.k.a l;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r7 == 6) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r7 == 6) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r7 == 6) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void p(b.e.b.k.e r6, int r7, boolean r8) {
        /*
            r5 = this;
            r5.k = r7
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 1
            r1 = 0
            r2 = 6
            r3 = 5
            r4 = 17
            if (r7 >= r4) goto L16
            int r7 = r5.j
            if (r7 != r3) goto L13
        L10:
            r5.k = r1
            goto L28
        L13:
            if (r7 != r2) goto L28
        L15:
            goto L1c
        L16:
            int r7 = r5.j
            if (r8 == 0) goto L22
            if (r7 != r3) goto L1f
        L1c:
            r5.k = r0
            goto L28
        L1f:
            if (r7 != r2) goto L28
            goto L10
        L22:
            if (r7 != r3) goto L25
            goto L10
        L25:
            if (r7 != r2) goto L28
            goto L15
        L28:
            boolean r7 = r6 instanceof b.e.b.k.a
            if (r7 == 0) goto L33
            b.e.b.k.a r6 = (b.e.b.k.a) r6
            int r7 = r5.k
            r6.j1(r7)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.a.p(b.e.b.k.e, int, boolean):void");
    }

    public int getMargin() {
        return this.l.f1();
    }

    public int getType() {
        return this.j;
    }

    @Override // androidx.constraintlayout.widget.c
    public void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        this.l = new b.e.b.k.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.J0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == j.S0) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == j.R0) {
                    this.l.i1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == j.T0) {
                    this.l.k1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f775e = this.l;
        n();
    }

    @Override // androidx.constraintlayout.widget.c
    public void i(b.e.b.k.e eVar, boolean z) {
        p(eVar, this.j, z);
    }

    public boolean o() {
        return this.l.d1();
    }

    public void setAllowsGoneWidget(boolean z) {
        this.l.i1(z);
    }

    public void setDpMargin(int i) {
        b.e.b.k.a aVar = this.l;
        aVar.k1((int) ((i * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.l.k1(i);
    }

    public void setType(int i) {
        this.j = i;
    }
}
