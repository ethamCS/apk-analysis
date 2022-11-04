package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
/* loaded from: classes.dex */
public class Barrier extends b {
    private int Y3;
    private int Z3;

    /* renamed from: a4 */
    private m0.a f2833a4;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
        if (r6 == 6) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r6 == 6) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void t(m0.e r4, int r5, boolean r6) {
        /*
            r3 = this;
            r3.Z3 = r5
            r5 = 1
            r0 = 0
            r1 = 6
            r2 = 5
            if (r6 == 0) goto L12
            int r6 = r3.Y3
            if (r6 != r2) goto Lf
        Lc:
            r3.Z3 = r5
            goto L1c
        Lf:
            if (r6 != r1) goto L1c
            goto L16
        L12:
            int r6 = r3.Y3
            if (r6 != r2) goto L19
        L16:
            r3.Z3 = r0
            goto L1c
        L19:
            if (r6 != r1) goto L1c
            goto Lc
        L1c:
            boolean r5 = r4 instanceof m0.a
            if (r5 == 0) goto L27
            m0.a r4 = (m0.a) r4
            int r5 = r3.Z3
            r4.x1(r5)
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.t(m0.e, int, boolean):void");
    }

    public boolean getAllowsGoneWidget() {
        return this.f2833a4.r1();
    }

    public int getMargin() {
        return this.f2833a4.t1();
    }

    public int getType() {
        return this.Y3;
    }

    @Override // androidx.constraintlayout.widget.b
    public void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        this.f2833a4 = new m0.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f3180n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == i.f3261w1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f3252v1) {
                    this.f2833a4.w1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == i.f3270x1) {
                    this.f2833a4.y1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2929x = this.f2833a4;
        s();
    }

    @Override // androidx.constraintlayout.widget.b
    public void n(m0.e eVar, boolean z10) {
        t(eVar, this.Y3, z10);
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f2833a4.w1(z10);
    }

    public void setDpMargin(int i10) {
        m0.a aVar = this.f2833a4;
        aVar.y1((int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f2833a4.y1(i10);
    }

    public void setType(int i10) {
        this.Y3 = i10;
    }
}
