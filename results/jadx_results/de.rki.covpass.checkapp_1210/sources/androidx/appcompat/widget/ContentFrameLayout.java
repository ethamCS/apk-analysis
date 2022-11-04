package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    private TypedValue U3;
    private final Rect V3;
    private a W3;

    /* renamed from: c */
    private TypedValue f1094c;

    /* renamed from: d */
    private TypedValue f1095d;

    /* renamed from: q */
    private TypedValue f1096q;

    /* renamed from: x */
    private TypedValue f1097x;

    /* renamed from: y */
    private TypedValue f1098y;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.V3 = new Rect();
    }

    public void a(int i10, int i11, int i12, int i13) {
        this.V3.set(i10, i11, i12, i13);
        if (androidx.core.view.y.S(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1098y == null) {
            this.f1098y = new TypedValue();
        }
        return this.f1098y;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.U3 == null) {
            this.U3 = new TypedValue();
        }
        return this.U3;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1096q == null) {
            this.f1096q = new TypedValue();
        }
        return this.f1096q;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1097x == null) {
            this.f1097x = new TypedValue();
        }
        return this.f1097x;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1094c == null) {
            this.f1094c = new TypedValue();
        }
        return this.f1094c;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1095d == null) {
            this.f1095d = new TypedValue();
        }
        return this.f1095d;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.W3;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.W3;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.W3 = aVar;
    }
}
