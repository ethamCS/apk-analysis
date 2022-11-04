package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: b */
    private TypedValue f386b;

    /* renamed from: c */
    private TypedValue f387c;

    /* renamed from: d */
    private TypedValue f388d;

    /* renamed from: e */
    private TypedValue f389e;

    /* renamed from: f */
    private TypedValue f390f;

    /* renamed from: g */
    private TypedValue f391g;

    /* renamed from: h */
    private final Rect f392h;
    private a i;

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

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f392h = new Rect();
    }

    public void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public void b(int i, int i2, int i3, int i4) {
        this.f392h.set(i, i2, i3, i4);
        if (b.g.l.t.O(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f390f == null) {
            this.f390f = new TypedValue();
        }
        return this.f390f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f391g == null) {
            this.f391g = new TypedValue();
        }
        return this.f391g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f388d == null) {
            this.f388d = new TypedValue();
        }
        return this.f388d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f389e == null) {
            this.f389e = new TypedValue();
        }
        return this.f389e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f386b == null) {
            this.f386b = new TypedValue();
        }
        return this.f386b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f387c == null) {
            this.f387c = new TypedValue();
        }
        return this.f387c;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.i;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.i;
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
        this.i = aVar;
    }
}
